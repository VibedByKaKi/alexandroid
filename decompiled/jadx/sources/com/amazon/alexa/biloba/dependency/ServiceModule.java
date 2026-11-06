package com.amazon.alexa.biloba.dependency;

import android.os.Handler;
import android.os.Looper;
import com.amazon.alexa.biloba.generated.network.AppSchedulerProvider;
import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.biloba.metrics.BilobaMetricsService;
import com.amazon.alexa.biloba.service.BilobaPersonIdProvider;
import com.amazon.alexa.biloba.service.BilobaUrlResolver;
import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.biloba.utils.UrlHelper;
import com.amazon.alexa.biloba.view.dashboard.RemoteManagementInactivityHandler;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.routing.api.RoutingService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ServiceModule {
    @Provides
    @Singleton
    public BilobaMetricsService provideBilobaMetricsService(Mobilytics mobilytics, Lazy<EnvironmentService> lazy) {
        return new BilobaMetricsService(mobilytics, lazy);
    }

    @Provides
    @Singleton
    public BilobaUrlResolver provideBilobaUrlResolver(EnvironmentService environmentService) {
        return new BilobaUrlResolver(environmentService);
    }

    @Provides
    @Singleton
    public PersonIdProvider providePersonIdProvider(IdentityService identityService, BilobaMetricsService bilobaMetricsService) {
        return new BilobaPersonIdProvider(identityService, bilobaMetricsService);
    }

    @Provides
    @Singleton
    public RemoteManagementInactivityHandler provideRemoteManagementInactivityHandler(Lazy<EventBus> lazy, Lazy<IdentityService> lazy2, Lazy<MainActivityLifecycleObserverRegistrar> lazy3, Lazy<RoutingService> lazy4, Lazy<CareActorsStore> lazy5) {
        return new RemoteManagementInactivityHandler(lazy, lazy2, lazy3, lazy4, lazy5, new Handler(Looper.getMainLooper()));
    }

    @Provides
    @Singleton
    public SchedulerProvider provideScheduler() {
        return new AppSchedulerProvider();
    }

    @Provides
    @Singleton
    public UrlHelper provideUrlHelper(Lazy<EnvironmentService> lazy, Lazy<CareActorsStore> lazy2) {
        return new UrlHelper(lazy, lazy2);
    }
}
