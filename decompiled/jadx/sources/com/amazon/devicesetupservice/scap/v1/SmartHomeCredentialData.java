package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.smarthome.SmartHomeCredential;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("SmartHomeCredentialData")
@Documentation("Encapsulates data needed to set credentials in the provisioner.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeCredentialData {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.SmartHomeCredentialData");
    private BleEntryData bleEntryData;
    private String timestamp;
    private SmartHomeCredential zigbeeCredential;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected BleEntryData bleEntryData;
        protected String timestamp;
        protected SmartHomeCredential zigbeeCredential;

        public SmartHomeCredentialData build() {
            SmartHomeCredentialData smartHomeCredentialData = new SmartHomeCredentialData();
            populate(smartHomeCredentialData);
            return smartHomeCredentialData;
        }

        public void populate(SmartHomeCredentialData smartHomeCredentialData) {
            smartHomeCredentialData.setZigbeeCredential(this.zigbeeCredential);
            smartHomeCredentialData.setBleEntryData(this.bleEntryData);
            smartHomeCredentialData.setTimestamp(this.timestamp);
        }

        public Builder withBleEntryData(BleEntryData bleEntryData) {
            this.bleEntryData = bleEntryData;
            return this;
        }

        public Builder withTimestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public Builder withZigbeeCredential(SmartHomeCredential smartHomeCredential) {
            this.zigbeeCredential = smartHomeCredential;
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
        if (!(obj instanceof SmartHomeCredentialData)) {
            return false;
        }
        SmartHomeCredentialData smartHomeCredentialData = (SmartHomeCredentialData) obj;
        return Objects.equals(getZigbeeCredential(), smartHomeCredentialData.getZigbeeCredential()) && Objects.equals(getBleEntryData(), smartHomeCredentialData.getBleEntryData()) && Objects.equals(getTimestamp(), smartHomeCredentialData.getTimestamp());
    }

    @Documentation("BLE entry data")
    public BleEntryData getBleEntryData() {
        return this.bleEntryData;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    @Documentation("A structure to hold the Auth Material Id and Auth Material Data.")
    public SmartHomeCredential getZigbeeCredential() {
        return this.zigbeeCredential;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getZigbeeCredential(), getBleEntryData(), getTimestamp());
    }

    public void setBleEntryData(BleEntryData bleEntryData) {
        this.bleEntryData = bleEntryData;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setZigbeeCredential(SmartHomeCredential smartHomeCredential) {
        this.zigbeeCredential = smartHomeCredential;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withZigbeeCredential(getZigbeeCredential());
        builder.withBleEntryData(getBleEntryData());
        builder.withTimestamp(getTimestamp());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeCredentialData(zigbeeCredential=");
        sb.append(String.valueOf(this.zigbeeCredential));
        sb.append(", bleEntryData=");
        sb.append(String.valueOf(this.bleEntryData));
        sb.append(", timestamp=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.timestamp, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
