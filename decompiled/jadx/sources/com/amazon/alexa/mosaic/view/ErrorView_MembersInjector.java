package com.amazon.alexa.mosaic.view;

import com.amazon.alexa.biloba.metrics.BilobaMetricsService;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class ErrorView_MembersInjector implements MembersInjector<ErrorView> {
    private final Provider<BilobaMetricsService> bilobaMetricsServiceProvider;

    public ErrorView_MembersInjector(Provider<BilobaMetricsService> provider) {
        this.bilobaMetricsServiceProvider = provider;
    }

    public static MembersInjector<ErrorView> create(Provider<BilobaMetricsService> provider) {
        return new ErrorView_MembersInjector(provider);
    }

    public static void injectBilobaMetricsService(ErrorView errorView, Lazy<BilobaMetricsService> lazy) {
        errorView.bilobaMetricsService = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ErrorView errorView) {
        injectBilobaMetricsService(errorView, DoubleCheck.lazy(this.bilobaMetricsServiceProvider));
    }
}
