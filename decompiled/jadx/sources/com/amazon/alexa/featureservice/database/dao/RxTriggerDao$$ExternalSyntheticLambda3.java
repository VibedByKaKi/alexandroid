package com.amazon.alexa.featureservice.database.dao;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxTriggerDao$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxTriggerDao f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ RxTriggerDao$$ExternalSyntheticLambda3(RxTriggerDao rxTriggerDao, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = rxTriggerDao;
        this.f$1 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer lambda$update$3;
        Integer lambda$delete$12;
        switch (this.$r8$classId) {
            case 0:
                lambda$update$3 = this.f$0.lambda$update$3(this.f$1);
                return lambda$update$3;
            default:
                lambda$delete$12 = this.f$0.lambda$delete$12(this.f$1);
                return lambda$delete$12;
        }
    }
}
