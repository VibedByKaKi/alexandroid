package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.DiscoveryInputParameters;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@Generated
@XmlName("SmartHomeDiscoveryInputParameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeDiscoveryInputParameters extends DiscoveryInputParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.SmartHomeDiscoveryInputParameters");
    private String protocolType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DiscoveryInputParameters.Builder {
        protected String protocolType;

        public SmartHomeDiscoveryInputParameters build() {
            SmartHomeDiscoveryInputParameters smartHomeDiscoveryInputParameters = new SmartHomeDiscoveryInputParameters();
            populate(smartHomeDiscoveryInputParameters);
            return smartHomeDiscoveryInputParameters;
        }

        public void populate(SmartHomeDiscoveryInputParameters smartHomeDiscoveryInputParameters) {
            super.populate((DiscoveryInputParameters) smartHomeDiscoveryInputParameters);
            smartHomeDiscoveryInputParameters.setProtocolType(this.protocolType);
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

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartHomeDiscoveryInputParameters) {
            return super.equals(obj) && Objects.equals(getProtocolType(), ((SmartHomeDiscoveryInputParameters) obj).getProtocolType());
        }
        return false;
    }

    @EnumValues({ProtocolType.ZIGBEE, ProtocolType.BLE, ProtocolType.BLE_MESH, ProtocolType.WIFI, "MATTER", ProtocolType.THREAD})
    public String getProtocolType() {
        return this.protocolType;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProtocolType());
    }

    public void setProtocolType(String str) {
        this.protocolType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProtocolType(getProtocolType());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeDiscoveryInputParameters(super=");
        sb.append(super.toString());
        sb.append(", protocolType=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.protocolType, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
