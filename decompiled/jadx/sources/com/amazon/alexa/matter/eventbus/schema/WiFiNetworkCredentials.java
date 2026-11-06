package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WiFiNetworkCredentials {
    private String password;
    private String ssid;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetworkCredentials() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof WiFiNetworkCredentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WiFiNetworkCredentials)) {
            return false;
        }
        WiFiNetworkCredentials wiFiNetworkCredentials = (WiFiNetworkCredentials) obj;
        if (!wiFiNetworkCredentials.canEqual(this)) {
            return false;
        }
        String password = getPassword();
        String password2 = wiFiNetworkCredentials.getPassword();
        if (password != null ? !password.equals(password2) : password2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wiFiNetworkCredentials.getSsid();
        return ssid != null ? ssid.equals(ssid2) : ssid2 == null;
    }

    @JsonProperty("password")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPassword() {
        return this.password;
    }

    @JsonProperty("ssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSsid() {
        return this.ssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String password = getPassword();
        int hashCode = password == null ? 43 : password.hashCode();
        String ssid = getSsid();
        return ((hashCode + 59) * 59) + (ssid != null ? ssid.hashCode() : 43);
    }

    @JsonProperty("password")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setPassword(String str) {
        this.password = str;
    }

    @JsonProperty("ssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSsid(String str) {
        this.ssid = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WiFiNetworkCredentials(password=" + getPassword() + ", ssid=" + getSsid() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
