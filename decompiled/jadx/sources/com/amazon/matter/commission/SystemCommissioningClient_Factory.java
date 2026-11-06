package com.amazon.matter.commission;

import android.content.Context;
import com.amazon.matter.metrics.MatterMetricsService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class SystemCommissioningClient_Factory implements Factory<SystemCommissioningClient> {
    private final Provider<Context> contextProvider;
    private final Provider<MatterMetricsService> metricsServiceProvider;

    public SystemCommissioningClient_Factory(Provider<Context> provider, Provider<MatterMetricsService> provider2) {
        this.contextProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static SystemCommissioningClient_Factory create(Provider<Context> provider, Provider<MatterMetricsService> provider2) {
        return new SystemCommissioningClient_Factory(provider, provider2);
    }

    public static SystemCommissioningClient newInstance(Context context, MatterMetricsService matterMetricsService) {
        return new SystemCommissioningClient(context, matterMetricsService);
    }

    @Override // javax.inject.Provider
    public SystemCommissioningClient get() {
        return newInstance(this.contextProvider.get(), this.metricsServiceProvider.get());
    }
}
