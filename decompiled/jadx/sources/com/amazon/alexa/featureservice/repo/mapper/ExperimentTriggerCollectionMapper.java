package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.trigger.TriggerData;
import com.amazon.alexa.featureservice.repo.model.ExperimentTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExperimentTriggerCollectionMapper implements RemoteMapper<List<ExperimentTrigger>, List<TriggerData>>, DatabaseMapper<List<ExperimentTrigger>, List<com.amazon.alexa.featureservice.database.entity.ExperimentTrigger>> {
    private final ExperimentTriggerMapper experimentTriggerMapper;

    @Inject
    public ExperimentTriggerCollectionMapper(ExperimentTriggerMapper experimentTriggerMapper) {
        this.experimentTriggerMapper = experimentTriggerMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public List<ExperimentTrigger> fromDatabaseModel(List<com.amazon.alexa.featureservice.database.entity.ExperimentTrigger> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazon.alexa.featureservice.database.entity.ExperimentTrigger> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.experimentTriggerMapper.fromDatabaseModel(it2.next()));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<ExperimentTrigger> fromRemoteModel(List<TriggerData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<TriggerData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.experimentTriggerMapper.fromRemoteModel(it2.next()));
        }
        return arrayList;
    }

    public ExperimentTriggerMapper getExperimentTriggerMapper() {
        return this.experimentTriggerMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public List<com.amazon.alexa.featureservice.database.entity.ExperimentTrigger> toDatabaseModel(List<ExperimentTrigger> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ExperimentTrigger> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.experimentTriggerMapper.toDatabaseModel(it2.next()));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<TriggerData> toRemoteModel(List<ExperimentTrigger> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ExperimentTrigger> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.experimentTriggerMapper.toRemoteModel(it2.next()));
        }
        return arrayList;
    }
}
