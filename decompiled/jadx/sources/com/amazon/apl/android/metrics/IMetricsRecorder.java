package com.amazon.apl.android.metrics;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IMetricsRecorder {
    public static final String APL_DOMAIN = "APL-Android";

    void addSink(IMetricsSink iMetricsSink);

    ICounter createCounter(String str);

    void mergeMetadata(String str, String str2);

    void mergeMetadata(Map<String, String> map);

    void recordMilestone(String str);

    ITimer startTimer(String str, Map<String, String> map);
}
