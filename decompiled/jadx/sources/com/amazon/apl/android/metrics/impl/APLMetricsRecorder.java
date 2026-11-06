package com.amazon.apl.android.metrics.impl;

import com.amazon.apl.android.metrics.IMetricsRecorder;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class APLMetricsRecorder implements IMetricsRecorder {
    public abstract void recordCounter(String str, long j);

    public abstract void recordSegmentEnd(String str, Map<String, String> map, long j);

    public abstract void recordSegmentFailed(String str, Map<String, String> map, long j);

    public abstract long recordSegmentStart(String str, Map<String, String> map);
}
