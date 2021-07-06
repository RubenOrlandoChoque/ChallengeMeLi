package com.rubenorlandochoque.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.rubenorlandochoque.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImageViewAdapter extends PagerAdapter {

    List<String> pictures;
    LayoutInflater mLayoutInflater;
    Fragment fragment;
    boolean zoom;

    public ImageViewAdapter(Fragment fragment, List<String> pictures, boolean zoom) {
        this.fragment = fragment;
        this.zoom = zoom;
        this.pictures = pictures;
        mLayoutInflater = (LayoutInflater) fragment.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pictures.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        // inflating the item.xml
        View itemView = mLayoutInflater.inflate(R.layout.item, container, false);

        // referencing the image view from the item.xml file
        ImageView imageView = itemView.findViewById(R.id.image_item);
        if(zoom) {
            imageView.setOnClickListener(v -> {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("images", (ArrayList<String>) pictures);
                NavHostFragment.findNavController(fragment)
                        .navigate(R.id.action_ProductDetailFragment_to_ImageZoomFragment, bundle);
            });
        }

        Glide.with(this.fragment.getContext())
                .load(pictures.get(position))
                .error(R.drawable.notimage)
                .placeholder(R.drawable.ic_hourglass)
                .fitCenter()
                .into(imageView);

        // Adding the View
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}