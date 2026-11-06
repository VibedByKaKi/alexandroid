package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.dee.app.http.CoralService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public abstract class CoralServiceModule {
    @Provides
    @Singleton
    public static CoralService provideCoralService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CoralService.class).get();
        return (CoralService) obj;
    }
}
