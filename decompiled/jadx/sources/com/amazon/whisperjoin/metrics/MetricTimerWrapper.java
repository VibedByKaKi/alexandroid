package com.amazon.whisperjoin.metrics;

import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricTimerWrapper {
    private final HashMap<String, MetricTimer> mProfilerMap = new HashMap<>();

    public MetricTimer getMetricTimer() {
        return new MetricTimer();
    }

    public MetricTimer getMetricTimerFromProfilerMap(String str) {
        return this.mProfilerMap.get(str);
    }

    public void storeMetricTimerInProfilerMap(String str, MetricTimer metricTimer) {
        this.mProfilerMap.put(str, metricTimer);
    }
}
