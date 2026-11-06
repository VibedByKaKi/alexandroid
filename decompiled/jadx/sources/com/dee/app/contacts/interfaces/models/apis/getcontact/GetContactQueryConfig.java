package com.dee.app.contacts.interfaces.models.apis.getcontact;

import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreferenceKey;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactQueryConfig {
    private List<ContactPreferenceKey> preferencesToBeIncluded;

    public List<ContactPreferenceKey> getPreferencesToBeIncluded() {
        return this.preferencesToBeIncluded;
    }

    public void setPreferencesToBeIncluded(List<ContactPreferenceKey> list) {
        this.preferencesToBeIncluded = list;
    }
}
