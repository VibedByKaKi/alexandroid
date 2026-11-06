package com.amazon.dee.app.framework.startup.featuregating;

import com.amazon.dee.app.framework.startup.implementation.StartupDataStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StartupFeatureGate {
    private static final String TAG = "StartupFeatureGate";
    private StartupDataStore featureStore;

    public StartupFeatureGate(StartupDataStore startupDataStore) {
        this.featureStore = startupDataStore;
    }

    public boolean isFeatureEnabled(StartupFeature startupFeature) {
        String feature = this.featureStore.getFeature(startupFeature.toString());
        startupFeature.toString();
        return (feature == null || feature.equalsIgnoreCase("C")) ? false : true;
    }
}
