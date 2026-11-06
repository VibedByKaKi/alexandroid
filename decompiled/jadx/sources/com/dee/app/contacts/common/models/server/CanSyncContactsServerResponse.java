package com.dee.app.contacts.common.models.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CanSyncContactsServerResponse {

    @JsonProperty
    private String canSyncStatus;

    public String getCanSyncStatus() {
        return this.canSyncStatus;
    }

    public void setCanSyncStatus(String str) {
        this.canSyncStatus = str;
    }
}
