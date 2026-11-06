package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.protocol.Firmware;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda21 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DevicePackage f$0;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda21(DevicePackage devicePackage, int i) {
        this.$r8$classId = i;
        this.f$0 = devicePackage;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        MaybeSource lambda$prepareFirmwareComponentsWithDAVS$18;
        Firmware.FirmwareInformation lambda$getDevicePackageFirmwareInfo$2;
        int i = this.$r8$classId;
        DevicePackage devicePackage = this.f$0;
        switch (i) {
            case 0:
                lambda$prepareFirmwareComponentsWithDAVS$18 = FirmwareCapability.lambda$prepareFirmwareComponentsWithDAVS$18(devicePackage, (Throwable) obj);
                return lambda$prepareFirmwareComponentsWithDAVS$18;
            default:
                lambda$getDevicePackageFirmwareInfo$2 = DevicePackageInformationSupplier.lambda$getDevicePackageFirmwareInfo$2(devicePackage, (List) obj);
                return lambda$getDevicePackageFirmwareInfo$2;
        }
    }
}
