package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiReportData")
@Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiReportData {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.WifiReportData");
    private ErrorInfo errorDetails;
    private String securityProtocol;
    private String ssid;
    private String wifiConnectionState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ErrorInfo errorDetails;
        protected String securityProtocol;
        protected String ssid;
        protected String wifiConnectionState;

        public WifiReportData build() {
            WifiReportData wifiReportData = new WifiReportData();
            populate(wifiReportData);
            return wifiReportData;
        }

        public void populate(WifiReportData wifiReportData) {
            wifiReportData.setSsid(this.ssid);
            wifiReportData.setSecurityProtocol(this.securityProtocol);
            wifiReportData.setWifiConnectionState(this.wifiConnectionState);
            wifiReportData.setErrorDetails(this.errorDetails);
        }

        public Builder withErrorDetails(ErrorInfo errorInfo) {
            this.errorDetails = errorInfo;
            return this;
        }

        public Builder withSecurityProtocol(String str) {
            this.securityProtocol = str;
            return this;
        }

        public Builder withSsid(String str) {
            this.ssid = str;
            return this;
        }

        public Builder withWifiConnectionState(String str) {
            this.wifiConnectionState = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiReportData)) {
            return false;
        }
        WifiReportData wifiReportData = (WifiReportData) obj;
        return Objects.equals(getSsid(), wifiReportData.getSsid()) && Objects.equals(getSecurityProtocol(), wifiReportData.getSecurityProtocol()) && Objects.equals(getWifiConnectionState(), wifiReportData.getWifiConnectionState()) && Objects.equals(getErrorDetails(), wifiReportData.getErrorDetails());
    }

    public ErrorInfo getErrorDetails() {
        return this.errorDetails;
    }

    @EnumValues({SecurityProtocol.WPA_PSK, "WEP", "OPEN", "OTHER"})
    @Required
    @Documentation("Wi-Fi security protocol.")
    public String getSecurityProtocol() {
        return this.securityProtocol;
    }

    @MaxLength(34)
    @Required
    @Sensitive
    @MinLength(1)
    public String getSsid() {
        return this.ssid;
    }

    @EnumValues({WifiConnectionState.IDLE, "DISCONNECTED", "UNAUTHENTICATED", "AUTHENTICATED", "ASSOCIATED", "FAILED"})
    @Required
    @Documentation("Wi-Fi connection state.")
    public String getWifiConnectionState() {
        return this.wifiConnectionState;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getSecurityProtocol(), getWifiConnectionState(), getErrorDetails());
    }

    public void setErrorDetails(ErrorInfo errorInfo) {
        this.errorDetails = errorInfo;
    }

    public void setSecurityProtocol(String str) {
        this.securityProtocol = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setWifiConnectionState(String str) {
        this.wifiConnectionState = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSsid(getSsid());
        builder.withSecurityProtocol(getSecurityProtocol());
        builder.withWifiConnectionState(getWifiConnectionState());
        builder.withErrorDetails(getErrorDetails());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiReportData(ssid=*** REDACTED ***, securityProtocol=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityProtocol, ", wifiConnectionState=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wifiConnectionState, ", errorDetails=", sb);
        sb.append(String.valueOf(this.errorDetails));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
