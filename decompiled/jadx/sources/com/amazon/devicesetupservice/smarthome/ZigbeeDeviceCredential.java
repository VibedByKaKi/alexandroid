package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("ZigbeeDeviceCredential")
@Documentation("A structure to hold the Zigbee Credential information: Mac Address and Install Code")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ZigbeeDeviceCredential {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.ZigbeeDeviceCredential");
    private String installCode;
    private String macAddress;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String installCode;
        protected String macAddress;

        public ZigbeeDeviceCredential build() {
            ZigbeeDeviceCredential zigbeeDeviceCredential = new ZigbeeDeviceCredential();
            populate(zigbeeDeviceCredential);
            return zigbeeDeviceCredential;
        }

        public void populate(ZigbeeDeviceCredential zigbeeDeviceCredential) {
            zigbeeDeviceCredential.setMacAddress(this.macAddress);
            zigbeeDeviceCredential.setInstallCode(this.installCode);
        }

        public Builder withInstallCode(String str) {
            this.installCode = str;
            return this;
        }

        public Builder withMacAddress(String str) {
            this.macAddress = str;
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
        if (!(obj instanceof ZigbeeDeviceCredential)) {
            return false;
        }
        ZigbeeDeviceCredential zigbeeDeviceCredential = (ZigbeeDeviceCredential) obj;
        return Objects.equals(getMacAddress(), zigbeeDeviceCredential.getMacAddress()) && Objects.equals(getInstallCode(), zigbeeDeviceCredential.getInstallCode());
    }

    @Documentation("A Zigbee Install Code, used for authenticated bonding")
    public String getInstallCode() {
        return this.installCode;
    }

    @MinLength(17)
    @Documentation("MAC address in MM:MM:MM:SS:SS:SS format")
    @Pattern("([0-9A-Fa-f]{2}[:]){5,}([0-9A-Fa-f]{2})")
    public String getMacAddress() {
        return this.macAddress;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getMacAddress(), getInstallCode());
    }

    public void setInstallCode(String str) {
        this.installCode = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMacAddress(getMacAddress());
        builder.withInstallCode(getInstallCode());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZigbeeDeviceCredential(macAddress=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.macAddress, ", installCode=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.installCode, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
