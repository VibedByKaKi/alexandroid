package com.amazon.alexa.accessory.frames.ota;

import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.alexa.eventbus.api.EventBus;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class OTAHelper$$ExternalSyntheticLambda14 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EventBus f$0;

    public /* synthetic */ OTAHelper$$ExternalSyntheticLambda14(EventBus eventBus, int i) {
        this.$r8$classId = i;
        this.f$0 = eventBus;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        EventBus eventBus = this.f$0;
        switch (i) {
            case 0:
                OTAHelper.lambda$initiateFirmwareTransferForAnsel$19(eventBus, (Float) obj);
                break;
            default:
                AssetTransferObserver.lambda$subscribeToTransferStateChanges$11(eventBus, (Assettransfer.NotifyTransferState) obj);
                break;
        }
    }
}
