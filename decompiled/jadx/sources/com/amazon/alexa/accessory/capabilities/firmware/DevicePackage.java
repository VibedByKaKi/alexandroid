package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DevicePackage {
    public final FirmwareContract.Package aPackage;
    public final int deviceId;
    public final String deviceType;
    public final String dsn;
    public final int segmentSize;

    public DevicePackage(FirmwareContract.Package r2, int i, String str, String str2, int i2) {
        Preconditions.notNull(r2, "aPackage");
        Preconditions.notNull(str, "deviceType");
        Preconditions.notNull(str2, "dsn");
        this.aPackage = r2;
        this.deviceId = i;
        this.deviceType = str;
        this.dsn = str2;
        this.segmentSize = i2;
    }
}
