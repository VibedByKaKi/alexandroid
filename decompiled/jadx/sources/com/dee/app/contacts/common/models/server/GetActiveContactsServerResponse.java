package com.dee.app.contacts.common.models.server;

import com.dee.app.contacts.interfaces.models.data.PresenceContact;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetActiveContactsServerResponse {

    @JsonProperty("contactsPresences")
    private List<PresenceContact> contactsPresences;

    public List<PresenceContact> getContactsPresences() {
        return this.contactsPresences;
    }

    public void setContactsPresences(List<PresenceContact> list) {
        this.contactsPresences = list;
    }
}
