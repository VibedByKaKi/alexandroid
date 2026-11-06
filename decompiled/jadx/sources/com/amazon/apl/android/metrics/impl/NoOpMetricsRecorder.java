package com.amazon.apl.android.metrics.impl;

import com.amazon.apl.android.metrics.ICounter;
import com.amazon.apl.android.metrics.IMetricsSink;
import com.amazon.apl.android.metrics.ITimer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpMetricsRecorder extends APLMetricsRecorder {
    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public ICounter createCounter(String str) {
        return new Counter(str, this);
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public long recordSegmentStart(String str, Map<String, String> map) {
        return 0L;
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public ITimer startTimer(String str, Map<String, String> map) {
        return new Timer(str, new HashMap(), this);
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void mergeMetadata(Map<String, String> map) {
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void addSink(IMetricsSink iMetricsSink) {
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void recordMilestone(String str) {
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void mergeMetadata(String str, String str2) {
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordCounter(String str, long j) {
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordSegmentEnd(String str, Map<String, String> map, long j) {
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordSegmentFailed(String str, Map<String, String> map, long j) {
    }
}
