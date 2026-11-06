package com.amazon.alexa.accessory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryScannerListener {
    void onAccessoryScanCancelled();

    void onAccessoryScanCompleted();

    void onAccessoryScanFailed(int i);

    void onAccessoryScanStarted();

    void onBleAccessoryFoundNearby(Accessory accessory, AccessoryScanRecord accessoryScanRecord, int i);

    void onBleDataBeaconFoundNearby(Accessory accessory, AccessoryDataBeaconRecord accessoryDataBeaconRecord, int i);

    void onConnectedAccessoryFound(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord);

    void onConnectedAccessoryLost(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord);
}
