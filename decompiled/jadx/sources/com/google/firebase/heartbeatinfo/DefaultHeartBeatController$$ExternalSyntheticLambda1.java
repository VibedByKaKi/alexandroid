package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class DefaultHeartBeatController$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultHeartBeatController f$0;

    public /* synthetic */ DefaultHeartBeatController$$ExternalSyntheticLambda1(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$getHeartBeatsHeader$1;
        Void lambda$registerHeartBeat$0;
        int i = this.$r8$classId;
        DefaultHeartBeatController defaultHeartBeatController = this.f$0;
        switch (i) {
            case 0:
                lambda$getHeartBeatsHeader$1 = defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
                return lambda$getHeartBeatsHeader$1;
            default:
                lambda$registerHeartBeat$0 = defaultHeartBeatController.lambda$registerHeartBeat$0();
                return lambda$registerHeartBeat$0;
        }
    }
}
