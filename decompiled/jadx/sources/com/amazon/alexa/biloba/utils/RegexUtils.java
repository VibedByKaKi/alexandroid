package com.amazon.alexa.biloba.utils;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class RegexUtils {
    private static final String SPECIAL_CHARACTERS = "[:\\-’', ]+";
    private static final Pattern ALLOW_SPECIAL_CHARACTERS = Pattern.compile(SPECIAL_CHARACTERS);
    private static final String CUSTOM_ALERT_NAME = "[0-9a-zñáéíóúü:\\-’', ]+";
    private static final Pattern ALLOWED_CUSTOM_ALERT_NAME = Pattern.compile(CUSTOM_ALERT_NAME, 2);

    private RegexUtils() {
    }

    public static boolean hasOnlyAllowedSpecialChars(CharSequence charSequence) {
        return ALLOW_SPECIAL_CHARACTERS.matcher(charSequence).matches();
    }

    public static boolean isValidCustomAlertName(CharSequence charSequence) {
        return ALLOWED_CUSTOM_ALERT_NAME.matcher(charSequence).matches();
    }
}
