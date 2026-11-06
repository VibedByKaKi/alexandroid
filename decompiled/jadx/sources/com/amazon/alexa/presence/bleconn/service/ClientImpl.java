package com.amazon.alexa.presence.bleconn.service;

import android.bluetooth.BluetoothDevice;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ClientImpl implements Client {
    private final BluetoothDevice device;

    public ClientImpl(BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice);
        this.device = bluetoothDevice;
    }

    @Override // com.amazon.alexa.presence.bleconn.service.Client
    public String getAddress() {
        return this.device.getAddress();
    }
}
