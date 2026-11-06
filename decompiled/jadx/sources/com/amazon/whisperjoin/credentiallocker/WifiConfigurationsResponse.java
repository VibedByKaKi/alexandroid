package com.amazon.whisperjoin.credentiallocker;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.wifi.WifiConfiguration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class WifiConfigurationsResponse {
    public final List<WifiConfiguration> wifiConfigurations;

    public WifiConfigurationsResponse(List<WifiConfiguration> list) {
        this.wifiConfigurations = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConfigurationsResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfigurationsResponse)) {
            return false;
        }
        WifiConfigurationsResponse wifiConfigurationsResponse = (WifiConfigurationsResponse) obj;
        if (!wifiConfigurationsResponse.canEqual(this)) {
            return false;
        }
        List<WifiConfiguration> wifiConfigurations = getWifiConfigurations();
        List<WifiConfiguration> wifiConfigurations2 = wifiConfigurationsResponse.getWifiConfigurations();
        return wifiConfigurations != null ? wifiConfigurations.equals(wifiConfigurations2) : wifiConfigurations2 == null;
    }

    public List<WifiConfiguration> getWifiConfigurations() {
        return this.wifiConfigurations;
    }

    public int hashCode() {
        List<WifiConfiguration> wifiConfigurations = getWifiConfigurations();
        return 59 + (wifiConfigurations == null ? 43 : wifiConfigurations.hashCode());
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, getWifiConfigurations(), new StringBuilder("WifiConfigurationsResponse(wifiConfigurations="));
    }
}
