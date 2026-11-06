package com.amazon.alexa.seamlessswitching.capability.model;

import com.amazon.alexa.seamlessswitching.capability.model.AutoValue_BluetoothState;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class BluetoothState {
    public static BluetoothState create(Set<AccessoryBluetoothState> set) {
        return new AutoValue_BluetoothState(set);
    }

    public static TypeAdapter<BluetoothState> typeAdapter(Gson gson) {
        return new AutoValue_BluetoothState.GsonTypeAdapter(gson);
    }

    public abstract Set<AccessoryBluetoothState> getBluetoothStates();
}
