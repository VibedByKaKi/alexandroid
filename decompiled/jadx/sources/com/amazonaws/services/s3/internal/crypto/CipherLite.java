package com.amazonaws.services.s3.internal.crypto;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
class CipherLite {
    static final CipherLite NULL = new CipherLite() { // from class: com.amazonaws.services.s3.internal.crypto.CipherLite.1
        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createInverse() {
            return this;
        }

        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createAuxiliary(long j) {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    public CipherLite createAuxiliary(long j) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j);
    }

    public CipherLite createInverse() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        int i = this.cipherMode;
        int i2 = 1;
        if (i != 2) {
            if (i != 1) {
                Duration$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            i2 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i2, this.cipher.getProvider());
    }

    public CipherLite createUsingIV(byte[] bArr) {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    public byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal();
    }

    public final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    public final int getCipherMode() {
        return this.cipherMode;
    }

    public final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    public final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    public final byte[] getIV() {
        return this.cipher.getIV();
    }

    public int getOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    public final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    public long mark() {
        return -1L;
    }

    public boolean markSupported() {
        return false;
    }

    public CipherLite recreate() {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    public void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    public byte[] update(byte[] bArr, int i, int i2) {
        return this.cipher.update(bArr, i, i2);
    }

    public byte[] doFinal(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(bArr);
    }

    public byte[] doFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(bArr, i, i2);
    }

    public CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i;
    }
}
