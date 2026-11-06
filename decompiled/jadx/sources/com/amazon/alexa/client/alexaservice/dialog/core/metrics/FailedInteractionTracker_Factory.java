package com.amazon.alexa.client.alexaservice.dialog.core.metrics;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.TimeProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FailedInteractionTracker_Factory implements Factory<FailedInteractionTracker> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<TimeProvider> timeProvider;

    public FailedInteractionTracker_Factory(Provider<AlexaClientEventBus> provider, Provider<TimeProvider> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.timeProvider = provider2;
    }

    public static FailedInteractionTracker_Factory create(Provider<AlexaClientEventBus> provider, Provider<TimeProvider> provider2) {
        return new FailedInteractionTracker_Factory(provider, provider2);
    }

    public static FailedInteractionTracker newInstance(AlexaClientEventBus alexaClientEventBus, TimeProvider timeProvider) {
        return new FailedInteractionTracker(alexaClientEventBus, timeProvider);
    }

    @Override // javax.inject.Provider
    public FailedInteractionTracker get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.timeProvider.get());
    }
}
