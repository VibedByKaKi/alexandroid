package com.amazon.alexa.benefits.dependency;

import android.os.Handler;
import android.os.Looper;
import com.amazon.alexa.benefits.models.service.AppSchedulerProvider;
import com.amazon.alexa.benefits.models.service.SchedulerProvider;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import java.time.Clock;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public final class ServiceModule {
    @Provides
    @Singleton
    public Clock provideClock() {
        return Clock.systemUTC();
    }

    @Provides
    @Singleton
    public Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public Handler provideHandler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    @Singleton
    public SchedulerProvider provideScheduler() {
        return new AppSchedulerProvider();
    }
}
