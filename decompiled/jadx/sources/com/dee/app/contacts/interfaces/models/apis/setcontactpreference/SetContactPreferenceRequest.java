package com.dee.app.contacts.interfaces.models.apis.setcontactpreference;

import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetContactPreferenceRequest {
    private ContactPreference preference;
    private String targetId;
    private String userId;

    public SetContactPreferenceRequest(String str, String str2, ContactPreference contactPreference) {
        this.targetId = str2;
        this.preference = contactPreference;
        this.userId = str;
    }

    public ContactPreference getPreference() {
        return this.preference;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPreference(ContactPreference contactPreference) {
        this.preference = contactPreference;
    }

    public void setTargetId(String str) {
        this.targetId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public SetContactPreferenceRequest(String str, ContactPreference contactPreference) {
        this.targetId = str;
        this.preference = contactPreference;
    }
}
