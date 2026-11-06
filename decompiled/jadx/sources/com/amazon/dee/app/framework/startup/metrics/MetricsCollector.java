package com.amazon.dee.app.framework.startup.metrics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class MetricsCollector {
    private List<DeferredCounterMetric> metricList = new ArrayList();
    private List<Future<? extends DeferredCounterMetric>> futureList = new ArrayList();

    @Inject
    public MetricsCollector() {
    }

    public synchronized void clear() {
        this.metricList.clear();
        this.futureList.clear();
    }

    public synchronized List<DeferredCounterMetric> getMetricList() {
        return this.metricList;
    }

    public synchronized List<Future<? extends DeferredCounterMetric>> getPendingMetrics() {
        return this.futureList;
    }

    public synchronized void logCounterMetric(String str, String str2) {
        this.metricList.add(new DeferredCounterMetric(str, str2));
    }

    public synchronized void logPendingTimerMetric(Future<? extends DeferredCounterMetric> future) {
        this.futureList.add(future);
    }

    public synchronized void logTimerMetric(String str, String str2, long j, long j2) {
        this.metricList.add(new DeferredTimerMetric(str, str2, j, j2));
    }
}
