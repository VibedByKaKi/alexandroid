package com.amazon.alexa.voice.ui.internal;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Fonts {
    EMBER_BOLD("APP_TEXT_BOLD"),
    EMBER_LIGHT("APP_TEXT_LIGHT"),
    EMBER_MEDIUM("APP_TEXT_MEDIUM"),
    EMBER_REGULAR("APP_TEXT_REGULAR"),
    BOOKERLY_ITALIC("APP_TEXT_REGULAR_OBLIQUE"),
    BOOKERLY_REGULAR("APP_TEXT_REGULAR");

    private Typeface font;
    private final String name;

    Fonts(String str) {
        this.name = str;
    }

    private void applyToAllTextViews(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                applyToAllTextViews((ViewGroup) childAt);
            } else if (childAt instanceof TextView) {
                apply((TextView) childAt);
            }
        }
    }

    private Typeface getFont(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Font name cannot be null or empty");
            return null;
        }
        Typeface typeface = this.font;
        if (typeface != null) {
            return typeface;
        }
        synchronized (this) {
            try {
                Typeface typeface2 = this.font;
                if (typeface2 != null) {
                    return typeface2;
                }
                Typeface font = FontResolver.getFont(context, Font.valueOf(str));
                this.font = font;
                return font;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void apply(@NonNull TextView textView) {
        textView.setTypeface(getFont(textView.getContext(), this.name));
    }

    public Typeface getTypeface(Context context) {
        return getFont(context, this.name);
    }

    public void apply(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            apply(textView);
        }
    }

    public void apply(@NonNull Context context, @NonNull Paint paint) {
        paint.setTypeface(getFont(context, this.name));
    }
}
