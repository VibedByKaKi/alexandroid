package com.amazon.alexa.seamlessswitching.capability.model;

import com.amazon.alexa.seamlessswitching.capability.model.AutoValue_AccessoryBluetoothState;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class AccessoryBluetoothState {
    public static AccessoryBluetoothState create(AlexaDevice alexaDevice, List<PairedDevice> list) {
        return new AutoValue_AccessoryBluetoothState(alexaDevice, list);
    }

    public static TypeAdapter<AccessoryBluetoothState> typeAdapter(Gson gson) {
        return new AutoValue_AccessoryBluetoothState.GsonTypeAdapter(gson);
    }

    public abstract AlexaDevice getAlexaDevice();

    public abstract List<PairedDevice> getPairedDevices();
}
