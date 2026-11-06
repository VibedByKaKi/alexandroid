package com.dee.app.contacts.interfaces.models.apis.deleteaddressbooks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteAddressBooksRequest {
    private DeleteAddressBooksQueryConfig queryConfig = new DeleteAddressBooksQueryConfig();
    private String userId;

    public DeleteAddressBooksQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setQueryConfig(DeleteAddressBooksQueryConfig deleteAddressBooksQueryConfig) {
        this.queryConfig = deleteAddressBooksQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
