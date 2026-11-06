package com.amazon.devicesetup.common.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@XmlName("AccessPoint")
@Documentation("Structure holds Access Point BSSID and SSID")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class AccessPoint {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.AccessPoint");
    private String bssid;
    private String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String bssid;
        protected String ssid;

        public AccessPoint build() {
            AccessPoint accessPoint = new AccessPoint();
            populate(accessPoint);
            return accessPoint;
        }

        public void populate(AccessPoint accessPoint) {
            accessPoint.setBssid(this.bssid);
            accessPoint.setSsid(this.ssid);
        }

        public Builder withBssid(String str) {
            this.bssid = str;
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
        if (!(obj instanceof AccessPoint)) {
            return false;
        }
        AccessPoint accessPoint = (AccessPoint) obj;
        return Objects.equals(getBssid(), accessPoint.getBssid()) && Objects.equals(getSsid(), accessPoint.getSsid());
    }

    @Required
    @Documentation("Device MAC Address, supporting both 48 bit and 64 bit mac addresses for IPv6 devices")
    @Pattern("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$|^([0-9A-Fa-f]{2}:){7}([0-9A-Fa-f]{2})$")
    public String getBssid() {
        return this.bssid;
    }

    @MaxLength(34)
    @Required
    @Sensitive
    @MinLength(1)
    public String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getBssid(), getSsid());
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withBssid(getBssid());
        builder.withSsid(getSsid());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.bssid, ", ssid=*** REDACTED ***)", new StringBuilder("AccessPoint(bssid="));
    }
}
