package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda11 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability.FirmwareActionHandler f$0;

    public /* synthetic */ FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda11(FirmwareCapability.FirmwareActionHandler firmwareActionHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareActionHandler;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$initiateFirmwareTransfer$5;
        CompletableSource lambda$initiateFirmwareTransfer$8;
        int i = this.$r8$classId;
        FirmwareCapability.FirmwareActionHandler firmwareActionHandler = this.f$0;
        switch (i) {
            case 0:
                lambda$initiateFirmwareTransfer$5 = firmwareActionHandler.lambda$initiateFirmwareTransfer$5((Set) obj);
                return lambda$initiateFirmwareTransfer$5;
            default:
                lambda$initiateFirmwareTransfer$8 = firmwareActionHandler.lambda$initiateFirmwareTransfer$8((FirmwareUpdateSet) obj);
                return lambda$initiateFirmwareTransfer$8;
        }
    }
}
