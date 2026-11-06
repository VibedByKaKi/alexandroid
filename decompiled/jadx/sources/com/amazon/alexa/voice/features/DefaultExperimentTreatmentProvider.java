package com.amazon.alexa.voice.features;

import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultExperimentTreatmentProvider implements ExperimentTreatmentProvider {
    public static final String TAG = "DefaultExperimentTreatmentProvider";
    private FeatureServiceV2 featureService;

    public DefaultExperimentTreatmentProvider(@NonNull FeatureServiceV2 featureServiceV2) {
        this.featureService = featureServiceV2;
    }

    @Override // com.amazon.alexa.voice.features.ExperimentTreatmentProvider
    public String getTreatmentAndRecordTrigger(ExperimentalFeatures experimentalFeatures) {
        String treatmentAndRecordTrigger = this.featureService.getTreatmentAndRecordTrigger(experimentalFeatures.getName(), "C_DEFAULT");
        experimentalFeatures.getName();
        return treatmentAndRecordTrigger;
    }
}
