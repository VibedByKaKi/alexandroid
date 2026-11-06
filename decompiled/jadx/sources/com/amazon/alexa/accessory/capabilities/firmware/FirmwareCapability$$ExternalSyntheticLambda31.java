package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.protocol.Firmware;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda31 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Firmware.FirmwareInformation f$0;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda31(Firmware.FirmwareInformation firmwareInformation, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareInformation;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$requestFirmwareComponents$30;
        SingleSource lambda$getNextAvailableUpdates$6;
        int i = this.$r8$classId;
        Firmware.FirmwareInformation firmwareInformation = this.f$0;
        List list = (List) obj;
        switch (i) {
            case 0:
                lambda$requestFirmwareComponents$30 = FirmwareCapability.lambda$requestFirmwareComponents$30(firmwareInformation, list);
                return lambda$requestFirmwareComponents$30;
            default:
                lambda$getNextAvailableUpdates$6 = DeviceFirmwareUpdateManager.lambda$getNextAvailableUpdates$6(firmwareInformation, list);
                return lambda$getNextAvailableUpdates$6;
        }
    }
}
