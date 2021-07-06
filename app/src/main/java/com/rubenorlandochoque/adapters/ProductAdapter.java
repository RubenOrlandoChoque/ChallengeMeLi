package com.rubenorlandochoque.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rubenorlandochoque.R;
import com.rubenorlandochoque.models.searchresult.Installments;
import com.rubenorlandochoque.models.searchresult.InstallmentsSerializable;
import com.rubenorlandochoque.models.searchresult.Result;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Result> itemList = new ArrayList<Result>();
    private Context context;
    private Fragment fragment;

    public void setMostSold(Result mostSold) {
        this.mostSold = mostSold;
    }

    private Result mostSold;
    DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();

    public ProductAdapter(Context context, Fragment fragment) {
        this.context = context;
        this.fragment = fragment;
        symbols.setGroupingSeparator('.');
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.product_row, viewGroup, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Result result = itemList.get(position);

        viewHolder.txt_title.setText(result.getTitle());
        viewHolder.txt_price.setText("$ " + new DecimalFormat("###,###", symbols).format(Math.round(result.getPrice())));
        if (result.getInstallments() != null && result.getInstallments().getRate() == 0) {
            viewHolder.txt_installments.setVisibility(View.VISIBLE);
            viewHolder.txt_installments.setText(String.format("En hasta %d cuotas sin interes", result.getInstallments().getQuantity()));
        } else {
            viewHolder.txt_installments.setVisibility(View.GONE);
        }
        viewHolder.txt_free_shipping.setVisibility(result.getShipping().getFreeShipping() ? View.VISIBLE : View.GONE);
        Glide.with(this.context)
                .load(result.getThumbnail())
                .error(R.drawable.notimage)
                .placeholder(R.drawable.ic_hourglass)
                .centerCrop()
                .into(viewHolder.img_item);

        if (result.getOriginalPrice() != 0) {
            double calPercentage = 100 - (100 * (result.getPrice() / result.getOriginalPrice()));
            String percentage = new DecimalFormat("#").format(Math.floor(calPercentage)) + "% OFF";
            viewHolder.txt_percentage.setVisibility(View.VISIBLE);
            viewHolder.txt_percentage.setText(percentage);
        } else {
            viewHolder.txt_percentage.setVisibility(View.GONE);
        }
        Installments installments = result.getInstallments();
        viewHolder.content_row.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("productId", result.getID());
            bundle.putBoolean("mostSold", mostSold != null && mostSold.getID().equals(result.getID()));
            bundle.putBoolean("fulfillment", result.getShipping().getLogisticType().equals("fulfillment"));
            bundle.putSerializable("installments", new InstallmentsSerializable(installments));
            NavHostFragment.findNavController(fragment)
                    .navigate(R.id.action_ProductSearchFragment_to_ProductDetailFragment, bundle);
        });

        viewHolder.iv_fulfillment.setVisibility(result.getShipping().getLogisticType().equals("fulfillment") ? View.VISIBLE : View.GONE);

        viewHolder.txt_most_sold.setVisibility(mostSold != null && mostSold.getID().equals(result.getID()) ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void setItems(List<Result> results) {
        this.itemList = results;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView content_row;
        TextView txt_price;
        TextView txt_title;
        TextView txt_installments;
        ImageView img_item;
        ImageView iv_fulfillment;
        TextView txt_free_shipping;
        TextView txt_percentage;
        TextView txt_most_sold;

        public ViewHolder(View view) {
            super(view);
            content_row = view.findViewById(R.id.content_row);
            txt_price = view.findViewById(R.id.txt_price);
            txt_title = view.findViewById(R.id.txt_title);
            txt_installments = view.findViewById(R.id.txt_installments);
            img_item = view.findViewById(R.id.img_item);
            iv_fulfillment = view.findViewById(R.id.iv_fulfillment);
            txt_free_shipping = view.findViewById(R.id.txt_free_shipping);
            txt_percentage = view.findViewById(R.id.txt_percentage);
            txt_most_sold = view.findViewById(R.id.txt_most_sold);
        }
    }
}

