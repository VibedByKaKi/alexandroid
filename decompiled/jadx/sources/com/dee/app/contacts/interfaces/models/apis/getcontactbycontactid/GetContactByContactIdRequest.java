package com.dee.app.contacts.interfaces.models.apis.getcontactbycontactid;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactByContactIdRequest {
    private String targetContactId;
    private String userId;

    public GetContactByContactIdRequest(String str) {
        this.targetContactId = str;
    }

    public String getTargetContactId() {
        return this.targetContactId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setTargetContactId(String str) {
        this.targetContactId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
