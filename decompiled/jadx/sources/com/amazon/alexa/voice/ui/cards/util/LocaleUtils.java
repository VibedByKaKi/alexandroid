package com.amazon.alexa.voice.ui.cards.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocaleUtils {
    private static final Set<String> RTL_SUPPORTED_LANGUAGES = new HashSet(Arrays.asList("ar"));

    private LocaleUtils() {
    }

    public static boolean isRtl(Locale locale) {
        return RTL_SUPPORTED_LANGUAGES.contains(locale.getLanguage());
    }
}
