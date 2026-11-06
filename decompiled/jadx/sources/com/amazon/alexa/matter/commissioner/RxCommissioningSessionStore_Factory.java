package com.amazon.alexa.matter.commissioner;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class RxCommissioningSessionStore_Factory implements Factory<RxCommissioningSessionStore> {
    private final Provider<CommissioningSessionStore> commissioningSessionStoreProvider;

    public RxCommissioningSessionStore_Factory(Provider<CommissioningSessionStore> provider) {
        this.commissioningSessionStoreProvider = provider;
    }

    public static RxCommissioningSessionStore_Factory create(Provider<CommissioningSessionStore> provider) {
        return new RxCommissioningSessionStore_Factory(provider);
    }

    public static RxCommissioningSessionStore newInstance(CommissioningSessionStore commissioningSessionStore) {
        return new RxCommissioningSessionStore(commissioningSessionStore);
    }

    @Override // javax.inject.Provider
    public RxCommissioningSessionStore get() {
        return newInstance(this.commissioningSessionStoreProvider.get());
    }
}
