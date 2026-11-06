package com.amazon.identity.auth.device;

import android.content.pm.Signature;
import com.amazon.alexa.ra.core.data.model.Constants;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class wn {
    public static String a(Signature signature) {
        if (signature == null) {
            return null;
        }
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
        if (digest == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(Constants.FEEDBACK_TYPE_DISLIKE);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }
}
