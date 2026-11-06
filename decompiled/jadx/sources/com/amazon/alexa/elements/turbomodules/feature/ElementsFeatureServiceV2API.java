package com.amazon.alexa.elements.turbomodules.feature;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsFeatureServiceV2API {
    WritableMap getAllFeaturesAndOverrides();

    void getTreatmentAndRecordTrigger(String str, String str2, Promise promise);

    String getTreatmentAndRecordTriggerSyncNamespaceFeature(String str, String str2, String str3);

    String getTreatmentAndRecordTriggerSyncStringFeature(String str, String str2);

    String getTreatmentSyncNamespaceFeature(String str, String str2, String str3);

    String getTreatmentSyncStringFeature(String str, String str2);

    boolean hasAccessNamespaceFeature(String str, String str2, boolean z);

    boolean hasAccessStringFeature(String str, boolean z);

    void overrideFeature(String str, String str2, Promise promise);

    void prefetchFeatures(ReadableArray readableArray, Promise promise);

    void revertOverride(String str, Promise promise);

    void syncFeatureCache(Promise promise);
}
