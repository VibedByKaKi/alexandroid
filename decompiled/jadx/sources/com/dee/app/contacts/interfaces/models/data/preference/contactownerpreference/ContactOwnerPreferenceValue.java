package com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference;

import com.amazon.clouddrive.cdasdk.aps.account.FeatureState;
import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ContactOwnerPreferenceValue implements IPreferenceValue<String> {
    ENABLED("enabled"),
    DISABLED(FeatureState.DISABLED),
    SELECTIVE_IMPORT("selective-import");

    private String value;

    ContactOwnerPreferenceValue(String str) {
        this.value = str;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue
    public String getPreferenceValueAsString() {
        return String.valueOf(this.value);
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
