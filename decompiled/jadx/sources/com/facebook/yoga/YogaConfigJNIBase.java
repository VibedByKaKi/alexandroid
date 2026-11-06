package com.facebook.yoga;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class YogaConfigJNIBase extends YogaConfig {
    private YogaLogger mLogger;
    long mNativePointer;

    private YogaConfigJNIBase(long j) {
        if (j != 0) {
            this.mNativePointer = j;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Failed to allocate native memory");
            throw null;
        }
    }

    @Override // com.facebook.yoga.YogaConfig
    public YogaErrata getErrata() {
        return YogaErrata.fromInt(YogaNative.jni_YGConfigGetErrataJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaConfig
    public YogaLogger getLogger() {
        return this.mLogger;
    }

    @Override // com.facebook.yoga.YogaConfig
    public long getNativePointer() {
        return this.mNativePointer;
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setErrata(YogaErrata yogaErrata) {
        YogaNative.jni_YGConfigSetErrataJNI(this.mNativePointer, yogaErrata.intValue());
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLoggerJNI(this.mNativePointer, yogaLogger);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setPointScaleFactor(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setUseWebDefaults(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.mNativePointer, z);
    }

    public YogaConfigJNIBase() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    public YogaConfigJNIBase(boolean z) {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
