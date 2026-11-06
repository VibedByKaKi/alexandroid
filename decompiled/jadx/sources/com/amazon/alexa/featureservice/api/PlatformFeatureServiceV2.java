package com.amazon.alexa.featureservice.api;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PlatformFeatureServiceV2 extends FeatureServiceV2 {
    Map<String, String> getAllFeatures();

    String getSerializedFeatureCache();

    String getTreatment(String str, String str2);

    void overrideFeature(String str, String str2);

    void prefetchFeatures(String[] strArr);

    void revertOverride(String str);
}
