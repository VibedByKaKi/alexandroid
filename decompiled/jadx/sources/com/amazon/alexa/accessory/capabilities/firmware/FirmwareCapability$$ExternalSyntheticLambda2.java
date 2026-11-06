package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.protocol.Device;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability f$0;
    public final /* synthetic */ Device.DeviceInformation f$1;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda2(FirmwareCapability firmwareCapability, Device.DeviceInformation deviceInformation, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareCapability;
        this.f$1 = deviceInformation;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$observeDAVSArtifactsAvailability$47;
        SingleSource lambda$fetchAndPrepareArtifactUpdateBundle$52;
        switch (this.$r8$classId) {
            case 0:
                lambda$observeDAVSArtifactsAvailability$47 = this.f$0.lambda$observeDAVSArtifactsAvailability$47(this.f$1, (Integer) obj);
                return lambda$observeDAVSArtifactsAvailability$47;
            default:
                lambda$fetchAndPrepareArtifactUpdateBundle$52 = this.f$0.lambda$fetchAndPrepareArtifactUpdateBundle$52(this.f$1, (List) obj);
                return lambda$fetchAndPrepareArtifactUpdateBundle$52;
        }
    }
}
