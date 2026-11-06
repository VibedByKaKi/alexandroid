package com.amazon.whisperjoin.softap.pojos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class WifiConfiguration {

    @SerializedName("key")
    private String key;

    @SerializedName("keyMgmt")
    private WifiKeyManagement keyMgmt;

    @SerializedName("ssid")
    private String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WifiConfigurationBuilder {
        private String key;
        private WifiKeyManagement keyMgmt;
        private String ssid;

        public WifiConfiguration build() {
            return new WifiConfiguration(this.ssid, this.keyMgmt, this.key);
        }

        public WifiConfigurationBuilder key(String str) {
            this.key = str;
            return this;
        }

        public WifiConfigurationBuilder keyMgmt(WifiKeyManagement wifiKeyManagement) {
            this.keyMgmt = wifiKeyManagement;
            return this;
        }

        public WifiConfigurationBuilder ssid(String str) {
            this.ssid = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WifiConfiguration.WifiConfigurationBuilder(ssid=");
            sb.append(this.ssid);
            sb.append(", keyMgmt=");
            sb.append(this.keyMgmt);
            sb.append(", key=");
            return a$$ExternalSyntheticOutline0.m(sb, this.key, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WifiKeyManagement {
        NONE,
        WPA_PSK,
        WEP,
        OTHER
    }

    public WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, String str2) {
        this.ssid = str;
        this.keyMgmt = wifiKeyManagement;
        this.key = str2;
    }

    public static WifiConfigurationBuilder builder() {
        return new WifiConfigurationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfiguration)) {
            return false;
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) obj;
        if (!wifiConfiguration.canEqual(this)) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiConfiguration.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        WifiKeyManagement keyMgmt = getKeyMgmt();
        WifiKeyManagement keyMgmt2 = wifiConfiguration.getKeyMgmt();
        if (keyMgmt != null ? !keyMgmt.equals(keyMgmt2) : keyMgmt2 != null) {
            return false;
        }
        String key = getKey();
        String key2 = wifiConfiguration.getKey();
        return key != null ? key.equals(key2) : key2 == null;
    }

    public String getKey() {
        return this.key;
    }

    public WifiKeyManagement getKeyMgmt() {
        return this.keyMgmt;
    }

    public String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        String ssid = getSsid();
        int hashCode = ssid == null ? 43 : ssid.hashCode();
        WifiKeyManagement keyMgmt = getKeyMgmt();
        int i = (hashCode + 59) * 59;
        int hashCode2 = keyMgmt == null ? 43 : keyMgmt.hashCode();
        String key = getKey();
        return ((i + hashCode2) * 59) + (key != null ? key.hashCode() : 43);
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setKeyMgmt(WifiKeyManagement wifiKeyManagement) {
        this.keyMgmt = wifiKeyManagement;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String toString() {
        return "WifiConfiguration(ssid=" + getSsid() + ", keyMgmt=" + getKeyMgmt() + ", key=" + getKey() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
