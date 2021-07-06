package com.rubenorlandochoque.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rubenorlandochoque.R;
import com.rubenorlandochoque.adapters.ProductAdapter;
import com.rubenorlandochoque.models.searchresult.Result;
import com.rubenorlandochoque.models.searchresult.SearchResult;
import com.rubenorlandochoque.shared.SharedConfig;
import com.rubenorlandochoque.viewmodels.ProductsViewModel;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static br.com.zbra.androidlinq.Linq.stream;

public class ProductSearchFragment extends Fragment {
    RecyclerView products_list;
    AutoCompleteTextView txt_search;
    ImageView iv_clear_text;
    ProductAdapter productAdapter;
    LinearLayout searching;
    LinearLayout not_found;
    LinearLayout write_to_search;
    private ProductsViewModel productsViewModel;
    private SharedConfig sharedConfig;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_product_search, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        productsViewModel = new ViewModelProvider(this).get(ProductsViewModel.class);
        sharedConfig = new SharedConfig(getContext());
        productAdapter = new ProductAdapter(getContext(), this);

        products_list = view.findViewById(R.id.products_list);
        iv_clear_text = view.findViewById(R.id.iv_clear_text);
        products_list.setLayoutManager(new LinearLayoutManager(getContext(),
                RecyclerView.VERTICAL,
                false));
        products_list.setAdapter(productAdapter);

        txt_search = view.findViewById(R.id.txt_search);
        txt_search.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                search(v.getText().toString());
                return true;
            }
            return false;
        });

        txt_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                iv_clear_text.setVisibility(s.length() > 0 ? View.VISIBLE : View.GONE);
            }
        });

        txt_search.setOnItemClickListener((parent, view1, position, id) -> {
            TextView item = (TextView) view1;
            search(item.getText().toString());
        });

        txt_search.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                txt_search.showDropDown();
            } else {
                txt_search.dismissDropDown();
            }
        });

        not_found = view.findViewById(R.id.not_found);
        searching = view.findViewById(R.id.searching);
        write_to_search = view.findViewById(R.id.write_to_search);
        write_to_search.setVisibility(View.VISIBLE);

        not_found.setVisibility(View.GONE);
        searching.setVisibility(View.GONE);

        final Observer<List<Result>> nameObserver = results -> {
            not_found.setVisibility(results.size() == 0 ? View.VISIBLE : View.GONE);
            write_to_search.setVisibility(View.GONE);
            if (results.size() > 0) {
                Result mostSold = stream(results).max(Result::getSoldQuantity);
                productAdapter.setMostSold(mostSold);
            }
            productAdapter.setItems(results);
            productAdapter.notifyDataSetChanged();
        };

        iv_clear_text.setOnClickListener(v -> {
            txt_search.setText("");
        });

        productsViewModel.getResults().observe(getViewLifecycleOwner(), nameObserver);
    }

    @Override
    public void onResume() {
        super.onResume();
        iv_clear_text.setVisibility(txt_search.getText().toString().length() > 0 ? View.VISIBLE : View.GONE);
        //load history
        Set<String> history = sharedConfig.getHistory();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, new ArrayList<>(history));
        txt_search.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void search(String search) {
        write_to_search.setVisibility(View.GONE);
        productAdapter.setItems(new ArrayList<>());
        productAdapter.notifyDataSetChanged();
        not_found.setVisibility(View.GONE);
        searching.setVisibility(View.VISIBLE);
        txt_search.clearFocus();
        InputMethodManager in = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        in.hideSoftInputFromWindow(txt_search.getWindowToken(), 0);

        if (search.isEmpty()) {
            searching.setVisibility(View.GONE);
            return;
        }
        saveHistory(search);

        final String urlServer = "https://api.mercadolibre.com/sites/MLA/search?q=" + search.trim();
        Rx2AndroidNetworking.get(urlServer)
                .build()
                .getObjectObservable(SearchResult.class)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new io.reactivex.Observer<SearchResult>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(SearchResult result) {
                        productsViewModel.getResults().setValue(result.getResults());
                    }

                    @Override
                    public void onError(Throwable e) {
                        searching.setVisibility(View.GONE);
                    }

                    @Override
                    public void onComplete() {
                        searching.setVisibility(View.GONE);
                    }
                });
    }

    private void saveHistory(String search) {
        HashSet<String> history = (HashSet<String>) sharedConfig.getHistory();
        if(history == null) history = new HashSet<>();
        history.add(search);
        sharedConfig.setHistory(search);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, new ArrayList<>(history));
        txt_search.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}