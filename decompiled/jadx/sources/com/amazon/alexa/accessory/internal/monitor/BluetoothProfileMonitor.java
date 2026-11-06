package com.amazon.alexa.accessory.internal.monitor;

import com.amazon.alexa.accessory.internal.PeripheralDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BluetoothProfileMonitor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Observer {
        void onProfileConnected(PeripheralDevice peripheralDevice, int i);

        void onProfileDisconnected(PeripheralDevice peripheralDevice, int i);
    }

    void addObserver(Observer observer);

    void removeObserver(Observer observer);
}
