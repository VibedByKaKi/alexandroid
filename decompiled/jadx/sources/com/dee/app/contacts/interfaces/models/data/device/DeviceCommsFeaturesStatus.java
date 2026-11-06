package com.dee.app.contacts.interfaces.models.data.device;

import com.dee.app.contacts.interfaces.models.data.enums.CommsDropInSupportedReason;
import com.dee.app.contacts.interfaces.models.data.enums.DeviceCommsSupportedFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeviceCommsFeaturesStatus {
    private DeviceCommsSupportedFeature feature;
    private boolean isSupported;
    private CommsDropInSupportedReason reason;

    public DeviceCommsSupportedFeature getFeature() {
        return this.feature;
    }

    public CommsDropInSupportedReason getReason() {
        return this.reason;
    }

    public boolean isSupported() {
        return this.isSupported;
    }

    public void setFeature(DeviceCommsSupportedFeature deviceCommsSupportedFeature) {
        this.feature = deviceCommsSupportedFeature;
    }

    public void setReason(CommsDropInSupportedReason commsDropInSupportedReason) {
        this.reason = commsDropInSupportedReason;
    }

    public void setSupported(boolean z) {
        this.isSupported = z;
    }
}
