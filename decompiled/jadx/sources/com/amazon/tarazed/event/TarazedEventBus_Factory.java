package com.amazon.tarazed.event;

import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class TarazedEventBus_Factory implements Factory<TarazedEventBus> {
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<CoroutineScope> tarazedScopeProvider;

    public TarazedEventBus_Factory(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2) {
        this.tarazedScopeProvider = provider;
        this.dispatchersProvider = provider2;
    }

    public static Factory<TarazedEventBus> create(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2) {
        return new TarazedEventBus_Factory(provider, provider2);
    }

    @Override // javax.inject.Provider
    public TarazedEventBus get() {
        return new TarazedEventBus(this.tarazedScopeProvider.get(), this.dispatchersProvider.get());
    }
}
