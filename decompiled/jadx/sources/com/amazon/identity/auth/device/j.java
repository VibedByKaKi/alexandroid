package com.amazon.identity.auth.device;

import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class j {
    public final String a(String str) {
        com.amazon.identity.auth.device.framework.crypto.a a2 = a();
        if (a2 != null && str != null) {
            byte[] decode = Base64.decode(str, 0);
            if (decode == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("dataToDecrypt is null");
                return null;
            }
            byte[] a3 = com.amazon.identity.auth.device.framework.crypto.a.a(a2.a(2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, (AlgorithmParameterSpec) null, true), decode, 0, decode.length);
            if (a3 != null) {
                try {
                    return new String(a3, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    Log.e(yf.a("AbstractTokenEncryptor"), "Cannot encode the given bytes as aUTF-8 string on this platform.");
                    return null;
                }
            }
        }
        return null;
    }

    public final String b(String str) {
        byte[] bytes;
        byte[] bArr;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                Log.e(yf.a("AbstractTokenEncryptor"), "Cannot encode a string as UTF-8 on this platform.");
            }
            com.amazon.identity.auth.device.framework.crypto.a a2 = a();
            if (bytes == null && a2 != null) {
                try {
                    bArr = com.amazon.identity.auth.device.framework.crypto.a.a(a2.a(1, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, (AlgorithmParameterSpec) null, true), bytes, 0, bytes.length);
                } catch (BadPaddingException e) {
                    Log.e(yf.a("AESCipher"), "BadPaddingException in encryption, should never happen.", e);
                    bArr = null;
                }
                if (bArr == null) {
                    return null;
                }
                return Base64.encodeToString(bArr, 0);
            }
        }
        bytes = null;
        com.amazon.identity.auth.device.framework.crypto.a a22 = a();
        return bytes == null ? null : null;
    }

    public abstract byte[] b();

    public final com.amazon.identity.auth.device.framework.crypto.a a() {
        byte[] b = b();
        if (b == null) {
            Log.e(yf.a("AbstractTokenEncryptor"), "Aborting encrypt/decrypt because a valid cipher could not be created.");
            return null;
        }
        return new com.amazon.identity.auth.device.framework.crypto.a(b);
    }
}
