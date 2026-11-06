package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import androidx.work.WorkManager;
import com.amazon.alexa.app.notification.branch.BranchEventRecorder;
import com.amazon.alexa.app.notification.branch.BranchIntegrationService;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.imageloader.api.ImageLoader;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.network.api.HttpClient;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.deecomms.api.CommsManager;
import com.dee.app.http.CoralService;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes.dex */
public class CoreModule {
    private final Lazy<CommsManager> commsManager;
    private final ComponentRegistry componentRegistry;
    private final Context context;
    private final Lazy<PersistentStorage.Factory> persistentStorageFactory;

    public CoreModule(Context context, ComponentRegistry componentRegistry, Lazy<PersistentStorage.Factory> lazy, Lazy<CommsManager> lazy2) {
        this.context = context;
        this.componentRegistry = componentRegistry;
        this.persistentStorageFactory = lazy;
        this.commsManager = lazy2;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public CommsManager provideCommsManager() {
        return this.commsManager.get();
    }

    @Provides
    @Singleton
    public ComponentRegistry provideComponentRegistry() {
        return this.componentRegistry;
    }

    @Provides
    @Singleton
    public CoralService provideCoralService() {
        return (CoralService) this.componentRegistry.get(CoralService.class).orNull();
    }

    @Provides
    @Singleton
    public CrashReporter provideCrashReporter() {
        return (CrashReporter) this.componentRegistry.get(CrashReporter.class).orNull();
    }

    @Provides
    @Singleton
    public DeviceInformation provideDeviceInformation() {
        return (DeviceInformation) this.componentRegistry.get(DeviceInformation.class).orNull();
    }

    @Provides
    @Singleton
    public EnvironmentService provideEnvironmentService() {
        return (EnvironmentService) this.componentRegistry.get(EnvironmentService.class).orNull();
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return (EventBus) this.componentRegistry.get(EventBus.class).orNull();
    }

    @Provides
    @Singleton
    public FeatureServiceV2 provideFeatureServiceV2() {
        return (FeatureServiceV2) this.componentRegistry.get(FeatureServiceV2.class).orNull();
    }

    @Provides
    @Singleton
    public IdentityService provideIdentityService() {
        return (IdentityService) this.componentRegistry.get(IdentityService.class).orNull();
    }

    @Provides
    @Singleton
    public ImageLoader provideImageLoader() {
        return (ImageLoader) this.componentRegistry.get(ImageLoader.class).orNull();
    }

    @Provides
    @Singleton
    public Mobilytics provideMobilytics() {
        return (Mobilytics) this.componentRegistry.get(Mobilytics.class).orNull();
    }

    @Provides
    @Singleton
    public NetworkService provideNetworkService() {
        return (NetworkService) this.componentRegistry.get(NetworkService.class).orNull();
    }

    @Provides
    @Singleton
    public ObjectMapper provideObjectMapper() {
        return new ObjectMapper();
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return ((HttpClient) this.componentRegistry.get(HttpClient.class).get()).httpClient();
    }

    @Provides
    @Singleton
    public PersistentStorage.Factory providePersistentStorageFactory() {
        return this.persistentStorageFactory.get();
    }

    @Provides
    @Singleton
    public PersonIdProvider providePersonIdProvider() {
        return (PersonIdProvider) this.componentRegistry.get(PersonIdProvider.class).orNull();
    }

    @Provides
    @Singleton
    public WorkManager provideWorkManager(Context context) {
        return WorkManager.getInstance(context);
    }

    @Provides
    @Singleton
    public BranchEventRecorder provideBranchEventRecorder(BranchIntegrationService branchIntegrationService) {
        return branchIntegrationService;
    }
}
