package com.amazon.alexa.featureservice.database.dao;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxTriggerDao$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxTriggerDao f$0;

    public /* synthetic */ RxTriggerDao$$ExternalSyntheticLambda1(RxTriggerDao rxTriggerDao, int i) {
        this.$r8$classId = i;
        this.f$0 = rxTriggerDao;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List lambda$getAll$4;
        Integer lambda$getPendingTriggerCount$16;
        Integer lambda$markAllPendingAsUploaded$9;
        List lambda$getPendingTriggers$6;
        Integer lambda$deleteAllUploaded$14;
        List lambda$getAndMarkPendingExperimentTriggers$17;
        Integer lambda$markAllUploadedAsPending$10;
        Integer lambda$deleteAll$15;
        List lambda$getUploadedTriggers$7;
        int i = this.$r8$classId;
        RxTriggerDao rxTriggerDao = this.f$0;
        switch (i) {
            case 0:
                lambda$getAll$4 = rxTriggerDao.lambda$getAll$4();
                return lambda$getAll$4;
            case 1:
                lambda$getPendingTriggerCount$16 = rxTriggerDao.lambda$getPendingTriggerCount$16();
                return lambda$getPendingTriggerCount$16;
            case 2:
                lambda$markAllPendingAsUploaded$9 = rxTriggerDao.lambda$markAllPendingAsUploaded$9();
                return lambda$markAllPendingAsUploaded$9;
            case 3:
                lambda$getPendingTriggers$6 = rxTriggerDao.lambda$getPendingTriggers$6();
                return lambda$getPendingTriggers$6;
            case 4:
                lambda$deleteAllUploaded$14 = rxTriggerDao.lambda$deleteAllUploaded$14();
                return lambda$deleteAllUploaded$14;
            case 5:
                lambda$getAndMarkPendingExperimentTriggers$17 = rxTriggerDao.lambda$getAndMarkPendingExperimentTriggers$17();
                return lambda$getAndMarkPendingExperimentTriggers$17;
            case 6:
                lambda$markAllUploadedAsPending$10 = rxTriggerDao.lambda$markAllUploadedAsPending$10();
                return lambda$markAllUploadedAsPending$10;
            case 7:
                lambda$deleteAll$15 = rxTriggerDao.lambda$deleteAll$15();
                return lambda$deleteAll$15;
            default:
                lambda$getUploadedTriggers$7 = rxTriggerDao.lambda$getUploadedTriggers$7();
                return lambda$getUploadedTriggers$7;
        }
    }
}
