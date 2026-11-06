package com.dee.app.contacts.interfaces.models.data.enums;

import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum PreferenceLevel {
    HOME_GROUP(Constants.ACMS_CONTACT_PREFERENCE_LEVEL_HG),
    NONE("None");

    private String preferenceLevel;

    PreferenceLevel(String str) {
        this.preferenceLevel = str;
    }

    public String getPreferenceLevel() {
        return this.preferenceLevel;
    }
}
