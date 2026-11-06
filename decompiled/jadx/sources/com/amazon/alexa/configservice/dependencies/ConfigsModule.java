package com.amazon.alexa.configservice.dependencies;

import android.content.Context;
import com.amazon.alexa.configservice.cache.ConfigCache;
import com.amazon.alexa.configservice.client.CloudfrontConfigClient;
import com.amazon.alexa.configservice.manager.RemoteConfigRetrievalManager;
import com.amazon.alexa.configservice.metadata.MetadataProvider;
import com.amazon.alexa.configservice.metrics.MobilyticsService;
import com.amazon.alexa.configservice.storage.ConfigRefreshStatusManager;
import com.amazon.alexa.configservice.storage.ConfigStorage;
import com.amazon.alexa.configservice.storage.SharedPreferencesManager;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ConfigsModule {
    private final Context context;

    public ConfigsModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public ApplicationLifecycleService providesApplicationLifecycleService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ApplicationLifecycleService.class).get();
        return (ApplicationLifecycleService) obj;
    }

    @Provides
    @Singleton
    public ConfigCache providesConfigCache() {
        return new ConfigCache();
    }

    @Provides
    @Singleton
    public ConfigRefreshStatusManager providesConfigRefreshStatusManager(SharedPreferencesManager sharedPreferencesManager) {
        return new ConfigRefreshStatusManager(sharedPreferencesManager);
    }

    @Provides
    @Singleton
    public ConfigStorage providesConfigStorage(MetadataProvider metadataProvider, MobilyticsService mobilyticsService, SharedPreferencesManager sharedPreferencesManager) {
        return new ConfigStorage(this.context, metadataProvider, mobilyticsService, sharedPreferencesManager);
    }

    @Provides
    @Singleton
    public MetadataProvider providesMetadataProvider(EnvironmentService environmentService) {
        return new MetadataProvider(environmentService);
    }

    @Provides
    @Singleton
    public MobilyticsService providesMobilyticsService() {
        return new MobilyticsService();
    }

    @Provides
    @Singleton
    public NetworkService providesNetworkService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(NetworkService.class).get();
        return (NetworkService) obj;
    }

    @Provides
    @Singleton
    public RemoteConfigRetrievalManager providesRemoteConfigRetrievalManager(Lazy<CloudfrontConfigClient> lazy, Lazy<ConfigStorage> lazy2, Lazy<ConfigRefreshStatusManager> lazy3, Lazy<ConfigCache> lazy4, Lazy<MobilyticsService> lazy5, Lazy<MetadataProvider> lazy6, Lazy<NetworkService> lazy7, Lazy<ApplicationLifecycleService> lazy8) {
        return new RemoteConfigRetrievalManager(lazy, lazy2, lazy3, lazy4, lazy5, lazy6, lazy7, lazy8);
    }

    @Provides
    @Singleton
    public SharedPreferencesManager providesSharedPrefsManager(MobilyticsService mobilyticsService) {
        return new SharedPreferencesManager(this.context, mobilyticsService);
    }
}
