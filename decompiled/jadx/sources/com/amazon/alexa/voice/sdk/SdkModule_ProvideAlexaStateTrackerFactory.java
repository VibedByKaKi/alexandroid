package com.amazon.alexa.voice.sdk;

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
public final class SdkModule_ProvideAlexaStateTrackerFactory implements Factory<AlexaStateTracker> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SdkModule_ProvideAlexaStateTrackerFactory INSTANCE = new SdkModule_ProvideAlexaStateTrackerFactory();

        private InstanceHolder() {
        }
    }

    public static SdkModule_ProvideAlexaStateTrackerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AlexaStateTracker provideAlexaStateTracker() {
        return (AlexaStateTracker) Preconditions.checkNotNullFromProvides(SdkModule.provideAlexaStateTracker());
    }

    @Override // javax.inject.Provider
    public AlexaStateTracker get() {
        return provideAlexaStateTracker();
    }
}
