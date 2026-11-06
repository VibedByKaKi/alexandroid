package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.protocol.Device;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryInteractor$$ExternalSyntheticLambda1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryInteractor$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$getDeviceTypeFromAccessory$12;
        int lambda$getPrimaryDeviceType$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$getDeviceTypeFromAccessory$12 = AccessoryInteractor.lambda$getDeviceTypeFromAccessory$12((Device.DeviceInformation) obj, (Device.DeviceInformation) obj2);
                return lambda$getDeviceTypeFromAccessory$12;
            default:
                lambda$getPrimaryDeviceType$1 = AccessoryPresenceNotifier.lambda$getPrimaryDeviceType$1((com.amazon.alexa.accessory.repositories.device.v2.Device) obj, (com.amazon.alexa.accessory.repositories.device.v2.Device) obj2);
                return lambda$getPrimaryDeviceType$1;
        }
    }
}
