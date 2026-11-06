package com.amazon.apl.android.metrics.impl;

import com.amazon.apl.android.metrics.ITimer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Timer implements ITimer {
    private static final String SUCCESS_KEY = "Succeeded";
    private Map<String, String> mMetadata;
    private APLMetricsRecorder mMetricsRecorder;
    private String mName;
    private long mSegmentStartId;

    public Timer(String str, Map<String, String> map, APLMetricsRecorder aPLMetricsRecorder) {
        this.mName = str;
        this.mMetadata = map == null ? new HashMap<>() : map;
        this.mMetricsRecorder = aPLMetricsRecorder;
        this.mSegmentStartId = aPLMetricsRecorder.recordSegmentStart(str, cloneMetaData());
    }

    private HashMap<String, String> cloneMetaData() {
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.mMetadata.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    @Override // com.amazon.apl.android.metrics.ITimer
    public void fail() {
        this.mMetricsRecorder.recordSegmentFailed(this.mName, this.mMetadata, this.mSegmentStartId);
    }

    @Override // com.amazon.apl.android.metrics.ITimer
    public void stop() {
        this.mMetricsRecorder.recordSegmentEnd(this.mName, this.mMetadata, this.mSegmentStartId);
    }
}
