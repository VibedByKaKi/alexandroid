package com.google.android.gms.internal.fido;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzfk {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str.concat(" must not be null"));
        return null;
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("identifier must not be empty");
            return null;
        }
        if (!zzc(str.charAt(0))) {
            Single$$ExternalSyntheticBUOutline0.m$3("identifier must start with an ASCII letter: ".concat(str));
            return null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                Single$$ExternalSyntheticBUOutline0.m$3("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                return null;
            }
        }
        return str;
    }

    private static boolean zzc(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
