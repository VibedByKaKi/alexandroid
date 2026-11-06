package com.amazon.dee.app.kids;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class KidsInitializer_Factory implements Factory<KidsInitializer> {
    private static final KidsInitializer_Factory INSTANCE = new KidsInitializer_Factory();

    public static KidsInitializer_Factory create() {
        return INSTANCE;
    }

    public static KidsInitializer newInstance() {
        return new KidsInitializer();
    }

    @Override // javax.inject.Provider
    public KidsInitializer get() {
        return new KidsInitializer();
    }
}
