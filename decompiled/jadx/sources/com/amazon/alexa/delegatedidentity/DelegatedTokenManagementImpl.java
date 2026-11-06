package com.amazon.alexa.delegatedidentity;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.delegatedidentity.api.DelegatedTokenManagement;
import com.amazon.alexa.delegatedidentity.model.Token;
import com.amazon.alexa.delegatedidentity.storage.TokenStorage;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DelegatedTokenManagementImpl implements DelegatedTokenManagement {
    private static final int DELEGATION_TOKEN_EXPIRY = 1800000;
    private static final String TAG = "com.amazon.alexa.delegatedidentity.DelegatedTokenManagementImpl";
    private static final int TOKEN_BUFFER = 600000;
    private final TokenAccessor tokenAccessor;
    private final TokenStorage tokenStorage;

    @Deprecated
    public DelegatedTokenManagementImpl(TokenAccessor tokenAccessor) {
        this.tokenAccessor = tokenAccessor;
        this.tokenStorage = null;
    }

    private String refreshDelegationToken(String str, String str2, boolean z) {
        String retrieveDelegatedTokenFromPIMS = retrieveDelegatedTokenFromPIMS(str, str2, Boolean.valueOf(z));
        if (retrieveDelegatedTokenFromPIMS != null && !TextUtils.isEmpty(retrieveDelegatedTokenFromPIMS)) {
            updateDelegationToken(retrieveDelegatedTokenFromPIMS);
            updateActorToken(str2);
        }
        return retrieveDelegatedTokenFromPIMS;
    }

    private String retrieveDelegatedTokenFromPIMS(String str, String str2, Boolean bool) {
        return this.tokenAccessor.getDelegationTokenForPerson(str, str2, bool);
    }

    private void updateActorToken(String str) {
        this.tokenStorage.putActorToken(Token.builder().withValue(str).withType(Token.TokenType.ACTOR).withExpiry(null).build());
    }

    private void updateDelegationToken(String str) {
        this.tokenStorage.putDelegatedToken(Token.builder().withValue(str).withType(Token.TokenType.DELEGATION).withExpiry(Long.valueOf(System.currentTimeMillis() + 1800000)).build());
    }

    @Override // com.amazon.alexa.delegatedidentity.api.DelegatedTokenManagement
    public String getDelegatedToken(@NonNull String str, @NonNull String str2, boolean z) {
        TokenStorage tokenStorage = this.tokenStorage;
        if (tokenStorage == null) {
            return retrieveDelegatedTokenFromPIMS(str, str2, Boolean.FALSE);
        }
        try {
            Token actorToken = tokenStorage.getActorToken();
            Token delegatedToken = this.tokenStorage.getDelegatedToken();
            if (actorToken != null && delegatedToken != null && str2.equals(actorToken.getValue())) {
                return delegatedToken.getExpiry().longValue() <= System.currentTimeMillis() + 600000 ? refreshDelegationToken(str, str2, false) : delegatedToken.getValue();
            }
            return refreshDelegationToken(str, str2, false);
        } catch (Exception e) {
            Log.e(TAG, "Exception while getting the delegation token.", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.api.DelegatedTokenManagement
    public void initiateDelegation(String str, String str2) {
        TokenStorage tokenStorage = this.tokenStorage;
        TokenAccessor tokenAccessor = this.tokenAccessor;
        if (tokenStorage == null) {
            tokenAccessor.getDelegationTokenForPerson(str, str2, Boolean.TRUE);
            return;
        }
        try {
            String delegationTokenForPerson = tokenAccessor.getDelegationTokenForPerson(str, str2, Boolean.TRUE);
            if (delegationTokenForPerson == null || TextUtils.isEmpty(delegationTokenForPerson)) {
                throw new RuntimeException("Could not retrieve delegation token.");
            }
            this.tokenStorage.cleanupTokens();
            updateDelegationToken(delegationTokenForPerson);
            updateActorToken(str2);
        } catch (Exception e) {
            Log.e(TAG, "Exception while initiating delegation.", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    @Override // com.amazon.alexa.delegatedidentity.api.DelegatedTokenManagement
    public void terminateDelegation(String str) {
        try {
            TokenStorage tokenStorage = this.tokenStorage;
            if (tokenStorage != null) {
                tokenStorage.cleanupTokens();
            }
            this.tokenAccessor.terminateDelegation(str);
        } catch (Exception e) {
            Log.e(TAG, "Exception while terminating delegation.", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public DelegatedTokenManagementImpl(TokenAccessor tokenAccessor, TokenStorage tokenStorage) {
        this.tokenAccessor = tokenAccessor;
        this.tokenStorage = tokenStorage;
    }
}
