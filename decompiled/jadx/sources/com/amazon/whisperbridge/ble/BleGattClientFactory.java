package com.amazon.whisperbridge.ble;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import com.amazon.whisperbridge.ble.BleGattClient;
import com.amazon.whisperbridge.ble.command.BleCommand;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.LinkedList;
import java.util.Queue;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class BleGattClientFactory {
    private static final BleGattClientFactory INSTANCE;
    private static final String TAG = "BleGattClientFactory";

    @Inject
    BluetoothGattFactory mBluetoothGattFactory;

    static {
        BleGattClientFactoryComponent create = DaggerBleGattClientFactoryComponent.create();
        BleGattClientFactory bleGattClientFactory = new BleGattClientFactory();
        create.inject(bleGattClientFactory);
        INSTANCE = bleGattClientFactory;
    }

    public static BleGattClientFactory getInstance() {
        return INSTANCE;
    }

    public BleGattClient createGattClient(Context context, BluetoothDevice bluetoothDevice, BleGattClient.Callback callback, boolean z) {
        return createGattClientWithCommandQueue(context, bluetoothDevice, callback, z, new LinkedList());
    }

    public BleGattClient createGattClientWithCommandQueue(Context context, BluetoothDevice bluetoothDevice, BleGattClient.Callback callback, boolean z, Queue<BleCommand> queue) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context cannot be null.");
            return null;
        }
        if (bluetoothDevice == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("btDevice cannot be null.");
            return null;
        }
        if (callback == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("callback cannot be null.");
            return null;
        }
        if (queue == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("commandQueue cannot be null.");
            return null;
        }
        BleGattClient bleGattClient = new BleGattClient(bluetoothDevice, callback, queue);
        WJLog.i(TAG, "Creating GATT client on build Version = " + Build.VERSION.SDK_INT);
        bleGattClient.setBluetoothGatt(this.mBluetoothGattFactory.createGattClient(context, bluetoothDevice, bleGattClient.getGattCallback(), z));
        if (bleGattClient.getBluetoothGatt() != null) {
            return bleGattClient;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Failed to open Android BluetoothGatt.");
        return null;
    }

    public BleGattClient createScapGattClient(Context context, BluetoothDevice bluetoothDevice, BleGattClient.ScapCallback scapCallback, boolean z) {
        return createScapGattClientWithCommandQueue(context, bluetoothDevice, scapCallback, z, new LinkedList());
    }

    public BleGattClient createScapGattClientWithCommandQueue(Context context, BluetoothDevice bluetoothDevice, BleGattClient.ScapCallback scapCallback, boolean z, Queue<BleCommand> queue) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context cannot be null.");
            return null;
        }
        if (bluetoothDevice == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("btDevice cannot be null.");
            return null;
        }
        if (scapCallback == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("callback cannot be null.");
            return null;
        }
        if (queue == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("commandQueue cannot be null.");
            return null;
        }
        BleGattClient bleGattClient = new BleGattClient(bluetoothDevice, scapCallback, queue);
        WJLog.i(TAG, "Creating GATT client on build Version = " + Build.VERSION.SDK_INT);
        bleGattClient.setBluetoothGatt(this.mBluetoothGattFactory.createGattClient(context, bluetoothDevice, bleGattClient.getGattCallback(), z));
        if (bleGattClient.getBluetoothGatt() != null) {
            return bleGattClient;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Failed to open Android BluetoothGatt.");
        return null;
    }
}
