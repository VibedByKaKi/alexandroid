package com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2;

import com.dee.app.contacts.interfaces.models.data.Contact;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsV2Response {
    List<Contact> contacts;

    public GetContactsV2Response(List<Contact> list) {
        this.contacts = list;
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void setContacts(List<Contact> list) {
        this.contacts = list;
    }
}
