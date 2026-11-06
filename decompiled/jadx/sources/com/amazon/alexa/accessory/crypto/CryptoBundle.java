package com.amazon.alexa.accessory.crypto;

import com.amazon.alexa.accessory.crypto.cipher.SupportedCipherSuite;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.security.Key;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CryptoBundle {
    private final Key authenticationKey;
    private final SupportedCipherSuite cipherSuite;
    private final String cipherTransform;
    private final Key decryptionKey;

    public CryptoBundle(SupportedCipherSuite supportedCipherSuite, String str, Key key, Key key2) {
        Preconditions.notNull(supportedCipherSuite, "cipherSuite");
        Preconditions.notEmpty(str, "cipherTransform");
        Preconditions.notNull(key, "decryptionKey");
        Preconditions.notNull(key2, "authenticationKey");
        this.cipherSuite = supportedCipherSuite;
        this.cipherTransform = str;
        this.decryptionKey = key;
        this.authenticationKey = key2;
    }

    public Key getAuthenticationKey() {
        return this.authenticationKey;
    }

    public SupportedCipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    public String getCipherTransform() {
        return this.cipherTransform;
    }

    public Key getDecryptionKey() {
        return this.decryptionKey;
    }
}
