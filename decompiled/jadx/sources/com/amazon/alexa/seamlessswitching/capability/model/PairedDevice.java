package com.amazon.alexa.seamlessswitching.capability.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.seamlessswitching.capability.model.AutoValue_PairedDevice;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class PairedDevice {
    public static PairedDevice create(BluetoothMacAddress bluetoothMacAddress) {
        return new AutoValue_PairedDevice(null, bluetoothMacAddress, null);
    }

    public static TypeAdapter<PairedDevice> typeAdapter(Gson gson) {
        return new AutoValue_PairedDevice.GsonTypeAdapter(gson);
    }

    public abstract BluetoothMacAddress getAddress();

    @Nullable
    public abstract ConnectionState getConnectionState();

    @Nullable
    public abstract FriendlyName getFriendlyName();

    public static PairedDevice create(FriendlyName friendlyName, BluetoothMacAddress bluetoothMacAddress, ConnectionState connectionState) {
        return new AutoValue_PairedDevice(friendlyName, bluetoothMacAddress, connectionState);
    }
}
