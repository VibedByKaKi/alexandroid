package com.dee.app.contacts.interfaces.models.apis.setuserpreference;

import com.dee.app.contacts.interfaces.models.data.preference.identitypreference.ContactIdentityPreference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetContactIdentityPreferenceRequest {
    private ContactIdentityPreference preference;
    private String userId;

    public SetContactIdentityPreferenceRequest(String str, ContactIdentityPreference contactIdentityPreference) {
        this.userId = str;
        this.preference = contactIdentityPreference;
    }

    public ContactIdentityPreference getPreference() {
        return this.preference;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPreference(ContactIdentityPreference contactIdentityPreference) {
        this.preference = contactIdentityPreference;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public SetContactIdentityPreferenceRequest(ContactIdentityPreference contactIdentityPreference) {
        this.preference = contactIdentityPreference;
    }
}
