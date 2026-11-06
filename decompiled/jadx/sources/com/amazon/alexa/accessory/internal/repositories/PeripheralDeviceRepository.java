package com.amazon.alexa.accessory.internal.repositories;

import com.amazon.alexa.accessory.internal.PeripheralDevice;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface PeripheralDeviceRepository {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onConnectedBluetoothDevicesFound(Set<PeripheralDevice> set);

        void onQueryFailed(Throwable th);
    }

    void queryConnectedBluetoothDevices(Callback callback);
}
