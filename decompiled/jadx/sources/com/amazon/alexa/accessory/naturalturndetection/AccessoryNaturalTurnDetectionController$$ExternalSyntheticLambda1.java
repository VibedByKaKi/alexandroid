package com.amazon.alexa.accessory.naturalturndetection;

import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionSession;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NaturalTurnDetectionSession f$0;

    public /* synthetic */ AccessoryNaturalTurnDetectionController$$ExternalSyntheticLambda1(NaturalTurnDetectionSession naturalTurnDetectionSession, int i) {
        this.$r8$classId = i;
        this.f$0 = naturalTurnDetectionSession;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        NaturalTurnDetectionSession naturalTurnDetectionSession = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                AccessoryNaturalTurnDetectionController.lambda$muteSession$2(naturalTurnDetectionSession, th);
                break;
            case 1:
                AccessoryNaturalTurnDetectionController.lambda$startSession$0(naturalTurnDetectionSession, th);
                break;
            case 2:
                AccessoryNaturalTurnDetectionController.lambda$unmuteSession$3(naturalTurnDetectionSession, th);
                break;
            default:
                AccessoryNaturalTurnDetectionController.lambda$stopSession$1(naturalTurnDetectionSession, th);
                break;
        }
    }
}
