package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConfiguration;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ClientProvisioningDataModel {
    private final Map<String, String> mCustomConfiguration;
    private final boolean mSaveNetworkToLocker;
    private final WifiConfiguration mWifiConfiguration;

    public ClientProvisioningDataModel(WifiConfiguration wifiConfiguration, boolean z, Map<String, String> map) {
        if (wifiConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("wifiConfiguration can not be null");
            throw null;
        }
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("customConfiguration can not be null");
            throw null;
        }
        this.mWifiConfiguration = wifiConfiguration;
        this.mSaveNetworkToLocker = z;
        this.mCustomConfiguration = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClientProvisioningDataModel clientProvisioningDataModel = (ClientProvisioningDataModel) obj;
            if (this.mSaveNetworkToLocker == clientProvisioningDataModel.mSaveNetworkToLocker && Objects.equal(this.mWifiConfiguration, clientProvisioningDataModel.mWifiConfiguration) && Objects.equal(this.mCustomConfiguration, clientProvisioningDataModel.mCustomConfiguration)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> getCustomConfiguration() {
        return this.mCustomConfiguration;
    }

    public WifiConfiguration getWifiConfiguration() {
        return this.mWifiConfiguration;
    }

    public int hashCode() {
        return Objects.hashCode(this.mWifiConfiguration, Boolean.valueOf(this.mSaveNetworkToLocker), this.mCustomConfiguration);
    }

    public boolean saveNetworkToLocker() {
        return this.mSaveNetworkToLocker;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mWifiConfiguration", this.mWifiConfiguration).add("mSaveNetworkToLocker", this.mSaveNetworkToLocker).add("mCustomConfiguration", this.mCustomConfiguration).toString();
    }

    public ClientProvisioningDataModel(WifiConfiguration wifiConfiguration, boolean z) {
        this(wifiConfiguration, z, Collections.EMPTY_MAP);
    }
}
