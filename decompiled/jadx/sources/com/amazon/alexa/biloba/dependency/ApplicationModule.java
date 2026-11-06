package com.amazon.alexa.biloba.dependency;

import com.amazon.alexa.biloba.view.BilobaViewModelFactory;
import com.amazon.alexa.crashreporting.api.CrashMetadata;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.imageloader.api.ImageLoader;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.network.api.HttpClient;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.tasks.api.TaskManager;
import com.amazon.latencyinfra.LatencyInfra;
import com.dee.app.data.api.ElementLocalStorage;
import com.dee.app.http.CoralService;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ExecutorService;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public final class ApplicationModule {
    @Provides
    @Singleton
    public CoralService provideCoralService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CoralService.class).get();
        return (CoralService) obj;
    }

    @Provides
    @Singleton
    public CrashMetadata provideCrashMetadata() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CrashMetadata.class).get();
        return (CrashMetadata) obj;
    }

    @Provides
    @Singleton
    public CrashReporter provideCrashReporter() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CrashReporter.class).get();
        return (CrashReporter) obj;
    }

    @Provides
    @Singleton
    public DeviceInformation provideDeviceInformation() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(DeviceInformation.class).get();
        return (DeviceInformation) obj;
    }

    @Provides
    @Singleton
    public ElementLocalStorage provideElementLocalStorage() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ElementLocalStorage.class).get();
        return (ElementLocalStorage) obj;
    }

    @Provides
    @Singleton
    public EnvironmentService provideEnvironmentService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
        return (EnvironmentService) obj;
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @Provides
    @Singleton
    public FeatureServiceV2 provideFeatureServiceV2() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }

    @Provides
    @Singleton
    public HttpClient provideHttpClient() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(HttpClient.class).get();
        return (HttpClient) obj;
    }

    @Provides
    @Singleton
    public IdentityService provideIdentityService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(IdentityService.class).get();
        return (IdentityService) obj;
    }

    @Provides
    @Singleton
    public ImageLoader provideImageLoader() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ImageLoader.class).get();
        return (ImageLoader) obj;
    }

    @Provides
    @Singleton
    public LatencyInfra provideLatencyInfra() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(LatencyInfra.class).get();
        return (LatencyInfra) obj;
    }

    @Provides
    @Singleton
    public MainActivityLifecycleObserverRegistrar provideMainActivityLifecycleObserverRegistrar() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(MainActivityLifecycleObserverRegistrar.class).get();
        return (MainActivityLifecycleObserverRegistrar) obj;
    }

    @Provides
    @Singleton
    public MetricsServiceV2 provideMetricsService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(MetricsServiceV2.class).get();
        return (MetricsServiceV2) obj;
    }

    @Provides
    @Singleton
    public Mobilytics provideMobilytics() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(Mobilytics.class).get();
        return (Mobilytics) obj;
    }

    @Provides
    public NetworkService provideNetworkService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(NetworkService.class).get();
        return (NetworkService) obj;
    }

    @Provides
    @Singleton
    public PersistentStorage.Factory providePersistentStorageFactory() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(PersistentStorage.Factory.class).get();
        return (PersistentStorage.Factory) obj;
    }

    @Provides
    @Singleton
    public RoutingService provideRoutingService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(RoutingService.class).get();
        return (RoutingService) obj;
    }

    @Provides
    @Singleton
    public ExecutorService provideShortLivedTaskExecutor() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(TaskManager.class).get();
        return ((TaskManager) obj).getExecutor(0);
    }

    @Provides
    @Singleton
    public BilobaViewModelFactory provideViewModelFactory() {
        return BilobaViewModelFactory.getInstance();
    }
}
