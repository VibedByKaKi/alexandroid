package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.FeatureIdentifierData;
import com.amazon.alexa.featureservice.util.FeatureServiceNamespace;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureIdentifierDataMapper implements RemoteMapper<String, FeatureIdentifierData> {
    @Inject
    public FeatureIdentifierDataMapper() {
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public String fromRemoteModel(FeatureIdentifierData featureIdentifierData) {
        return featureIdentifierData.getNamespace() != null ? featureIdentifierData.getNamespace().isEmpty() ? featureIdentifierData.getFeatureName() : FeatureServiceNamespace.concatFeatureIdentifiers(featureIdentifierData.getNamespace(), featureIdentifierData.getFeatureName()) : featureIdentifierData.getFeatureName();
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public FeatureIdentifierData toRemoteModel(String str) {
        FeatureIdentifierData featureIdentifierData = new FeatureIdentifierData();
        String[] splitFeatureIdentifier = FeatureServiceNamespace.splitFeatureIdentifier(str);
        if (splitFeatureIdentifier.length > 1) {
            featureIdentifierData.setNamespace(splitFeatureIdentifier[0]);
            featureIdentifierData.setFeatureName(splitFeatureIdentifier[1]);
            return featureIdentifierData;
        }
        featureIdentifierData.setNamespace(null);
        featureIdentifierData.setFeatureName(splitFeatureIdentifier[0]);
        return featureIdentifierData;
    }
}
