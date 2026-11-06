package com.amazon.whisperbridge.ble;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BluetoothDisabledException extends Exception {
    private static final String TAG = "BluetoothDisabledException";

    public BluetoothDisabledException() {
        super("Bluetooth is not enabled. Please prompt user for permission and enable Bluetooth before calling initializeBluetoothLE.");
        WJLog.e(TAG, getMessage());
    }
}
