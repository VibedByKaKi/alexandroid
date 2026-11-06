package com.amazon.alexa.app.notification.crypto;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface MessageCrypto {
    String decrypt(String str, String str2) throws MessageDecryptionException;

    void expireKeyPair();

    @Nullable
    String getPublicKey();
}
