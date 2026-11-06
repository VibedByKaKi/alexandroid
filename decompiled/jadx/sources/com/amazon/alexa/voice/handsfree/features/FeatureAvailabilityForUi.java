package com.amazon.alexa.voice.handsfree.features;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.voice.feature.FeatureAvailability;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FeatureAvailabilityForUi implements FeatureAvailability {
    private static final String TAG = "FeatureAvailabilityForUi";

    @Override // com.amazon.alexa.voice.feature.FeatureAvailability
    public boolean hasAccessToFeature(String str) {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
        return ((FeatureServiceV2) obj).hasAccess(str, false);
    }
}
