package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceDetailsProtoData {
    private final DeviceDetails mDeviceDetails;
    private final String mNetworkSyncToken;

    public DeviceDetailsProtoData(DeviceDetails deviceDetails, String str) {
        this.mDeviceDetails = deviceDetails;
        this.mNetworkSyncToken = str;
    }

    public DeviceDetails getDeviceDetails() {
        return this.mDeviceDetails;
    }

    public String getNetworkSyncToken() {
        return this.mNetworkSyncToken;
    }
}
