package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
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
import com.amazon.devicesetup.common.v1.SignedOutput;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ComputeConfigurationOutput")
@Documentation("Output structure for the \"compute configuration data\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ComputeConfigurationOutput extends SignedOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.ComputeConfigurationOutput");
    private boolean canProceed;
    private Map<String, String> configuration;
    private String nextProvisioningState;
    private String nonce;
    private String reason;
    private String sessionId;
    private String waitTime;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetup.common.v1.SignedOutput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputeConfigurationOutput)) {
            return false;
        }
        ComputeConfigurationOutput computeConfigurationOutput = (ComputeConfigurationOutput) obj;
        return super.equals(obj) && Objects.equals(getNonce(), computeConfigurationOutput.getNonce()) && Objects.equals(getSessionId(), computeConfigurationOutput.getSessionId()) && Objects.equals(getConfiguration(), computeConfigurationOutput.getConfiguration()) && Objects.equals(getNextProvisioningState(), computeConfigurationOutput.getNextProvisioningState()) && Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(computeConfigurationOutput.isCanProceed())) && Objects.equals(getWaitTime(), computeConfigurationOutput.getWaitTime()) && Objects.equals(getReason(), computeConfigurationOutput.getReason());
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    @Documentation("Configuration list for \"compute configuration data\" API.")
    public Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @EnumValues({ProvisioningState.NOT_PROVISIONED, "DISCOVERED", ProvisioningState.START_PROVISIONING, ProvisioningState.START_PIN_BASED_SETUP, ProvisioningState.POST_WIFI_SCAN_DATA, ProvisioningState.GET_WIFI_LIST, ProvisioningState.COMPUTE_CONFIGURATION, ProvisioningState.CONNECTING_TO_USER_NETWORK, ProvisioningState.CONNECTED_TO_USER_NETWORK, "TOKEN_REDEEMED", "DONE"})
    @Documentation("Provisioning state for authenticated provisionee.")
    public String getNextProvisioningState() {
        return this.nextProvisioningState;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @Documentation("Non-localized, developer-facing string.")
    public String getReason() {
        return this.reason;
    }

    @MaxLength(255)
    @Required
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getSessionId() {
        return this.sessionId;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getWaitTime() {
        return this.waitTime;
    }

    @Override // com.amazon.devicesetup.common.v1.SignedOutput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getConfiguration(), getNextProvisioningState(), Boolean.valueOf(isCanProceed()), getWaitTime(), getReason());
    }

    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setConfiguration(Map<String, String> map) {
        this.configuration = map;
    }

    public void setNextProvisioningState(String str) {
        this.nextProvisioningState = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setWaitTime(String str) {
        this.waitTime = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSignature(getSignature());
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withConfiguration(getConfiguration());
        builder.withNextProvisioningState(getNextProvisioningState());
        builder.withCanProceed(isCanProceed());
        builder.withWaitTime(getWaitTime());
        builder.withReason(getReason());
        return builder;
    }

    @Override // com.amazon.devicesetup.common.v1.SignedOutput
    public String toString() {
        StringBuilder sb = new StringBuilder("ComputeConfigurationOutput(super=");
        sb.append(super.toString());
        sb.append(", , , , , , , nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", configuration=", sb);
        sb.append(String.valueOf(this.configuration));
        sb.append(", nextProvisioningState=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nextProvisioningState, ", canProceed=", sb);
        sb.append(String.valueOf(this.canProceed));
        sb.append(", waitTime=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.waitTime, ", reason=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.reason, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends SignedOutput.Builder {
        protected boolean canProceed;
        protected Map<String, String> configuration;
        protected String nextProvisioningState;
        protected String nonce;
        protected String reason;
        protected String sessionId;
        protected String waitTime;

        public ComputeConfigurationOutput build() {
            ComputeConfigurationOutput computeConfigurationOutput = new ComputeConfigurationOutput();
            populate(computeConfigurationOutput);
            return computeConfigurationOutput;
        }

        public void populate(ComputeConfigurationOutput computeConfigurationOutput) {
            super.populate((SignedOutput) computeConfigurationOutput);
            computeConfigurationOutput.setNonce(this.nonce);
            computeConfigurationOutput.setSessionId(this.sessionId);
            computeConfigurationOutput.setConfiguration(this.configuration);
            computeConfigurationOutput.setNextProvisioningState(this.nextProvisioningState);
            computeConfigurationOutput.setCanProceed(this.canProceed);
            computeConfigurationOutput.setWaitTime(this.waitTime);
            computeConfigurationOutput.setReason(this.reason);
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withConfiguration(Map<String, String> map) {
            this.configuration = map;
            return this;
        }

        public Builder withNextProvisioningState(String str) {
            this.nextProvisioningState = str;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withReason(String str) {
            this.reason = str;
            return this;
        }

        public Builder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder withWaitTime(String str) {
            this.waitTime = str;
            return this;
        }

        @Override // com.amazon.devicesetup.common.v1.SignedOutput.Builder
        public Builder withSignature(String str) {
            super.withSignature(str);
            return this;
        }
    }
}
