package com.amazon.identity.auth.device.metrics;

import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SSOMetrics$AccountProperties {
    DeviceName(DataRecordKey.MODEL),
    DeviceEmail("DeviceEmail"),
    General("General");

    private final String mName;

    SSOMetrics$AccountProperties(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }
}
