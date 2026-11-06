package com.amazon.alexa.biloba.databinding;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DataBindingForResourceId {
    private DataBindingForResourceId() {
    }

    @BindingAdapter({"resourceId"})
    public static void setImageResource(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    @BindingAdapter({"resourceId"})
    public static void setTextResource(TextView textView, int i) {
        textView.setText(i);
    }
}
