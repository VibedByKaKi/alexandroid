package com.facebook.yoga;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class YogaConfig {
    public static int SPACING_TYPE = 1;

    public abstract YogaErrata getErrata();

    public abstract YogaLogger getLogger();

    public abstract long getNativePointer();

    public abstract void setErrata(YogaErrata yogaErrata);

    public abstract void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z);

    public abstract void setLogger(YogaLogger yogaLogger);

    public abstract void setPointScaleFactor(float f);

    public abstract void setUseWebDefaults(boolean z);
}
