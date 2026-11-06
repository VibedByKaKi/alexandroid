package com.amazon.alexa.voice.features;

import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum ExperimentalFeatures {
    ALEXA_MOBILE_FAB_GEOLOCATION_DISCLOSURE(NativeFeatureRegistry.ALEXA_MOBILE_GEOLOCATION_DISCLOSURE),
    ALEXA_VOX_ANDROID_WW_DISABLE_LIVE_MODE("ALEXA_VOX_ANDROID_WW_DISABLE_LIVE_MODE");

    private final String featureName;

    ExperimentalFeatures(String str) {
        this.featureName = str;
    }

    public String getName() {
        return this.featureName;
    }
}
