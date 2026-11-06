package com.amazon.alexa.client.alexaservice.base.auth;

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
public final class AuthenticationChangeBroadcastReceiver_Factory implements Factory<AuthenticationChangeBroadcastReceiver> {
    private final Provider<Context> contextProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public AuthenticationChangeBroadcastReceiver_Factory(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        this.contextProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static AuthenticationChangeBroadcastReceiver_Factory create(Provider<Context> provider, Provider<AlexaClientEventBus> provider2) {
        return new AuthenticationChangeBroadcastReceiver_Factory(provider, provider2);
    }

    public static AuthenticationChangeBroadcastReceiver newInstance(Context context, AlexaClientEventBus alexaClientEventBus) {
        return new AuthenticationChangeBroadcastReceiver(context, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public AuthenticationChangeBroadcastReceiver get() {
        return newInstance(this.contextProvider.get(), this.eventBusProvider.get());
    }
}
