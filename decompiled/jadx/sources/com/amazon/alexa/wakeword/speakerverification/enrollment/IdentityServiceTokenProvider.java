package com.amazon.alexa.wakeword.speakerverification.enrollment;

import androidx.annotation.Nullable;
import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.TokenProvider;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.marketplace.api.Marketplace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class IdentityServiceTokenProvider implements TokenProvider {
    private static final String TAG = "IdentityServiceTokenProvider";
    private final IdentityService mIdentityService;

    public IdentityServiceTokenProvider(@Nullable IdentityService identityService) {
        this.mIdentityService = identityService;
    }

    public Marketplace getMarketPlace() {
        IdentityService identityService = this.mIdentityService;
        return identityService != null ? identityService.getUser(TAG).getMarketplace() : Marketplace.USA;
    }

    @Override // com.amazon.alexa.auth.TokenProvider
    @Nullable
    public AccessToken getToken() {
        IdentityService identityService = this.mIdentityService;
        if (identityService != null) {
            return AccessToken.create(identityService.getAccessToken(TAG));
        }
        return null;
    }
}
