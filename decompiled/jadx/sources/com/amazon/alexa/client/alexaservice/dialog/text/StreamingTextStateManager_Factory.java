package com.amazon.alexa.client.alexaservice.dialog.text;

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
public final class StreamingTextStateManager_Factory implements Factory<StreamingTextStateManager> {
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final Provider<ScheduledExecutorService> sharedExecutorServiceProvider;

    public StreamingTextStateManager_Factory(Provider<ScheduledExecutorService> provider, Provider<AlexaClientEventBus> provider2) {
        this.sharedExecutorServiceProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static StreamingTextStateManager_Factory create(Provider<ScheduledExecutorService> provider, Provider<AlexaClientEventBus> provider2) {
        return new StreamingTextStateManager_Factory(provider, provider2);
    }

    public static StreamingTextStateManager newInstance(ScheduledExecutorService scheduledExecutorService, AlexaClientEventBus alexaClientEventBus) {
        return new StreamingTextStateManager(scheduledExecutorService, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public StreamingTextStateManager get() {
        return newInstance(this.sharedExecutorServiceProvider.get(), this.eventBusProvider.get());
    }
}
