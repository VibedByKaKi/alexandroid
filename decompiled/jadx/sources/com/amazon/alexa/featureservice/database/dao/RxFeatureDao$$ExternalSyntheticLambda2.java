package com.amazon.alexa.featureservice.database.dao;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxFeatureDao$$ExternalSyntheticLambda2 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxFeatureDao f$0;

    public /* synthetic */ RxFeatureDao$$ExternalSyntheticLambda2(RxFeatureDao rxFeatureDao, int i) {
        this.$r8$classId = i;
        this.f$0 = rxFeatureDao;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer lambda$deleteAll$5;
        List lambda$getActiveFeatures$7;
        List lambda$getAll$2;
        int i = this.$r8$classId;
        RxFeatureDao rxFeatureDao = this.f$0;
        switch (i) {
            case 0:
                lambda$deleteAll$5 = rxFeatureDao.lambda$deleteAll$5();
                return lambda$deleteAll$5;
            case 1:
                lambda$getActiveFeatures$7 = rxFeatureDao.lambda$getActiveFeatures$7();
                return lambda$getActiveFeatures$7;
            default:
                lambda$getAll$2 = rxFeatureDao.lambda$getAll$2();
                return lambda$getAll$2;
        }
    }
}
