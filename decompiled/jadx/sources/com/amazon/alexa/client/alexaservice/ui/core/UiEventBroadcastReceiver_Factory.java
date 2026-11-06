package com.amazon.alexa.client.alexaservice.ui.core;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UiEventBroadcastReceiver_Factory implements Factory<UiEventBroadcastReceiver> {
    private final Provider<Context> contextProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public UiEventBroadcastReceiver_Factory(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        this.contextProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static UiEventBroadcastReceiver_Factory create(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        return new UiEventBroadcastReceiver_Factory(provider, provider2);
    }

    public static UiEventBroadcastReceiver newInstance(Context context, AlexaClientEventBus alexaClientEventBus) {
        return new UiEventBroadcastReceiver(context, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public UiEventBroadcastReceiver get() {
        return newInstance(this.contextProvider.get(), this.eventBusProvider.get());
    }
}
