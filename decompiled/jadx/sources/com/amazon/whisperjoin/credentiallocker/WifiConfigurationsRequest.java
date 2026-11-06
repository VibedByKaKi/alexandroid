package com.amazon.whisperjoin.credentiallocker;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.wifi.WifiConfiguration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class WifiConfigurationsRequest {
    public final String deviceId;
    public final String deviceType;
    public final List<WifiConfiguration> wifiConfigurations;

    public WifiConfigurationsRequest(String str, String str2, List<WifiConfiguration> list) {
        this.deviceType = str;
        this.deviceId = str2;
        this.wifiConfigurations = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConfigurationsRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfigurationsRequest)) {
            return false;
        }
        WifiConfigurationsRequest wifiConfigurationsRequest = (WifiConfigurationsRequest) obj;
        if (!wifiConfigurationsRequest.canEqual(this)) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = wifiConfigurationsRequest.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String deviceType = getDeviceType();
        String deviceType2 = wifiConfigurationsRequest.getDeviceType();
        if (deviceType != null ? !deviceType.equals(deviceType2) : deviceType2 != null) {
            return false;
        }
        List<WifiConfiguration> wifiConfigurations = getWifiConfigurations();
        List<WifiConfiguration> wifiConfigurations2 = wifiConfigurationsRequest.getWifiConfigurations();
        return wifiConfigurations != null ? wifiConfigurations.equals(wifiConfigurations2) : wifiConfigurations2 == null;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public List<WifiConfiguration> getWifiConfigurations() {
        return this.wifiConfigurations;
    }

    public int hashCode() {
        String deviceId = getDeviceId();
        int hashCode = deviceId == null ? 43 : deviceId.hashCode();
        String deviceType = getDeviceType();
        int i = (hashCode + 59) * 59;
        int hashCode2 = deviceType == null ? 43 : deviceType.hashCode();
        List<WifiConfiguration> wifiConfigurations = getWifiConfigurations();
        return ((i + hashCode2) * 59) + (wifiConfigurations != null ? wifiConfigurations.hashCode() : 43);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiConfigurationsRequest(deviceId=");
        sb.append(getDeviceId());
        sb.append(", deviceType=");
        sb.append(getDeviceType());
        sb.append(", wifiConfigurations=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, getWifiConfigurations(), sb);
    }
}
