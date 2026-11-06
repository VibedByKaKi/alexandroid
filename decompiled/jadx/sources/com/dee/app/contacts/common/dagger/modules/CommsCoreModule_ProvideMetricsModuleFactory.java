package com.dee.app.contacts.common.dagger.modules;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CommsCoreModule_ProvideMetricsModuleFactory implements Factory<AlexaCommsCoreMetricsService> {
    private final CommsCoreModule module;

    public CommsCoreModule_ProvideMetricsModuleFactory(CommsCoreModule commsCoreModule) {
        this.module = commsCoreModule;
    }

    public static CommsCoreModule_ProvideMetricsModuleFactory create(CommsCoreModule commsCoreModule) {
        return new CommsCoreModule_ProvideMetricsModuleFactory(commsCoreModule);
    }

    public static AlexaCommsCoreMetricsService provideMetricsModule(CommsCoreModule commsCoreModule) {
        return (AlexaCommsCoreMetricsService) Preconditions.checkNotNullFromProvides(commsCoreModule.provideMetricsModule());
    }

    @Override // javax.inject.Provider
    public AlexaCommsCoreMetricsService get() {
        return provideMetricsModule(this.module);
    }
}
