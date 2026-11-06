package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.util;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class TimeOutTaskManager_Factory implements Factory<TimeOutTaskManager> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<ScheduledExecutorService> executorServiceProvider;

    public TimeOutTaskManager_Factory(Provider<AlexaClientEventBus> provider, Provider<ScheduledExecutorService> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.executorServiceProvider = provider2;
    }

    public static TimeOutTaskManager_Factory create(Provider<AlexaClientEventBus> provider, Provider<ScheduledExecutorService> provider2) {
        return new TimeOutTaskManager_Factory(provider, provider2);
    }

    public static TimeOutTaskManager newInstance(AlexaClientEventBus alexaClientEventBus, ScheduledExecutorService scheduledExecutorService) {
        return new TimeOutTaskManager(alexaClientEventBus, scheduledExecutorService);
    }

    @Override // javax.inject.Provider
    public TimeOutTaskManager get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.executorServiceProvider.get());
    }
}
