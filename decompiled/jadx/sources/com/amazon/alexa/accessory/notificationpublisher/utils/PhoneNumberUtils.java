package com.amazon.alexa.accessory.notificationpublisher.utils;

import android.util.Patterns;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PhoneNumberUtils {
    private PhoneNumberUtils() {
    }

    @NonNull
    public static String extractAreaCode(@NonNull String str) {
        String replaceAll = str.replaceAll("[^0-9]", "");
        if (replaceAll.length() >= 10) {
            if (replaceAll.length() == 11 && replaceAll.charAt(0) == '1') {
                return replaceAll.substring(1, 4);
            }
            if (replaceAll.length() == 10) {
                return replaceAll.substring(0, 3);
            }
        }
        return "";
    }

    public static boolean isPhoneNumber(@NonNull String str) {
        if (!str.isEmpty() && str.replaceAll("[^0-9]", "").length() >= 10) {
            return Patterns.PHONE.matcher(str).matches();
        }
        return false;
    }
}
