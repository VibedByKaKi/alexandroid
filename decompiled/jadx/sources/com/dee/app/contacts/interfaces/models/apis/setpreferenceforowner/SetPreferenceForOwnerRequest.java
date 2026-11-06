package com.dee.app.contacts.interfaces.models.apis.setpreferenceforowner;

import com.dee.app.contacts.interfaces.models.data.enums.PreferenceNameSpace;
import com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference.ContactOwnerPreference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetPreferenceForOwnerRequest {
    private ContactOwnerPreference preference;
    private PreferenceNameSpace preferenceNameSpace;
    private SetPreferenceForOwnerQueryConfig queryConfig;
    private String target;
    private String userId;

    public SetPreferenceForOwnerRequest(ContactOwnerPreference contactOwnerPreference, String str, PreferenceNameSpace preferenceNameSpace) {
        this.preference = contactOwnerPreference;
        this.target = str;
        this.preferenceNameSpace = preferenceNameSpace;
    }

    public ContactOwnerPreference getPreference() {
        return this.preference;
    }

    public PreferenceNameSpace getPreferenceNameSpace() {
        return this.preferenceNameSpace;
    }

    public SetPreferenceForOwnerQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getTarget() {
        return this.target;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPreference(ContactOwnerPreference contactOwnerPreference) {
        this.preference = contactOwnerPreference;
    }

    public void setPreferenceNameSpace(PreferenceNameSpace preferenceNameSpace) {
        this.preferenceNameSpace = preferenceNameSpace;
    }

    public void setQueryConfig(SetPreferenceForOwnerQueryConfig setPreferenceForOwnerQueryConfig) {
        this.queryConfig = setPreferenceForOwnerQueryConfig;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public SetPreferenceForOwnerRequest(ContactOwnerPreference contactOwnerPreference, String str) {
        this.preference = contactOwnerPreference;
        this.target = str;
    }
}
