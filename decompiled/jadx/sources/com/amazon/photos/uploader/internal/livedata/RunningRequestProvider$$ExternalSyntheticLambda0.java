package com.amazon.photos.uploader.internal.livedata;

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunningRequestProvider$$ExternalSyntheticLambda0 implements FlowableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RunningRequestProvider f$0;

    public /* synthetic */ RunningRequestProvider$$ExternalSyntheticLambda0(RunningRequestProvider runningRequestProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = runningRequestProvider;
    }

    @Override // io.reactivex.rxjava3.core.FlowableOnSubscribe
    public final void subscribe(FlowableEmitter flowableEmitter) {
        int i = this.$r8$classId;
        RunningRequestProvider runningRequestProvider = this.f$0;
        switch (i) {
            case 0:
                RunningRequestProvider.attachThrottledLiveData$lambda$0(runningRequestProvider, flowableEmitter);
                break;
            default:
                RunningRequestProvider.attachThrottledTotalProgressLiveData$lambda$2(runningRequestProvider, flowableEmitter);
                break;
        }
    }
}
