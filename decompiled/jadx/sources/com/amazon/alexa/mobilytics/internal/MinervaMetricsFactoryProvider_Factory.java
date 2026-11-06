package com.amazon.alexa.mobilytics.internal;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MinervaMetricsFactoryProvider_Factory implements Factory<MinervaMetricsFactoryProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<Integer> domainProvider;

    public MinervaMetricsFactoryProvider_Factory(Provider<Context> provider, Provider<Integer> provider2) {
        this.contextProvider = provider;
        this.domainProvider = provider2;
    }

    public static MinervaMetricsFactoryProvider_Factory create(Provider<Context> provider, Provider<Integer> provider2) {
        return new MinervaMetricsFactoryProvider_Factory(provider, provider2);
    }

    public static MinervaMetricsFactoryProvider newInstance(Context context, int i) {
        return new MinervaMetricsFactoryProvider(context, i);
    }

    @Override // javax.inject.Provider
    public MinervaMetricsFactoryProvider get() {
        return newInstance(this.contextProvider.get(), this.domainProvider.get().intValue());
    }
}
