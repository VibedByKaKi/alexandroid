package com.amazon.matter.app;

import com.amazon.matter.commission.SystemCommissioningClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ActivityLifecycleObserver_Factory implements Factory<ActivityLifecycleObserver> {
    private final Provider<SystemCommissioningClient> systemCommissioningClientProvider;

    public ActivityLifecycleObserver_Factory(Provider<SystemCommissioningClient> provider) {
        this.systemCommissioningClientProvider = provider;
    }

    public static ActivityLifecycleObserver_Factory create(Provider<SystemCommissioningClient> provider) {
        return new ActivityLifecycleObserver_Factory(provider);
    }

    public static ActivityLifecycleObserver newInstance(SystemCommissioningClient systemCommissioningClient) {
        return new ActivityLifecycleObserver(systemCommissioningClient);
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleObserver get() {
        return newInstance(this.systemCommissioningClientProvider.get());
    }
}
