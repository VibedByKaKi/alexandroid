package com.amazon.alexa.seamlessswitching.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.seamlessswitching.utils.LoggingUtils;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MetricsRecorder {
    private static final String COMPONENT_NAME = "SeamlessSwitchingAndroid";
    private static final String OWNER_IDENTIFIER = "42534835-54fc-4240-8452-ba6c44493b3b";
    private static final String SUB_COMPONENT_NAME = "default";
    private static final String TAG = LoggingUtils.getTag(MetricsRecorder.class);
    private final LazyComponent<Mobilytics> mobilytics;

    public MetricsRecorder(LazyComponent<Mobilytics> lazyComponent) {
        this.mobilytics = lazyComponent;
    }

    public void recordCounter(String str, double d) {
        Preconditions.checkNotNull(str, "eventName is null");
        MobilyticsMetricsCounter createCounter = this.mobilytics.get().createCounter(str, COMPONENT_NAME, "default", "42534835-54fc-4240-8452-ba6c44493b3b");
        createCounter.incrementCounterByValue((long) d);
        this.mobilytics.get().recordCounter(createCounter);
        String.format("Recorded accessory metric counter: %s, value: %f", str, Double.valueOf(d));
    }

    public void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        this.mobilytics.get().recordTimer(mobilyticsMetricsTimer);
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        Preconditions.checkNotNull(str, "timerName is null");
        return this.mobilytics.get().createTimer(str, COMPONENT_NAME, "default", "42534835-54fc-4240-8452-ba6c44493b3b");
    }

    public void recordCounter(String str) {
        recordCounter(str, 1.0d);
    }
}
