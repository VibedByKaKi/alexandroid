package com.dee.app.contacts.common.models.server;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PreferenceForOwnerResponse {
    private List<PreferenceForOwner> preferences;

    public PreferenceForOwnerResponse(List<PreferenceForOwner> list) {
        this.preferences = list;
    }

    public List<PreferenceForOwner> getPreferences() {
        return this.preferences;
    }

    public void setPreferences(List<PreferenceForOwner> list) {
        this.preferences = list;
    }

    public PreferenceForOwnerResponse() {
    }
}
