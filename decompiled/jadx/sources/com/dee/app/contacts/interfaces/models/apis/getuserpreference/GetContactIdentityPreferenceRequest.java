package com.dee.app.contacts.interfaces.models.apis.getuserpreference;

import com.dee.app.contacts.interfaces.models.data.preference.identitypreference.IdentityPreferenceKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactIdentityPreferenceRequest {
    private IdentityPreferenceKey key;
    private String userId;

    public GetContactIdentityPreferenceRequest(String str, IdentityPreferenceKey identityPreferenceKey) {
        this.userId = str;
        this.key = identityPreferenceKey;
    }

    public IdentityPreferenceKey getKey() {
        return this.key;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setKey(IdentityPreferenceKey identityPreferenceKey) {
        this.key = identityPreferenceKey;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public GetContactIdentityPreferenceRequest(IdentityPreferenceKey identityPreferenceKey) {
        this.key = identityPreferenceKey;
    }
}
