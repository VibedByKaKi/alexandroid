package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface AnalyticsEvent {
    void addAttribute(String str, String str2);

    void addMetric(String str, Double d);

    Map<String, String> getAllAttributes();

    Map<String, Double> getAllMetrics();

    String getAttribute(String str);

    String getEventType();

    Double getMetric(String str);

    boolean hasAttribute(String str);

    boolean hasMetric(String str);

    AnalyticsEvent withAttribute(String str, String str2);

    AnalyticsEvent withMetric(String str, Double d);
}
