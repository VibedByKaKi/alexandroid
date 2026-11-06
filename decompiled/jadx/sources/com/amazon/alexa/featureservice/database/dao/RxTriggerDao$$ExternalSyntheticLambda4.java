package com.amazon.alexa.featureservice.database.dao;

import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RxTriggerDao$$ExternalSyntheticLambda4 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxTriggerDao f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ RxTriggerDao$$ExternalSyntheticLambda4(RxTriggerDao rxTriggerDao, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = rxTriggerDao;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ExperimentTrigger lambda$getByKey$5;
        Integer lambda$markAsUploaded$8;
        Integer lambda$deleteByKey$13;
        switch (this.$r8$classId) {
            case 0:
                lambda$getByKey$5 = this.f$0.lambda$getByKey$5(this.f$1, this.f$2);
                return lambda$getByKey$5;
            case 1:
                lambda$markAsUploaded$8 = this.f$0.lambda$markAsUploaded$8(this.f$1, this.f$2);
                return lambda$markAsUploaded$8;
            default:
                lambda$deleteByKey$13 = this.f$0.lambda$deleteByKey$13(this.f$1, this.f$2);
                return lambda$deleteByKey$13;
        }
    }
}
