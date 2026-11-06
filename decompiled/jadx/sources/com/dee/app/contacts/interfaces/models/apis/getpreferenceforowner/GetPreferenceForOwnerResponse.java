package com.dee.app.contacts.interfaces.models.apis.getpreferenceforowner;

import com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference.Preference;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPreferenceForOwnerResponse {
    private List<Preference> preferenceList;

    public List<Preference> getPreferenceList() {
        return this.preferenceList;
    }

    public void setPreferenceList(List<Preference> list) {
        this.preferenceList = list;
    }
}
