package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CameraMetricsModule_ProvideMobilyticsServiceFactory implements Factory<CamerasMobilyticsService> {
    private final Provider<Mobilytics> mobilyticsProvider;

    public CameraMetricsModule_ProvideMobilyticsServiceFactory(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public static CameraMetricsModule_ProvideMobilyticsServiceFactory create(Provider<Mobilytics> provider) {
        return new CameraMetricsModule_ProvideMobilyticsServiceFactory(provider);
    }

    public static CamerasMobilyticsService provideMobilyticsService(Mobilytics mobilytics) {
        return (CamerasMobilyticsService) Preconditions.checkNotNull(CameraMetricsModule.provideMobilyticsService(mobilytics), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CamerasMobilyticsService get() {
        return provideMobilyticsService(this.mobilyticsProvider.get());
    }
}
