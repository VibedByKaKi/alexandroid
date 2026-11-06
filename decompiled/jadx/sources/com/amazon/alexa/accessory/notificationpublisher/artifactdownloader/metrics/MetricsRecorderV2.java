package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MetricsRecorderV2 {
    private static final String MOBILYTICS_IDENTIFIER = "42534835-54fc-4240-8452-ba6c44493b3b";
    private static final String TAG = "MetricsRecorderV2";
    private static MetricsRecorderV2 recorder;
    private LazyComponent<Mobilytics> lazyMobilytics = ComponentRegistry.getInstance().getLazy(Mobilytics.class);

    private MetricsRecorderV2() {
    }

    public static MetricsRecorderV2 getInstance() {
        if (recorder == null) {
            synchronized (MetricsRecorderV2.class) {
                try {
                    if (recorder == null) {
                        Log.d(TAG, "getInstance - Creating new instance");
                        recorder = new MetricsRecorderV2();
                    }
                } finally {
                }
            }
        }
        return recorder;
    }

    @VisibleForTesting
    public static void resetInstance() {
        recorder = new MetricsRecorderV2();
    }

    public void recordCounter(String str, String str2, String str3, double d) {
        Preconditions.checkNotNull(str, "eventName is null.");
        Preconditions.checkNotNull(str2, "componentName is null.");
        Preconditions.checkNotNull(str2, "value is null.");
        Mobilytics mobilytics = this.lazyMobilytics.get();
        MobilyticsMetricsCounter createCounter = mobilytics.createCounter(str, str2, str3, "42534835-54fc-4240-8452-ba6c44493b3b");
        createCounter.incrementCounterByValue((long) d);
        mobilytics.recordCounter(createCounter);
        Log.i(TAG, String.format("Recorded accessory metric counter: %s, value: %f, subComponent: %s", str, Double.valueOf(d), str3));
    }

    public void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        this.lazyMobilytics.get().recordTimer(mobilyticsMetricsTimer);
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        return this.lazyMobilytics.get().createTimer(str, MetricConstants.COMPONENT_NAME, "default", "42534835-54fc-4240-8452-ba6c44493b3b");
    }

    public void recordCounter(String str, String str2) {
        recordCounter(str, MetricConstants.COMPONENT_NAME, str2, 1.0d);
    }

    public void recordCounter(String str) {
        recordCounter(str, MetricConstants.COMPONENT_NAME, "default", 1.0d);
    }

    public void recordCounter(String str, double d) {
        recordCounter(str, MetricConstants.COMPONENT_NAME, "default", d);
    }
}
