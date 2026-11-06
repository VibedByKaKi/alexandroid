package com.amazon.dee.app.services.features;

import androidx.annotation.NonNull;
import com.amazon.alexa.feature.provider.api.FeatureStore;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.features.FeatureConstraints;
import com.amazon.alexa.protocols.features.FeatureFilter;
import com.amazon.alexa.protocols.features.FeatureQuery;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.voice.model.VoiceService;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.featureservice.ConfigureFeatureServiceUseCase;
import com.amazon.dee.app.services.featureservice.DefaultConfigureFeatureServiceUseCase;
import com.amazon.deecomms.core.decoupling.AlexaCommsService;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public abstract class FeaturesModule {
    @Provides
    @ApplicationScope
    @IntoSet
    public static FeatureFilter provideCommsFeatureFilter(@NonNull AlexaCommsService alexaCommsService) {
        return alexaCommsService.getCommsFeatureFilter();
    }

    @Provides
    @ApplicationScope
    public static FeatureConstraints provideFeatureConstraints(Set<FeatureFilter> set, EnvironmentService environmentService) {
        return new DefaultFeatureConstraints(set, environmentService);
    }

    @Provides
    @ApplicationScope
    @Deprecated
    public static FeatureQuery provideFeatureQuery(Lazy<IdentityService> lazy) {
        return new DefaultFeatureQuery(lazy);
    }

    @Provides
    @ApplicationScope
    public static FeatureStore provideFeatureStore() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureStore.class).get();
        return (FeatureStore) obj;
    }

    @Provides
    @ApplicationScope
    @IntoSet
    public static FeatureFilter provideVoiceIngressFeatureFilter(Lazy<VoiceService> lazy) {
        return new VoiceIngressFeatureFilter(lazy);
    }

    @Binds
    @ApplicationScope
    public abstract ConfigureFeatureServiceUseCase bindConfigureFeatureServiceUseCase(DefaultConfigureFeatureServiceUseCase defaultConfigureFeatureServiceUseCase);
}
