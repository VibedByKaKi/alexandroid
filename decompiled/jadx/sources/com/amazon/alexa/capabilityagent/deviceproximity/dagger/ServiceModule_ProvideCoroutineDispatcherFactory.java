package com.amazon.alexa.capabilityagent.deviceproximity.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
    private final ServiceModule module;

    public ServiceModule_ProvideCoroutineDispatcherFactory(ServiceModule serviceModule) {
        this.module = serviceModule;
    }

    public static ServiceModule_ProvideCoroutineDispatcherFactory create(ServiceModule serviceModule) {
        return new ServiceModule_ProvideCoroutineDispatcherFactory(serviceModule);
    }

    public static CoroutineDispatcher provideCoroutineDispatcher(ServiceModule serviceModule) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(serviceModule.provideCoroutineDispatcher());
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return provideCoroutineDispatcher(this.module);
    }
}
