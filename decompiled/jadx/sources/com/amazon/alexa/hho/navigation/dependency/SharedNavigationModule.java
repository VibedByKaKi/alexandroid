package com.amazon.alexa.hho.navigation.dependency;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ThirdPartyDeeplinkingDirectiveHandler;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink.LastLaunchedNavigationAppStore;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui.ActivityStarter;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui.DefaultActivityStarter;
import com.amazon.alexa.hho.navigation.transit.notification.NavigationNotificationManager;
import com.amazon.alexa.hho.navigation.transit.session.NavigationSessionManager;
import com.amazon.alexa.hho.navigation.utils.DirectiveParsingUtils;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.notification.api.NotificationCenterLocalProtocol;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module(subcomponents = {ThirdPartyDeeplinkingDirectiveHandler.Factory.class, NavigationSessionManager.Component.class})
/* loaded from: classes13.dex */
public class SharedNavigationModule {
    private static final int CORE_POOL_SIZE = 3;
    public static final String SHARED_SCHEDULER = "shared_scheduler";
    private final Context context;

    public SharedNavigationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public static PreferredNavigationAppContentAccessor providePreferredNavigationAppContentAccessor(Context context) {
        return new PreferredNavigationAppContentAccessor(context);
    }

    @Provides
    public ActivityStarter provideActivityStarter(Context context) {
        return new DefaultActivityStarter(context);
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public LazyComponent<BenefitsService> provideBenefitsService() {
        return ComponentRegistry.getInstance().getLazy(BenefitsService.class);
    }

    @Provides
    public DirectiveParsingUtils provideDirectiveParsingUtils(Gson gson) {
        return new DirectiveParsingUtils(gson);
    }

    @Provides
    @Singleton
    public LazyComponent<FeatureServiceV2> provideFeatureServiceV2() {
        return ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class);
    }

    @Provides
    @Singleton
    public Gson provideGson() {
        return new GsonBuilder().registerTypeAdapterFactory(AutoValueAdapterFactory.create()).create();
    }

    @Provides
    @Singleton
    public KeyguardManager provideKeyguardManager(Context context) {
        return (KeyguardManager) context.getSystemService("keyguard");
    }

    @Provides
    @Singleton
    public LastLaunchedNavigationAppStore provideLastLaunchedNavigationAppStore(LazyComponent<PersistentStorage.Factory> lazyComponent) {
        return new LastLaunchedNavigationAppStore(lazyComponent);
    }

    @NonNull
    @Provides
    @Singleton
    public HHOMetricsService provideMetrics(LazyComponent<Mobilytics> lazyComponent) {
        return new HHOMetricsService(lazyComponent);
    }

    @Provides
    @Singleton
    public LazyComponent<Mobilytics> provideMobilytics() {
        return ComponentRegistry.getInstance().getLazy(Mobilytics.class);
    }

    @Provides
    @Singleton
    public NavigationNotificationManager provideNavigationNotificationManager(Context context, HHOMetricsService hHOMetricsService) {
        return new NavigationNotificationManager(context, ComponentRegistry.getInstance().getLazy(NotificationCenterLocalProtocol.class), hHOMetricsService);
    }

    @Provides
    @Singleton
    public PackageManager providePackageManager() {
        return this.context.getPackageManager();
    }

    @Provides
    @Singleton
    public LazyComponent<PersistentStorage.Factory> providePersistentStorageFactory() {
        return ComponentRegistry.getInstance().getLazy(PersistentStorage.Factory.class);
    }

    @Provides
    @Singleton
    @Named("shared_scheduler")
    public ScheduledExecutorService provideSharedScheduler() {
        return ManagedExecutorFactory.newScheduledExecutor(3, "shared_scheduler");
    }
}
