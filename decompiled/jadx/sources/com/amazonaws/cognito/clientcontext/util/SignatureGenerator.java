package com.amazonaws.cognito.clientcontext.util;

import android.util.Base64;
import android.util.Log;
import com.amazonaws.cognito.clientcontext.data.ConfigurationConstant;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SignatureGenerator {
    private static final String ALGORITHM = "HmacSHA256";
    private static final String TAG = "HMAC_SHA256_Signature";

    private void logWarning(Exception exc) {
        Log.w(TAG, "Exception while completing context data signature", exc);
    }

    public String getSignature(String str, String str2, String str3) {
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            Charset charset = ConfigurationConstant.DEFAULT_CHARSET;
            mac.init(new SecretKeySpec(str2.getBytes(charset), ALGORITHM));
            mac.update(str3.getBytes(charset));
            return Base64.encodeToString(mac.doFinal(str.getBytes(charset)), 0);
        } catch (Exception e) {
            this.logWarning(e);
            return "";
        }
    }
}
