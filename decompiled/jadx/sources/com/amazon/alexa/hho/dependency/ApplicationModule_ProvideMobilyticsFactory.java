package com.amazon.alexa.hho.dependency;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class ApplicationModule_ProvideMobilyticsFactory implements Factory<LazyComponent<Mobilytics>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideMobilyticsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideMobilyticsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideMobilyticsFactory(applicationModule);
    }

    public static LazyComponent<Mobilytics> provideMobilytics(ApplicationModule applicationModule) {
        return (LazyComponent) Preconditions.checkNotNullFromProvides(applicationModule.provideMobilytics());
    }

    @Override // javax.inject.Provider
    public LazyComponent<Mobilytics> get() {
        return provideMobilytics(this.module);
    }
}
