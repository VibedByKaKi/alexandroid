package com.amazon.devicesetupservice.v1;

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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ProvisionerIdentity")
@Documentation("Pseudo-provisioner-identity for the \"discovered provisionee\" internal API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionerIdentity {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ProvisionerIdentity");
    private String customerId;
    private String deviceSerial;
    private String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String customerId;
        protected String deviceSerial;
        protected String deviceType;

        public ProvisionerIdentity build() {
            ProvisionerIdentity provisionerIdentity = new ProvisionerIdentity();
            populate(provisionerIdentity);
            return provisionerIdentity;
        }

        public void populate(ProvisionerIdentity provisionerIdentity) {
            provisionerIdentity.setCustomerId(this.customerId);
            provisionerIdentity.setDeviceType(this.deviceType);
            provisionerIdentity.setDeviceSerial(this.deviceSerial);
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withDeviceSerial(String str) {
            this.deviceSerial = str;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProvisionerIdentity)) {
            return false;
        }
        ProvisionerIdentity provisionerIdentity = (ProvisionerIdentity) obj;
        return Objects.equals(getCustomerId(), provisionerIdentity.getCustomerId()) && Objects.equals(getDeviceType(), provisionerIdentity.getDeviceType()) && Objects.equals(getDeviceSerial(), provisionerIdentity.getDeviceSerial());
    }

    @MinLength(1)
    @Required
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
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
    @Required
    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId(), getDeviceType(), getDeviceSerial());
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceSerial(String str) {
        this.deviceSerial = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerId(getCustomerId());
        builder.withDeviceType(getDeviceType());
        builder.withDeviceSerial(getDeviceSerial());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionerIdentity(customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", deviceType=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, ", deviceSerial=*** REDACTED ***)", sb);
    }
}
