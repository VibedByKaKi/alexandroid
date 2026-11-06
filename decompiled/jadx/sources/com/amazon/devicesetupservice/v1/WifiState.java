package com.amazon.devicesetupservice.v1;

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
import com.amazon.devicesetup.common.v1.SecurityProtocol;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiState")
@Documentation("Wi-Fi state structure for the \"report\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiState {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.WifiState");
    private String connectionState;
    private String securityProtocol;
    private String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String connectionState;
        protected String securityProtocol;
        protected String ssid;

        public WifiState build() {
            WifiState wifiState = new WifiState();
            populate(wifiState);
            return wifiState;
        }

        public void populate(WifiState wifiState) {
            wifiState.setSsid(this.ssid);
            wifiState.setSecurityProtocol(this.securityProtocol);
            wifiState.setConnectionState(this.connectionState);
        }

        public Builder withConnectionState(String str) {
            this.connectionState = str;
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
        if (!(obj instanceof WifiState)) {
            return false;
        }
        WifiState wifiState = (WifiState) obj;
        return Objects.equals(getSsid(), wifiState.getSsid()) && Objects.equals(getSecurityProtocol(), wifiState.getSecurityProtocol()) && Objects.equals(getConnectionState(), wifiState.getConnectionState());
    }

    @EnumValues({WifiConnectionState.IDLE, "DISCONNECTED", "UNAUTHENTICATED", "AUTHENTICATED", "ASSOCIATED", "FAILED"})
    @Required
    @Documentation("Wi-Fi connection state.")
    public String getConnectionState() {
        return this.connectionState;
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

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getSecurityProtocol(), getConnectionState());
    }

    public void setConnectionState(String str) {
        this.connectionState = str;
    }

    public void setSecurityProtocol(String str) {
        this.securityProtocol = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSsid(getSsid());
        builder.withSecurityProtocol(getSecurityProtocol());
        builder.withConnectionState(getConnectionState());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiState(ssid=*** REDACTED ***, securityProtocol=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityProtocol, ", connectionState=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.connectionState, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
