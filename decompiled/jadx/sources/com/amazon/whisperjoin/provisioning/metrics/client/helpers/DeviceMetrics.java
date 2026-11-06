package com.amazon.whisperjoin.provisioning.metrics.client.helpers;

import com.amazon.whisperjoin.provisioning.metrics.client.MinervaMetricHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DeviceMetrics {
    static final String TARGET_DEVICE_SERIAL_METRIC = "TargetDeviceSerial";
    static final String TARGET_DEVICE_TYPE_METRIC = "TargetDeviceType";
    static final String TARGET_DEVICE_VERSION_METRIC = "TargetDeviceVersion";
    private final MinervaMetricHelper mMinervaMetricHelper;

    public DeviceMetrics(MinervaMetricHelper minervaMetricHelper) {
        this.mMinervaMetricHelper = minervaMetricHelper;
    }

    public void onTargetDeviceSerialDiscovered(String str) {
        this.mMinervaMetricHelper.recordString(TARGET_DEVICE_SERIAL_METRIC, str, new Object[0]);
    }

    public void onTargetDeviceTypeDiscovered(String str) {
        this.mMinervaMetricHelper.recordString(TARGET_DEVICE_TYPE_METRIC, str, new Object[0]);
    }

    public void onTargetDeviceVersionDiscovered(String str) {
        this.mMinervaMetricHelper.recordString(TARGET_DEVICE_VERSION_METRIC, str, new Object[0]);
    }
}
