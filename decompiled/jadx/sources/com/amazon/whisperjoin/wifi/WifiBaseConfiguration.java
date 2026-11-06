package com.amazon.whisperjoin.wifi;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class WifiBaseConfiguration extends WifiNetwork implements Serializable, Validatable {
    protected boolean hidden;
    protected int priority;

    public WifiBaseConfiguration(String str, WifiKeyManagement wifiKeyManagement, int i, boolean z) {
        super(str, wifiKeyManagement);
        this.priority = i;
        this.hidden = z;
    }

    public static WifiBaseConfiguration convertFromAndroidWifiConfiguration(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(0)) {
            String[] strArr = wifiConfiguration.wepKeys;
            return (strArr == null || strArr.length <= 0 || strArr[0] == null) ? createOpenWifiConfiguration(wifiConfiguration.SSID, wifiConfiguration.priority, wifiConfiguration.hiddenSSID) : createWepWifiConfiguration(wifiConfiguration.SSID, wifiConfiguration.priority, wifiConfiguration.hiddenSSID);
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return createWpaWifiConfiguration(wifiConfiguration.SSID, wifiConfiguration.priority, wifiConfiguration.hiddenSSID);
        }
        return null;
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, 0, false);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, 0, false);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, 0, false);
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean canEqual(Object obj) {
        return obj instanceof WifiBaseConfiguration;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiBaseConfiguration)) {
            return false;
        }
        WifiBaseConfiguration wifiBaseConfiguration = (WifiBaseConfiguration) obj;
        return wifiBaseConfiguration.canEqual(this) && super.equals(obj) && getPriority() == wifiBaseConfiguration.getPriority() && isHidden() == wifiBaseConfiguration.isHidden();
    }

    public int getPriority() {
        return this.priority;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public int hashCode() {
        return ((getPriority() + (super.hashCode() * 59)) * 59) + (isHidden() ? 79 : 97);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public String toString() {
        return "WifiBaseConfiguration(priority=" + getPriority() + ", hidden=" + isHidden() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public static WifiBaseConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.NONE, i, z);
    }

    public static WifiBaseConfiguration createWepWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WEP, i, z);
    }

    public static WifiBaseConfiguration createWpaWifiConfiguration(String str, int i, boolean z) {
        return new WifiBaseConfiguration(str, WifiKeyManagement.WPA_PSK, i, z);
    }
}
