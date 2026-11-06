package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;
import com.google.common.base.Preconditions;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class CameraMetricsModule {
    @Provides
    public static Mobilytics provideMobilytics() {
        return (Mobilytics) Automotive$$ExternalSyntheticOutline0.m(Mobilytics.class);
    }

    @Provides
    @Singleton
    public static CamerasMobilyticsService provideMobilyticsService(Mobilytics mobilytics) {
        Preconditions.checkNotNull(mobilytics, "Mobilytics cannot be null");
        return new CamerasMobilyticsService(mobilytics);
    }
}
