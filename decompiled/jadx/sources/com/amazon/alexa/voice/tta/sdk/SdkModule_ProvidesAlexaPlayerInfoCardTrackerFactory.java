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
public final class SdkModule_ProvidesAlexaPlayerInfoCardTrackerFactory implements Factory<AlexaPlayerInfoCardTracker> {
    private final SdkModule module;

    public SdkModule_ProvidesAlexaPlayerInfoCardTrackerFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvidesAlexaPlayerInfoCardTrackerFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvidesAlexaPlayerInfoCardTrackerFactory(sdkModule);
    }

    public static AlexaPlayerInfoCardTracker providesAlexaPlayerInfoCardTracker(SdkModule sdkModule) {
        return (AlexaPlayerInfoCardTracker) Preconditions.checkNotNullFromProvides(sdkModule.providesAlexaPlayerInfoCardTracker());
    }

    @Override // javax.inject.Provider
    public AlexaPlayerInfoCardTracker get() {
        return providesAlexaPlayerInfoCardTracker(this.module);
    }
}
