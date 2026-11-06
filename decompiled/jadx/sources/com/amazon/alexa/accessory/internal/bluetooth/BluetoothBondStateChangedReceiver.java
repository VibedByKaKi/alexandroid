package com.amazon.alexa.accessory.internal.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BluetoothBondStateChangedReceiver extends BroadcastReceiver {
    private final Listener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onBondStateChanged(BluetoothDevice bluetoothDevice, int i, int i2);
    }

    public BluetoothBondStateChangedReceiver(Listener listener) {
        Preconditions.notNull(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
        this.listener.onBondStateChanged(bluetoothDevice, intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10), intExtra);
    }
}
