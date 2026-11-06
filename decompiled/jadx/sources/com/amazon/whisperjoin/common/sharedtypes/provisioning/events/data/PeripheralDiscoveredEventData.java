package com.amazon.whisperjoin.common.sharedtypes.provisioning.events.data;

import com.amazon.whisperjoin.common.sharedtypes.devices.AbstractPeripheralDeviceDetails;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PeripheralDiscoveredEventData {
    private final AbstractPeripheralDeviceDetails mDeviceDetails;

    public PeripheralDiscoveredEventData(AbstractPeripheralDeviceDetails abstractPeripheralDeviceDetails) {
        if (abstractPeripheralDeviceDetails != null) {
            this.mDeviceDetails = abstractPeripheralDeviceDetails;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceDetails can not be null");
            throw null;
        }
    }

    public AbstractPeripheralDeviceDetails getDeviceDetails() {
        return this.mDeviceDetails;
    }
}
