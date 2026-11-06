package com.amazon.alexa.accessory.naturalturndetection;

import com.amazon.alexa.accessory.naturalturndetection.AccessoryNaturalTurnDetectionControllerManager;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 0:
                AccessoryNaturalTurnDetectionController.lambda$observeNotifyNaturalTurnDetectionState$4(th);
                break;
            default:
                AccessoryNaturalTurnDetectionControllerManager.NtdAccessorySessionListener.lambda$onAccessorySessionConnected$2(th);
                break;
        }
    }
}
