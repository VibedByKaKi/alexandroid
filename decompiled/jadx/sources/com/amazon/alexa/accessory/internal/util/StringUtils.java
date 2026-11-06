package com.amazon.alexa.accessory.internal.util;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class StringUtils {
    private StringUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static String join(Iterable<? extends CharSequence> iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
        }
        return sb.toString();
    }

    public static String removePrefix(String str, String str2) {
        return (str == null || str2 == null) ? str : str.replaceFirst("(?i)^".concat(str2), "");
    }

    public static String safeFormat(Locale locale, String str, Object... objArr) {
        try {
            return String.format(locale, str, objArr);
        } catch (NullPointerException | IllegalFormatException e) {
            Log.e("AlexaAccessory", "String.format() caused exception", e);
            if (str == null) {
                str = "null";
            }
            StringBuilder sb = new StringBuilder(str);
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append("|");
                    if (obj != null) {
                        sb.append(obj.toString());
                    } else {
                        sb.append("null");
                    }
                }
            }
            return sb.toString();
        }
    }
}
