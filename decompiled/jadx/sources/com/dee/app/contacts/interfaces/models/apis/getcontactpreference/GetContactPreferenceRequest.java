package com.dee.app.contacts.interfaces.models.apis.getcontactpreference;

import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreferenceKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactPreferenceRequest {
    private ContactPreferenceKey preferenceKey;
    private String targetId;
    private String userId;

    public GetContactPreferenceRequest(String str, String str2, ContactPreferenceKey contactPreferenceKey) {
        this.targetId = str2;
        this.preferenceKey = contactPreferenceKey;
        this.userId = str;
    }

    public ContactPreferenceKey getPreferenceKey() {
        return this.preferenceKey;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPreferenceKey(ContactPreferenceKey contactPreferenceKey) {
        this.preferenceKey = contactPreferenceKey;
    }

    public void setTargetId(String str) {
        this.targetId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public GetContactPreferenceRequest(String str, ContactPreferenceKey contactPreferenceKey) {
        this.targetId = str;
        this.preferenceKey = contactPreferenceKey;
    }
}
