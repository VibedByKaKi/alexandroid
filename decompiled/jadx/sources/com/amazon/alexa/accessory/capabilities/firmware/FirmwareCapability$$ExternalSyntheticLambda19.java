package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.protocol.Firmware;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda19 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability f$0;
    public final /* synthetic */ DevicePackage f$1;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda19(FirmwareCapability firmwareCapability, DevicePackage devicePackage, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareCapability;
        this.f$1 = devicePackage;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        MaybeSource lambda$getArtifactsFromDevicePackage$24;
        SingleSource lambda$getArtifactsFromDevicePackage$23;
        MaybeSource lambda$prepareFirmwareComponentsWithDAVS$19;
        MaybeSource lambda$prepareFirmwareComponentsWithDAVS$22;
        switch (this.$r8$classId) {
            case 0:
                lambda$getArtifactsFromDevicePackage$24 = this.f$0.lambda$getArtifactsFromDevicePackage$24(this.f$1, (List) obj);
                return lambda$getArtifactsFromDevicePackage$24;
            case 1:
                lambda$getArtifactsFromDevicePackage$23 = this.f$0.lambda$getArtifactsFromDevicePackage$23(this.f$1, (List) obj);
                return lambda$getArtifactsFromDevicePackage$23;
            case 2:
                lambda$prepareFirmwareComponentsWithDAVS$19 = this.f$0.lambda$prepareFirmwareComponentsWithDAVS$19(this.f$1, (Firmware.FirmwareInformation) obj);
                return lambda$prepareFirmwareComponentsWithDAVS$19;
            default:
                lambda$prepareFirmwareComponentsWithDAVS$22 = this.f$0.lambda$prepareFirmwareComponentsWithDAVS$22(this.f$1, (List) obj);
                return lambda$prepareFirmwareComponentsWithDAVS$22;
        }
    }
}
