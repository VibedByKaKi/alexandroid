package com.amazon.whisperbridge.ble;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class GattClientModule {
    private static final String TAG = "GattClientModule";

    public GattClientModule() {
        WJLog.i(TAG, "Creating Android BLE module");
    }

    @Provides
    @Singleton
    public BluetoothGattFactory provideBluetoothGattFactory() {
        return new AndroidBleGattClientFactory();
    }
}
