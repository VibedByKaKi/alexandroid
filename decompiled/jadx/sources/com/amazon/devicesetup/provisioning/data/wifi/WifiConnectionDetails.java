package com.amazon.devicesetup.provisioning.data.wifi;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.devicesetup.utility.InputValidator;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiConnectionDetails {
    private String ssid;
    private State state;
    private WifiKeyManagement wifiKeyManagement;
    private WpaPskType wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        INITIATING_CONNECTION_ATTEMPT(0, "Initiating connection attempt"),
        DISCONNECTED(1, "Disconnected"),
        CONNECTING(2, "Connecting"),
        ASSOCIATED(3, "Associated with AP"),
        CONNECTED(4, "Connected"),
        CONNECTION_FAILED_INTERNAL_ERROR(-1, "Connection failed due to internal error"),
        CONNECTED_BEHIND_CAPTIVE_PORTAL(-2, "Connected, but behind captive portal"),
        CONNECTED_LIMITED_CONNECTIVITY(-3, "Connected, but with limited connectivity"),
        CONNECTION_FAILED_PSK_AUTHENTICATION(-4, "Connection failed due to PSK authentation error"),
        CONNECTION_FAILED_AP_NOT_FOUND(-5, "Connection failed due to Access Point Not Found");

        private final String description;
        private final int value;

        State(int i, String str) {
            this.value = i;
            this.description = str;
        }

        public static State fromInt(int i) {
            switch (i) {
                case -5:
                    return CONNECTION_FAILED_AP_NOT_FOUND;
                case -4:
                    return CONNECTION_FAILED_PSK_AUTHENTICATION;
                case -3:
                    return CONNECTED_LIMITED_CONNECTIVITY;
                case -2:
                    return CONNECTED_BEHIND_CAPTIVE_PORTAL;
                case -1:
                    return CONNECTION_FAILED_INTERNAL_ERROR;
                case 0:
                    return INITIATING_CONNECTION_ATTEMPT;
                case 1:
                    return DISCONNECTED;
                case 2:
                    return CONNECTING;
                case 3:
                    return ASSOCIATED;
                case 4:
                    return CONNECTED;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown WifiConnectionDetails.State: "));
                    return null;
            }
        }

        public String getDescription() {
            return this.description;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public WifiConnectionDetails(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, State state) {
        if (str != null && (!str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE))) {
            Single$$ExternalSyntheticBUOutline0.m$3("SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.ssid = str == null ? null : AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.wifiKeyManagement = wifiKeyManagement;
        this.wpaPskType = wpaPskType;
        this.state = state;
        validate();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WifiConnectionDetails)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        WifiConnectionDetails wifiConnectionDetails = (WifiConnectionDetails) obj;
        String str = this.ssid;
        String str2 = wifiConnectionDetails.ssid;
        return (str == null ? str2 == null : str.equals(str2)) && this.wifiKeyManagement == wifiConnectionDetails.wifiKeyManagement && this.state == wifiConnectionDetails.state;
    }

    public State getConnectionState() {
        return this.state;
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
        String str = this.ssid;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.state.ordinal() + ((this.wifiKeyManagement.ordinal() + ((hashCode + 41) * 41)) * 41);
    }

    public void setConnectionState(State state) {
        this.state = state;
        validate();
    }

    public String toString() {
        String valueOf = String.valueOf(this.state);
        String str = this.ssid;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("WifiConnectionDetails [state=", valueOf, ", ssid=", str, ", key-mgmt="), String.valueOf(this.wifiKeyManagement), MarkdownConstants.RIGHT_BRACKET);
    }

    public void validate() {
        if (this.ssid != null && !InputValidator.isValidSsid(getSsid())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid ssid in wifi connection details. Please use com.amazon.whisperjoin.common.sharedtypes.utility. InputValidator to validate wifi parameters.");
            return;
        }
        WifiKeyManagement wifiKeyManagement = this.wifiKeyManagement;
        if (wifiKeyManagement == null || InputValidator.isValidWifiKeyManagement(wifiKeyManagement)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid key management in wifi connection details. Please use com.amazon.whisperjoin.common.sharedtypes.utility. InputValidator to validate wifi parameters.");
    }

    public WifiConnectionDetails(String str, WifiKeyManagement wifiKeyManagement, State state) {
        if (str != null && (!str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE))) {
            Single$$ExternalSyntheticBUOutline0.m$3("SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.ssid = str == null ? null : AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.wifiKeyManagement = wifiKeyManagement;
        this.state = state;
        validate();
    }
}
