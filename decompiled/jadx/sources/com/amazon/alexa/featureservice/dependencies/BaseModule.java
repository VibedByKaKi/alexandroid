package com.amazon.alexa.featureservice.dependencies;

import android.content.Context;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.dependencies.annotation.ApplicationContext;
import com.amazon.alexa.featureservice.util.Analytics;
import com.amazon.alexa.featureservice.util.RandomUtil;
import com.amazon.alexa.featureservice.util.SafeEventBus;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.dee.app.http.CoralService;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class BaseModule {
    private Context context;
    private Lazy<CoralService> coralServiceLazy;
    private Lazy<EnvironmentService> environmentServiceLazy;
    private Lazy<EventBus> eventBusLazy;
    private Lazy<Mobilytics> mobilyticsLazy;

    public BaseModule(Context context, Lazy<EnvironmentService> lazy, Lazy<EventBus> lazy2, Lazy<Mobilytics> lazy3, Lazy<CoralService> lazy4) {
        this.context = context;
        this.environmentServiceLazy = lazy;
        this.eventBusLazy = lazy2;
        this.mobilyticsLazy = lazy3;
        this.coralServiceLazy = lazy4;
    }

    @Provides
    @Singleton
    public Analytics providesAnalytics() {
        return new Analytics(this.mobilyticsLazy, new RandomUtil());
    }

    @Provides
    @Singleton
    @ApplicationContext
    public Context providesContext() {
        return this.context.getApplicationContext();
    }

    @Provides
    @Singleton
    public CoralService providesCoralService() {
        return this.coralServiceLazy.get();
    }

    @Provides
    @Singleton
    public EnvironmentService providesEnvironmentService() {
        return this.environmentServiceLazy.get();
    }

    @Provides
    @Singleton
    public EventBus providesEventBus() {
        return this.eventBusLazy.get();
    }

    @Provides
    @Singleton
    public Gson providesGsonInstance() {
        return new Gson();
    }

    @Provides
    @Singleton
    public Mobilytics providesMobilytics() {
        return this.mobilyticsLazy.get();
    }

    @Provides
    @Singleton
    public SafeEventBus providesSafeEventBus() {
        return new SafeEventBus(this.eventBusLazy);
    }
}
