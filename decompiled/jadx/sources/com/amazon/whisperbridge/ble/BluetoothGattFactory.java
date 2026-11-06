package com.amazon.whisperbridge.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface BluetoothGattFactory {
    BluetoothGatt createGattClient(Context context, BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback, boolean z);
}
