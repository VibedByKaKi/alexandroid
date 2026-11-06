package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.mobilytics.Mobilytics;
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
public final class ExternalModule_ProvidesMobilyticsFactory implements Factory<Mobilytics> {
    private final ExternalModule module;

    public ExternalModule_ProvidesMobilyticsFactory(ExternalModule externalModule) {
        this.module = externalModule;
    }

    public static ExternalModule_ProvidesMobilyticsFactory create(ExternalModule externalModule) {
        return new ExternalModule_ProvidesMobilyticsFactory(externalModule);
    }

    public static Mobilytics providesMobilytics(ExternalModule externalModule) {
        return (Mobilytics) Preconditions.checkNotNullFromProvides(externalModule.providesMobilytics());
    }

    @Override // javax.inject.Provider
    public Mobilytics get() {
        return providesMobilytics(this.module);
    }
}
