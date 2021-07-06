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
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static br.com.zbra.androidlinq.Linq.stream;

public class ProductDetailFragment extends Fragment {
    DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
    ProductResult productResult;
    View view;
    ViewPager viewPager;
    ImageViewAdapter imageViewAdapter;
    boolean mostSold;
    InstallmentsSerializable installments;
    boolean fulfillment;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_detail, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        symbols.setGroupingSeparator('.');
        this.view = view;
        String productId = getArguments().getString("productId");
        mostSold = getArguments().getBoolean("mostSold");
        fulfillment = getArguments().getBoolean("fulfillment");
        installments = (InstallmentsSerializable) getArguments().getSerializable("installments");
        view.findViewById(R.id.ll_product_container).setVisibility(View.INVISIBLE);
        getProduct(productId);
    }

    private void getProduct(String productId) {
        final String urlServer = "https://api.mercadolibre.com/items?ids=" + productId;
        Rx2AndroidNetworking.get(urlServer)
                .build()
                .getObjectListObservable(ProductResult.class)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new io.reactivex.Observer<List<ProductResult>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<ProductResult> result) {
                        if (result != null && result.size() > 0) {
                            productResult = result.get(0);
                            cargarDatos();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void cargarDatos() {
        TextView txt_condition = view.findViewById(R.id.txt_condition);
        TextView txt_title = view.findViewById(R.id.txt_title);
        TextView txt_color = view.findViewById(R.id.txt_color);
        TextView txt_price = view.findViewById(R.id.txt_price);
        TextView txt_price_decimal = view.findViewById(R.id.txt_price_decimal);
        TextView txt_original_price = view.findViewById(R.id.txt_original_price);
        TextView txt_percentage = view.findViewById(R.id.txt_percentage);
        TextView txt_current_image = view.findViewById(R.id.txt_current_image);
        TextView txt_most_sold = view.findViewById(R.id.txt_most_sold);
        LinearLayout ll_color = view.findViewById(R.id.ll_color);
        LinearLayout ll_installments = view.findViewById(R.id.ll_installments);
        TextView txt_sold = view.findViewById(R.id.txt_sold);
        TextView txt_stock = view.findViewById(R.id.txt_stock);
        TextView txt_installments = view.findViewById(R.id.txt_installments);
        TextView txt_installments_decimal = view.findViewById(R.id.txt_installments_decimal);
        TextView txt_without_interest = view.findViewById(R.id.txt_without_interest);
        TextView txt_free_shipping = view.findViewById(R.id.txt_free_shipping);
        ImageView iv_fulfillment = view.findViewById(R.id.iv_fulfillment);


        txt_condition.setText(productResult.getBody().getCondition().equals("new") ? "Nuevo" : "Usado");
        txt_title.setText(productResult.getBody().getTitle());
        Attribute main_color = stream(productResult.getBody().getAttributes()).where(e -> e.getID().equals("COLOR")).firstOrNull();
        if (main_color != null) {
            ll_color.setVisibility(View.VISIBLE);
            txt_color.setText(main_color.getValueName());
        } else {
            ll_color.setVisibility(View.GONE);
        }
        viewPager = (ViewPager) view.findViewById(R.id.image_viewer);
        imageViewAdapter = new ImageViewAdapter(this, stream(productResult.getBody().getPictures()).select(e -> e.getURL()).toList(), true);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            public void onPageScrollStateChanged(int arg0) {
            }

            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            public void onPageSelected(int currentPage) {
                txt_current_image.setText((currentPage + 1) + " / " + productResult.getBody().getPictures().size());
            }
        });
        txt_current_image.setVisibility(productResult.getBody().getPictures().size() < 1 ? View.GONE : View.VISIBLE);
        txt_current_image.setText("1 / " + productResult.getBody().getPictures().size());
        viewPager.setAdapter(imageViewAdapter);
        String[] split = Double.toString(productResult.getBody().getPrice()).split("\\.");
        txt_price.setText("$ " + new DecimalFormat("###,###", symbols).format(Double.parseDouble(split[0])));
        if (split.length > 1 && !split[1].equals("0")) {
            txt_price_decimal.setVisibility(View.VISIBLE);
            txt_price_decimal.setText(split[1]);
        } else {
            txt_price_decimal.setVisibility(View.GONE);
        }
        if (productResult.getBody().getOriginalPrice() != 0) {
            double calPercentage = 100 - (100 * (productResult.getBody().getPrice() / productResult.getBody().getOriginalPrice()));
            String percentage = new DecimalFormat("#").format(Math.floor(calPercentage)) + "% OFF";
            txt_percentage.setVisibility(View.VISIBLE);
            txt_percentage.setText(percentage);

            txt_original_price.setVisibility(View.VISIBLE);
            txt_original_price.setText("$ " + new DecimalFormat("###,###", symbols).format(Math.round(productResult.getBody().getOriginalPrice())));
            txt_original_price.setPaintFlags(txt_original_price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            txt_percentage.setVisibility(View.GONE);
            txt_original_price.setVisibility(View.GONE);
        }
        txt_most_sold.setVisibility(mostSold ? View.VISIBLE : View.GONE);
        view.findViewById(R.id.ll_product_container).setVisibility(View.VISIBLE);
        txt_sold.setText(productResult.getBody().getSoldQuantity() + " Vendidos");
        txt_stock.setText(productResult.getBody().getAvailableQuantity() + " Unidades");

        if (installments != null && installments.getQuantity() > 0) {
            ll_installments.setVisibility(View.VISIBLE);
            String[] splitInstallments = Double.toString(installments.getAmount()).split("\\.");
            if (installments.getRate() == 0) {
                txt_without_interest.setVisibility(View.VISIBLE);
                txt_installments.setTextColor(getResources().getColor(R.color.green));
                txt_installments_decimal.setTextColor(getResources().getColor(R.color.green));
            } else {
                txt_installments_decimal.setTextColor(getResources().getColor(R.color.black));
                txt_installments.setTextColor(getResources().getColor(R.color.black));
                txt_without_interest.setVisibility(View.GONE);
            }
            txt_installments.setText(installments.getQuantity() + "x $ " + new DecimalFormat("###,###", symbols).format(Double.parseDouble(splitInstallments[0])));
            if (splitInstallments.length > 1 && !splitInstallments[1].equals("0")) {
                txt_installments_decimal.setVisibility(View.VISIBLE);
                txt_installments_decimal.setText(splitInstallments[1]);
            } else {
                txt_installments_decimal.setVisibility(View.GONE);
            }
        } else {
            ll_installments.setVisibility(View.GONE);
        }

        getSeller(productResult.getBody().getSellerID());
        txt_free_shipping.setVisibility(productResult.getBody().getShipping().getFreeShipping() ? View.VISIBLE : View.GONE);
        iv_fulfillment.setVisibility(fulfillment ? View.VISIBLE : View.GONE);
    }


    private void getSeller(long sellerId) {
        final String urlServer = "https://api.mercadolibre.com/sites/MLA/search?seller_id=" + sellerId;
        Rx2AndroidNetworking.get(urlServer)
                .build()
                .getObjectObservable(SellerResult.class)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new io.reactivex.Observer<SellerResult>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(SellerResult result) {
                        cargarSeller(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    private void cargarSeller(SellerResult result) {
        TextView txt_seller = view.findViewById(R.id.txt_seller);
        txt_seller.setText(result.getSeller().getNickname());
    }
}