package com.google.android.exoplayer2.util;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class AESUtil {
    private static final String TAG = "AESUtil";
    private Cipher cipher;
    private Key cipherKey;

    public byte[] decryptCBC(byte[] bArr, int i, int i2) {
        try {
            return this.cipher.doFinal(bArr, i, i2);
        } catch (Exception e) {
            android.util.Log.e(TAG, "decryptCBC exception:", e);
            return null;
        }
    }

    public byte[] decryptCBCPartial(byte[] bArr, int i, int i2) {
        try {
            return this.cipher.update(bArr, i, i2);
        } catch (Exception e) {
            android.util.Log.e(TAG, "decryptCBCPartial exception:", e);
            return null;
        }
    }

    public boolean initKey(byte[] bArr) {
        try {
            this.cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.cipherKey = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            return true;
        } catch (Exception e) {
            android.util.Log.e(TAG, "initKey exception:", e);
            return false;
        }
    }

    public boolean resetIV(byte[] bArr) {
        try {
            this.cipher.init(2, this.cipherKey, new IvParameterSpec(bArr));
            return true;
        } catch (Exception e) {
            android.util.Log.e(TAG, "resetIV exception:", e);
            return false;
        }
    }
}
