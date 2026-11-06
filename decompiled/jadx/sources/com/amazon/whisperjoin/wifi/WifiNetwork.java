package com.amazon.whisperjoin.wifi;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class WifiNetwork implements Serializable, Validatable {
    protected WifiKeyManagement keyMgmt;
    protected String ssid;

    public WifiNetwork(String str, WifiKeyManagement wifiKeyManagement) {
        if (str == null || !str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.ssid = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.keyMgmt = wifiKeyManagement;
        validateInternal();
    }

    private void validateInternal() {
        if (InputValidator.isValidSsid(getSsid()) && InputValidator.isValidWifiKeyManagement(this.keyMgmt)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi network. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiNetwork;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiNetwork)) {
            return false;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        if (!wifiNetwork.canEqual(this)) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiNetwork.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        WifiKeyManagement keyMgmt = getKeyMgmt();
        WifiKeyManagement keyMgmt2 = wifiNetwork.getKeyMgmt();
        return keyMgmt != null ? keyMgmt.equals(keyMgmt2) : keyMgmt2 == null;
    }

    public WifiKeyManagement getKeyMgmt() {
        return this.keyMgmt;
    }

    public String getSsid() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.ssid, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public int hashCode() {
        String ssid = getSsid();
        int hashCode = ssid == null ? 43 : ssid.hashCode();
        WifiKeyManagement keyMgmt = getKeyMgmt();
        return ((hashCode + 59) * 59) + (keyMgmt != null ? keyMgmt.hashCode() : 43);
    }

    public String toString() {
        return "WifiNetwork(ssid=" + getSsid() + ", keyMgmt=" + getKeyMgmt() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public void validate() {
        validateInternal();
    }

    public WifiNetwork(WifiNetwork wifiNetwork) {
        this.ssid = wifiNetwork.ssid;
        this.keyMgmt = wifiNetwork.keyMgmt;
    }
}
