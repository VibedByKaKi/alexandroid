package com.amazon.alexa.matter.commissioner;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class InMemoryCommissioningSessionStore_Factory implements Factory<InMemoryCommissioningSessionStore> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final InMemoryCommissioningSessionStore_Factory INSTANCE = new InMemoryCommissioningSessionStore_Factory();

        private InstanceHolder() {
        }
    }

    public static InMemoryCommissioningSessionStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InMemoryCommissioningSessionStore newInstance() {
        return new InMemoryCommissioningSessionStore();
    }

    @Override // javax.inject.Provider
    public InMemoryCommissioningSessionStore get() {
        return newInstance();
    }
}
