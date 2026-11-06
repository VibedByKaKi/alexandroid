package com.dee.app.contacts.interfaces.models.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Contacts {
    private List<Contact> contacts;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Contacts) {
            return Objects.equal(this.contacts, ((Contacts) obj).contacts);
        }
        return false;
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public int hashCode() {
        return Objects.hashCode(this.contacts);
    }

    public void setContacts(List<Contact> list) {
        this.contacts = list;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("contacts", this.contacts).toString();
    }
}
