package com.amazon.alexa.voice.ui;

import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.CountryCode;
import com.amazon.alexa.voice.ui.marketplace.MarketplaceAuthority;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DefaultMarketplaceAuthority implements MarketplaceAuthority {
    private static final String TAG = "DefaultMarketplaceAuthority";
    private final IdentityService identityService;

    public DefaultMarketplaceAuthority(IdentityService identityService) {
        this.identityService = identityService;
    }

    @Override // com.amazon.alexa.voice.ui.marketplace.MarketplaceAuthority
    public String getMarketplace() {
        UserIdentity user = this.identityService.getUser(TAG);
        return user != null ? user.getEffectiveMarketplace().getCountryCode().name() : CountryCode.US.name();
    }
}
