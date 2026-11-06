package com.dee.app.contacts.interfaces.models.apis.getcontacts;

import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreferenceKey;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsQueryConfig {
    private boolean includeMergedContacts;
    private List<ContactPreferenceKey> preferencesToInclude;

    public List<ContactPreferenceKey> getPreferencesToInclude() {
        return this.preferencesToInclude;
    }

    public boolean isIncludeMergedContacts() {
        return this.includeMergedContacts;
    }

    public void setIncludeMergedContacts(boolean z) {
        this.includeMergedContacts = z;
    }

    public void setPreferencesToInclude(List<ContactPreferenceKey> list) {
        this.preferencesToInclude = list;
    }
}
