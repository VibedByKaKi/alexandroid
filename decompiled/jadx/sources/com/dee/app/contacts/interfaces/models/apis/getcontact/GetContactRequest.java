package com.dee.app.contacts.interfaces.models.apis.getcontact;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactRequest {
    private GetContactQueryConfig getContactQueryConfig;
    private String targetId;
    private String userId;

    public GetContactRequest(String str) {
        this.targetId = str;
    }

    public GetContactQueryConfig getGetContactQueryConfig() {
        return this.getContactQueryConfig;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setGetContactQueryConfig(GetContactQueryConfig getContactQueryConfig) {
        this.getContactQueryConfig = getContactQueryConfig;
    }

    public void setTargetId(String str) {
        this.targetId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
