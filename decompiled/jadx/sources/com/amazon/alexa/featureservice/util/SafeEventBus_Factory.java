package com.amazon.alexa.featureservice.util;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SafeEventBus_Factory implements Factory<SafeEventBus> {
    private final Provider<EventBus> eventBusLazyProvider;

    public SafeEventBus_Factory(Provider<EventBus> provider) {
        this.eventBusLazyProvider = provider;
    }

    public static SafeEventBus_Factory create(Provider<EventBus> provider) {
        return new SafeEventBus_Factory(provider);
    }

    public static SafeEventBus newInstance(Lazy<EventBus> lazy) {
        return new SafeEventBus(lazy);
    }

    @Override // javax.inject.Provider
    public SafeEventBus get() {
        return newInstance(DoubleCheck.lazy(this.eventBusLazyProvider));
    }
}
