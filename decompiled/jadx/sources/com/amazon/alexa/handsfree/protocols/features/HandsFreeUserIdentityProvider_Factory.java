package com.amazon.alexa.handsfree.protocols.features;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class HandsFreeUserIdentityProvider_Factory implements Factory<HandsFreeUserIdentityProvider> {
    private static final HandsFreeUserIdentityProvider_Factory INSTANCE = new HandsFreeUserIdentityProvider_Factory();

    public static HandsFreeUserIdentityProvider_Factory create() {
        return INSTANCE;
    }

    public static HandsFreeUserIdentityProvider newHandsFreeUserIdentityProvider() {
        return new HandsFreeUserIdentityProvider();
    }

    public static HandsFreeUserIdentityProvider provideInstance() {
        return new HandsFreeUserIdentityProvider();
    }

    @Override // javax.inject.Provider
    public HandsFreeUserIdentityProvider get() {
        return provideInstance();
    }
}
