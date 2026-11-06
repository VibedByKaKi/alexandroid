package com.amazon.alexa.accessory.crypto.persistence;

import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class KeyStoreLoader {
    private static final String ANDROID_KEY_STORE_PROVIDER = "AndroidKeyStore";
    private KeyStore lazy = null;

    public KeyStore fabricateAndLoadKeyStore() throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_PROVIDER);
            keyStore.load(null);
            return keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new CryptoKeyDataStore.CryptoKeyDataStoreIOException(null, "Error loading the Android KeyStore", e);
        }
    }

    public final synchronized KeyStore getKeyStore() throws CryptoKeyDataStore.CryptoKeyDataStoreIOException {
        try {
            if (this.lazy == null) {
                this.lazy = fabricateAndLoadKeyStore();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lazy;
    }
}
