package com.amazon.alexa.voice.handsfree.features;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class IdentityServiceProvider_Factory implements Factory<IdentityServiceProvider> {
    private static final IdentityServiceProvider_Factory INSTANCE = new IdentityServiceProvider_Factory();

    public static IdentityServiceProvider_Factory create() {
        return INSTANCE;
    }

    public static IdentityServiceProvider newInstance() {
        return new IdentityServiceProvider();
    }

    @Override // javax.inject.Provider
    public IdentityServiceProvider get() {
        return new IdentityServiceProvider();
    }
}
