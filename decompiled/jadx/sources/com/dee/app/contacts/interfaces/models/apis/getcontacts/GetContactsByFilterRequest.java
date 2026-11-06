package com.dee.app.contacts.interfaces.models.apis.getcontacts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsByFilterRequest extends GetContactsRequest {
    private GetContactsFilterConfig filterConfig;
    private GetContactsQueryConfig queryConfig;

    public GetContactsFilterConfig getFilterConfig() {
        return this.filterConfig;
    }

    public GetContactsQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public void setFilterConfig(GetContactsFilterConfig getContactsFilterConfig) {
        this.filterConfig = getContactsFilterConfig;
    }

    public void setQueryConfig(GetContactsQueryConfig getContactsQueryConfig) {
        this.queryConfig = getContactsQueryConfig;
    }
}
