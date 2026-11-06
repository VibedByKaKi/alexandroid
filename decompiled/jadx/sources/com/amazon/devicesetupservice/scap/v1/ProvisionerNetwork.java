package com.amazon.devicesetupservice.scap.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.SecurityProtocol;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ProvisionerNetwork")
@Documentation("Provisioner network information.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionerNetwork {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ProvisionerNetwork");
    private String securityProtocol;
    private String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String securityProtocol;
        protected String ssid;

        public ProvisionerNetwork build() {
            ProvisionerNetwork provisionerNetwork = new ProvisionerNetwork();
            populate(provisionerNetwork);
            return provisionerNetwork;
        }

        public void populate(ProvisionerNetwork provisionerNetwork) {
            provisionerNetwork.setSecurityProtocol(this.securityProtocol);
            provisionerNetwork.setSsid(this.ssid);
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
        if (!(obj instanceof ProvisionerNetwork)) {
            return false;
        }
        ProvisionerNetwork provisionerNetwork = (ProvisionerNetwork) obj;
        return Objects.equals(getSecurityProtocol(), provisionerNetwork.getSecurityProtocol()) && Objects.equals(getSsid(), provisionerNetwork.getSsid());
    }

    @EnumValues({SecurityProtocol.WPA_PSK, "WEP", "OPEN", "OTHER"})
    @Documentation("Wi-Fi security protocol.")
    public String getSecurityProtocol() {
        return this.securityProtocol;
    }

    @MaxLength(34)
    @MinLength(1)
    @Sensitive
    public String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSecurityProtocol(), getSsid());
    }

    public void setSecurityProtocol(String str) {
        this.securityProtocol = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSecurityProtocol(getSecurityProtocol());
        builder.withSsid(getSsid());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.securityProtocol, ", ssid=*** REDACTED ***)", new StringBuilder("ProvisionerNetwork(securityProtocol="));
    }
}
