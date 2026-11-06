package com.amazon.alexa.voice.tta.sdk;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SdkModule_ProvidesAlexaStateTrackerFactory implements Factory<AlexaStateTracker> {
    private final SdkModule module;

    public SdkModule_ProvidesAlexaStateTrackerFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvidesAlexaStateTrackerFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvidesAlexaStateTrackerFactory(sdkModule);
    }

    public static AlexaStateTracker providesAlexaStateTracker(SdkModule sdkModule) {
        return (AlexaStateTracker) Preconditions.checkNotNullFromProvides(sdkModule.providesAlexaStateTracker());
    }

    @Override // javax.inject.Provider
    public AlexaStateTracker get() {
        return providesAlexaStateTracker(this.module);
    }
}
