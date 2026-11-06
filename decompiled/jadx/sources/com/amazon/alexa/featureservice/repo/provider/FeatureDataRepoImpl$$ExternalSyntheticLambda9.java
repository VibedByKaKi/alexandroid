package com.amazon.alexa.featureservice.repo.provider;

import com.amazon.alexa.featureservice.remote.model.FeatureServiceResponse;
import com.amazon.alexa.featureservice.repo.model.Feature;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FeatureDataRepoImpl$$ExternalSyntheticLambda9 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureDataRepoImpl f$0;

    public /* synthetic */ FeatureDataRepoImpl$$ExternalSyntheticLambda9(FeatureDataRepoImpl featureDataRepoImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = featureDataRepoImpl;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$uploadExperimentTriggers$11;
        SingleSource lambda$uploadExperimentTriggers$10;
        Feature lambda$singleFeatureUpdates$3;
        List lambda$refreshFeatures$0;
        int i = this.$r8$classId;
        FeatureDataRepoImpl featureDataRepoImpl = this.f$0;
        switch (i) {
            case 0:
                lambda$uploadExperimentTriggers$11 = featureDataRepoImpl.lambda$uploadExperimentTriggers$11((List) obj);
                return lambda$uploadExperimentTriggers$11;
            case 1:
                lambda$uploadExperimentTriggers$10 = featureDataRepoImpl.lambda$uploadExperimentTriggers$10((List) obj);
                return lambda$uploadExperimentTriggers$10;
            case 2:
                lambda$singleFeatureUpdates$3 = featureDataRepoImpl.lambda$singleFeatureUpdates$3((com.amazon.alexa.featureservice.database.entity.Feature) obj);
                return lambda$singleFeatureUpdates$3;
            default:
                lambda$refreshFeatures$0 = featureDataRepoImpl.lambda$refreshFeatures$0((FeatureServiceResponse) obj);
                return lambda$refreshFeatures$0;
        }
    }
}
