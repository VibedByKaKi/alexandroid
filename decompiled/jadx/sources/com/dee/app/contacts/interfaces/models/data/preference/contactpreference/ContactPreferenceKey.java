package com.dee.app.contacts.interfaces.models.data.preference.contactpreference;

import com.amazon.deecomms.common.Constants;
import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ContactPreferenceKey implements IPreferenceKey<String> {
    DROP_IN(Constants.CONTACT_PREF_DROP_IN, "DropIn"),
    EMERGENCY_CONTACT("EMERGENCY_CONTACT", new String[0]),
    FAVORITE_CONTACT("FAVORITE_CONTACT", new String[0]),
    UNKNOWN_KEY("UNKNOWN_KEY", new String[0]);

    private final String primaryKey;
    private final List<String> secondaryKeys;

    ContactPreferenceKey(String str, String... strArr) {
        this.primaryKey = str;
        this.secondaryKeys = Arrays.asList(strArr);
    }

    public static ContactPreferenceKey getPreferenceKey(String str) {
        for (ContactPreferenceKey contactPreferenceKey : values()) {
            if (contactPreferenceKey.getPreferenceKeyAsString().equals(str) || contactPreferenceKey.secondaryKeys.contains(str)) {
                return contactPreferenceKey;
            }
        }
        return UNKNOWN_KEY;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey
    public String getPreferenceKeyAsString() {
        return this.primaryKey;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey
    public boolean isPreferenceKeyForString(String str) {
        return this.primaryKey.equals(str) || this.secondaryKeys.contains(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.primaryKey;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey
    public String getPreferenceKey() {
        return this.primaryKey;
    }
}
