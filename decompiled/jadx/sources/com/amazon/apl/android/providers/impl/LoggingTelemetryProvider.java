package com.amazon.apl.android.providers.impl;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.amazon.apl.android.utils.MetricInfo;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LoggingTelemetryProvider implements ITelemetryProvider {
    private static final String COUNT_LOG = " - success:";
    private static final String FAIL_LOG = "  fail:";
    private static final String MS_LOG = "ms";
    private static final String TAG = "TelemetryReport";
    private static final String TIMER_AVG_LOG = "  average:";
    private static final String TIMER_TOTAL_LOG = "  total:";
    private final List<Metric> mMetrics = Collections.synchronizedList(new ArrayList());
    private final List<String> mIds = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Metric {
        public String metricName;
        public long seedTime = 0;
        public long startTime = 0;
        public long totalTime = 0;
        public double success = 0.0d;
        public int fail = 0;

        public Metric() {
        }
    }

    private String idOf(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m$1(str, ".", str2);
    }

    @SuppressLint({"DefaultLocale"})
    private void logAndResetMetrics() {
        int i = 0;
        while (true) {
            int size = this.mMetrics.size();
            List<Metric> list = this.mMetrics;
            if (i >= size) {
                list.clear();
                this.mIds.clear();
                return;
            }
            StringBuilder sb = new StringBuilder();
            Metric metric = list.get(i);
            sb.append(metric.metricName);
            sb.append(COUNT_LOG);
            sb.append(metric.success);
            sb.append(FAIL_LOG);
            sb.append(metric.fail);
            if (metric.totalTime > 0) {
                if (metric.success > 0.0d) {
                    ArcMode$$ExternalSyntheticOutline0.m(metric.totalTime / 1000000, TIMER_TOTAL_LOG, "ms  average:", sb);
                    sb.append(Math.round(r4 / ((float) r11)) / 1000000);
                    sb.append(MS_LOG);
                    metric.totalTime = 0L;
                }
            }
            metric.success = 0.0d;
            metric.fail = 0;
            Log.i(TAG, sb.toString());
            i++;
        }
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized int createMetricId(String str, String str2, ITelemetryProvider.Type type) {
        int metricId;
        metricId = getMetricId(str, str2);
        if (metricId == -1) {
            Metric metric = new Metric();
            metric.metricName = idOf(str, str2);
            int size = this.mMetrics.size();
            this.mMetrics.add(metric);
            this.mIds.add(size, metric.metricName);
            metricId = size;
        }
        return metricId;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void fail(int i) {
        Metric metric = this.mMetrics.get(i);
        int i2 = metric.fail + 1;
        metric.fail = i2;
        metric.startTime = 0L;
        Log.i(TAG, String.format("Incrementing counter: %s by 1 -%s%d", metric.metricName, FAIL_LOG, Integer.valueOf(i2)));
    }

    public Metric getMetric(int i) {
        return this.mMetrics.get(i);
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized int getMetricId(String str, String str2) {
        return this.mIds.indexOf(idOf(str, str2));
    }

    public synchronized List<MetricInfo> getPerformanceMetrics() {
        List<MetricInfo> synchronizedList;
        MetricInfo metricInfo;
        try {
            synchronizedList = Collections.synchronizedList(new ArrayList());
            for (Metric metric : this.mMetrics) {
                if (metric.totalTime <= 0 || metric.success <= 0.0d) {
                    double d = metric.success;
                    metricInfo = d > 0.0d ? new MetricInfo(metric.metricName, d) : new MetricInfo(metric.metricName, metric.fail);
                } else {
                    metricInfo = new MetricInfo(metric.metricName, r3 / 1000000);
                }
                synchronizedList.add(metricInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return synchronizedList;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void incrementCount(int i, int i2) {
        Metric metric = this.mMetrics.get(i);
        metric.success += i2;
        Log.i(TAG, String.format("Incrementing counter: %s by %d%s%f", metric.metricName, Integer.valueOf(i2), COUNT_LOG, Double.valueOf(metric.success)));
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        logAndResetMetrics();
    }

    @VisibleForTesting
    public long realtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void reportTimer(int i, TimeUnit timeUnit, long j) {
        Metric metric = this.mMetrics.get(i);
        long nanos = timeUnit.toNanos(j);
        metric.totalTime = nanos;
        Log.i(TAG, String.format("Recording timer: %s -%s%d%s", metric.metricName, TIMER_TOTAL_LOG, Long.valueOf(nanos / 1000000), MS_LOG));
        metric.success += 1.0d;
        metric.seedTime = 0L;
        metric.startTime = 0L;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void startTimer(int i, TimeUnit timeUnit, long j) {
        Metric metric = this.mMetrics.get(i);
        if (metric.startTime == 0) {
            metric.startTime = realtimeNanos();
            metric.seedTime = timeUnit.toNanos(j);
        }
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void stopTimer(int i, TimeUnit timeUnit, long j) {
        Metric metric = this.mMetrics.get(i);
        if (metric.startTime != 0) {
            long nanos = (timeUnit.toNanos(j) - (metric.startTime - metric.seedTime)) + metric.totalTime;
            metric.totalTime = nanos;
            metric.success += 1.0d;
            Log.i(TAG, String.format("Stopping timer: %s -%s%d%s", metric.metricName, TIMER_TOTAL_LOG, Long.valueOf(nanos / 1000000), MS_LOG));
            metric.seedTime = 0L;
            metric.startTime = 0L;
        }
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void startTimer(int i) {
        startTimer(i, TimeUnit.NANOSECONDS, 0L);
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void incrementCount(int i) {
        incrementCount(i, 1);
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void incrementCount(int i, double d) {
        Metric metric = this.mMetrics.get(i);
        metric.success += d;
        Log.i(TAG, String.format("Incrementing counter: %s by %f%s%f", metric.metricName, Double.valueOf(d), COUNT_LOG, Double.valueOf(metric.success)));
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public synchronized void stopTimer(int i) {
        stopTimer(i, TimeUnit.NANOSECONDS, realtimeNanos());
    }
}
