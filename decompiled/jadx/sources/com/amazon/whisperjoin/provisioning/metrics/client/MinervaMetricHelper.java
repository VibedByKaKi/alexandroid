package com.amazon.whisperjoin.provisioning.metrics.client;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.minerva.client.thirdparty.api.MetricEvent;
import com.amazon.minerva.client.thirdparty.api.Predefined;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class MinervaMetricHelper {
    protected MetricEvent mMetricEvent;
    protected AmazonMinerva mMinervaClient;

    public MinervaMetricHelper(AmazonMinerva amazonMinerva, MetricEvent metricEvent) {
        this.mMinervaClient = amazonMinerva;
        this.mMetricEvent = metricEvent;
    }

    private String getMetricNameWithDimensions(String str, Object... objArr) {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        for (Object obj : objArr) {
            if (obj != null) {
                m.append("_");
                m.append(obj.toString());
            }
        }
        return m.toString();
    }

    public void close() {
        if (this.mMinervaClient != null) {
            this.mMetricEvent.addPredefined(Predefined.DEVICE_TYPE);
            this.mMetricEvent.addPredefined(Predefined.COUNTRY_OF_RESIDENCE);
            this.mMinervaClient.record(this.mMetricEvent);
        }
        this.mMinervaClient = null;
        this.mMetricEvent = null;
    }

    public void recordCounter(String str, double d, Object... objArr) {
        this.mMetricEvent.addDouble(getMetricNameWithDimensions(str, objArr), d);
    }

    public void recordString(String str, Object obj, Object... objArr) {
        this.mMetricEvent.addString(getMetricNameWithDimensions(str, objArr), obj == null ? null : obj.toString());
    }

    public void recordTimer(String str, double d, Object... objArr) {
        this.mMetricEvent.addDouble(getMetricNameWithDimensions(str, objArr), d);
    }
}
