package com.amazon.alexa.voice.ui.onedesign.util;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CharSequenceUtils {
    private CharSequenceUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static CharSequence capitalize(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isLetter(charAt)) {
                spannableStringBuilder.append(charAt);
            } else if (i == 0 || Character.isSpaceChar(charSequence.charAt(i - 1))) {
                spannableStringBuilder.append(Character.toUpperCase(charAt));
            } else {
                spannableStringBuilder.append(charAt);
            }
        }
        return spannableStringBuilder;
    }
}
