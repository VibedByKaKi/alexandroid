package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.capabilities.Capability;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AccessorySessionOptions {
    private List<Capability> supportedCapabilities;
    private boolean useUnsecureLowEnergyConnection = false;
    private boolean deviceKnown = false;
    private boolean forceConnection = false;

    public List<Capability> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    public boolean isDeviceKnown() {
        return this.deviceKnown;
    }

    public void setDeviceKnown(boolean z) {
        this.deviceKnown = z;
    }

    public void setForceConnection(boolean z) {
        this.forceConnection = z;
    }

    public void setSupportedCapabilities(List<Capability> list) {
        this.supportedCapabilities = list;
    }

    public boolean shouldForceConnection() {
        return this.forceConnection;
    }

    public boolean shouldUseUnsecureLowEnergyConnection() {
        return this.useUnsecureLowEnergyConnection;
    }

    public void useUnsecureLowEnergyConnection(boolean z) {
        this.useUnsecureLowEnergyConnection = z;
    }
}
