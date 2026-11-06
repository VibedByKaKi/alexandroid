package com.amazon.alexa.featureservice.database.dao;

import com.amazon.alexa.featureservice.database.entity.Feature;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxFeatureDao$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxFeatureDao f$0;
    public final /* synthetic */ Feature f$1;

    public /* synthetic */ RxFeatureDao$$ExternalSyntheticLambda1(RxFeatureDao rxFeatureDao, Feature feature, int i) {
        this.$r8$classId = i;
        this.f$0 = rxFeatureDao;
        this.f$1 = feature;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long lambda$insert$0;
        Integer lambda$delete$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$insert$0 = this.f$0.lambda$insert$0(this.f$1);
                return lambda$insert$0;
            default:
                lambda$delete$4 = this.f$0.lambda$delete$4(this.f$1);
                return lambda$delete$4;
        }
    }
}
