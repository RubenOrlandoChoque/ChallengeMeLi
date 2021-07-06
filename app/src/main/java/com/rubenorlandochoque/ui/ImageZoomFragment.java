package com.rubenorlandochoque.ui;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.rubenorlandochoque.R;
import com.rubenorlandochoque.adapters.ImageViewAdapter;
import com.rubenorlandochoque.models.productresult.Attribute;
import com.rubenorlandochoque.models.productresult.ProductResult;
import com.rubenorlandochoque.models.searchresult.InstallmentsSerializable;
import com.rubenorlandochoque.models.sellerresult.SellerResult;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static br.com.zbra.androidlinq.Linq.stream;

public class ImageZoomFragment extends Fragment {
    ViewPager viewPager;
    ImageViewAdapter imageViewAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_zoom, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txt_current_image = view.findViewById(R.id.txt_current_image);
        List<String> images = getArguments().getStringArrayList("images");
        viewPager = (ViewPager) view.findViewById(R.id.image_viewer);
        imageViewAdapter = new ImageViewAdapter(this, images, false);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            public void onPageScrollStateChanged(int arg0) {
            }

            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            public void onPageSelected(int currentPage) {
                txt_current_image.setText((currentPage + 1) + " / " + images.size());
            }
        });
        viewPager.setAdapter(imageViewAdapter);
        txt_current_image.setVisibility(images.size() < 1 ? View.GONE : View.VISIBLE);
        txt_current_image.setText("1 / " + images.size());
        view.findViewById(R.id.back).setOnClickListener(v -> {
            getActivity().onBackPressed();
        });
    }
}