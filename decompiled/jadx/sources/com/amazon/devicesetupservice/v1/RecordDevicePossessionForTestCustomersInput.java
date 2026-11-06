package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
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
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("RecordDevicePossessionForTestCustomersInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordDevicePossessionForTestCustomersInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.RecordDevicePossessionForTestCustomersInput");
    private String deviceSerial;
    private String deviceType;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDevicePossessionForTestCustomersInput)) {
            return false;
        }
        RecordDevicePossessionForTestCustomersInput recordDevicePossessionForTestCustomersInput = (RecordDevicePossessionForTestCustomersInput) obj;
        return super.equals(obj) && Objects.equals(getDeviceSerial(), recordDevicePossessionForTestCustomersInput.getDeviceSerial()) && Objects.equals(getDeviceType(), recordDevicePossessionForTestCustomersInput.getDeviceType());
    }

    @MaxLength(100)
    @Required
    @Sensitive
    @MinLength(1)
    public String getDeviceSerial() {
        return this.deviceSerial;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceSerial(), getDeviceType());
    }

    public void setDeviceSerial(String str) {
        this.deviceSerial = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withDeviceSerial(getDeviceSerial());
        builder.withDeviceType(getDeviceType());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordDevicePossessionForTestCustomersInput(super=");
        sb.append(super.toString());
        sb.append(", , deviceSerial=*** REDACTED ***, deviceType=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String deviceSerial;
        protected String deviceType;

        public RecordDevicePossessionForTestCustomersInput build() {
            RecordDevicePossessionForTestCustomersInput recordDevicePossessionForTestCustomersInput = new RecordDevicePossessionForTestCustomersInput();
            populate(recordDevicePossessionForTestCustomersInput);
            return recordDevicePossessionForTestCustomersInput;
        }

        public void populate(RecordDevicePossessionForTestCustomersInput recordDevicePossessionForTestCustomersInput) {
            super.populate((AuthenticatedInput) recordDevicePossessionForTestCustomersInput);
            recordDevicePossessionForTestCustomersInput.setDeviceSerial(this.deviceSerial);
            recordDevicePossessionForTestCustomersInput.setDeviceType(this.deviceType);
        }

        public Builder withDeviceSerial(String str) {
            this.deviceSerial = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
