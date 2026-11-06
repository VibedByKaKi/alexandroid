package com.amazon.alexa.client.alexaservice.features.alerts;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
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
public final class AlertsBroadcastReceiver_Factory implements Factory<AlertsBroadcastReceiver> {
    private final Provider<Context> contextProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public AlertsBroadcastReceiver_Factory(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        this.contextProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static AlertsBroadcastReceiver_Factory create(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        return new AlertsBroadcastReceiver_Factory(provider, provider2);
    }

    public static AlertsBroadcastReceiver newInstance(Context context, AlexaClientEventBus alexaClientEventBus) {
        return new AlertsBroadcastReceiver(context, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public AlertsBroadcastReceiver get() {
        return newInstance(this.contextProvider.get(), this.eventBusProvider.get());
    }
}
