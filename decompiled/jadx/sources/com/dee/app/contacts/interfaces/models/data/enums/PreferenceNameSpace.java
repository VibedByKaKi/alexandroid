package com.dee.app.contacts.interfaces.models.data.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum PreferenceNameSpace {
    AMAZON("com.amazon"),
    COMMS("com.amazon.comms"),
    PHOTOS("com.amazon.photos"),
    MUSIC("com.amazon.music");

    final String value;

    PreferenceNameSpace(String str) {
        this.value = str;
    }

    public static PreferenceNameSpace getPreferenceNameSpaceKeyForValue(String str) {
        for (PreferenceNameSpace preferenceNameSpace : values()) {
            if (preferenceNameSpace.getValue().equals(str)) {
                return preferenceNameSpace;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }
}
