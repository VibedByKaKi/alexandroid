package com.amazon.alexa.biloba.view.dashboard;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CommsHandler_Factory implements Factory<CommsHandler> {
    private final Provider<EventBus> eventBusProvider;

    public CommsHandler_Factory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static CommsHandler_Factory create(Provider<EventBus> provider) {
        return new CommsHandler_Factory(provider);
    }

    public static CommsHandler newInstance(Lazy<EventBus> lazy) {
        return new CommsHandler(lazy);
    }

    @Override // javax.inject.Provider
    public CommsHandler get() {
        return new CommsHandler(DoubleCheck.lazy(this.eventBusProvider));
    }
}
