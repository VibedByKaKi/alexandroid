package com.amazon.deecomms.ndt.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PersonalizedAccount {

    @JsonProperty("commsId")
    private String commsId;

    @JsonProperty("isChildAccount")
    private boolean isChildAccount;

    public String getCommsId() {
        return this.commsId;
    }

    public boolean isChildAccount() {
        return this.isChildAccount;
    }

    public void setChildAccount(boolean z) {
        this.isChildAccount = z;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }
}
