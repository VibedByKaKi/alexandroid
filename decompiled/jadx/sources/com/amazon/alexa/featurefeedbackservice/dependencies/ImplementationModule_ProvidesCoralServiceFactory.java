package com.amazon.alexa.featurefeedbackservice.dependencies;

import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImplementationModule_ProvidesCoralServiceFactory implements Factory<CoralService> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesCoralServiceFactory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesCoralServiceFactory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesCoralServiceFactory(implementationModule);
    }

    public static CoralService providesCoralService(ImplementationModule implementationModule) {
        return (CoralService) Preconditions.checkNotNull(implementationModule.providesCoralService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CoralService get() {
        return providesCoralService(this.module);
    }
}
