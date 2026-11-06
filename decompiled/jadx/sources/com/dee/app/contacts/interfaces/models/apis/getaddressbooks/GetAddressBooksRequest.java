package com.dee.app.contacts.interfaces.models.apis.getaddressbooks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetAddressBooksRequest {
    private GetAddressBooksQueryConfig queryConfig = new GetAddressBooksQueryConfig();
    private String userId;

    public GetAddressBooksQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setQueryConfig(GetAddressBooksQueryConfig getAddressBooksQueryConfig) {
        this.queryConfig = getAddressBooksQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
