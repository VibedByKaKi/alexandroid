package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MapKeyConstraint;
import com.amazon.coral.annotation.MapValueConstraint;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ComputeConfigurationDataOutput")
@Documentation("Output structure for the \"compute configuration data\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ComputeConfigurationDataOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ComputeConfigurationDataOutput");
    private Map<String, String> configuration;
    private String endpointToUse;
    private String nonce;
    private RegistrationDetails registrationDetails;
    private String signature;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Map<String, String> configuration;
        protected String endpointToUse;
        protected String nonce;
        protected RegistrationDetails registrationDetails;
        protected String signature;

        public ComputeConfigurationDataOutput build() {
            ComputeConfigurationDataOutput computeConfigurationDataOutput = new ComputeConfigurationDataOutput();
            populate(computeConfigurationDataOutput);
            return computeConfigurationDataOutput;
        }

        public void populate(ComputeConfigurationDataOutput computeConfigurationDataOutput) {
            computeConfigurationDataOutput.setNonce(this.nonce);
            computeConfigurationDataOutput.setConfiguration(this.configuration);
            computeConfigurationDataOutput.setSignature(this.signature);
            computeConfigurationDataOutput.setRegistrationDetails(this.registrationDetails);
            computeConfigurationDataOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withConfiguration(Map<String, String> map) {
            this.configuration = map;
            return this;
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withRegistrationDetails(RegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }

        public Builder withSignature(String str) {
            this.signature = str;
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
        if (!(obj instanceof ComputeConfigurationDataOutput)) {
            return false;
        }
        ComputeConfigurationDataOutput computeConfigurationDataOutput = (ComputeConfigurationDataOutput) obj;
        return Objects.equals(getNonce(), computeConfigurationDataOutput.getNonce()) && Objects.equals(getConfiguration(), computeConfigurationDataOutput.getConfiguration()) && Objects.equals(getSignature(), computeConfigurationDataOutput.getSignature()) && Objects.equals(getRegistrationDetails(), computeConfigurationDataOutput.getRegistrationDetails()) && Objects.equals(getEndpointToUse(), computeConfigurationDataOutput.getEndpointToUse());
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    @Documentation("Configuration list for \"compute configuration data\" API.")
    public Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    public RegistrationDetails getRegistrationDetails() {
        return this.registrationDetails;
    }

    @MaxLength(2048)
    @Required
    @MinLength(1)
    @Documentation("Signature validating a payload. This will be Base64 encoded string.\n        Signature length varies based on what kind of key was used to compute\n        the signature.")
    @HttpHeader("x-amzn-dss-signature")
    public String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getConfiguration(), getSignature(), getRegistrationDetails(), getEndpointToUse());
    }

    public void setConfiguration(Map<String, String> map) {
        this.configuration = map;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setRegistrationDetails(RegistrationDetails registrationDetails) {
        this.registrationDetails = registrationDetails;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withConfiguration(getConfiguration());
        builder.withSignature(getSignature());
        builder.withRegistrationDetails(getRegistrationDetails());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComputeConfigurationDataOutput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", configuration=", sb);
        sb.append(String.valueOf(this.configuration));
        sb.append(", signature=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.signature, ", registrationDetails=", sb);
        sb.append(String.valueOf(this.registrationDetails));
        sb.append(", endpointToUse=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
