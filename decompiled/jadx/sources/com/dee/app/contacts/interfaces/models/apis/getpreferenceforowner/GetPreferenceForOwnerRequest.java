package com.dee.app.contacts.interfaces.models.apis.getpreferenceforowner;

import com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference.ContactOwnerPreferenceKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPreferenceForOwnerRequest {
    private ContactOwnerPreferenceKey preferenceKey;
    private GetPreferenceForOwnerQueryConfig queryConfig;
    private String userId;

    public GetPreferenceForOwnerRequest(ContactOwnerPreferenceKey contactOwnerPreferenceKey) {
        this.preferenceKey = contactOwnerPreferenceKey;
    }

    public ContactOwnerPreferenceKey getPreferenceKey() {
        return this.preferenceKey;
    }

    public GetPreferenceForOwnerQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPreferenceKey(ContactOwnerPreferenceKey contactOwnerPreferenceKey) {
        this.preferenceKey = contactOwnerPreferenceKey;
    }

    public void setQueryConfig(GetPreferenceForOwnerQueryConfig getPreferenceForOwnerQueryConfig) {
        this.queryConfig = getPreferenceForOwnerQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
