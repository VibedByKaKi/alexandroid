package com.amazon.whisperjoin.provisioning.metrics.client.helpers;

import com.amazon.whisperjoin.provisioning.Radios;
import com.amazon.whisperjoin.provisioning.metrics.client.MinervaMetricHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ConnectionMetrics {
    private static final String ACTIVE_RADIO_METRIC = "ActiveRadio";
    private static final String CONNECTION_DROPPED_METRIC = "ConnectionDropped";
    private static final String CONNECTION_FAILED_METRIC = "ConnectionFailed";
    private static final String CONNECT_METRIC = "Connected";
    private static final String NO_DEVICES_DISCOVERED_METRIC = "NoDevicesDiscovered";
    private final Radios mActiveRadio;
    private final MinervaMetricHelper mMinervaMetricHelper;

    public ConnectionMetrics(MinervaMetricHelper minervaMetricHelper, Radios radios) {
        this.mMinervaMetricHelper = minervaMetricHelper;
        this.mActiveRadio = radios;
        minervaMetricHelper.recordString(ACTIVE_RADIO_METRIC, radios, new Object[0]);
    }

    public void onConnectionAttemptFailed() {
        this.mMinervaMetricHelper.recordCounter(CONNECTION_FAILED_METRIC, 1.0d, new Object[0]);
        this.mMinervaMetricHelper.recordCounter(CONNECTION_FAILED_METRIC, 1.0d, this.mActiveRadio);
    }

    public void onConnectionDropped() {
        this.mMinervaMetricHelper.recordCounter("ConnectionDropped", 1.0d, new Object[0]);
        this.mMinervaMetricHelper.recordCounter("ConnectionDropped", 1.0d, this.mActiveRadio);
    }

    public void onConnectionEstablished() {
        this.mMinervaMetricHelper.recordCounter(CONNECT_METRIC, 1.0d, new Object[0]);
        this.mMinervaMetricHelper.recordCounter(CONNECT_METRIC, 1.0d, this.mActiveRadio);
    }

    public void onDiscoveryFailed() {
        this.mMinervaMetricHelper.recordCounter(NO_DEVICES_DISCOVERED_METRIC, 1.0d, new Object[0]);
        this.mMinervaMetricHelper.recordCounter(NO_DEVICES_DISCOVERED_METRIC, 1.0d, this.mActiveRadio);
    }
}
