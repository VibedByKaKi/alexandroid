package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.ProvisioneeDetails;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@Generated
@XmlName("SmartHomeProvisioneeDetails")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeProvisioneeDetails extends ProvisioneeDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails");
    private String mac;
    private int rssi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisioneeDetails.Builder {
        protected String mac;
        protected int rssi;

        public SmartHomeProvisioneeDetails build() {
            SmartHomeProvisioneeDetails smartHomeProvisioneeDetails = new SmartHomeProvisioneeDetails();
            populate(smartHomeProvisioneeDetails);
            return smartHomeProvisioneeDetails;
        }

        public void populate(SmartHomeProvisioneeDetails smartHomeProvisioneeDetails) {
            super.populate((ProvisioneeDetails) smartHomeProvisioneeDetails);
            smartHomeProvisioneeDetails.setMac(this.mac);
            smartHomeProvisioneeDetails.setRssi(this.rssi);
        }

        public Builder withMac(String str) {
            this.mac = str;
            return this;
        }

        public Builder withRssi(int i) {
            this.rssi = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartHomeProvisioneeDetails)) {
            return false;
        }
        SmartHomeProvisioneeDetails smartHomeProvisioneeDetails = (SmartHomeProvisioneeDetails) obj;
        return super.equals(obj) && Objects.equals(getMac(), smartHomeProvisioneeDetails.getMac()) && Integer.valueOf(getRssi()).equals(Integer.valueOf(smartHomeProvisioneeDetails.getRssi()));
    }

    @Documentation("Device MAC Address, supporting both 48 bit and 64 bit mac addresses for IPv6 devices")
    @Pattern("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$|^([0-9A-Fa-f]{2}:){7}([0-9A-Fa-f]{2})$")
    public String getMac() {
        return this.mac;
    }

    public int getRssi() {
        return this.rssi;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getMac(), Integer.valueOf(getRssi()));
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMac(getMac());
        builder.withRssi(getRssi());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeProvisioneeDetails(super=");
        sb.append(super.toString());
        sb.append(", , mac=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.mac, ", rssi=", sb);
        sb.append(String.valueOf(this.rssi));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
