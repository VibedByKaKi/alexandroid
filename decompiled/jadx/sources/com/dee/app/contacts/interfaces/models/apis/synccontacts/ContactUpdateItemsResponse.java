package com.dee.app.contacts.interfaces.models.apis.synccontacts;

import com.dee.app.contacts.interfaces.models.data.ContactForSync;
import com.dee.app.contacts.interfaces.models.data.enums.ContactSourceType;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactUpdateItemsResponse {
    private ContactSourceType contactSourceType;
    private List<ContactForSync> deleteOnlyItems;
    private List<ContactForSync> nonDeleteItems;

    public ContactUpdateItemsResponse(List<ContactForSync> list, List<ContactForSync> list2, ContactSourceType contactSourceType) {
        this.deleteOnlyItems = list;
        this.nonDeleteItems = list2;
        this.contactSourceType = contactSourceType;
    }

    public ContactSourceType getContactSourceType() {
        return this.contactSourceType;
    }

    public List<ContactForSync> getDeleteOnlyItems() {
        return this.deleteOnlyItems;
    }

    public List<ContactForSync> getNonDeleteItems() {
        return this.nonDeleteItems;
    }

    public void setContactSourceType(ContactSourceType contactSourceType) {
        this.contactSourceType = contactSourceType;
    }

    public void setDeleteOnlyItems(List<ContactForSync> list) {
        this.deleteOnlyItems = list;
    }

    public void setNonDeleteItems(List<ContactForSync> list) {
        this.nonDeleteItems = list;
    }
}
