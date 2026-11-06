package com.amazonaws.mobileconnectors.remoteconfiguration.internal.gear;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalConfigInstanceIdGenerationHelper {
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    private static final String TAG = "LocalConfigInstanceIdGenerationHelper";

    private LocalConfigInstanceIdGenerationHelper() {
    }

    public static String convertBytesToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String generateLocalConfigInstanceId(String str) {
        Checks.checkArgument((str == null || str.isEmpty()) ? false : true, "Invalid string for hashing");
        try {
            return convertBytesToHexString(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            Log.e(TAG, "Unable to generate hash from string identifier");
            return "";
        }
    }
}
