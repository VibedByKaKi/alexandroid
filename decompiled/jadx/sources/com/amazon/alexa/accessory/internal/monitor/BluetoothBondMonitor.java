package com.amazon.alexa.accessory.internal.monitor;

import com.amazon.alexa.accessory.internal.PeripheralDevice;
import com.amazon.alexa.accessory.internal.PeripheralDevices;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BluetoothBondMonitor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Observer {
        void onBondRemoved(PeripheralDevice peripheralDevice);

        void onBondedAdded(PeripheralDevice peripheralDevice);
    }

    void addObserver(Observer observer);

    PeripheralDevices getBondedDevices();

    void removeObserver(Observer observer);
}
