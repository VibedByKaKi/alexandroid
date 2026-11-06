package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.FeatureResponseMetaData;
import com.amazon.alexa.featureservice.repo.model.Feature;
import com.amazon.alexa.featureservice.util.FeatureServiceNamespace;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureResponseDataMapper implements RemoteMapper<Feature, FeatureResponseMetaData>, DatabaseMapper<Feature, com.amazon.alexa.featureservice.database.entity.Feature> {
    @Inject
    public FeatureResponseDataMapper() {
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public Feature fromDatabaseModel(com.amazon.alexa.featureservice.database.entity.Feature feature) {
        Feature feature2 = new Feature();
        feature2.setFeatureName(feature.getFeatureName());
        feature2.setTreatment(feature.getTreatment());
        feature2.setAllocationId(feature.getAllocationId());
        feature2.setTriggerOnUse(feature.isShouldRecordTrigger());
        feature2.setDeprecated(feature.isDeprecated());
        return feature2;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public Feature fromRemoteModel(FeatureResponseMetaData featureResponseMetaData) {
        Feature feature = new Feature();
        if (featureResponseMetaData.getNamespace() == null) {
            feature.setFeatureName(featureResponseMetaData.getFeatureName());
            feature.setDeprecated(true);
        } else if (featureResponseMetaData.getNamespace().isEmpty()) {
            feature.setFeatureName(featureResponseMetaData.getFeatureName());
            feature.setDeprecated(true);
        } else {
            feature.setFeatureName(FeatureServiceNamespace.concatFeatureIdentifiers(featureResponseMetaData.getNamespace(), featureResponseMetaData.getFeatureName()));
            feature.setDeprecated(false);
        }
        feature.setAllocationId(featureResponseMetaData.getAllocationId() == null ? "" : featureResponseMetaData.getAllocationId());
        feature.setTriggerOnUse(featureResponseMetaData.isTriggerOnUse());
        feature.setTreatment(featureResponseMetaData.getTreatment());
        return feature;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public com.amazon.alexa.featureservice.database.entity.Feature toDatabaseModel(Feature feature) {
        com.amazon.alexa.featureservice.database.entity.Feature feature2 = new com.amazon.alexa.featureservice.database.entity.Feature();
        feature2.setFeatureName(feature.getFeatureName());
        feature2.setAllocationId(feature.getAllocationId() == null ? "" : feature.getAllocationId());
        feature2.setShouldRecordTrigger(feature.isTriggerOnUse());
        feature2.setTreatment(feature.getTreatment());
        feature2.setDeprecated(feature.isDeprecated());
        return feature2;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public FeatureResponseMetaData toRemoteModel(Feature feature) {
        FeatureResponseMetaData featureResponseMetaData = new FeatureResponseMetaData();
        String[] splitFeatureIdentifier = FeatureServiceNamespace.splitFeatureIdentifier(feature.getFeatureName());
        if (splitFeatureIdentifier.length > 1) {
            featureResponseMetaData.setNamespace(splitFeatureIdentifier[0]);
            featureResponseMetaData.setFeatureName(splitFeatureIdentifier[1]);
        } else {
            featureResponseMetaData.setNamespace(null);
            featureResponseMetaData.setFeatureName(splitFeatureIdentifier[0]);
        }
        featureResponseMetaData.setAllocationId(feature.getAllocationId());
        featureResponseMetaData.setTreatment(feature.getTreatment());
        featureResponseMetaData.setTriggerOnUse(feature.isTriggerOnUse());
        return featureResponseMetaData;
    }
}
