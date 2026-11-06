package com.amazon.alexa.accessory.naturalturndetection;

import com.amazon.alexa.accessory.protocol.Naturalturndetection;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryNaturalTurnDetectionController f$0;

    public /* synthetic */ AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda0(AccessoryNaturalTurnDetectionController accessoryNaturalTurnDetectionController, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryNaturalTurnDetectionController;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryNaturalTurnDetectionController accessoryNaturalTurnDetectionController = this.f$0;
        switch (i) {
            case 0:
                accessoryNaturalTurnDetectionController.handleResponse((Naturalturndetection.SetNaturalTurnDetectionStateResponse) obj);
                break;
            default:
                accessoryNaturalTurnDetectionController.handleNotification((Naturalturndetection.NotifyNaturalTurnDetectionState) obj);
                break;
        }
    }
}
