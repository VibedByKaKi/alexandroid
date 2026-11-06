package com.amazon.whisperjoin.provisioning.identity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DeviceDetails {
    public final String firmwareRevision;
    public final String hardwareRevision;
    public final String manufacturer;
    public final String modelNumber;
    public final String serialNumber;

    public DeviceDetails(String str, String str2, String str3, String str4, String str5) {
        this.manufacturer = str;
        this.serialNumber = str2;
        this.modelNumber = str3;
        this.hardwareRevision = str4;
        this.firmwareRevision = str5;
    }
}
