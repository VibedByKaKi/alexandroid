package com.amazon.alexa.presence.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class BleConnServiceComponent_Factory implements Factory<BleConnServiceComponent> {
    private final Provider<BleConnIdentityComponent> identityComponentProvider;

    public BleConnServiceComponent_Factory(Provider<BleConnIdentityComponent> provider) {
        this.identityComponentProvider = provider;
    }

    public static BleConnServiceComponent_Factory create(Provider<BleConnIdentityComponent> provider) {
        return new BleConnServiceComponent_Factory(provider);
    }

    public static BleConnServiceComponent newInstance(BleConnIdentityComponent bleConnIdentityComponent) {
        return new BleConnServiceComponent(bleConnIdentityComponent);
    }

    @Override // javax.inject.Provider
    public BleConnServiceComponent get() {
        return newInstance(this.identityComponentProvider.get());
    }
}
