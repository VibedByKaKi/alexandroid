package com.amazon.whisperjoin.softap.pojos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.softap.pojos.WifiConfiguration;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class Network {

    @SerializedName("bssid")
    private String bssid;

    @SerializedName("security")
    private WifiConfiguration.WifiKeyManagement keyMgmt;

    @SerializedName("rssi")
    private int rssi;

    @SerializedName("ssid")
    private String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NetworkBuilder {
        private String bssid;
        private WifiConfiguration.WifiKeyManagement keyMgmt;
        private int rssi;
        private String ssid;

        public NetworkBuilder bssid(String str) {
            this.bssid = str;
            return this;
        }

        public Network build() {
            return new Network(this.ssid, this.bssid, this.keyMgmt, this.rssi);
        }

        public NetworkBuilder keyMgmt(WifiConfiguration.WifiKeyManagement wifiKeyManagement) {
            this.keyMgmt = wifiKeyManagement;
            return this;
        }

        public NetworkBuilder rssi(int i) {
            this.rssi = i;
            return this;
        }

        public NetworkBuilder ssid(String str) {
            this.ssid = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Network.NetworkBuilder(ssid=");
            sb.append(this.ssid);
            sb.append(", bssid=");
            sb.append(this.bssid);
            sb.append(", keyMgmt=");
            sb.append(this.keyMgmt);
            sb.append(", rssi=");
            return a$$ExternalSyntheticOutline0.m(sb, this.rssi, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public Network(String str, String str2, WifiConfiguration.WifiKeyManagement wifiKeyManagement, int i) {
        this.ssid = str;
        this.bssid = str2;
        this.keyMgmt = wifiKeyManagement;
        this.rssi = i;
    }

    public static NetworkBuilder builder() {
        return new NetworkBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Network;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (!network.canEqual(this) || getRssi() != network.getRssi()) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = network.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        String bssid = getBssid();
        String bssid2 = network.getBssid();
        if (bssid != null ? !bssid.equals(bssid2) : bssid2 != null) {
            return false;
        }
        WifiConfiguration.WifiKeyManagement keyMgmt = getKeyMgmt();
        WifiConfiguration.WifiKeyManagement keyMgmt2 = network.getKeyMgmt();
        return keyMgmt != null ? keyMgmt.equals(keyMgmt2) : keyMgmt2 == null;
    }

    public String getBssid() {
        return this.bssid;
    }

    public WifiConfiguration.WifiKeyManagement getKeyMgmt() {
        return this.keyMgmt;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        int rssi = getRssi() + 59;
        String ssid = getSsid();
        int hashCode = (rssi * 59) + (ssid == null ? 43 : ssid.hashCode());
        String bssid = getBssid();
        int i = hashCode * 59;
        int hashCode2 = bssid == null ? 43 : bssid.hashCode();
        WifiConfiguration.WifiKeyManagement keyMgmt = getKeyMgmt();
        return ((i + hashCode2) * 59) + (keyMgmt != null ? keyMgmt.hashCode() : 43);
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setKeyMgmt(WifiConfiguration.WifiKeyManagement wifiKeyManagement) {
        this.keyMgmt = wifiKeyManagement;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String toString() {
        return "Network(ssid=" + getSsid() + ", bssid=" + getBssid() + ", keyMgmt=" + getKeyMgmt() + ", rssi=" + getRssi() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
