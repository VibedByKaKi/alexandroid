package com.dee.app.contacts.interfaces.models.apis.deletecontact;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteContactResponse {
    private String contactId;
    private String serverContactId;
    private boolean success;

    public String getContactId() {
        return this.contactId;
    }

    public String getServerContactId() {
        return this.serverContactId;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setServerContactId(String str) {
        this.serverContactId = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
