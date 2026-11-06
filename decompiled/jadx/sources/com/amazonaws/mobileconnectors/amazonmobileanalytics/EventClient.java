package com.amazonaws.mobileconnectors.amazonmobileanalytics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface EventClient {
    void addGlobalAttribute(String str, String str2);

    void addGlobalAttribute(String str, String str2, String str3);

    void addGlobalMetric(String str, Double d);

    void addGlobalMetric(String str, String str2, Double d);

    AnalyticsEvent createEvent(String str);

    void recordEvent(AnalyticsEvent analyticsEvent);

    void removeGlobalAttribute(String str);

    void removeGlobalAttribute(String str, String str2);

    void removeGlobalMetric(String str);

    void removeGlobalMetric(String str, String str2);

    void submitEvents();
}
