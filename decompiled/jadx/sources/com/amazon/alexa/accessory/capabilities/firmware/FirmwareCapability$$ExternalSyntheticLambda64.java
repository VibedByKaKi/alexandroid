package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda64 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda64(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FirmwareCapability) this.f$0).lambda$scheduleDownload$55((UpdateRequest) this.f$1);
                break;
            case 1:
                ((FirmwareCapability) this.f$0).lambda$scheduleDownload$58((UpdateRequest) this.f$1);
                break;
            default:
                ((FirmwareCapability.FirmwareActionHandler) this.f$0).lambda$initiateFirmwareTransfer$7((FirmwareUpdateSet) this.f$1);
                break;
        }
    }
}
