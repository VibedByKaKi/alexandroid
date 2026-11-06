package com.amazon.alexa.seamlessswitching.capability.dependencies;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class AlexaMobileModule_ProvidesMobilyticsLazyFactory implements Factory<LazyComponent<Mobilytics>> {
    private final AlexaMobileModule module;

    public AlexaMobileModule_ProvidesMobilyticsLazyFactory(AlexaMobileModule alexaMobileModule) {
        this.module = alexaMobileModule;
    }

    public static AlexaMobileModule_ProvidesMobilyticsLazyFactory create(AlexaMobileModule alexaMobileModule) {
        return new AlexaMobileModule_ProvidesMobilyticsLazyFactory(alexaMobileModule);
    }

    public static LazyComponent<Mobilytics> providesMobilyticsLazy(AlexaMobileModule alexaMobileModule) {
        return (LazyComponent) Preconditions.checkNotNullFromProvides(alexaMobileModule.providesMobilyticsLazy());
    }

    @Override // javax.inject.Provider
    public LazyComponent<Mobilytics> get() {
        return providesMobilyticsLazy(this.module);
    }
}
