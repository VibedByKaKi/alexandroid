package com.amazon.alexa.voice.metrics.service;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface MetricsService {
    void cancelTimer(String str);

    void recordError(String str, String str2, String str3, Map<String, Object> map);

    void recordEvent(String str, String str2, Map<String, Object> map);

    void recordEventMetricWithClickInteraction(String str, String str2, String str3, String str4);

    void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map);

    void recordPercentOccurrence(String str, String str2, boolean z, Map<String, Object> map);

    void recordTimer(MetricsTimer metricsTimer);

    void recordTimer(String str);

    MetricsTimer startTimer(String str, String str2, Map<String, Object> map);
}
