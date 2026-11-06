package com.google.android.gms.internal.home;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzv {
    public static boolean zza(CharSequence charSequence, CharSequence charSequence2) {
        int zzc;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((zzc = zzc(charAt)) >= 26 || zzc != zzc(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzb(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int zzc(char c) {
        return (char) ((c | ' ') - 97);
    }
}
