package com.amazon.alexa.system;

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
/* loaded from: classes19.dex */
public final class UserInactivityAuthority_Factory implements Factory<UserInactivityAuthority> {
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final Provider<ScheduledExecutorService> sharedExecutorServiceProvider;

    public UserInactivityAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<ScheduledExecutorService> provider2) {
        this.eventBusProvider = provider;
        this.sharedExecutorServiceProvider = provider2;
    }

    public static UserInactivityAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<ScheduledExecutorService> provider2) {
        return new UserInactivityAuthority_Factory(provider, provider2);
    }

    public static UserInactivityAuthority newInstance(AlexaClientEventBus alexaClientEventBus, ScheduledExecutorService scheduledExecutorService) {
        return new UserInactivityAuthority(alexaClientEventBus, scheduledExecutorService);
    }

    @Override // javax.inject.Provider
    public UserInactivityAuthority get() {
        return newInstance(this.eventBusProvider.get(), this.sharedExecutorServiceProvider.get());
    }
}
