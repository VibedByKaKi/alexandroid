package com.amazon.whisperjoin.provisioning.metrics.client.helpers;

import com.amazon.whisperjoin.provisioning.metrics.client.MinervaMetricHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class SecureSessionMetrics {
    private static final String SECURE_CHANNEL_ESTABLISHED_PIVOT = "SecureChannelEstablished";
    private static final String SECURE_CHANNEL_REQUIRED_PIVOT = "SecureChannelRequired";
    private static final String SECURE_CHANNEL_SETUP_SUCCESS_METRIC = "SecureChannelSetupSuccess";
    private final MinervaMetricHelper mMinervaMetricHelper;

    public SecureSessionMetrics(MinervaMetricHelper minervaMetricHelper) {
        this.mMinervaMetricHelper = minervaMetricHelper;
    }

    public void onSecureSessionSetupFailed() {
        this.mMinervaMetricHelper.recordString(SECURE_CHANNEL_REQUIRED_PIVOT, Boolean.TRUE, new Object[0]);
        this.mMinervaMetricHelper.recordString(SECURE_CHANNEL_ESTABLISHED_PIVOT, Boolean.FALSE, new Object[0]);
        this.mMinervaMetricHelper.recordCounter(SECURE_CHANNEL_SETUP_SUCCESS_METRIC, 0.0d, new Object[0]);
    }

    public void onSecureSessionSetupSuccess() {
        MinervaMetricHelper minervaMetricHelper = this.mMinervaMetricHelper;
        Boolean bool = Boolean.TRUE;
        minervaMetricHelper.recordString(SECURE_CHANNEL_REQUIRED_PIVOT, bool, new Object[0]);
        this.mMinervaMetricHelper.recordString(SECURE_CHANNEL_ESTABLISHED_PIVOT, bool, new Object[0]);
        this.mMinervaMetricHelper.recordCounter(SECURE_CHANNEL_SETUP_SUCCESS_METRIC, 1.0d, new Object[0]);
    }
}
