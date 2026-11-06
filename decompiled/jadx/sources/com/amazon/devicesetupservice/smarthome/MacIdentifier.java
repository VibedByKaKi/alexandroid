package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
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
@XmlName("MacIdentifier")
@Documentation("A flexible structure for passing associated MAC addresses for a given device")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class MacIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.MacIdentifier");
    private String macAddress;
    private String protocolType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String macAddress;
        protected String protocolType;

        public MacIdentifier build() {
            MacIdentifier macIdentifier = new MacIdentifier();
            populate(macIdentifier);
            return macIdentifier;
        }

        public void populate(MacIdentifier macIdentifier) {
            macIdentifier.setProtocolType(this.protocolType);
            macIdentifier.setMacAddress(this.macAddress);
        }

        public Builder withMacAddress(String str) {
            this.macAddress = str;
            return this;
        }

        public Builder withProtocolType(String str) {
            this.protocolType = str;
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
        if (!(obj instanceof MacIdentifier)) {
            return false;
        }
        MacIdentifier macIdentifier = (MacIdentifier) obj;
        return Objects.equals(getProtocolType(), macIdentifier.getProtocolType()) && Objects.equals(getMacAddress(), macIdentifier.getMacAddress());
    }

    @MinLength(17)
    @Documentation("MAC address in MM:MM:MM:SS:SS:SS format")
    @Pattern("([0-9A-Fa-f]{2}[:]){5,}([0-9A-Fa-f]{2})")
    public String getMacAddress() {
        return this.macAddress;
    }

    @EnumValues({ProtocolType.ZIGBEE, ProtocolType.BLE, ProtocolType.BLE_MESH, ProtocolType.WIFI, "MATTER", ProtocolType.THREAD})
    public String getProtocolType() {
        return this.protocolType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProtocolType(), getMacAddress());
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setProtocolType(String str) {
        this.protocolType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProtocolType(getProtocolType());
        builder.withMacAddress(getMacAddress());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MacIdentifier(protocolType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.protocolType, ", macAddress=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.macAddress, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
