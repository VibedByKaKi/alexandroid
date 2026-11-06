package com.amazon.minerva.client.common.internal.compliance;

import com.amazon.minerva.client.thirdparty.compliance.NonAnonymousCustomerIdProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NonAnonymousCustomerIdProviderAdapter implements NonAnonymousCustomerIdProvider {
    private com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider mNonAnonymousCustomerIdProvider;

    public NonAnonymousCustomerIdProviderAdapter(com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider) {
        this.mNonAnonymousCustomerIdProvider = nonAnonymousCustomerIdProvider;
    }

    @Override // com.amazon.minerva.client.thirdparty.compliance.NonAnonymousCustomerIdProvider
    public String getNonAnonymousCustomerId() throws Exception {
        return this.mNonAnonymousCustomerIdProvider.getNonAnonymousCustomerId();
    }
}
