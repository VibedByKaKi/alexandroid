package com.amazon.alexa.accessory.speech.events.activitydetection;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ActivityDetectionAccessoryManager$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityDetectionAccessoryManager f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ActivityDetectionAccessoryManager$$ExternalSyntheticLambda0(ActivityDetectionAccessoryManager activityDetectionAccessoryManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = activityDetectionAccessoryManager;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fetchAndPublishCurrentSignals$0(this.f$1, (List) obj);
                break;
            default:
                this.f$0.lambda$subscribeAndObserve$8(this.f$1, (List) obj);
                break;
        }
    }
}
