package com.amazon.identity.auth.device;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class oo {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        byte[] c = c(str);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(c);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(String.format("%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    public static byte[] b(String str) {
        return Base64.decode(str, 0);
    }
}
