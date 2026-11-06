package com.amazon.crypto.symmetric;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.crypto.ByteCipherSymmetric;
import com.amazon.crypto.ByteEncryptorSymmetric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SymmetricEncryptor implements ByteEncryptorSymmetric {
    private final ByteCipherSymmetric backend;

    public SymmetricEncryptor(ByteCipherSymmetric byteCipherSymmetric) {
        this.backend = byteCipherSymmetric;
    }

    @NonNull
    public static SymmetricEncryptor using(@NonNull SymmetricKey symmetricKey) throws IllegalArgumentException {
        return new SymmetricEncryptor(AndroidSymmetricCipher.using(symmetricKey));
    }

    @Override // com.amazon.crypto.ByteEncryptorSymmetric, com.amazon.crypto.ByteEncryptor
    @Nullable
    public byte[] encrypt(@Nullable byte[] bArr) throws IllegalArgumentException, SecurityException {
        return this.backend.encrypt(bArr);
    }

    @Override // com.amazon.crypto.ByteEncryptorSymmetric
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws IllegalArgumentException, SecurityException {
        return this.backend.encrypt(bArr, bArr2);
    }
}
