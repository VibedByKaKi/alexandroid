package com.amazon.alexa.wakeword.davs;

import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CheckSumUtils {
    public static final String DEFAULT_ARTIFACT_MD5 = "";
    private static final String MD_5 = "MD5";

    private CheckSumUtils() {
        throw new IllegalStateException("cannot create instance");
    }

    public static String getMD5(@Nullable byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static boolean verifyChecksum(byte[] bArr, String str) {
        return str.equalsIgnoreCase(getMD5(bArr));
    }
}
