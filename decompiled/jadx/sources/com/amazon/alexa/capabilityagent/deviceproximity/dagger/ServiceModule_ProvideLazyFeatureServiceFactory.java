package com.amazon.alexa.capabilityagent.deviceproximity.dagger;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
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
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideLazyFeatureServiceFactory implements Factory<LazyComponent<FeatureServiceV2>> {
    private final ServiceModule module;

    public ServiceModule_ProvideLazyFeatureServiceFactory(ServiceModule serviceModule) {
        this.module = serviceModule;
    }

    public static ServiceModule_ProvideLazyFeatureServiceFactory create(ServiceModule serviceModule) {
        return new ServiceModule_ProvideLazyFeatureServiceFactory(serviceModule);
    }

    public static LazyComponent<FeatureServiceV2> provideLazyFeatureService(ServiceModule serviceModule) {
        return (LazyComponent) Preconditions.checkNotNullFromProvides(serviceModule.provideLazyFeatureService());
    }

    @Override // javax.inject.Provider
    public LazyComponent<FeatureServiceV2> get() {
        return provideLazyFeatureService(this.module);
    }
}
