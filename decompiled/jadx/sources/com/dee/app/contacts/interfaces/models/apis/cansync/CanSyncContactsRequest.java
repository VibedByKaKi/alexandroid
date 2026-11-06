package com.dee.app.contacts.interfaces.models.apis.cansync;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CanSyncContactsRequest {
    private CanSyncContactsQueryConfig queryConfig;
    private String userId;

    public CanSyncContactsRequest(String str, CanSyncContactsQueryConfig canSyncContactsQueryConfig) {
        this.userId = str;
        this.queryConfig = canSyncContactsQueryConfig;
    }

    public CanSyncContactsQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setQueryConfig(CanSyncContactsQueryConfig canSyncContactsQueryConfig) {
        this.queryConfig = canSyncContactsQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public CanSyncContactsRequest(CanSyncContactsQueryConfig canSyncContactsQueryConfig) {
        this.queryConfig = canSyncContactsQueryConfig;
    }

    public CanSyncContactsRequest() {
    }
}
