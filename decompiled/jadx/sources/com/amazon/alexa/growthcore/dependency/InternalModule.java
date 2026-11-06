package com.amazon.alexa.growthcore.dependency;

import android.content.Context;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.growthcore.service.cache.CacheServiceImpl;
import com.amazon.alexa.growthcore.service.configbasedexperiment.ConfigBasedExperimentService;
import com.amazon.alexa.growthcore.service.configbasedexperiment.ConfigBasedExperimentServiceImpl;
import com.amazon.alexa.growthcore.service.metadata.MetadataProvider;
import com.amazon.alexa.growthcore.service.metrics.MobilyticsService;
import com.amazon.alexa.growthcore.service.sessionid.ExperimentSessionIDProvider;
import com.amazon.alexa.growthcore.service.sessionid.MobilyticsExperimentSessionIDProvider;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class InternalModule {
    private final Context context;

    public InternalModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public ConfigBasedExperimentService providesConfigBasedExperimentService(Lazy<ExperimentSessionIDProvider> lazy, Lazy<ConfigService> lazy2, Lazy<MetadataProvider> lazy3, Lazy<MobilyticsService> lazy4) {
        return ConfigBasedExperimentServiceImpl.getInstance(lazy, lazy2, lazy3, lazy4, new CacheServiceImpl(), this.context.getResources().getConfiguration());
    }

    @Provides
    @Singleton
    public ExperimentSessionIDProvider providesExperimentSessionIDProvider() {
        return new MobilyticsExperimentSessionIDProvider(this.context);
    }

    @Provides
    @Singleton
    public MetadataProvider providesMetadataProvider(Lazy<EnvironmentService> lazy) {
        return new MetadataProvider(lazy);
    }

    @Provides
    @Singleton
    public MobilyticsService providesMobilyticsService(Lazy<Mobilytics> lazy) {
        return new MobilyticsService(lazy);
    }
}
