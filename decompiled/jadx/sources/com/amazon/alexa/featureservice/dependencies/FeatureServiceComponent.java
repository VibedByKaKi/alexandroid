package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.configuration.FeatureServiceConfiguration;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {BaseModule.class, NetworkModule.class, DatabaseModule.class, RepositoryModule.class, ImplementationModule.class})
@Singleton
/* loaded from: classes17.dex */
public interface FeatureServiceComponent {
    FeatureServiceConfiguration getConfiguration();

    FeatureServiceV2 getFeatureService();
}
