package com.amazon.alexa.benefits.storage;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BenefitsSubscriptionStore_Factory implements Factory<BenefitsSubscriptionStore> {
    private final Provider<EventBus> eventBusProvider;

    public BenefitsSubscriptionStore_Factory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static BenefitsSubscriptionStore_Factory create(Provider<EventBus> provider) {
        return new BenefitsSubscriptionStore_Factory(provider);
    }

    public static BenefitsSubscriptionStore newInstance(Lazy<EventBus> lazy) {
        return new BenefitsSubscriptionStore(lazy);
    }

    @Override // javax.inject.Provider
    public BenefitsSubscriptionStore get() {
        return newInstance(DoubleCheck.lazy(this.eventBusProvider));
    }
}
