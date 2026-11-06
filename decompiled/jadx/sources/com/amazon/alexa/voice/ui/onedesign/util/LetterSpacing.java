package com.amazon.alexa.voice.ui.onedesign.util;

import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LetterSpacing {
    private LetterSpacing() {
    }

    public static void apply(@DimenRes int i, @NonNull TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setLetterSpacing(textView.getResources().getDimension(i) / textView.getTextSize());
        }
    }
}
