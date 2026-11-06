package com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference;

import com.amazon.deecomms.common.Constants;
import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ContactOwnerPreferenceKey implements IPreferenceKey<String> {
    AMAZON_CONTACTS("AMAZON_CONTACTS", new String[0]),
    CONTACT_IMPORT(Constants.CONTACT_IMPORT, new String[0]),
    AUTO_DISCOVERY("AUTO_DISCOVERY", new String[0]),
    PHONE_NUMBER_VERIFIED("PHONE_NUMBER_VERIFIED", new String[0]),
    UNKNOWN_KEY("UNKNOWN_KEY", new String[0]);

    private final String primaryKey;
    private final List<String> secondaryKeys;

    ContactOwnerPreferenceKey(String str, String... strArr) {
        this.primaryKey = str;
        this.secondaryKeys = Arrays.asList(strArr);
    }

    public static ContactOwnerPreferenceKey getPreferenceKey(String str) {
        for (ContactOwnerPreferenceKey contactOwnerPreferenceKey : values()) {
            if (contactOwnerPreferenceKey.getPreferenceKeyAsString().equals(str) || contactOwnerPreferenceKey.secondaryKeys.contains(str)) {
                return contactOwnerPreferenceKey;
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
