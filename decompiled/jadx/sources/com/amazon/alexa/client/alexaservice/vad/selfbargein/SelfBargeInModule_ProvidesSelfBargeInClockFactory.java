package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import com.amazon.alexa.client.alexaservice.vad.selfbargein.PerDridCaptionAccumulator;
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
public final class SelfBargeInModule_ProvidesSelfBargeInClockFactory implements Factory<PerDridCaptionAccumulator.Clock> {
    private final SelfBargeInModule module;

    public SelfBargeInModule_ProvidesSelfBargeInClockFactory(SelfBargeInModule selfBargeInModule) {
        this.module = selfBargeInModule;
    }

    public static SelfBargeInModule_ProvidesSelfBargeInClockFactory create(SelfBargeInModule selfBargeInModule) {
        return new SelfBargeInModule_ProvidesSelfBargeInClockFactory(selfBargeInModule);
    }

    public static PerDridCaptionAccumulator.Clock providesSelfBargeInClock(SelfBargeInModule selfBargeInModule) {
        return (PerDridCaptionAccumulator.Clock) Preconditions.checkNotNullFromProvides(selfBargeInModule.providesSelfBargeInClock());
    }

    @Override // javax.inject.Provider
    public PerDridCaptionAccumulator.Clock get() {
        return providesSelfBargeInClock(this.module);
    }
}
