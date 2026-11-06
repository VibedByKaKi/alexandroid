package com.amazon.whisperjoin.metrics;

import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MinervaMetricsRecorderProvider {
    private String mClientName;
    private String mDirectedId;
    private final MetricsProgramName mMetricsProgramName;
    private final AmazonMinerva mMinervaClient;

    public MinervaMetricsRecorderProvider(AmazonMinerva amazonMinerva, MetricsProgramName metricsProgramName, String str, String str2) {
        this.mMinervaClient = amazonMinerva;
        this.mMetricsProgramName = metricsProgramName;
        this.mDirectedId = str;
        this.mClientName = str2;
    }

    public MinervaMetricsRecorder getMetricsRecorder(WhisperJoinMetricSourceName whisperJoinMetricSourceName) {
        return new MinervaMetricsRecorder(this.mMinervaClient, whisperJoinMetricSourceName, this.mMetricsProgramName, this.mDirectedId, this.mClientName, new MetricTimerWrapper());
    }

    public MinervaMetricsRecorder getMetricsRecorderForProvisionable(WhisperJoinMetricSourceName whisperJoinMetricSourceName, String str) {
        return new MinervaMetricsRecorder(this.mMinervaClient, whisperJoinMetricSourceName, this.mMetricsProgramName, str, new MetricTimerWrapper());
    }

    public MinervaMetricsRecorderProvider(AmazonMinerva amazonMinerva, MetricsProgramName metricsProgramName) {
        this.mMinervaClient = amazonMinerva;
        this.mMetricsProgramName = metricsProgramName;
    }
}
