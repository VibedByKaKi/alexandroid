package com.amazon.alexa.featureservice.database.dao;

import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxTriggerDao$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxTriggerDao f$0;
    public final /* synthetic */ ExperimentTrigger f$1;

    public /* synthetic */ RxTriggerDao$$ExternalSyntheticLambda0(RxTriggerDao rxTriggerDao, ExperimentTrigger experimentTrigger, int i) {
        this.$r8$classId = i;
        this.f$0 = rxTriggerDao;
        this.f$1 = experimentTrigger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long lambda$insert$0;
        Integer lambda$delete$11;
        Integer lambda$update$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$insert$0 = this.f$0.lambda$insert$0(this.f$1);
                return lambda$insert$0;
            case 1:
                lambda$delete$11 = this.f$0.lambda$delete$11(this.f$1);
                return lambda$delete$11;
            default:
                lambda$update$2 = this.f$0.lambda$update$2(this.f$1);
                return lambda$update$2;
        }
    }
}
