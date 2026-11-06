package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class HandsFreeStateProvider_Factory implements Factory<HandsFreeStateProvider> {
    private final Provider<Context> contextProvider;

    public HandsFreeStateProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static HandsFreeStateProvider_Factory create(Provider<Context> provider) {
        return new HandsFreeStateProvider_Factory(provider);
    }

    public static HandsFreeStateProvider newInstance(Context context) {
        return new HandsFreeStateProvider(context);
    }

    @Override // javax.inject.Provider
    public HandsFreeStateProvider get() {
        return new HandsFreeStateProvider(this.contextProvider.get());
    }
}
