package com.amazon.alexa.featurefeedbackservice.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featurefeedbackservice.cache.ConfigCache;
import com.amazon.alexa.featurefeedbackservice.configmanager.ConfigRefreshStatusManager;
import com.amazon.alexa.featurefeedbackservice.configmanager.ConfigRetrievalManager;
import com.amazon.alexa.featurefeedbackservice.remote.NetworkClient;
import com.amazon.alexa.featurefeedbackservice.storage.SharedPreferenceRepo;
import com.amazon.alexa.featurefeedbackservice.util.MetricUtils;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.dee.app.http.CoralService;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ImplementationModule {
    private Context context;

    public ImplementationModule(@NonNull Context context) {
        ValidationUtils.validateNonNullObject("context", context);
        this.context = context;
    }

    @Provides
    @Singleton
    public ConfigCache providesConfigCache() {
        return new ConfigCache();
    }

    @Provides
    @Singleton
    public ConfigRefreshStatusManager providesConfigRefreshStatusManager(Lazy<SharedPreferenceRepo> lazy) {
        return new ConfigRefreshStatusManager(lazy);
    }

    @Provides
    @Singleton
    public ConfigRetrievalManager providesConfigRetrievalManager(Lazy<ConfigCache> lazy, Lazy<SharedPreferenceRepo> lazy2, Lazy<ConfigRefreshStatusManager> lazy3, Lazy<MetricUtils> lazy4, Lazy<NetworkClient> lazy5, Lazy<ConfigService> lazy6) {
        return new ConfigRetrievalManager(lazy, lazy2, lazy3, lazy4, lazy5, lazy6);
    }

    @Provides
    @Singleton
    public ConfigService providesConfigService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ConfigService.class).get();
        return (ConfigService) obj;
    }

    @Provides
    @Singleton
    public CoralService providesCoralService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CoralService.class).get();
        return (CoralService) obj;
    }

    @Provides
    @Singleton
    public EventBus providesEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @Provides
    @Singleton
    public FeatureServiceV2 providesFeatureServiceV2() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }

    @Provides
    @Singleton
    public Gson providesGsonInstance() {
        return new Gson();
    }

    @Provides
    @Singleton
    public MetricUtils providesMetricUtils(Lazy<Mobilytics> lazy) {
        return new MetricUtils(lazy);
    }

    @Provides
    @Singleton
    public Mobilytics providesMobilytics() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(Mobilytics.class).get();
        return (Mobilytics) obj;
    }

    @Provides
    @Singleton
    public NetworkClient providesNetworkClient(Lazy<CoralService> lazy, Lazy<MetricUtils> lazy2) {
        return new NetworkClient(lazy, lazy2);
    }

    @Provides
    @Singleton
    public SharedPreferenceRepo providesSharedPreferenceRepo(Gson gson) {
        return new SharedPreferenceRepo(this.context, gson);
    }
}
