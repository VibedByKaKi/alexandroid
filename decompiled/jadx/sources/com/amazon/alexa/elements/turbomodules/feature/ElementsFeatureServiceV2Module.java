package com.amazon.alexa.elements.turbomodules.feature;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsTurboModuleFeatureServiceV2")
/* loaded from: classes17.dex */
public class ElementsFeatureServiceV2Module extends NativeElementsTurboModuleFeatureServiceV2Spec {
    public static final String NAME = "ElementsTurboModuleFeatureServiceV2";
    private ElementsFeatureServiceV2API elementsFeatureServiceV2API;

    public ElementsFeatureServiceV2Module(ReactApplicationContext reactApplicationContext, ElementsFeatureServiceV2API elementsFeatureServiceV2API) {
        super(reactApplicationContext);
        this.elementsFeatureServiceV2API = elementsFeatureServiceV2API;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public WritableMap getAllFeaturesAndOverrides() {
        return this.elementsFeatureServiceV2API.getAllFeaturesAndOverrides();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsTurboModuleFeatureServiceV2";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public void getTreatmentAndRecordTrigger(String str, String str2, Promise promise) {
        this.elementsFeatureServiceV2API.getTreatmentAndRecordTrigger(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public String getTreatmentAndRecordTriggerSyncNamespaceFeature(String str, String str2, String str3) {
        return this.elementsFeatureServiceV2API.getTreatmentAndRecordTriggerSyncNamespaceFeature(str, str2, str3);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public String getTreatmentAndRecordTriggerSyncStringFeature(String str, String str2) {
        return this.elementsFeatureServiceV2API.getTreatmentAndRecordTriggerSyncStringFeature(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public String getTreatmentSyncNamespaceFeature(String str, String str2, String str3) {
        return this.elementsFeatureServiceV2API.getTreatmentSyncNamespaceFeature(str, str2, str3);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public String getTreatmentSyncStringFeature(String str, String str2) {
        return this.elementsFeatureServiceV2API.getTreatmentSyncStringFeature(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public boolean hasAccessNamespaceFeature(String str, String str2, boolean z) {
        return this.elementsFeatureServiceV2API.hasAccessNamespaceFeature(str, str2, z);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public boolean hasAccessStringFeature(String str, boolean z) {
        return this.elementsFeatureServiceV2API.hasAccessStringFeature(str, z);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public void overrideFeature(String str, String str2, Promise promise) {
        this.elementsFeatureServiceV2API.overrideFeature(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public void prefetchFeatures(ReadableArray readableArray, Promise promise) {
        this.elementsFeatureServiceV2API.prefetchFeatures(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public void revertOverride(String str, Promise promise) {
        this.elementsFeatureServiceV2API.revertOverride(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsTurboModuleFeatureServiceV2Spec
    @ReactMethod
    public void syncFeatureCache(Promise promise) {
        this.elementsFeatureServiceV2API.syncFeatureCache(promise);
    }
}
