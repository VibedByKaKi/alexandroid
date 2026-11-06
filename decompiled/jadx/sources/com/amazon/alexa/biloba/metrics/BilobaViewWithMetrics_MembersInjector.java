package com.amazon.alexa.biloba.metrics;

import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BilobaViewWithMetrics_MembersInjector implements MembersInjector<BilobaViewWithMetrics> {
    private final Provider<BilobaMetricsService> bilobaMetricsServiceProvider;

    public BilobaViewWithMetrics_MembersInjector(Provider<BilobaMetricsService> provider) {
        this.bilobaMetricsServiceProvider = provider;
    }

    public static MembersInjector<BilobaViewWithMetrics> create(Provider<BilobaMetricsService> provider) {
        return new BilobaViewWithMetrics_MembersInjector(provider);
    }

    public static void injectBilobaMetricsService(BilobaViewWithMetrics bilobaViewWithMetrics, BilobaMetricsService bilobaMetricsService) {
        bilobaViewWithMetrics.bilobaMetricsService = bilobaMetricsService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BilobaViewWithMetrics bilobaViewWithMetrics) {
        injectBilobaMetricsService(bilobaViewWithMetrics, this.bilobaMetricsServiceProvider.get());
    }
}
