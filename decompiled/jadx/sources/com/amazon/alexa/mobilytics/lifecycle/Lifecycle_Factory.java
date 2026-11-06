package com.amazon.alexa.mobilytics.lifecycle;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Lifecycle_Factory implements Factory<Lifecycle> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final Lifecycle_Factory INSTANCE = new Lifecycle_Factory();

        private InstanceHolder() {
        }
    }

    public static Lifecycle_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Lifecycle newInstance() {
        return new Lifecycle();
    }

    @Override // javax.inject.Provider
    public Lifecycle get() {
        return newInstance();
    }
}
