package com.dee.app.contacts.interfaces.models.data.preference;

import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceKey;
import com.dee.app.contacts.interfaces.models.data.preference.IPreferenceValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface IPreference<K extends IPreferenceKey, V extends IPreferenceValue> {
    K getPreferenceKey();

    V getPreferenceValue();
}
