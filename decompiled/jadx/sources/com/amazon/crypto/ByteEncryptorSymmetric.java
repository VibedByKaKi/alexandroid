package com.amazon.crypto;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ByteEncryptorSymmetric extends ByteEncryptor {
    @Override // com.amazon.crypto.ByteEncryptor
    byte[] encrypt(byte[] bArr) throws IllegalArgumentException, SecurityException;

    byte[] encrypt(byte[] bArr, byte[] bArr2) throws SecurityException;
}
