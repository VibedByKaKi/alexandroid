package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public abstract class FeatureServiceV2Module {
    @Provides
    @Singleton
    public static FeatureServiceV2 provideFeatureServiceV2() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }
}
