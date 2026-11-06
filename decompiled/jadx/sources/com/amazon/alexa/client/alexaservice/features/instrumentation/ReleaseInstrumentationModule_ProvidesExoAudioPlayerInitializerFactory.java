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
public final class ReleaseInstrumentationModule_ProvidesExoAudioPlayerInitializerFactory implements Factory<ExoAudioPlayerInitializer> {
    private final ReleaseInstrumentationModule module;

    public ReleaseInstrumentationModule_ProvidesExoAudioPlayerInitializerFactory(ReleaseInstrumentationModule releaseInstrumentationModule) {
        this.module = releaseInstrumentationModule;
    }

    public static ReleaseInstrumentationModule_ProvidesExoAudioPlayerInitializerFactory create(ReleaseInstrumentationModule releaseInstrumentationModule) {
        return new ReleaseInstrumentationModule_ProvidesExoAudioPlayerInitializerFactory(releaseInstrumentationModule);
    }

    public static ExoAudioPlayerInitializer providesExoAudioPlayerInitializer(ReleaseInstrumentationModule releaseInstrumentationModule) {
        return (ExoAudioPlayerInitializer) Preconditions.checkNotNullFromProvides(releaseInstrumentationModule.providesExoAudioPlayerInitializer());
    }

    @Override // javax.inject.Provider
    public ExoAudioPlayerInitializer get() {
        return providesExoAudioPlayerInitializer(this.module);
    }
}
