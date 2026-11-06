package com.amazon.alexa.voiceui.cards;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.marketplace.MarketplaceAuthority;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class DefaultMarketplaceAuthority implements MarketplaceAuthority {
    private String marketplace;

    @Inject
    public DefaultMarketplaceAuthority() {
    }

    @Override // com.amazon.alexa.voice.ui.marketplace.MarketplaceAuthority
    @Nullable
    public String getMarketplace() {
        return this.marketplace;
    }

    public void setMarketplace(String str) {
        this.marketplace = str;
    }
}
