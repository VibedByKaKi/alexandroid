package com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2;

import com.dee.app.contacts.interfaces.models.apis.getcontacts.GetContactsRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsV2Request extends GetContactsRequest {
    private GetContactsV2QueryConfig queryConfig;
    private String userId;

    public GetContactsV2Request(String str, GetContactsV2QueryConfig getContactsV2QueryConfig) {
        this.userId = str;
        this.queryConfig = getContactsV2QueryConfig;
    }

    public GetContactsV2QueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setQueryConfig(GetContactsV2QueryConfig getContactsV2QueryConfig) {
        this.queryConfig = getContactsV2QueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public GetContactsV2Request() {
    }
}
