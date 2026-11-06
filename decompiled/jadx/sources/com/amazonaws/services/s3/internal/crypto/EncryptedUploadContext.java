package com.amazonaws.services.s3.internal.crypto;

import javax.crypto.SecretKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class EncryptedUploadContext extends MultipartUploadContext {
    private final SecretKey envelopeEncryptionKey;
    private byte[] firstIV;
    private byte[] nextIV;

    public EncryptedUploadContext(String str, String str2, SecretKey secretKey) {
        super(str, str2);
        this.envelopeEncryptionKey = secretKey;
    }

    public SecretKey getEnvelopeEncryptionKey() {
        return this.envelopeEncryptionKey;
    }

    public byte[] getFirstInitializationVector() {
        return this.firstIV;
    }

    public byte[] getNextInitializationVector() {
        return this.nextIV;
    }

    public void setFirstInitializationVector(byte[] bArr) {
        this.firstIV = bArr;
    }

    public void setNextInitializationVector(byte[] bArr) {
        this.nextIV = bArr;
    }
}
