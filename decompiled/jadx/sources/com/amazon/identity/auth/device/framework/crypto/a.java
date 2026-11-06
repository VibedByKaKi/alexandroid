package com.amazon.identity.auth.device.framework.crypto;

import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.oo;
import com.amazon.identity.auth.device.u3;
import com.amazon.identity.auth.device.yf;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {
    public static final AESCipher$KeySize b = AESCipher$KeySize.KEY_SIZE_128_BITS;
    public static final SecureRandom c = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f647a;

    public a(byte[] bArr) {
        if (bArr != null) {
            this.f647a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("encryption key was null");
            throw null;
        }
    }

    public final Cipher a(int i, String str, AlgorithmParameterSpec algorithmParameterSpec, boolean z) {
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(str);
            cipher.init(i, this.f647a, algorithmParameterSpec);
            return cipher;
        } catch (AssertionError e) {
            Log.e(yf.a("AESCipher"), "Android throws AssertionError: ", e);
            if (z && JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM.equals(str)) {
                Log.i(yf.a("AESCipher"), "Retrying creating cipher");
                yf.a("AESCipher");
                "user".equalsIgnoreCase(Build.TYPE);
                return a(i, "AES/ECB/PKCS5Padding", algorithmParameterSpec, false);
            }
            return cipher;
        } catch (Exception e2) {
            Log.e(yf.a("AESCipher"), "Aborting cipher creation", e2);
            return cipher;
        }
    }

    public final byte[] b(byte[] bArr) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dataToEncrypt is null");
            return null;
        }
        byte[] bArr2 = new byte[12];
        c.nextBytes(bArr2);
        try {
            return a(bArr2, a(a(1, "AES/GCM/NoPadding", (AlgorithmParameterSpec) new GCMParameterSpec(128, bArr2), true), bArr, 0, bArr.length));
        } catch (BadPaddingException e) {
            yf.a("AESCipher", "BadPaddingException in encryption, should never happen.", e, "AESCipher:BadPadding:GCMMode");
            return null;
        }
    }

    public static byte[] a(AESCipher$KeySize aESCipher$KeySize) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            keyGenerator.init(aESCipher$KeySize.getKeySizeInBit());
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException e) {
            Log.e(yf.a("AESCipher"), "Could not generate AES key for algorithm AES, this shouldn't happen", e);
            return null;
        }
    }

    public static String a(u3 u3Var) {
        u3Var.getClass();
        u3.b();
        return oo.b(a(b));
    }

    public static byte[] a(Cipher cipher, byte[] bArr, int i, int i2) {
        if (cipher == null) {
            return null;
        }
        try {
            return cipher.doFinal(bArr, i, i2);
        } catch (BadPaddingException e) {
            Log.e(yf.a("AESCipher"), "BadPaddingException occurs, MAP will handle it in upper level but won't cause a crash.");
            throw e;
        } catch (Exception e2) {
            Log.e(yf.a("AESCipher"), "Encrypting / Decrypting failed with the given key. Aborting!", e2);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        } catch (Exception e) {
            Log.e(yf.a("AESCipher"), "Exception happened during concatenating the initialization vectors and the cipher text", e);
            return null;
        }
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return a(a(2, "AES/GCM/NoPadding", (AlgorithmParameterSpec) new GCMParameterSpec(128, bArr, 0, 12), true), bArr, 12, bArr.length - 12);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("dataToDecrypt is null in GCMMode");
        return null;
    }
}
