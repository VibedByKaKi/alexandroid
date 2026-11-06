package com.amazon.alexa.assetManagementService.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.assetManagementService.model.constants.GetAssetURLServiceMetricsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class FileCheckSumSHA {
    private Context context;

    public FileCheckSumSHA(Context context) {
        this.context = context;
    }

    private static String checksum(InputStream inputStream, MessageDigest messageDigest) throws IOException {
        DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest);
        try {
            MessageDigest messageDigest2 = digestInputStream.getMessageDigest();
            digestInputStream.close();
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest2.digest()) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                digestInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private String getCheckSum() {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            messageDigest = null;
        }
        try {
            return checksum(this.context.getResources().getAssets().open("fallbackAssetMapping.json"), messageDigest);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean shouldFallbackBeParsed() {
        String string = this.context.getSharedPreferences(GetAssetURLServiceMetricsConstants.CAM_COMPONENT_NAME, 0).getString("FALLBACK", null);
        if (string != null && string.equalsIgnoreCase(getCheckSum())) {
            return false;
        }
        SharedPreferences.Editor edit = this.context.getSharedPreferences(GetAssetURLServiceMetricsConstants.CAM_COMPONENT_NAME, 0).edit();
        edit.putString("FALLBACK", getCheckSum());
        edit.remove("ETag");
        edit.apply();
        return true;
    }
}
