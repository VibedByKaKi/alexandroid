package com.amazon.matter.metrics;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.matter.data.MatterErrorType;
import com.amazon.matter.eventbus.MatterEventType;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class MatterMetricsService {
    private static final String COMPONENT_NAME = "Matter";
    private static final String ERROR = "Error";
    private static final String SUB_COMPONENT_NAME = "AlexaMobileMatter";
    private static final String TIME = "Time";
    private final Mobilytics mobilytics;

    @Inject
    public MatterMetricsService(Mobilytics mobilytics) {
        this.mobilytics = mobilytics;
    }

    private String getErrorMetricName(MatterEventType matterEventType, String str) {
        return a$$ExternalSyntheticOutline0.m$1(matterEventType.toString().replace("Matter:", "").replace(":request", ""), ".Error.", str);
    }

    private String getMetricNameFromEvent(MatterEventType matterEventType) {
        return matterEventType.toString().replace("Matter:", "").replace("response:", "").replace(AbstractJsonLexerKt.COLON, '.');
    }

    private String getTimeMetricName(MatterEventType matterEventType) {
        return BitVector$$ExternalSyntheticOutline0.m(matterEventType.toString().replace("Matter:", "").replace(":request", ""), ".Time");
    }

    public MobilyticsMetricsTimer createAndStartTimer(String str) {
        return this.mobilytics.createTimer(str, COMPONENT_NAME, SUB_COMPONENT_NAME, OwnerIdentifier.SMART_HOME_MATTER);
    }

    public void recordCountMetric(MatterEventType matterEventType, long j) {
        recordMetricCount(getMetricNameFromEvent(matterEventType), j);
    }

    public void recordErrorMetric(MatterEventType matterEventType, MatterErrorType matterErrorType) {
        recordMetric(getErrorMetricName(matterEventType, matterErrorType.name()));
    }

    public void recordEventTime(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        this.mobilytics.recordTimer(mobilyticsMetricsTimer);
    }

    public void recordMetric(String str) {
        recordMetricCount(str, 1L);
    }

    public void recordMetricCount(String str, long j) {
        MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter(str, COMPONENT_NAME, SUB_COMPONENT_NAME, OwnerIdentifier.SMART_HOME_MATTER);
        createCounter.incrementCounterByValue(j);
        this.mobilytics.recordCounter(createCounter);
    }

    public void recordRequestMetric(MatterEventType matterEventType) {
        recordMetric(getMetricNameFromEvent(matterEventType));
    }

    public void recordSuccessMetric(MatterEventType matterEventType) {
        recordMetric(getMetricNameFromEvent(matterEventType));
    }

    public MobilyticsMetricsTimer createAndStartTimer(MatterEventType matterEventType) {
        return createAndStartTimer(getTimeMetricName(matterEventType));
    }
}
