package com.dee.app.contacts.interfaces.models.apis.querycontacts;

import com.dee.app.contacts.interfaces.models.data.enums.ContactType;
import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreferenceKey;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class QueryContactsWithAttributesFilterConfig {
    private List<ContactPreferenceKey> contactPreferences;
    private List<ContactType> contactTypes;
    private List<QueryContactAttributeIDFilterConfig> ids;
    private boolean includeMergedContacts;
    private String name;

    public List<ContactPreferenceKey> getContactPreferences() {
        return this.contactPreferences;
    }

    public List<ContactType> getContactTypes() {
        return this.contactTypes;
    }

    public List<QueryContactAttributeIDFilterConfig> getIds(List<QueryContactAttributeIDFilterConfig> list) {
        return this.ids;
    }

    public boolean isIncludeMergedContacts() {
        return this.includeMergedContacts;
    }

    public void setContactPreferences(List<ContactPreferenceKey> list) {
        this.contactPreferences = list;
    }

    public void setContactTypes(List<ContactType> list) {
        this.contactTypes = list;
    }

    public void setIds(List<QueryContactAttributeIDFilterConfig> list) {
        this.ids = list;
    }

    public void setIncludeMergedContacts(boolean z) {
        this.includeMergedContacts = z;
    }

    public void setName(String str) {
        this.name = str;
    }
}
