package com.amazon.alexa.voice.ui.onedesign.util;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FontUtils {
    private FontUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static void apply(@NonNull Font font, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            apply(font, textView);
        }
    }

    private static void applyToAllTextViews(@NonNull Typeface typeface, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                applyToAllTextViews(typeface, (ViewGroup) childAt);
            } else if (childAt instanceof TextView) {
                applyTypeface(typeface, (TextView) childAt);
            }
        }
    }

    private static void applyTypeface(@NonNull Typeface typeface, @NonNull TextView textView) {
        textView.setTypeface(typeface);
    }

    @Nullable
    public static Font getFontFromTheme(@NonNull Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type == 0) {
            return null;
        }
        return Font.fromInt(typedValue.data);
    }

    public static void apply(@NonNull Font font, @NonNull TextView textView) {
        applyTypeface(FontResolver.getFont(textView.getContext(), font), textView);
    }

    public static void apply(@NonNull Font font, @NonNull Context context, @NonNull Paint paint) {
        paint.setTypeface(FontResolver.getFont(context, font));
    }
}
