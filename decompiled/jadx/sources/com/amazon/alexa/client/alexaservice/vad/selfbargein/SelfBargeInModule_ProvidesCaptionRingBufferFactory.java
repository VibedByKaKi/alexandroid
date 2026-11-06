package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SelfBargeInModule_ProvidesCaptionRingBufferFactory implements Factory<CaptionRingBuffer> {
    private final Provider<SelfBargeInConfig> configProvider;
    private final SelfBargeInModule module;

    public SelfBargeInModule_ProvidesCaptionRingBufferFactory(SelfBargeInModule selfBargeInModule, Provider<SelfBargeInConfig> provider) {
        this.module = selfBargeInModule;
        this.configProvider = provider;
    }

    public static SelfBargeInModule_ProvidesCaptionRingBufferFactory create(SelfBargeInModule selfBargeInModule, Provider<SelfBargeInConfig> provider) {
        return new SelfBargeInModule_ProvidesCaptionRingBufferFactory(selfBargeInModule, provider);
    }

    public static CaptionRingBuffer providesCaptionRingBuffer(SelfBargeInModule selfBargeInModule, SelfBargeInConfig selfBargeInConfig) {
        return (CaptionRingBuffer) Preconditions.checkNotNullFromProvides(selfBargeInModule.providesCaptionRingBuffer(selfBargeInConfig));
    }

    @Override // javax.inject.Provider
    public CaptionRingBuffer get() {
        return providesCaptionRingBuffer(this.module, this.configProvider.get());
    }
}
