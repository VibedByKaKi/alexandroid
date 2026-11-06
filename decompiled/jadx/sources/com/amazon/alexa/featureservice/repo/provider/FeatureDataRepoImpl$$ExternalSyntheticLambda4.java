package com.amazon.alexa.featureservice.repo.provider;

import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import com.amazon.alexa.featureservice.remote.model.trigger.TriggerData;
import com.amazon.alexa.featureservice.repo.mapper.ExperimentTriggerCollectionMapper;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FeatureDataRepoImpl$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExperimentTriggerCollectionMapper f$0;

    public /* synthetic */ FeatureDataRepoImpl$$ExternalSyntheticLambda4(ExperimentTriggerCollectionMapper experimentTriggerCollectionMapper, int i) {
        this.$r8$classId = i;
        this.f$0 = experimentTriggerCollectionMapper;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        int i = this.$r8$classId;
        ExperimentTriggerCollectionMapper experimentTriggerCollectionMapper = this.f$0;
        List<TriggerData> list = (List) obj;
        switch (i) {
            case 0:
                return experimentTriggerCollectionMapper.fromRemoteModel(list);
            case 1:
                return experimentTriggerCollectionMapper.fromDatabaseModel((List<ExperimentTrigger>) list);
            default:
                return experimentTriggerCollectionMapper.toRemoteModel((List<com.amazon.alexa.featureservice.repo.model.ExperimentTrigger>) list);
        }
    }
}
