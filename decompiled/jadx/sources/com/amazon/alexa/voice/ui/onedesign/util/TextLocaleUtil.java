package com.amazon.alexa.voice.ui.onedesign.util;

import android.os.LocaleList;
import android.text.SpannableStringBuilder;
import android.text.style.LocaleSpan;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TextLocaleUtil {
    private TextLocaleUtil() {
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.toString().trim().isEmpty();
    }

    public static SpannableStringBuilder wrapTextInLocaleSpan(CharSequence charSequence, Locale locale) {
        if (isEmpty(charSequence) || locale == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new LocaleSpan(locale), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder wrapTextInLocaleSpan(CharSequence charSequence, LocaleList localeList) {
        if (isEmpty(charSequence) || localeList == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new LocaleSpan(localeList), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }
}
