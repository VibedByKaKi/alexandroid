package com.amazon.minerva.client.common.internal.provider;

import com.amazon.minerva.client.thirdparty.api.provider.CustomerInfoProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomerInfoProviderAdapter implements CustomerInfoProvider {
    private com.amazon.minerva.client.common.api.provider.CustomerInfoProvider mCustomerInfoProvider;

    public CustomerInfoProviderAdapter(com.amazon.minerva.client.common.api.provider.CustomerInfoProvider customerInfoProvider) {
        this.mCustomerInfoProvider = customerInfoProvider;
    }

    @Override // com.amazon.minerva.client.thirdparty.api.provider.CustomerInfoProvider
    public String getCountryOfResidence() {
        return this.mCustomerInfoProvider.getCountryOfResidence();
    }

    @Override // com.amazon.minerva.client.thirdparty.api.provider.CustomerInfoProvider
    public String getMarketplaceId() {
        return this.mCustomerInfoProvider.getMarketplaceId();
    }
}
