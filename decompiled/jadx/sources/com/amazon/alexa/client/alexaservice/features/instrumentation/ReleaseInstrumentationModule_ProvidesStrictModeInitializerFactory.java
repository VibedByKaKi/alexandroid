package com.amazon.alexa.client.alexaservice.features.instrumentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ReleaseInstrumentationModule_ProvidesStrictModeInitializerFactory implements Factory<StrictModeInitializer> {
    private final ReleaseInstrumentationModule module;

    public ReleaseInstrumentationModule_ProvidesStrictModeInitializerFactory(ReleaseInstrumentationModule releaseInstrumentationModule) {
        this.module = releaseInstrumentationModule;
    }

    public static ReleaseInstrumentationModule_ProvidesStrictModeInitializerFactory create(ReleaseInstrumentationModule releaseInstrumentationModule) {
        return new ReleaseInstrumentationModule_ProvidesStrictModeInitializerFactory(releaseInstrumentationModule);
    }

    public static StrictModeInitializer providesStrictModeInitializer(ReleaseInstrumentationModule releaseInstrumentationModule) {
        return (StrictModeInitializer) Preconditions.checkNotNullFromProvides(releaseInstrumentationModule.providesStrictModeInitializer());
    }

    @Override // javax.inject.Provider
    public StrictModeInitializer get() {
        return providesStrictModeInitializer(this.module);
    }
}
