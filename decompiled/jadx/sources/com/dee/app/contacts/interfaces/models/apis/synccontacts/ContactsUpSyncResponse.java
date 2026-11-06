package com.dee.app.contacts.interfaces.models.apis.synccontacts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsUpSyncResponse {
    private Boolean isSuccess;
    private String message;

    public ContactsUpSyncResponse(Boolean bool, String str) {
        this.isSuccess = bool;
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public Boolean getSuccess() {
        return this.isSuccess;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(Boolean bool) {
        this.isSuccess = bool;
    }

    public ContactsUpSyncResponse(Boolean bool) {
        this.isSuccess = bool;
    }
}
