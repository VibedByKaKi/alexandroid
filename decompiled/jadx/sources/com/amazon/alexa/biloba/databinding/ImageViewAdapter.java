package com.amazon.alexa.biloba.databinding;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import com.amazon.alexa.imageloader.api.ImageLoader;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import java.net.URI;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImageViewAdapter {
    private ImageViewAdapter() {
    }

    @BindingAdapter({"imageUrl"})
    public static void setImageUrl(ImageView imageView, String str) {
        Object obj;
        if (str == null) {
            imageView.setImageDrawable(null);
        } else {
            obj = ComponentRegistry.getInstance().get(ImageLoader.class).get();
            ((ImageLoader) obj).loadInto(URI.create(str), imageView);
        }
    }

    @BindingAdapter({"android:src"})
    public static void setSrc(ImageView imageView, @DrawableRes int i) {
        if (i == 0) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), i));
        }
    }

    @BindingAdapter({"android:src"})
    public static void setSrc(ImageView imageView, Drawable drawable) {
        if (drawable == null) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}
