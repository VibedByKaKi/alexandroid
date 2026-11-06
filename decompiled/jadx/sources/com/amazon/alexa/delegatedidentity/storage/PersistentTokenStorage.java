package com.amazon.alexa.delegatedidentity.storage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.delegatedidentity.model.Token;
import com.amazon.alexa.protocols.datastore.DataStoreService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersistentTokenStorage implements TokenStorage {
    static final String KEY_ACTOR_TOKEN = "DELEGATED_TOKEN_MGMT_ACTOR_TOKEN";
    static final String KEY_DELEGATED_TOKEN = "DELEGATED_TOKEN_MGMT_DELEGATED_TOKEN";
    static final String KEY_DELEGATED_TOKEN_EXPIRY = "DELEGATED_TOKEN_MGMT_DELEGATED_TOKEN_EXPIRY";
    private static final String TAG = "com.amazon.alexa.delegatedidentity.storage.PersistentTokenStorage";
    private final DataStoreService dataStoreService;
    private final TokenEncryptor tokenEncryptor;

    public PersistentTokenStorage(DataStoreService dataStoreService, TokenEncryptor tokenEncryptor) {
        this.dataStoreService = dataStoreService;
        this.tokenEncryptor = tokenEncryptor;
        initialize();
    }

    private Long getDelegatedTokenExpiry() {
        return Long.valueOf(Long.parseLong(this.dataStoreService.retrieveValue(KEY_DELEGATED_TOKEN_EXPIRY)));
    }

    private void initialize() {
        try {
            cleanupTokens();
        } catch (Exception unused) {
            Log.e(TAG, "Exception caught while clearing up existing tokens.");
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.storage.TokenStorage
    public void cleanupTokens() {
        this.dataStoreService.storeValue(KEY_ACTOR_TOKEN, "");
        this.dataStoreService.storeValue(KEY_DELEGATED_TOKEN, "");
        this.dataStoreService.storeValue(KEY_DELEGATED_TOKEN_EXPIRY, "");
    }

    @Override // com.amazon.alexa.delegatedidentity.storage.TokenStorage
    public Token getActorToken() {
        try {
            String retrieveValue = this.dataStoreService.retrieveValue(KEY_ACTOR_TOKEN);
            if (retrieveValue != null && !retrieveValue.isEmpty()) {
                return Token.builder().withValue(this.tokenEncryptor.decrypt(retrieveValue)).withType(Token.TokenType.ACTOR).withExpiry(null).build();
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Exception caught while retrieving actor token. Returning null.", e);
            return null;
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.storage.TokenStorage
    public Token getDelegatedToken() {
        try {
            String retrieveValue = this.dataStoreService.retrieveValue(KEY_DELEGATED_TOKEN);
            if (retrieveValue != null && !retrieveValue.isEmpty()) {
                return Token.builder().withValue(this.tokenEncryptor.decrypt(retrieveValue)).withType(Token.TokenType.DELEGATION).withExpiry(getDelegatedTokenExpiry()).build();
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Exception caught while retrieving delegated token. Returning null.", e);
            return null;
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.storage.TokenStorage
    public void putActorToken(@NonNull Token token) {
        try {
            this.dataStoreService.storeValue(KEY_ACTOR_TOKEN, this.tokenEncryptor.encrypt(token.getValue()));
        } catch (Exception e) {
            Log.e(TAG, "Exception caught while storing actor token. Unable to store actor token.", e);
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.storage.TokenStorage
    public void putDelegatedToken(@NonNull Token token) {
        try {
            this.dataStoreService.storeValue(KEY_DELEGATED_TOKEN, this.tokenEncryptor.encrypt(token.getValue()));
            this.dataStoreService.storeValue(KEY_DELEGATED_TOKEN_EXPIRY, token.getExpiry().toString());
        } catch (Exception e) {
            Log.e(TAG, "Exception caught while storing delegated token.", e);
        }
    }
}
