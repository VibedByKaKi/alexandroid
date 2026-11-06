package com.amazon.alexa.accessory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class UnavailableDeviceManufacturerSupplier implements DeviceManufacturerSupplier {
    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public String getDeviceOwnerId(String str) {
        return null;
    }

    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public boolean isFirstParty(String str) {
        return false;
    }

    @Override // com.amazon.alexa.accessory.DeviceManufacturerSupplier
    public boolean isFwUpdateSupported(String str) {
        return true;
    }
}
