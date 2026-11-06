package com.amazon.devicesetup.provisioning.data.wifi;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.devicesetup.utility.InputValidator;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiNetwork {
    protected String ssid;
    protected WifiKeyManagement wifiKeyManagement;
    protected WpaPskType wpaPskType;

    public WifiNetwork(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType) {
        if (str == null || !str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. SSID is not quoted. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.ssid = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.wifiKeyManagement = wifiKeyManagement;
        this.wpaPskType = wpaPskType;
        validateInternal();
    }

    private void validateInternal() {
        if (InputValidator.isValidSsid(getSsid()) && InputValidator.isValidWifiKeyManagement(this.wifiKeyManagement)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WifiNetwork)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        return this.ssid.equals(wifiNetwork.ssid) && this.wifiKeyManagement.equals(wifiNetwork.wifiKeyManagement);
    }

    public WifiKeyManagement getKeyManagement() {
        return this.wifiKeyManagement;
    }

    public String getSsid() {
        return a$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, this.ssid, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public WpaPskType getWpaPskType() {
        return this.wpaPskType;
    }

    public int hashCode() {
        return this.wifiKeyManagement.ordinal() + ArcMode$$ExternalSyntheticOutline0.m(41, 41, this.ssid);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("WifiNetwork [ssid=", this.ssid, ", key-mgmt=", String.valueOf(this.wifiKeyManagement), MarkdownConstants.RIGHT_BRACKET);
    }

    public void validate() {
        validateInternal();
    }

    public WifiNetwork(String str, WifiKeyManagement wifiKeyManagement) {
        if (str != null && str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            this.ssid = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
            this.wifiKeyManagement = wifiKeyManagement;
            validateInternal();
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. SSID is not quoted. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
        throw null;
    }

    public WifiNetwork(WifiNetwork wifiNetwork) {
        this.ssid = wifiNetwork.ssid;
        this.wifiKeyManagement = wifiNetwork.wifiKeyManagement;
        this.wpaPskType = wifiNetwork.wpaPskType;
    }
}
