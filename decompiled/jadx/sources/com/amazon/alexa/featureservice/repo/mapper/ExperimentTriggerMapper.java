package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.trigger.TriggerData;
import com.amazon.alexa.featureservice.repo.model.ExperimentTrigger;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExperimentTriggerMapper implements RemoteMapper<ExperimentTrigger, TriggerData>, DatabaseMapper<ExperimentTrigger, com.amazon.alexa.featureservice.database.entity.ExperimentTrigger> {
    @Inject
    public ExperimentTriggerMapper() {
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public ExperimentTrigger fromDatabaseModel(com.amazon.alexa.featureservice.database.entity.ExperimentTrigger experimentTrigger) {
        ExperimentTrigger experimentTrigger2 = new ExperimentTrigger();
        experimentTrigger2.setFeatureName(experimentTrigger.getFeatureName());
        experimentTrigger2.setNamespace(experimentTrigger.getNamespace().isEmpty() ? null : experimentTrigger.getNamespace());
        experimentTrigger2.setAllocationId(experimentTrigger.getAllocationId());
        experimentTrigger2.setTreatmentUsed(experimentTrigger.getTreatmentUsed());
        experimentTrigger2.setTimeUsed(experimentTrigger.getTimeUsed());
        return experimentTrigger2;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public ExperimentTrigger fromRemoteModel(TriggerData triggerData) {
        ExperimentTrigger experimentTrigger = new ExperimentTrigger();
        experimentTrigger.setFeatureName(triggerData.getName());
        experimentTrigger.setNamespace(triggerData.getNamespace());
        experimentTrigger.setAllocationId(triggerData.getAllocationId());
        experimentTrigger.setRecordStatus(triggerData.getRecordStatus());
        experimentTrigger.setTreatment(triggerData.getTreatment());
        return experimentTrigger;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public com.amazon.alexa.featureservice.database.entity.ExperimentTrigger toDatabaseModel(ExperimentTrigger experimentTrigger) {
        com.amazon.alexa.featureservice.database.entity.ExperimentTrigger experimentTrigger2 = new com.amazon.alexa.featureservice.database.entity.ExperimentTrigger();
        experimentTrigger2.setFeatureName(experimentTrigger.getFeatureName());
        experimentTrigger2.setNamespace(experimentTrigger.getNamespace() != null ? experimentTrigger.getNamespace() : "");
        experimentTrigger2.setAllocationId(experimentTrigger.getAllocationId());
        experimentTrigger2.setTreatmentUsed(experimentTrigger.getTreatmentUsed());
        experimentTrigger2.setTimeUsed(experimentTrigger.getTimeUsed());
        experimentTrigger2.setUploaded(false);
        return experimentTrigger2;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public TriggerData toRemoteModel(ExperimentTrigger experimentTrigger) {
        TriggerData triggerData = new TriggerData();
        triggerData.setName(experimentTrigger.getFeatureName());
        triggerData.setNamespace(experimentTrigger.getNamespace());
        triggerData.setAllocationId(experimentTrigger.getAllocationId());
        triggerData.setTreatmentUsed(experimentTrigger.getTreatmentUsed());
        triggerData.setTimeUsed(experimentTrigger.getTimeUsed());
        return triggerData;
    }
}
