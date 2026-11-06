package com.amazon.identity.auth.device;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class l4 {
    public static String a(String str, String str2) {
        String a2 = i3.a(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(a2.getBytes(Charset.forName("UTF-8")));
            String substring = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3).substring(0, 11);
            yf.a("AppSmsSignatureHelper");
            "user".equalsIgnoreCase(Build.TYPE);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            Log.e(yf.a("AppSmsSignatureHelper"), "hash:NoSuchAlgorithm", e);
            return null;
        }
    }

    public static String a(PackageInfo packageInfo) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Signature signature : packageInfo.signatures) {
                String a2 = a(packageInfo.packageName, signature.toCharsString());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        } catch (Exception e) {
            Log.e(yf.a("AppSmsSignatureHelper"), "Unable to calculate hash.", e);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }
}
