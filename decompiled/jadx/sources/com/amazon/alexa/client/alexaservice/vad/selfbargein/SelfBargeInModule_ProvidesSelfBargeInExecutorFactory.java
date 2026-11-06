package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.amazon.alexa.client.alexaservice.vad.selfbargein.SelfBargeInExecutor"})
/* loaded from: classes17.dex */
public final class SelfBargeInModule_ProvidesSelfBargeInExecutorFactory implements Factory<ScheduledExecutorService> {
    private final SelfBargeInModule module;

    public SelfBargeInModule_ProvidesSelfBargeInExecutorFactory(SelfBargeInModule selfBargeInModule) {
        this.module = selfBargeInModule;
    }

    public static SelfBargeInModule_ProvidesSelfBargeInExecutorFactory create(SelfBargeInModule selfBargeInModule) {
        return new SelfBargeInModule_ProvidesSelfBargeInExecutorFactory(selfBargeInModule);
    }

    public static ScheduledExecutorService providesSelfBargeInExecutor(SelfBargeInModule selfBargeInModule) {
        return (ScheduledExecutorService) Preconditions.checkNotNullFromProvides(selfBargeInModule.providesSelfBargeInExecutor());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return providesSelfBargeInExecutor(this.module);
    }
}
