package com.dee.app.contacts.interfaces.models.apis.updatecontact;

import com.dee.app.contacts.interfaces.models.data.Contact;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateContactRequest {
    private Contact contact;
    private String userId;

    public Contact getContact() {
        return this.contact;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
