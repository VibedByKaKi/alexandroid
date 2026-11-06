package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentityStorage;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.dee.app.build.GradleBuild;
import com.amazon.dee.app.services.environment.BobPathResolver;
import com.amazon.dee.app.services.environment.DataRegionEnvironmentService;
import com.amazon.dee.app.services.environment.DefaultEnvironmentService;
import com.amazon.dee.app.services.environment.PersistentEndpointsStorage;
import com.amazon.dee.app.services.environment.PfmEnvironmentService;
import com.amazon.dee.app.services.marketplace.MarketplaceConfigProvider;
import com.dee.app.http.CoralService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class EnvironmentModule {
    @Provides
    @ApplicationScope
    public BobPathResolver provideBobPathResolver(Lazy<ConfigService> lazy, Lazy<FeatureServiceV2> lazy2) {
        return new BobPathResolver(lazy, lazy2);
    }

    @Provides
    @ApplicationScope
    public DataRegionEnvironmentService provideDataRegionEnvironmentService(Context context, EventBus eventBus, UserIdentityStorage userIdentityStorage, PersistentEndpointsStorage persistentEndpointsStorage, Lazy<CoralService> lazy, Lazy<IdentityService> lazy2, Lazy<Mobilytics> lazy3, Lazy<PfmEnvironmentService> lazy4, BobPathResolver bobPathResolver, MarketplaceConfigProvider marketplaceConfigProvider) {
        return new DataRegionEnvironmentService(context, eventBus, userIdentityStorage, persistentEndpointsStorage, lazy, lazy2, lazy3, lazy4, bobPathResolver, marketplaceConfigProvider);
    }

    @Provides
    @ApplicationScope
    public EnvironmentService provideEnvironmentService(PfmEnvironmentService pfmEnvironmentService, DataRegionEnvironmentService dataRegionEnvironmentService, Lazy<IdentityService> lazy, GradleBuild gradleBuild) {
        return new DefaultEnvironmentService(pfmEnvironmentService, dataRegionEnvironmentService, lazy, gradleBuild);
    }

    @Provides
    @ApplicationScope
    public PersistentEndpointsStorage providePersistentEndpointsStorage(PersistentStorage.Factory factory) {
        return new PersistentEndpointsStorage(factory);
    }

    @Provides
    @ApplicationScope
    public PfmEnvironmentService providePfmEnvironmentService(Context context, DeviceInformation deviceInformation, UserIdentityStorage userIdentityStorage, Lazy<ConfigService> lazy, Lazy<FeatureServiceV2> lazy2, BobPathResolver bobPathResolver, GradleBuild gradleBuild, MarketplaceConfigProvider marketplaceConfigProvider) {
        return new PfmEnvironmentService(context, deviceInformation, userIdentityStorage, lazy, lazy2, bobPathResolver, gradleBuild, marketplaceConfigProvider);
    }
}
