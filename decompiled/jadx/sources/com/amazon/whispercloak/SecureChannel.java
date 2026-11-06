package com.amazon.whispercloak;

import com.amazon.whispercloak.cipher.AesGcmCipher;
import com.amazon.whispercloak.error.SecureChannelInitializationError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface SecureChannel {
    Payload decrypt(byte[] bArr);

    byte[] encrypt(Payload payload);

    AesGcmCipher getCipher();

    byte[] getDerEncodedPublicKey();

    String getPemEncodedPublicKey();

    byte[] getSymmetricKey();

    void init(String str) throws SecureChannelInitializationError;

    void init(byte[] bArr) throws SecureChannelInitializationError;
}
