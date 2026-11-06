package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.metrics.service.MetricsTimer;
import com.amazon.alexa.voice.metrics.service.VoxDefaultMetricsService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class MetricsModule {
    private MetricsModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MetricsTimer lambda$provideMetricsTimerFactory$0(String str, String str2) {
        return new VoiceMetricsTimer(str, str2, null);
    }

    @Provides
    @Singleton
    public static MetricsService provideMetricsService(Mobilytics mobilytics) {
        return new VoxDefaultMetricsService(mobilytics);
    }

    @Provides
    @Singleton
    public static MetricsTimerFactory provideMetricsTimerFactory() {
        return new MetricsModule$$ExternalSyntheticLambda0();
    }

    @Provides
    @Singleton
    public static VoxMetricEventProcessingService provideVoxMetricEventProcessingService(MetricsService metricsService) {
        return new VoxMetricEventProcessingService(metricsService);
    }
}
