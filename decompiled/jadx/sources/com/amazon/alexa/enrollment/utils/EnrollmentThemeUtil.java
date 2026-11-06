package com.amazon.alexa.enrollment.utils;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.enrollment.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentThemeUtil {
    private static final String TAG = "VoxEn_EnrollmentThemeUtil";

    private static int getColorFromAttribute(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context == null || context.getTheme() == null || !context.getTheme().resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        return typedValue.data;
    }

    public void setBackgroundColorToView(Context context, int i, View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundColor(getColorFromAttribute(context, i));
            }
        }
    }

    public void setBackgroundToView(Context context, int i, View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setBackground(ContextCompat.getDrawable(context, i));
            }
        }
    }

    public void setImage(ImageView imageView, int i) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public void setTextColor(Context context, int i, TextView... textViewArr) {
        if (textViewArr == null) {
            return;
        }
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(getColorFromAttribute(context, i));
            }
        }
    }

    public void setTheme(Context context) {
        Log.i(TAG, "Setting mosaic theme...");
        context.setTheme(R.style.Theme_Mosaic_Jasper);
    }

    public void setTintColorToImageView(ImageView imageView, Context context, int i) {
        if (imageView == null) {
            return;
        }
        imageView.setColorFilter(getColorFromAttribute(context, i));
    }
}
