package com.amazon.whisperjoin.provisionerSDK.devices.basic.connection;

import android.bluetooth.BluetoothDevice;
import com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface BLEConnectionFactory {
    BasicBLEDevice createBleDevice(BluetoothDevice bluetoothDevice);
}
