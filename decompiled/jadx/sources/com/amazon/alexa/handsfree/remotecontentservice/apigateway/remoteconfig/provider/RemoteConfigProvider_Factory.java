package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class RemoteConfigProvider_Factory implements Factory<RemoteConfigProvider> {
    private final Provider<Context> contextProvider;

    public RemoteConfigProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RemoteConfigProvider_Factory create(Provider<Context> provider) {
        return new RemoteConfigProvider_Factory(provider);
    }

    public static RemoteConfigProvider newInstance(Context context) {
        return new RemoteConfigProvider(context);
    }

    @Override // javax.inject.Provider
    public RemoteConfigProvider get() {
        return new RemoteConfigProvider(this.contextProvider.get());
    }
}
