package com.amazon.alexa.featurefeedbackservice.api.utils;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.security.InvalidParameterException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Utils {
    private Utils() {
    }

    public static boolean areListsEqual(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!areStringsEqual(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean areStringsEqual(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean isEmptyString(String str) {
        return str == null || str.isEmpty();
    }

    public static void validateNonEmptyString(String str, String str2) {
        if (isEmptyString(str2)) {
            throw new InvalidParameterException(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be null or empty"));
        }
    }
}
