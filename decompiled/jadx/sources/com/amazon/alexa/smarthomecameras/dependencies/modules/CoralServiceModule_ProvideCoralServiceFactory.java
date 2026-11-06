package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CoralServiceModule_ProvideCoralServiceFactory implements Factory<CoralService> {
    private static final CoralServiceModule_ProvideCoralServiceFactory INSTANCE = new CoralServiceModule_ProvideCoralServiceFactory();

    public static CoralServiceModule_ProvideCoralServiceFactory create() {
        return INSTANCE;
    }

    public static CoralService provideCoralService() {
        return (CoralService) Preconditions.checkNotNull(CoralServiceModule.provideCoralService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CoralService get() {
        return provideCoralService();
    }
}
