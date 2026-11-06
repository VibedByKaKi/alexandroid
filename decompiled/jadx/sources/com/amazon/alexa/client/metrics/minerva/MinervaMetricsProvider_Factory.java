package com.amazon.alexa.client.metrics.minerva;

import android.content.Context;
import com.amazon.alexa.auth.TokenProvider;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MinervaMetricsProvider_Factory implements Factory<MinervaMetricsProvider> {
    private final Provider<MetricsClientConfiguration> clientConfigurationProvider;
    private final Provider<Context> contextProvider;
    private final Provider<TokenProvider> tokenProvider;

    public MinervaMetricsProvider_Factory(Provider<Context> provider, Provider<TokenProvider> provider2, Provider<MetricsClientConfiguration> provider3) {
        this.contextProvider = provider;
        this.tokenProvider = provider2;
        this.clientConfigurationProvider = provider3;
    }

    public static MinervaMetricsProvider_Factory create(Provider<Context> provider, Provider<TokenProvider> provider2, Provider<MetricsClientConfiguration> provider3) {
        return new MinervaMetricsProvider_Factory(provider, provider2, provider3);
    }

    public static MinervaMetricsProvider newInstance(Context context, TokenProvider tokenProvider, Lazy<MetricsClientConfiguration> lazy) {
        return new MinervaMetricsProvider(context, tokenProvider, lazy);
    }

    @Override // javax.inject.Provider
    public MinervaMetricsProvider get() {
        return newInstance(this.contextProvider.get(), this.tokenProvider.get(), DoubleCheck.lazy(this.clientConfigurationProvider));
    }
}
