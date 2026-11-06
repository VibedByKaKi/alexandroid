package com.amazon.alexa.featureservice.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.featureservice.constants.FeatureServiceMetrics;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Analytics {
    private static final String TAG = "Analytics";
    private double metricSampleRate;
    private Lazy<Mobilytics> mobilyticsLazy;
    private RandomUtil randomUtil;

    @Inject
    public Analytics(Lazy<Mobilytics> lazy, RandomUtil randomUtil) {
        this.mobilyticsLazy = lazy;
        this.randomUtil = randomUtil;
    }

    public void recordCriticalMetric(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Throwable th) {
        if (this.mobilyticsLazy.get() != null) {
            try {
                this.mobilyticsLazy.get().recordCriticalEvent(FeatureServiceMetrics.METRICS_NAME_PREFIX + str, FeatureServiceMetrics.METRICS_NAME_PREFIX + str, str2, str3, th, "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
            } catch (Exception e) {
                Log.e(TAG, "Failed to log metrics due to exception", e);
            }
        }
    }

    public void recordPostInitTimer(@NonNull String str, long j) {
        recordTimer("core_startup.dependency_post_init", FeatureServiceMetrics.METRICS_NAME_PREFIX, str, j, System.currentTimeMillis());
    }

    public void recordTimer(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, long j2) {
        if (this.mobilyticsLazy.get() != null) {
            try {
                MobilyticsMetricsTimer createTimer = this.mobilyticsLazy.get().createTimer(FeatureServiceMetrics.METRICS_NAME_PREFIX + str, str2, str3, j2 - j, false, "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
                createTimer.setChannelName("coreapp");
                this.mobilyticsLazy.get().recordTimer(createTimer);
            } catch (Exception e) {
                Log.e(TAG, "Failed to log timer metrics due to exception", e);
            }
        }
    }

    public void setMetricSampleRate(double d) {
        this.metricSampleRate = Math.min(0.01d, d);
    }

    public boolean shouldEmitMetric() {
        return this.metricSampleRate != 0.0d && this.randomUtil.nextDouble() <= this.metricSampleRate;
    }

    public void recordTimer(@NonNull String str, @NonNull String str2, @NonNull String str3, long j) {
        recordTimer(str, str2, str3, j, System.currentTimeMillis());
    }
}
