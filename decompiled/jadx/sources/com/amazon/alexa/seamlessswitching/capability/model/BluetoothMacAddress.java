package com.amazon.alexa.seamlessswitching.capability.model;

import com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class BluetoothMacAddress implements StronglyTypedString {
    public static BluetoothMacAddress create(String str) {
        return new AutoValue_BluetoothMacAddress(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<BluetoothMacAddress> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<BluetoothMacAddress>() { // from class: com.amazon.alexa.seamlessswitching.capability.model.BluetoothMacAddress.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString.StronglyTypedStringAdapter
            public BluetoothMacAddress instantiate(String str) {
                return BluetoothMacAddress.create(str);
            }
        };
    }
}
