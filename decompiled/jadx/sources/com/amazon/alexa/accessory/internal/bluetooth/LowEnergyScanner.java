package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.PeripheralDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface LowEnergyScanner {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onPeripheralFound(PeripheralDevice peripheralDevice, BleAdvertisementData bleAdvertisementData, int i);

        void onScanCancelled();

        void onScanCompleted();

        void onScanFailed(int i);

        void onScanStarted();
    }

    void cancelScan(Listener listener);

    boolean isScanning(Listener listener);

    boolean startScan(Listener listener);
}
