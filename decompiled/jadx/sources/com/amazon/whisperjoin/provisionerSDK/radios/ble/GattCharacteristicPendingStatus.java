package com.amazon.whisperjoin.provisionerSDK.radios.ble;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
class GattCharacteristicPendingStatus {
    private final GattCharacteristicPendingUpdate mAddtionalUpdates;
    private final boolean mHandled;

    public GattCharacteristicPendingStatus(boolean z, GattCharacteristicPendingUpdate gattCharacteristicPendingUpdate) {
        this.mHandled = z;
        this.mAddtionalUpdates = gattCharacteristicPendingUpdate;
    }

    public GattCharacteristicPendingUpdate additionalUpdates() {
        return this.mAddtionalUpdates;
    }

    public boolean handled() {
        return this.mHandled;
    }
}
