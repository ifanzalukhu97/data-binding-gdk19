package com.ifanjszalukhu.databindinggdk19;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class BindingAdapters {

    @BindingAdapter("img_poster")
    public static void setImagePoster(ImageView image, String poster) {
        Glide.with(image.getContext())
                .load(poster)
                .into(image);
    }
}
