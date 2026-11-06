package com.amazon.whisperjoin.provisioning.wifi;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import com.amazon.whisperjoin.wifi.WifiKeyManagement;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class WifiConnectionDetails implements Validatable {
    public static final int ASSOCIATED = 3;
    public static final int CONNECTED = 2;
    public static final int CONNECTED_BEHIND_CAPTIVE_PORTAL = 5;
    public static final int CONNECTED_LIMITED_CONNECTIVITY = 4;
    public static final int CONNECTING = 1;

    @Deprecated
    public static final int CONNECTION_FAILED_ASSOCIATION_TIMED_OUT = -12;
    public static final int CONNECTION_FAILED_AUTHENTICATION_FAILED = -4;

    @Deprecated
    public static final int CONNECTION_FAILED_CAPTIVE_PORTAL = -11;

    @Deprecated
    public static final int CONNECTION_FAILED_DHCP_LEASE_FAILED = -7;

    @Deprecated
    public static final int CONNECTION_FAILED_INTERNET_UNREACHABLE = -10;

    @Deprecated
    public static final int CONNECTION_FAILED_IP_CONFLICT = -9;

    @Deprecated
    public static final int CONNECTION_FAILED_LOW_SIGNAL = -3;

    @Deprecated
    public static final int CONNECTION_FAILED_NO_AP_RESPONSE = -5;

    @Deprecated
    public static final int CONNECTION_FAILED_NO_DHCP_SERVER = -6;

    @Deprecated
    public static final int CONNECTION_FAILED_NO_DNS_SERVER = -8;

    @Deprecated
    public static final int CONNECTION_FAILED_NO_NETWORK_AVAILABLE = -2;
    public static final int CONNECTION_FAILED_OTHER = -1;
    public static final int DISCONNECTED = 0;
    private WifiKeyManagement keyMgmt;

    @SerializedName("msg")
    private String message;
    private String ssid;
    private Integer state;

    public WifiConnectionDetails(String str, WifiKeyManagement wifiKeyManagement, Integer num) {
        if (str != null && (!str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE))) {
            Single$$ExternalSyntheticBUOutline0.m$3("SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.ssid = str == null ? null : AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.keyMgmt = wifiKeyManagement;
        this.state = num;
        validate();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConnectionDetails;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConnectionDetails)) {
            return false;
        }
        WifiConnectionDetails wifiConnectionDetails = (WifiConnectionDetails) obj;
        if (!wifiConnectionDetails.canEqual(this)) {
            return false;
        }
        Integer state = getState();
        Integer state2 = wifiConnectionDetails.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiConnectionDetails.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        WifiKeyManagement keyMgmt = getKeyMgmt();
        WifiKeyManagement keyMgmt2 = wifiConnectionDetails.getKeyMgmt();
        if (keyMgmt != null ? !keyMgmt.equals(keyMgmt2) : keyMgmt2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = wifiConnectionDetails.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public WifiKeyManagement getKeyMgmt() {
        return this.keyMgmt;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSsid() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.ssid, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public Integer getState() {
        return this.state;
    }

    public int hashCode() {
        Integer state = getState();
        int hashCode = state == null ? 43 : state.hashCode();
        String ssid = getSsid();
        int hashCode2 = ((hashCode + 59) * 59) + (ssid == null ? 43 : ssid.hashCode());
        WifiKeyManagement keyMgmt = getKeyMgmt();
        int i = hashCode2 * 59;
        int hashCode3 = keyMgmt == null ? 43 : keyMgmt.hashCode();
        String message = getMessage();
        return ((i + hashCode3) * 59) + (message != null ? message.hashCode() : 43);
    }

    public void setKeyMgmt(WifiKeyManagement wifiKeyManagement) {
        this.keyMgmt = wifiKeyManagement;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setState(Integer num) {
        this.state = num;
        validate();
    }

    public String toString() {
        return "WifiConnectionDetails(ssid=" + getSsid() + ", keyMgmt=" + getKeyMgmt() + ", state=" + getState() + ", message=" + getMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (this.ssid != null && !InputValidator.isValidSsid(getSsid())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid ssid in wifi connection details. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            return;
        }
        WifiKeyManagement wifiKeyManagement = this.keyMgmt;
        if (wifiKeyManagement != null && !InputValidator.isValidWifiKeyManagement(wifiKeyManagement)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid key management in wifi connection details. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
        } else {
            if (this.state != null) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("WifiConnectionDetails does not support a null state value.");
        }
    }
}
