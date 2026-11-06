package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
import com.amazon.devicesetupservice.ProvisioneeIdentifier;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("DeviceSerialNumberIdentifier")
@Documentation("A device identifier containing DSN and DT that unlike LegacyIdentifier inherits from ProvisioneeIdentifier for use\n        in some APIs.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DeviceSerialNumberIdentifier extends ProvisioneeIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.DeviceSerialNumberIdentifier");
    private String deviceSerialNumber;
    private String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisioneeIdentifier.Builder {
        protected String deviceSerialNumber;
        protected String deviceType;

        public DeviceSerialNumberIdentifier build() {
            DeviceSerialNumberIdentifier deviceSerialNumberIdentifier = new DeviceSerialNumberIdentifier();
            populate(deviceSerialNumberIdentifier);
            return deviceSerialNumberIdentifier;
        }

        public void populate(DeviceSerialNumberIdentifier deviceSerialNumberIdentifier) {
            super.populate((ProvisioneeIdentifier) deviceSerialNumberIdentifier);
            deviceSerialNumberIdentifier.setDeviceSerialNumber(this.deviceSerialNumber);
            deviceSerialNumberIdentifier.setDeviceType(this.deviceType);
        }

        public Builder withDeviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceSerialNumberIdentifier)) {
            return false;
        }
        DeviceSerialNumberIdentifier deviceSerialNumberIdentifier = (DeviceSerialNumberIdentifier) obj;
        return super.equals(obj) && Objects.equals(getDeviceSerialNumber(), deviceSerialNumberIdentifier.getDeviceSerialNumber()) && Objects.equals(getDeviceType(), deviceSerialNumberIdentifier.getDeviceType());
    }

    @MaxLength(100)
    @Required
    @Sensitive
    @MinLength(1)
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @MaxLength(100)
    @MinLength(1)
    @Required
    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceSerialNumber(), getDeviceType());
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceSerialNumber(getDeviceSerialNumber());
        builder.withDeviceType(getDeviceType());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceSerialNumberIdentifier(super=");
        sb.append(super.toString());
        sb.append(", , deviceSerialNumber=*** REDACTED ***, deviceType=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
