package com.amazon.alexa.benefits.dependency;

import android.os.Handler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideHandlerFactory implements Factory<Handler> {
    private final ServiceModule module;

    public ServiceModule_ProvideHandlerFactory(ServiceModule serviceModule) {
        this.module = serviceModule;
    }

    public static ServiceModule_ProvideHandlerFactory create(ServiceModule serviceModule) {
        return new ServiceModule_ProvideHandlerFactory(serviceModule);
    }

    public static Handler provideHandler(ServiceModule serviceModule) {
        return (Handler) Preconditions.checkNotNull(serviceModule.provideHandler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return provideHandler(this.module);
    }
}
