package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ComputeConfigurationInput")
@Documentation("Input structure for the \"compute configuration data\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ComputeConfigurationInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.ComputeConfigurationInput");
    private Map<String, String> configuration;
    private DeviceDetails deviceDetails;
    private String nonce;
    private String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Map<String, String> configuration;
        protected DeviceDetails deviceDetails;
        protected String nonce;
        protected String sessionId;

        public ComputeConfigurationInput build() {
            ComputeConfigurationInput computeConfigurationInput = new ComputeConfigurationInput();
            populate(computeConfigurationInput);
            return computeConfigurationInput;
        }

        public void populate(ComputeConfigurationInput computeConfigurationInput) {
            computeConfigurationInput.setNonce(this.nonce);
            computeConfigurationInput.setSessionId(this.sessionId);
            computeConfigurationInput.setDeviceDetails(this.deviceDetails);
            computeConfigurationInput.setConfiguration(this.configuration);
        }

        public Builder withConfiguration(Map<String, String> map) {
            this.configuration = map;
            return this;
        }

        public Builder withDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withSessionId(String str) {
            this.sessionId = str;
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
        if (!(obj instanceof ComputeConfigurationInput)) {
            return false;
        }
        ComputeConfigurationInput computeConfigurationInput = (ComputeConfigurationInput) obj;
        return Objects.equals(getNonce(), computeConfigurationInput.getNonce()) && Objects.equals(getSessionId(), computeConfigurationInput.getSessionId()) && Objects.equals(getDeviceDetails(), computeConfigurationInput.getDeviceDetails()) && Objects.equals(getConfiguration(), computeConfigurationInput.getConfiguration());
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    @Documentation("Configuration list for \"compute configuration data\" API.")
    public Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @Documentation("Device identifiers.")
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @MaxLength(255)
    @Required
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getDeviceDetails(), getConfiguration());
    }

    public void setConfiguration(Map<String, String> map) {
        this.configuration = map;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withConfiguration(getConfiguration());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComputeConfigurationInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", configuration=");
        sb.append(String.valueOf(this.configuration));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
