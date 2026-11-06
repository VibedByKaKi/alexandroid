package com.amazon.apl.android.metrics.impl;

import com.amazon.apl.android.metrics.ICounter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Counter implements ICounter {
    private APLMetricsRecorder mMetricsRecorder;
    private String mName;

    public Counter(String str, APLMetricsRecorder aPLMetricsRecorder) {
        this.mMetricsRecorder = aPLMetricsRecorder;
        this.mName = str;
    }

    @Override // com.amazon.apl.android.metrics.ICounter
    public void increment(long j) {
        this.mMetricsRecorder.recordCounter(this.mName, j);
    }
}
