package com.amazonaws.services.s3.internal.crypto;

import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class EncryptionInstruction {
    private final byte[] encryptedSymmetricKey;
    private final Map<String, String> materialsDescription;
    private final Cipher symmetricCipher;
    private final CipherFactory symmetricCipherFactory;

    public EncryptionInstruction(Map<String, String> map, byte[] bArr, SecretKey secretKey, CipherFactory cipherFactory) {
        this.materialsDescription = map;
        this.encryptedSymmetricKey = bArr;
        this.symmetricCipherFactory = cipherFactory;
        this.symmetricCipher = cipherFactory.createCipher();
    }

    public CipherFactory getCipherFactory() {
        return this.symmetricCipherFactory;
    }

    public byte[] getEncryptedSymmetricKey() {
        return this.encryptedSymmetricKey;
    }

    public Map<String, String> getMaterialsDescription() {
        return this.materialsDescription;
    }

    public Cipher getSymmetricCipher() {
        return this.symmetricCipher;
    }

    public EncryptionInstruction(Map<String, String> map, byte[] bArr, SecretKey secretKey, Cipher cipher) {
        this.materialsDescription = map;
        this.encryptedSymmetricKey = bArr;
        this.symmetricCipher = cipher;
        this.symmetricCipherFactory = null;
    }
}
