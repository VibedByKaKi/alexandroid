package com.amazon.whisperjoin.deviceprovisioningservice.error;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.DeviceSession;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ConnectionFailureDuringSetup extends Exception {
    private final DeviceSession mDeviceSession;

    public ConnectionFailureDuringSetup(Throwable th, DeviceSession deviceSession) {
        super(th);
        this.mDeviceSession = deviceSession;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mDeviceSession, ((ConnectionFailureDuringSetup) obj).mDeviceSession);
    }

    public DeviceSession getDeviceSession() {
        return this.mDeviceSession;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDeviceSession);
    }
}
