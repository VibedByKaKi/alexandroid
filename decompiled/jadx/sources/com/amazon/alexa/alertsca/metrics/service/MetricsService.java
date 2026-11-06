package com.amazon.alexa.alertsca.metrics.service;

import com.amazon.alexa.alertsca.metrics.MetricsElement;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface MetricsService {
    MobilyticsMetricsTimer createTimer(String str, boolean z, long j);

    void recordError(String str);

    void recordErrorWithException(String str, Throwable th);

    void recordEvent(MetricsElement metricsElement);

    void recordEvent(String str);

    void recordOccurrence(String str, boolean z);

    void recordOccurrenceWithContentId(String str, boolean z, String str2);

    void recordPercentOccurrence(String str, boolean z);

    void recordSimpleTimerDuration(String str, long j);

    void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer);
}
