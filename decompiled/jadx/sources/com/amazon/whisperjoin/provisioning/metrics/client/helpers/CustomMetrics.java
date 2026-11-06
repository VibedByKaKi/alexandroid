package com.amazon.whisperjoin.provisioning.metrics.client.helpers;

import com.amazon.whisperjoin.provisioning.metrics.client.MinervaMetricHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class CustomMetrics {
    private final MinervaMetricHelper mMinervaMetricHelper;

    public CustomMetrics(MinervaMetricHelper minervaMetricHelper) {
        this.mMinervaMetricHelper = minervaMetricHelper;
    }

    public void addCounter(String str, double d) {
        this.mMinervaMetricHelper.recordCounter(str, d, new Object[0]);
    }

    public void addString(String str, String str2) {
        this.mMinervaMetricHelper.recordString(str, str2, new Object[0]);
    }

    public void addTimer(String str, double d) {
        this.mMinervaMetricHelper.recordTimer(str, d, new Object[0]);
    }
}
