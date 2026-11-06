package com.amazon.devicesetupservice.wss1p;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wss1p/")
@CoralSuppressWarnings
@Generated
@XmlName("DiscoveredDevice")
@Documentation("Structure holds discovered device's mac, rssi and encodedSsid")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DiscoveredDevice {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wss1p.DiscoveredDevice");
    private String encodedSsid;
    private String macAddress;
    private int rssi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String encodedSsid;
        protected String macAddress;
        protected int rssi;

        public DiscoveredDevice build() {
            DiscoveredDevice discoveredDevice = new DiscoveredDevice();
            populate(discoveredDevice);
            return discoveredDevice;
        }

        public void populate(DiscoveredDevice discoveredDevice) {
            discoveredDevice.setMacAddress(this.macAddress);
            discoveredDevice.setEncodedSsid(this.encodedSsid);
            discoveredDevice.setRssi(this.rssi);
        }

        public Builder withEncodedSsid(String str) {
            this.encodedSsid = str;
            return this;
        }

        public Builder withMacAddress(String str) {
            this.macAddress = str;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredDevice)) {
            return false;
        }
        DiscoveredDevice discoveredDevice = (DiscoveredDevice) obj;
        return Objects.equals(getMacAddress(), discoveredDevice.getMacAddress()) && Objects.equals(getEncodedSsid(), discoveredDevice.getEncodedSsid()) && Integer.valueOf(getRssi()).equals(Integer.valueOf(discoveredDevice.getRssi()));
    }

    @MaxLength(34)
    @Required
    @Sensitive
    @MinLength(1)
    public String getEncodedSsid() {
        return this.encodedSsid;
    }

    @Required
    @Documentation("Device MAC Address, supporting both 48 bit and 64 bit mac addresses for IPv6 devices")
    @Pattern("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$|^([0-9A-Fa-f]{2}:){7}([0-9A-Fa-f]{2})$")
    public String getMacAddress() {
        return this.macAddress;
    }

    @Required
    public int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getMacAddress(), getEncodedSsid(), Integer.valueOf(getRssi()));
    }

    public void setEncodedSsid(String str) {
        this.encodedSsid = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMacAddress(getMacAddress());
        builder.withEncodedSsid(getEncodedSsid());
        builder.withRssi(getRssi());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiscoveredDevice(macAddress=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.macAddress, ", encodedSsid=*** REDACTED ***, rssi=", sb);
        sb.append(String.valueOf(this.rssi));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
