package com.amazon.apl.android.metrics.impl;

import com.amazon.apl.android.metrics.ICounter;
import com.amazon.apl.android.metrics.IMetricsSink;
import com.amazon.apl.android.metrics.ITimer;
import com.amazon.apl.android.metrics.ITimestampGenerator;
import com.amazon.apl.android.metrics.MetricEventType;
import com.amazon.apl.android.metrics.MetricsEvent;
import com.amazon.apl.android.thread.IHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricsRecorder extends APLMetricsRecorder {
    private static final String TAG = "MetricsRecorder";
    private static AtomicLong mMetricId = new AtomicLong(1);
    private IHandler mHandler;
    private Map<String, String> mMetadata;
    private List<IMetricsSink> mSinkList;
    private ITimestampGenerator mTimestampGenerator;

    public MetricsRecorder() {
        this.mSinkList = new ArrayList();
        this.mMetadata = new HashMap();
        this.mTimestampGenerator = new TimestampGenerator();
        this.mHandler = MetricsHandler.getInstance();
    }

    private HashMap<String, String> cloneMetaData() {
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.mMetadata.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordCounter$4(String str, long j) {
        recordMetric(MetricsEvent.builder().metricId(mMetricId.getAndIncrement()).metricName(str).eventType(MetricEventType.COUNTER).metaData(cloneMetaData()).relateId(0L).value(j).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordMilestone$0(String str, long j) {
        recordMetric(MetricsEvent.builder().metricId(mMetricId.getAndIncrement()).metricName(str).eventType(MetricEventType.MILESTONE).relateId(0L).value(j).metaData(cloneMetaData()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordSegmentEnd$2(String str, Map map, long j, long j2) {
        recordMetric(MetricsEvent.builder().metricId(mMetricId.getAndIncrement()).metricName(str).eventType(MetricEventType.SEGMENT_END).metaData(map).relateId(j).value(j2).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordSegmentFailed$3(String str, Map map, long j, long j2) {
        recordMetric(MetricsEvent.builder().metricId(mMetricId.getAndIncrement()).metricName(str).eventType(MetricEventType.SEGMENT_FAILED).metaData(map).relateId(j).value(j2).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordSegmentStart$1(long j, String str, Map map, long j2) {
        recordMetric(MetricsEvent.builder().metricId(j).metricName(str).eventType(MetricEventType.SEGMENT_START).metaData(map).relateId(0L).value(j2).build());
    }

    private void post(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    private void recordMetric(MetricsEvent metricsEvent) {
        Iterator<IMetricsSink> it2 = this.mSinkList.iterator();
        while (it2.hasNext()) {
            it2.next().metricPublished(metricsEvent);
        }
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void addSink(IMetricsSink iMetricsSink) {
        this.mSinkList.add(iMetricsSink);
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public ICounter createCounter(String str) {
        return new Counter(str, this);
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void mergeMetadata(Map<String, String> map) {
        if (map == null) {
            return;
        }
        this.mMetadata.putAll(map);
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordCounter(String str, long j) {
        post(new MetricsRecorder$$ExternalSyntheticLambda1(this, str, j, 0));
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void recordMilestone(String str) {
        post(new MetricsRecorder$$ExternalSyntheticLambda1(this, str, this.mTimestampGenerator.generateTimeStamp(), 1));
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordSegmentEnd(String str, Map<String, String> map, long j) {
        post(new MetricsRecorder$$ExternalSyntheticLambda0(this, str, map, j, this.mTimestampGenerator.generateTimeStamp(), 0));
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public void recordSegmentFailed(String str, Map<String, String> map, long j) {
        post(new MetricsRecorder$$ExternalSyntheticLambda0(this, str, map, j, this.mTimestampGenerator.generateTimeStamp(), 1));
    }

    @Override // com.amazon.apl.android.metrics.impl.APLMetricsRecorder
    public long recordSegmentStart(String str, Map<String, String> map) {
        long generateTimeStamp = this.mTimestampGenerator.generateTimeStamp();
        long andIncrement = mMetricId.getAndIncrement();
        post(new MetricsRecorder$$ExternalSyntheticLambda0(andIncrement, generateTimeStamp, this, str, map));
        return andIncrement;
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public ITimer startTimer(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.mMetadata);
        if (map == null) {
            map = new HashMap<>();
        }
        hashMap.putAll(map);
        return new Timer(str, hashMap, this);
    }

    @Override // com.amazon.apl.android.metrics.IMetricsRecorder
    public void mergeMetadata(String str, String str2) {
        this.mMetadata.put(str, str2);
    }

    public MetricsRecorder(ITimestampGenerator iTimestampGenerator, IHandler iHandler) {
        this.mSinkList = new ArrayList();
        this.mMetadata = new HashMap();
        this.mTimestampGenerator = iTimestampGenerator;
        this.mHandler = iHandler;
    }
}
