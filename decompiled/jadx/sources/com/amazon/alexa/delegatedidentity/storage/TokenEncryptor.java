package com.amazon.alexa.delegatedidentity.storage;

import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.crypto.Crypto;
import com.amazon.crypto.symmetric.SymmetricKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TokenEncryptor {
    static final String ENCRYPTION_KEY_IN_SHARED_PREF = "com.amazon.alexa.delegatedidentity.DelegatedTokenStorage.encrypt.key";
    private static final String TAG = "com.amazon.alexa.delegatedidentity.storage.TokenEncryptor";
    private final LocalAndroidKeyValueStore localAndroidKeyValueStore;

    public TokenEncryptor(LocalAndroidKeyValueStore localAndroidKeyValueStore) {
        this.localAndroidKeyValueStore = localAndroidKeyValueStore;
        initialize();
    }

    private void initialize() {
        try {
            this.localAndroidKeyValueStore.setValue(ENCRYPTION_KEY_IN_SHARED_PREF, encodeToString(Crypto.generateSymmetricKey().toBytes()));
        } catch (Exception e) {
            Log.e(TAG, "Exception caught while setting up encryption key. Not storing encryption key in local KV store.", e);
        }
    }

    @VisibleForTesting
    public byte[] decodeToBytes(String str) {
        return Base64.decode(str, 0);
    }

    public String decrypt(@NonNull String str) {
        SymmetricKey retrieveSymmetricKeyFromStore = retrieveSymmetricKeyFromStore();
        if (retrieveSymmetricKeyFromStore != null) {
            return new String(Crypto.decrypt(decodeToBytes(str), retrieveSymmetricKeyFromStore));
        }
        Log.e(TAG, "Cannot obtain symmetric key for encryption. Unable to get actor token.`");
        return null;
    }

    @VisibleForTesting
    public String encodeToString(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public String encrypt(@NonNull String str) {
        SymmetricKey retrieveSymmetricKeyFromStore = retrieveSymmetricKeyFromStore();
        if (retrieveSymmetricKeyFromStore != null) {
            return encodeToString(Crypto.encrypt(str.getBytes(), retrieveSymmetricKeyFromStore));
        }
        Log.e(TAG, "Cannot obtain symmetric key for encryption. Unable to store actor token.`");
        return null;
    }

    @VisibleForTesting
    public SymmetricKey retrieveSymmetricKeyFromStore() {
        String stringValue = this.localAndroidKeyValueStore.getStringValue(ENCRYPTION_KEY_IN_SHARED_PREF, null);
        if (stringValue != null && !stringValue.isEmpty()) {
            return SymmetricKey.from(decodeToBytes(stringValue));
        }
        Log.e(TAG, "No symmetric key found. Trying to initialize again.");
        initialize();
        return null;
    }
}
