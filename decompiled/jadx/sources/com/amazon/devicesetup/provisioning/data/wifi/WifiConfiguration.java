package com.amazon.devicesetup.provisioning.data.wifi;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.devicesetup.utility.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiConfiguration extends WifiBaseConfiguration {
    private String mPsk;
    private String mWepKey;

    private WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, String str2, String str3, int i, boolean z) {
        super(str, wifiKeyManagement, wpaPskType, i, z);
        if (wifiKeyManagement == WifiKeyManagement.WEP) {
            this.mWepKey = str2;
        } else if (wifiKeyManagement == WifiKeyManagement.WPA_PSK) {
            this.mPsk = str3;
        }
        validate();
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, 0, false);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, 0, false);
    }

    public static WifiConfiguration createWpaTypedWifiConfiguration(String str, String str2, WpaPskType wpaPskType) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, null, str2, 0, false);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, 0, false);
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (!(obj instanceof WifiConfiguration)) {
            return false;
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) obj;
        return this.mPsk != null ? super.equals(obj) && this.mPsk.equals(wifiConfiguration.mPsk) : this.mWepKey != null ? super.equals(obj) && this.mWepKey.equals(wifiConfiguration.mWepKey) : super.equals(obj);
    }

    public String getPsk() {
        return this.mPsk;
    }

    public String getWepKey() {
        return this.mWepKey;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        int hashCode = (super.hashCode() + 41) * 41;
        String str = this.mWepKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 41;
        String str2 = this.mPsk;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiBaseConfiguration, com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("WifiConfiguration [ssid=", this.ssid, ", key-mgmt=", String.valueOf(this.wifiKeyManagement), MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public void validate() {
        super.validate();
        String str = this.mPsk;
        if (str != null && this.mWepKey != null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Wifi configuration cannot have both WEP-key and PSK. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            return;
        }
        if (str != null && !InputValidator.isValidWPAWifiConfiguration(this.wifiKeyManagement, getPsk())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid PSK in wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            return;
        }
        String str2 = this.mWepKey;
        if (str2 != null && !InputValidator.isValidWEPWifiConfiguration(this.wifiKeyManagement, str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid WEP-key in wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        } else if (this.mPsk == null && this.mWepKey == null && !InputValidator.isValidOpenWifiConfiguration(this.wifiKeyManagement)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid open wifi configuration. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        }
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, i, z);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, i, z);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, i, z);
    }

    public static WifiConfiguration createWpaTypedWifiConfiguration(String str, String str2, WpaPskType wpaPskType, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, wpaPskType, null, str2, i, z);
    }

    private WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, String str2, String str3, int i, boolean z) {
        super(str, wifiKeyManagement, i, z);
        if (wifiKeyManagement == WifiKeyManagement.WEP) {
            this.mWepKey = str2;
        } else if (wifiKeyManagement == WifiKeyManagement.WPA_PSK) {
            this.mPsk = str3;
        }
        validate();
    }
}
