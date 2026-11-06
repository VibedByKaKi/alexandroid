package com.amazon.alexa.accessory.frames.media.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    public static ImageView findImageView(@Nullable View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            ImageView findImageView = findImageView(viewGroup.getChildAt(i));
            if (findImageView != null) {
                return findImageView;
            }
        }
        return null;
    }

    public static int measureViewHeight(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }
}
