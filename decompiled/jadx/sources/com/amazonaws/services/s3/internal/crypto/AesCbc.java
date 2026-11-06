package com.amazonaws.services.s3.internal.crypto;

import org.openjdk.tools.javac.code.Flags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
class AesCbc extends ContentCryptoScheme {
    private static final int DEFAULT_BLOCK_SIZE_IN_BYTES = 16;
    private static final int DEFAULT_IV_LENGTH_IN_BYTES = 16;
    private static final int DEFAULT_KEY_LENGTH_IN_BITS = 256;

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getCipherAlgorithm() {
        return JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getIVLengthInBytes() {
        return 16;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getKeyGeneratorAlgorithm() {
        return JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getKeyLengthInBits() {
        return 256;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public long getMaxPlaintextSize() {
        return Flags.AUTOMATIC_MODULE;
    }
}
