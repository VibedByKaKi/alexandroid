package com.amazon.alexa.identity.bootstrapSSO.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class BootstrapSSOOptionResult {
    private final BootstrapSSOAccount bootstrapSSOAccount;
    private final BootstrapSSOOptions optionChosen;

    public BootstrapSSOOptionResult(BootstrapSSOOptions bootstrapSSOOptions, BootstrapSSOAccount bootstrapSSOAccount) {
        this.optionChosen = bootstrapSSOOptions;
        this.bootstrapSSOAccount = bootstrapSSOAccount;
    }

    public BootstrapSSOAccount getBootstrapSSOAccount() {
        return this.bootstrapSSOAccount;
    }

    public BootstrapSSOOptions getOptionChosen() {
        return this.optionChosen;
    }
}
