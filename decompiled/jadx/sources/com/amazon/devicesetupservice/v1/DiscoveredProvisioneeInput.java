package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.DiscoveryInputParameters;
import com.amazon.devicesetupservice.ProvisioneeDetails;
import com.amazon.devicesetupservice.ProvisionerDetails;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("DiscoveredProvisioneeInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DiscoveredProvisioneeInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.DiscoveredProvisioneeInput");
    private String accessToken;
    private DiscoveryInputParameters discoveryInputParameters;
    private ProvisioneeDetails provisioneeDetails;
    private ProvisionerDetails provisionerDetails;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected DiscoveryInputParameters discoveryInputParameters;
        protected ProvisioneeDetails provisioneeDetails;
        protected ProvisionerDetails provisionerDetails;

        public DiscoveredProvisioneeInput build() {
            DiscoveredProvisioneeInput discoveredProvisioneeInput = new DiscoveredProvisioneeInput();
            populate(discoveredProvisioneeInput);
            return discoveredProvisioneeInput;
        }

        public void populate(DiscoveredProvisioneeInput discoveredProvisioneeInput) {
            discoveredProvisioneeInput.setProvisionerDetails(this.provisionerDetails);
            discoveredProvisioneeInput.setProvisioneeDetails(this.provisioneeDetails);
            discoveredProvisioneeInput.setDiscoveryInputParameters(this.discoveryInputParameters);
            discoveredProvisioneeInput.setAccessToken(this.accessToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withDiscoveryInputParameters(DiscoveryInputParameters discoveryInputParameters) {
            this.discoveryInputParameters = discoveryInputParameters;
            return this;
        }

        public Builder withProvisioneeDetails(ProvisioneeDetails provisioneeDetails) {
            this.provisioneeDetails = provisioneeDetails;
            return this;
        }

        public Builder withProvisionerDetails(ProvisionerDetails provisionerDetails) {
            this.provisionerDetails = provisionerDetails;
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
        if (!(obj instanceof DiscoveredProvisioneeInput)) {
            return false;
        }
        DiscoveredProvisioneeInput discoveredProvisioneeInput = (DiscoveredProvisioneeInput) obj;
        return Objects.equals(getProvisionerDetails(), discoveredProvisioneeInput.getProvisionerDetails()) && Objects.equals(getProvisioneeDetails(), discoveredProvisioneeInput.getProvisioneeDetails()) && Objects.equals(getDiscoveryInputParameters(), discoveredProvisioneeInput.getDiscoveryInputParameters()) && Objects.equals(getAccessToken(), discoveredProvisioneeInput.getAccessToken());
    }

    @HttpHeader("x-amz-access-token")
    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    @Documentation("This is the base structure for the types of workflows and their input settings that we can have in FFS.")
    public DiscoveryInputParameters getDiscoveryInputParameters() {
        return this.discoveryInputParameters;
    }

    @Documentation("This is the base structure for the types of provisionees that can be FFS'd.")
    public ProvisioneeDetails getProvisioneeDetails() {
        return this.provisioneeDetails;
    }

    @Documentation("This is the base structure for the types of provisioners that can perform FFS.")
    public ProvisionerDetails getProvisionerDetails() {
        return this.provisionerDetails;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProvisionerDetails(), getProvisioneeDetails(), getDiscoveryInputParameters(), getAccessToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDiscoveryInputParameters(DiscoveryInputParameters discoveryInputParameters) {
        this.discoveryInputParameters = discoveryInputParameters;
    }

    public void setProvisioneeDetails(ProvisioneeDetails provisioneeDetails) {
        this.provisioneeDetails = provisioneeDetails;
    }

    public void setProvisionerDetails(ProvisionerDetails provisionerDetails) {
        this.provisionerDetails = provisionerDetails;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProvisionerDetails(getProvisionerDetails());
        builder.withProvisioneeDetails(getProvisioneeDetails());
        builder.withDiscoveryInputParameters(getDiscoveryInputParameters());
        builder.withAccessToken(getAccessToken());
        return builder;
    }

    public String toString() {
        return "DiscoveredProvisioneeInput(provisionerDetails=" + String.valueOf(this.provisionerDetails) + ", provisioneeDetails=" + String.valueOf(this.provisioneeDetails) + ", discoveryInputParameters=" + String.valueOf(this.discoveryInputParameters) + ", accessToken=*** REDACTED ***)";
    }
}
