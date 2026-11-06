package com.dee.app.contacts.interfaces.models.apis.getcontactpreference;

import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactPreferenceResponse {
    private ContactPreference preference;
    private String sourceId;
    private String targetId;

    public ContactPreference getPreference() {
        return this.preference;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public void setPreference(ContactPreference contactPreference) {
        this.preference = contactPreference;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setTargetId(String str) {
        this.targetId = str;
    }
}
