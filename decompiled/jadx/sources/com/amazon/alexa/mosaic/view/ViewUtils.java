package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.databinding.ImageViewAdapter;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.mosaic.components.ThemeUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class ViewUtils {
    private static final String TAG = "ViewUtils";

    private ViewUtils() {
    }

    public static void addClickListener(@NonNull View view, int i, View.OnClickListener onClickListener) {
        view.findViewById(i).setOnClickListener(onClickListener);
    }

    public static ContextThemeWrapper getThemeWrapper(Context context) {
        return new ContextThemeWrapper(context, R.style.Theme_Biloba);
    }

    public static void setMaxLines(@NonNull View view, int i, int i2) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            LogUtils.e(TAG, "setMaxLines view is null:" + i);
            return;
        }
        if (i2 != 0) {
            textView.setMaxLines(i2);
            return;
        }
        LogUtils.e(TAG, "maxLines was given 0 for view:" + i);
    }

    public static void updateBackgroundColor(@NonNull View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i2);
            return;
        }
        LogUtils.e(TAG, "updateBackgroundColor View is null:" + i);
    }

    public static void updateImageColor(@NonNull View view, int i, ColorStateList colorStateList) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null && colorStateList != null) {
            imageView.setImageTintList(colorStateList);
            return;
        }
        LogUtils.e(TAG, "updateImageColor ImageView is null:" + i + ", or color is null");
    }

    public static void updateImageUrl(@NonNull View view, int i, String str) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView == null) {
            LogUtils.e(TAG, "updateImageUrl ImageView is null:" + i);
            return;
        }
        if (str == null) {
            imageView.setVisibility(8);
        } else {
            ImageViewAdapter.setImageUrl(imageView, str);
            imageView.setVisibility(0);
        }
    }

    public static void updateImageView(@NonNull View view, int i, Drawable drawable) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView == null) {
            LogUtils.e(TAG, "updateImageView ImageView is null:" + i);
            return;
        }
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
    }

    public static void updateTextClickable(@NonNull View view, int i, boolean z) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            textView.setClickable(z);
            textView.setTextColor(ThemeUtil.getColorFromAttribute(view.getContext(), z ? R.attr.mosaicAction10 : R.attr.mosaicNeutral30));
        } else {
            LogUtils.e(TAG, "updateLinkClickable View is null:" + i);
        }
    }

    public static void updateTextColor(@NonNull View view, int i, int i2) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            textView.setTextColor(i2);
            return;
        }
        LogUtils.e(TAG, "updateTextColor TextView is null:" + i);
    }

    public static void updateTextView(@NonNull View view, int i, SpannableStringBuilder spannableStringBuilder) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            LogUtils.e(TAG, "updateTextView TextView is null:" + i);
            return;
        }
        if (spannableStringBuilder == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setVisibility(0);
    }

    public static void updateViewContentDescription(@NonNull View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setContentDescription(str);
            return;
        }
        LogUtils.e(TAG, "updateViewContentDescription view is null:" + i);
    }

    public static void updateVisibility(@NonNull View view, int i, Boolean bool) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(bool == Boolean.TRUE ? 0 : 8);
            return;
        }
        LogUtils.e(TAG, "updateVisibility View is null:" + i);
    }

    public static void updateTextColor(@NonNull View view, int i, ColorStateList colorStateList) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            LogUtils.e(TAG, "updateTextColor TextView is null:" + i);
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public static void updateTextView(@NonNull View view, int i, String str) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            LogUtils.e(TAG, "updateTextView TextView is null:" + i);
            return;
        }
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
