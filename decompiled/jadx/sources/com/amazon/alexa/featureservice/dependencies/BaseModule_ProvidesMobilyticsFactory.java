package com.amazon.alexa.featureservice.dependencies;

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
public final class BaseModule_ProvidesMobilyticsFactory implements Factory<Mobilytics> {
    private final BaseModule module;

    public BaseModule_ProvidesMobilyticsFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesMobilyticsFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesMobilyticsFactory(baseModule);
    }

    public static Mobilytics providesMobilytics(BaseModule baseModule) {
        return (Mobilytics) Preconditions.checkNotNullFromProvides(baseModule.providesMobilytics());
    }

    @Override // javax.inject.Provider
    public Mobilytics get() {
        return providesMobilytics(this.module);
    }
}
