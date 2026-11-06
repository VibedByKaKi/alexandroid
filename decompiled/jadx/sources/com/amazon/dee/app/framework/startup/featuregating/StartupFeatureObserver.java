package com.amazon.dee.app.framework.startup.featuregating;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.dee.app.framework.startup.implementation.StartupDataStore;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StartupFeatureObserver implements FeatureServiceV2.FeatureUpdateListener {
    private static final String DEFAULT_TREATMENT = "C";
    private static final String TAG = "StartupFeatureObserver";
    private FeatureServiceV2 featureServiceV2;
    private StartupDataStore featureStore;

    public StartupFeatureObserver(FeatureServiceV2 featureServiceV2, StartupDataStore startupDataStore) {
        this.featureServiceV2 = featureServiceV2;
        this.featureStore = startupDataStore;
    }

    public void clearAllFeatures() {
        for (StartupFeature startupFeature : StartupFeature.STARTUP_FEATURES_TO_OBSERVE) {
            this.featureStore.removeFeature(startupFeature.toString());
        }
    }

    public void observeFeatures() {
        for (StartupFeature startupFeature : StartupFeature.STARTUP_FEATURES_TO_OBSERVE) {
            Objects.toString(startupFeature);
            this.featureServiceV2.observeFeature(startupFeature.getNamespace(), startupFeature.getFeatureName(), this);
        }
    }

    @Override // com.amazon.alexa.featureservice.api.FeatureServiceV2.FeatureUpdateListener
    public void onFeatureUpdate(String str, String str2) {
        StartupFeature startupFeature = new StartupFeature(str, str2);
        this.featureStore.setFeature(startupFeature.toString(), this.featureServiceV2.getTreatmentAndRecordTrigger(str, str2, "C"));
    }
}
