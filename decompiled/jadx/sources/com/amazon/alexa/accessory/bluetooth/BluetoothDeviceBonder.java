package com.amazon.alexa.accessory.bluetooth;

import android.bluetooth.BluetoothDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BluetoothDeviceBonder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onBondCompleted(BluetoothDevice bluetoothDevice);

        void onBondFailed(BluetoothDevice bluetoothDevice);
    }

    void cancel();

    void cancel(BluetoothDevice bluetoothDevice);

    void createBond(BluetoothDevice bluetoothDevice, int i, Callback callback);
}
