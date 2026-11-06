package com.amazon.crypto.symmetric;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.crypto.ByteCipherSymmetric;
import com.amazon.crypto.ByteDecryptorSymmetric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SymmetricDecryptor implements ByteDecryptorSymmetric {
    private final ByteCipherSymmetric backend;

    public SymmetricDecryptor(ByteCipherSymmetric byteCipherSymmetric) {
        this.backend = byteCipherSymmetric;
    }

    @NonNull
    public static SymmetricDecryptor using(@NonNull SymmetricKey symmetricKey) {
        return new SymmetricDecryptor(AndroidSymmetricCipher.using(symmetricKey));
    }

    @Override // com.amazon.crypto.ByteDecryptorSymmetric, com.amazon.crypto.ByteDecryptor
    @Nullable
    public byte[] decrypt(@Nullable byte[] bArr) throws IllegalArgumentException, SecurityException {
        return this.backend.decrypt(bArr);
    }

    @Override // com.amazon.crypto.ByteDecryptorSymmetric
    @Nullable
    public byte[] decrypt(@Nullable byte[] bArr, byte[] bArr2) throws IllegalArgumentException, SecurityException {
        return this.backend.decrypt(bArr, bArr2);
    }
}
