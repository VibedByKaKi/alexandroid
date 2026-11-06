package com.amazon.identity.auth.device;

import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Cipher;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class yl {
    public static Cipher a(int i, String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(i, key);
            return cipher;
        } catch (InvalidKeyException e) {
            throw e;
        } catch (Exception e2) {
            yf.a("RSACipherHelper", "Unable to create RSA cipher, this seems to be a system bug.", e2, "RSACipherCreationFailure");
            Single$$ExternalSyntheticBUOutline0.m$2("Unable to create RSA cipher.");
            return null;
        }
    }
}
