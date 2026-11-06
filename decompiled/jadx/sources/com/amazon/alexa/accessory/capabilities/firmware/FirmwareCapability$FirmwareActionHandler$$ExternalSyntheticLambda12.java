package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda12 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability.FirmwareActionHandler f$0;

    public /* synthetic */ FirmwareCapability$FirmwareActionHandler$$ExternalSyntheticLambda12(FirmwareCapability.FirmwareActionHandler firmwareActionHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareActionHandler;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource lambda$initiateFirmwareTransfer$9;
        SingleSource lambda$initiateFirmwareTransfer$6;
        int i = this.$r8$classId;
        FirmwareCapability.FirmwareActionHandler firmwareActionHandler = this.f$0;
        switch (i) {
            case 0:
                lambda$initiateFirmwareTransfer$9 = firmwareActionHandler.lambda$initiateFirmwareTransfer$9();
                return lambda$initiateFirmwareTransfer$9;
            default:
                lambda$initiateFirmwareTransfer$6 = firmwareActionHandler.lambda$initiateFirmwareTransfer$6();
                return lambda$initiateFirmwareTransfer$6;
        }
    }
}
