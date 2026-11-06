package com.amazon.devicesetup.provisioning.data.wifi;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiBaseConfiguration extends WifiNetwork {
    protected boolean mIsHiddenNetwork;
    protected int mNetworkPriority;

    public WifiBaseConfiguration(String str, WifiKeyManagement wifiKeyManagement, int i, boolean z) {
        super(str, wifiKeyManagement);
        this.mNetworkPriority = i;
        this.mIsHiddenNetwork = z;
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, null, 0, false);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, null, 0, false);
    }

    public static WifiBaseConfiguration createWpaTypedWifiConfiguration(String str, WpaPskType wpaPskType, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, i, z);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, null, 0, false);
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj instanceof WifiBaseConfiguration) {
            WifiBaseConfiguration wifiBaseConfiguration = (WifiBaseConfiguration) obj;
            if (super.equals(this) && this.mNetworkPriority == wifiBaseConfiguration.mNetworkPriority && this.mIsHiddenNetwork == wifiBaseConfiguration.mIsHiddenNetwork) {
                return true;
            }
        }
        return false;
    }

    public int getNetworkPriority() {
        return this.mNetworkPriority;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        return ((((super.hashCode() + 41) * 41) + this.mNetworkPriority) * 41) + (this.mIsHiddenNetwork ? 1 : 0);
    }

    public boolean isHiddenNetwork() {
        return this.mIsHiddenNetwork;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public String toString() {
        String str = this.ssid;
        String valueOf = String.valueOf(this.wifiKeyManagement);
        int i = this.mNetworkPriority;
        boolean z = this.mIsHiddenNetwork;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("WifiBaseConfiguration [ssid=", str, ", key-mgmt=", valueOf, ", priority=");
        m.append(i);
        m.append(", hidden=");
        m.append(z);
        m.append(MarkdownConstants.RIGHT_BRACKET);
        return m.toString();
    }

    public WifiBaseConfiguration(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, int i, boolean z) {
        super(str, wifiKeyManagement, wpaPskType);
        this.mNetworkPriority = i;
        this.mIsHiddenNetwork = z;
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, null, i, z);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, null, i, z);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, null, i, z);
    }
}
