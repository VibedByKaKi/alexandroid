package com.amazon.alexa.redesign.dependency;

import com.amazon.alexa.redesign.HomeServiceInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ServiceClientModule_ProvideHomeServiceInterfaceFactory implements Factory<HomeServiceInterface> {
    private final ServiceClientModule module;

    public ServiceClientModule_ProvideHomeServiceInterfaceFactory(ServiceClientModule serviceClientModule) {
        this.module = serviceClientModule;
    }

    public static ServiceClientModule_ProvideHomeServiceInterfaceFactory create(ServiceClientModule serviceClientModule) {
        return new ServiceClientModule_ProvideHomeServiceInterfaceFactory(serviceClientModule);
    }

    public static HomeServiceInterface provideHomeServiceInterface(ServiceClientModule serviceClientModule) {
        return (HomeServiceInterface) Preconditions.checkNotNullFromProvides(serviceClientModule.provideHomeServiceInterface());
    }

    @Override // javax.inject.Provider
    public HomeServiceInterface get() {
        return provideHomeServiceInterface(this.module);
    }
}
