package com.dee.app.cachemanager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MarshmallowPlusAESEncryptor extends AbstractAESEncryptor {
    private static final String AES_MODE = "AES/GCM/NoPadding";
    private static final int AES_TAG_LENGTH = 16;
    private static final byte[] FIXED_IV = {55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, JsonWriter.COMMA};

    public MarshmallowPlusAESEncryptor(@NonNull Context context, @NonNull String str) {
        super(context, str);
    }

    @Override // com.dee.app.cachemanager.AbstractAESEncryptor
    public String getSharedPreferenceName(String str) {
        return a$$ExternalSyntheticOutline0.m("encryptor_", str);
    }

    @Override // com.dee.app.cachemanager.AbstractAESEncryptor
    public Cipher getUninitializedCipher() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        return Cipher.getInstance(AES_MODE);
    }

    @Override // com.dee.app.cachemanager.AbstractAESEncryptor
    public Cipher getWrappingCipher() throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    @Override // com.dee.app.cachemanager.AbstractAESEncryptor
    public void initAESDecryptCipher(Cipher cipher, Key key) throws InvalidAlgorithmParameterException, InvalidKeyException {
        cipher.init(2, key, new GCMParameterSpec(128, FIXED_IV));
    }

    @Override // com.dee.app.cachemanager.AbstractAESEncryptor
    public void initAESEncryptCipher(Cipher cipher, Key key) throws InvalidAlgorithmParameterException, InvalidKeyException {
        cipher.init(1, key, new GCMParameterSpec(128, FIXED_IV));
    }
}
