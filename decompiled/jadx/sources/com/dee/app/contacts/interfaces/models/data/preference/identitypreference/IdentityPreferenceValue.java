package com.dee.app.contacts.interfaces.models.data.preference.identitypreference;

import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum IdentityPreferenceValue implements IPreferenceValue<String> {
    ALL_CONTACTS("ALL_CONTACTS"),
    FAVORITES_ONLY("FAVORITES_ONLY"),
    ENABLED("true"),
    DISABLED("false");

    private String value;

    IdentityPreferenceValue(String str) {
        this.value = str;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue
    public String getPreferenceValueAsString() {
        return this.value;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue
    public boolean isPreferenceValueForString(String str) {
        return Objects.equals(this.value, str);
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue
    public String getPreferenceValue() {
        return this.value;
    }
}
