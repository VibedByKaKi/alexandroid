package com.amazon.ds2.oobe.metrics.minerva.common;

import com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultNonAnonymousCustomerIdProvider implements NonAnonymousCustomerIdProvider {
    public static final String UNKNOWN = "UNKNOWN";
    private String customerId;

    @Override // com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider
    public String getNonAnonymousCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }
}
