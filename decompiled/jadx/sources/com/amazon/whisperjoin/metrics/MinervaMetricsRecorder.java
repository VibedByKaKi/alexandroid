package com.amazon.whisperjoin.metrics;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.minerva.client.thirdparty.api.MetricEvent;
import com.amazon.minerva.client.thirdparty.api.Predefined;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MinervaMetricsRecorder {
    private static final String LATENCY = "Latency";
    private static final String TAG = "MinervaMetricsRecorder";
    private static final String WHISPER_JOIN_CLIENT = "WhisperJoinV2Client";
    protected Map<String, Double> counterMap = new ConcurrentHashMap();
    protected MetricEvent mMetricEvent;
    private MetricTimerWrapper mMetricTimerWrapper;
    protected AmazonMinerva mMinervaClient;
    private WhisperJoinMetricSourceName mWhisperJoinMetricSourceName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.metrics.MinervaMetricsRecorder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$metrics$WhisperJoinMetricName;

        static {
            int[] iArr = new int[WhisperJoinMetricName.values().length];
            $SwitchMap$com$amazon$whisperjoin$metrics$WhisperJoinMetricName = iArr;
            try {
                iArr[WhisperJoinMetricName.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$metrics$WhisperJoinMetricName[WhisperJoinMetricName.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MinervaMetricsRecorder(AmazonMinerva amazonMinerva, WhisperJoinMetricSourceName whisperJoinMetricSourceName, MetricsProgramName metricsProgramName, String str, String str2, MetricTimerWrapper metricTimerWrapper) {
        this.mMinervaClient = amazonMinerva;
        this.mMetricEvent = new MetricEvent(metricsProgramName.toString(), whisperJoinMetricSourceName.toString());
        this.mWhisperJoinMetricSourceName = whisperJoinMetricSourceName;
        this.mMetricTimerWrapper = metricTimerWrapper;
        recordString(WHISPER_JOIN_CLIENT, str2);
        this.mMetricEvent.addPredefined(Predefined.DEVICE_TYPE);
        this.mMetricEvent.addPredefined(Predefined.COUNTRY_OF_RESIDENCE);
    }

    private void addCounters() {
        for (Map.Entry<String, Double> entry : this.counterMap.entrySet()) {
            this.mMetricEvent.addDouble(entry.getKey(), entry.getValue().doubleValue());
        }
    }

    private MetricTimer getAndStoreNewMetricsTimer(String str) {
        MetricTimer metricTimer = this.mMetricTimerWrapper.getMetricTimer();
        if (this.mMetricTimerWrapper.getMetricTimerFromProfilerMap(str) != null) {
            WJLog.w(TAG, "Replacing metric timer instance for: " + str);
        }
        this.mMetricTimerWrapper.storeMetricTimerInProfilerMap(str, metricTimer);
        return metricTimer;
    }

    private MetricTimer getExistingMetricsTimer(String str) {
        MetricTimer metricTimerFromProfilerMap = this.mMetricTimerWrapper.getMetricTimerFromProfilerMap(str);
        if (metricTimerFromProfilerMap == null) {
            WJLog.w(TAG, "No metric timer found for: " + str);
        }
        return metricTimerFromProfilerMap;
    }

    public void addAnonymousIdentity() {
        this.mMetricEvent.addPredefined(Predefined.CUSTOMER_ID);
        this.mMetricEvent.addPredefined(Predefined.DEVICE_ID);
    }

    public void addTimer(String str, long j) {
        String str2 = TAG;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("addTimer(metricName:[", str, "], latency: [", j);
        m.append("])");
        WJLog.v(str2, m.toString());
        this.mMetricEvent.addLong(str, j);
    }

    public void close() {
        addCounters();
        this.mMinervaClient.record(this.mMetricEvent);
    }

    public WhisperJoinMetricSourceName getMetricSourceName() {
        return this.mWhisperJoinMetricSourceName;
    }

    public void incrementCounter(String str) {
        WJLog.v(TAG, "incrementCounter(metricName:[" + str + "])");
        boolean containsKey = this.counterMap.containsKey(str);
        Map<String, Double> map = this.counterMap;
        if (!containsKey) {
            map.put(str, Double.valueOf(1.0d));
        } else {
            this.counterMap.put(str, Double.valueOf(map.get(str).doubleValue() + 1.0d));
        }
    }

    public void recordCounter(String str, double d) {
        WJLog.v(TAG, "recordCounter(metricName: [" + str + "], value: [" + d + "])");
        this.counterMap.put(str, Double.valueOf(d));
    }

    public void recordString(String str, Object obj) {
        String str2 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("recordString(metricName:[", str, "], value: [");
        m2m.append(obj == null ? "null" : obj);
        m2m.append("])");
        WJLog.v(str2, m2m.toString());
        this.mMetricEvent.addString(str, obj == null ? null : obj.toString());
    }

    public void startProfiling(String str) {
        WJLog.v(TAG, "startProfiling metricOperationName: [" + str + "])");
        getAndStoreNewMetricsTimer(str).start();
    }

    public void startTimer(String str) {
        WJLog.v(TAG, "startTimer(metricName:[" + str + "])");
        getAndStoreNewMetricsTimer(str).start();
    }

    public void stopProfiling(WhisperJoinMetricName whisperJoinMetricName, String str) {
        WJLog.v(TAG, "stopProfiling(metricOperationName: [" + str + "])");
        MetricTimer existingMetricsTimer = getExistingMetricsTimer(str);
        if (existingMetricsTimer != null) {
            long stop = existingMetricsTimer.stop();
            this.mMetricEvent.addLong(str + "_Latency", stop);
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$metrics$WhisperJoinMetricName[whisperJoinMetricName.ordinal()];
        if (i == 1) {
            recordCounter(whisperJoinMetricName.toString(), 1.0d);
        } else if (i == 2) {
            recordCounter(WhisperJoinMetricName.SUCCESS.toString(), 0.0d);
        }
        close();
    }

    public void stopTimer(String str) {
        MetricTimer existingMetricsTimer = getExistingMetricsTimer(str);
        if (existingMetricsTimer != null) {
            addTimer(str, existingMetricsTimer.stop());
        }
    }

    public MinervaMetricsRecorder(AmazonMinerva amazonMinerva, WhisperJoinMetricSourceName whisperJoinMetricSourceName, MetricsProgramName metricsProgramName, String str, MetricTimerWrapper metricTimerWrapper) {
        this.mMinervaClient = amazonMinerva;
        this.mMetricEvent = new MetricEvent(metricsProgramName.toString(), whisperJoinMetricSourceName.toString());
        this.mWhisperJoinMetricSourceName = whisperJoinMetricSourceName;
        this.mMetricTimerWrapper = metricTimerWrapper;
        recordString(WHISPER_JOIN_CLIENT, str);
    }
}
