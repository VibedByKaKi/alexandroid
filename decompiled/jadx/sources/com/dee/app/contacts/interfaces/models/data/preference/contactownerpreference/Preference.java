package com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference;

import com.dee.app.contacts.interfaces.models.data.enums.PreferenceNameSpace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Preference {
    private ContactOwnerPreference preference;
    private PreferenceNameSpace preferenceNameSpace;
    private String target;

    public ContactOwnerPreference getPreference() {
        return this.preference;
    }

    public PreferenceNameSpace getPreferenceNameSpace() {
        return this.preferenceNameSpace;
    }

    public String getTarget() {
        return this.target;
    }

    public void setPreference(ContactOwnerPreference contactOwnerPreference) {
        this.preference = contactOwnerPreference;
    }

    public void setPreferenceNameSpace(PreferenceNameSpace preferenceNameSpace) {
        this.preferenceNameSpace = preferenceNameSpace;
    }

    public void setTarget(String str) {
        this.target = str;
    }
}
