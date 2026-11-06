package com.amazon.alexa.biloba.utils;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpanBuilder {
    private SpannableStringBuilder spanStringBuilder = new SpannableStringBuilder();

    public SpanBuilder append(String str, CharacterStyle... characterStyleArr) {
        int length = this.spanStringBuilder.length();
        this.spanStringBuilder.append((CharSequence) str);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                this.spanStringBuilder.setSpan(characterStyle, length, str.length() + length, 17);
            }
        }
        return this;
    }

    public SpannableStringBuilder getValue() {
        return this.spanStringBuilder;
    }

    public String toString() {
        return this.spanStringBuilder.toString();
    }
}
