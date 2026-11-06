package com.amazon.alexa.presence.service;

import android.content.Context;
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
public final class BleConnIdentityComponent_Factory implements Factory<BleConnIdentityComponent> {
    private final Provider<Context> applicationContextProvider;

    public BleConnIdentityComponent_Factory(Provider<Context> provider) {
        this.applicationContextProvider = provider;
    }

    public static BleConnIdentityComponent_Factory create(Provider<Context> provider) {
        return new BleConnIdentityComponent_Factory(provider);
    }

    public static BleConnIdentityComponent newInstance(Context context) {
        return new BleConnIdentityComponent(context);
    }

    @Override // javax.inject.Provider
    public BleConnIdentityComponent get() {
        return newInstance(this.applicationContextProvider.get());
    }
}
