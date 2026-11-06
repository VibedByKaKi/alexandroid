package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.davs.DeviceArtifactContract;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Firmware;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FirmwareUpdateSet {
    List<DeviceArtifactContract.ArtifactPackage> artifactPackages;
    public final List<Firmware.FirmwareComponent> components;
    final DevicePackage devicePackage;

    public FirmwareUpdateSet(DevicePackage devicePackage, List<Firmware.FirmwareComponent> list) {
        this.artifactPackages = Collections.EMPTY_LIST;
        Preconditions.notNull(devicePackage, "devicePackage");
        Preconditions.notNull(list, "components");
        this.devicePackage = devicePackage;
        this.components = list;
    }

    public FirmwareUpdateSet(DevicePackage devicePackage, List<Firmware.FirmwareComponent> list, List<DeviceArtifactContract.ArtifactPackage> list2) {
        List list3 = Collections.EMPTY_LIST;
        this.devicePackage = devicePackage;
        this.components = list;
        this.artifactPackages = list2;
    }
}
