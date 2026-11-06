package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeElementsTurboModuleFeatureServiceV2Spec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ElementsTurboModuleFeatureServiceV2";

    public NativeElementsTurboModuleFeatureServiceV2Spec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getAllFeaturesAndOverrides();

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ElementsTurboModuleFeatureServiceV2";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getTreatmentAndRecordTrigger(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTreatmentAndRecordTriggerSyncNamespaceFeature(String str, String str2, String str3);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTreatmentAndRecordTriggerSyncStringFeature(String str, String str2);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTreatmentSyncNamespaceFeature(String str, String str2, String str3);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTreatmentSyncStringFeature(String str, String str2);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean hasAccessNamespaceFeature(String str, String str2, boolean z);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean hasAccessStringFeature(String str, boolean z);

    @DoNotStrip
    @ReactMethod
    public abstract void overrideFeature(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void prefetchFeatures(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void revertOverride(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public void syncFeatureCache(Promise promise) {
    }
}
