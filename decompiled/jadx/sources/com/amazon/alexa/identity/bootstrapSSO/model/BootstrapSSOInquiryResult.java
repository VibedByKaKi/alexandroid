package com.amazon.alexa.identity.bootstrapSSO.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class BootstrapSSOInquiryResult {
    private final BootstrapSSOAccount bootstrapSSOAccount;
    private final boolean bootstrapSSOPossible;

    public BootstrapSSOInquiryResult(boolean z, BootstrapSSOAccount bootstrapSSOAccount) {
        this.bootstrapSSOPossible = z;
        this.bootstrapSSOAccount = bootstrapSSOAccount;
    }

    public BootstrapSSOAccount getBootstrapSSOAccount() {
        return this.bootstrapSSOAccount;
    }

    public boolean isBootstrapSSOPossible() {
        return this.bootstrapSSOPossible;
    }
}
