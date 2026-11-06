package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ProvisionWithPreAuthorizedCodeOutput")
@Documentation("Output structure for the \"provision with authorized code\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionWithPreAuthorizedCodeOutput extends SignedOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.ProvisionWithPreAuthorizedCodeOutput");
    private boolean canProceed;
    private long expiresInSeconds;
    private String nonce;
    private String preAuthorizedCode;
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
        if (!(obj instanceof ProvisionWithPreAuthorizedCodeOutput)) {
            return false;
        }
        ProvisionWithPreAuthorizedCodeOutput provisionWithPreAuthorizedCodeOutput = (ProvisionWithPreAuthorizedCodeOutput) obj;
        return super.equals(obj) && Objects.equals(getNonce(), provisionWithPreAuthorizedCodeOutput.getNonce()) && Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(provisionWithPreAuthorizedCodeOutput.isCanProceed())) && Objects.equals(getWaitTime(), provisionWithPreAuthorizedCodeOutput.getWaitTime()) && Objects.equals(getPreAuthorizedCode(), provisionWithPreAuthorizedCodeOutput.getPreAuthorizedCode()) && Long.valueOf(getExpiresInSeconds()).equals(Long.valueOf(provisionWithPreAuthorizedCodeOutput.getExpiresInSeconds()));
    }

    @Documentation("Duration define the amount of intervening time in a time interval.")
    public long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @Documentation("Preauthorized code to share with client what clients can use for registration.")
    @Pattern("[a-zA-Z0-9]+")
    public String getPreAuthorizedCode() {
        return this.preAuthorizedCode;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getWaitTime() {
        return this.waitTime;
    }

    @Override // com.amazon.devicesetup.common.v1.SignedOutput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNonce(), Boolean.valueOf(isCanProceed()), getWaitTime(), getPreAuthorizedCode(), Long.valueOf(getExpiresInSeconds()));
    }

    @Required
    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setExpiresInSeconds(long j) {
        this.expiresInSeconds = j;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setPreAuthorizedCode(String str) {
        this.preAuthorizedCode = str;
    }

    public void setWaitTime(String str) {
        this.waitTime = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSignature(getSignature());
        builder.withNonce(getNonce());
        builder.withCanProceed(isCanProceed());
        builder.withWaitTime(getWaitTime());
        builder.withPreAuthorizedCode(getPreAuthorizedCode());
        builder.withExpiresInSeconds(getExpiresInSeconds());
        return builder;
    }

    @Override // com.amazon.devicesetup.common.v1.SignedOutput
    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionWithPreAuthorizedCodeOutput(super=");
        sb.append(super.toString());
        sb.append(", , , , , nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", canProceed=", sb);
        sb.append(String.valueOf(this.canProceed));
        sb.append(", waitTime=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.waitTime, ", preAuthorizedCode=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.preAuthorizedCode, ", expiresInSeconds=", sb);
        sb.append(String.valueOf(this.expiresInSeconds));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends SignedOutput.Builder {
        protected boolean canProceed;
        protected long expiresInSeconds;
        protected String nonce;
        protected String preAuthorizedCode;
        protected String waitTime;

        public ProvisionWithPreAuthorizedCodeOutput build() {
            ProvisionWithPreAuthorizedCodeOutput provisionWithPreAuthorizedCodeOutput = new ProvisionWithPreAuthorizedCodeOutput();
            populate(provisionWithPreAuthorizedCodeOutput);
            return provisionWithPreAuthorizedCodeOutput;
        }

        public void populate(ProvisionWithPreAuthorizedCodeOutput provisionWithPreAuthorizedCodeOutput) {
            super.populate((SignedOutput) provisionWithPreAuthorizedCodeOutput);
            provisionWithPreAuthorizedCodeOutput.setNonce(this.nonce);
            provisionWithPreAuthorizedCodeOutput.setCanProceed(this.canProceed);
            provisionWithPreAuthorizedCodeOutput.setWaitTime(this.waitTime);
            provisionWithPreAuthorizedCodeOutput.setPreAuthorizedCode(this.preAuthorizedCode);
            provisionWithPreAuthorizedCodeOutput.setExpiresInSeconds(this.expiresInSeconds);
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withExpiresInSeconds(long j) {
            this.expiresInSeconds = j;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withPreAuthorizedCode(String str) {
            this.preAuthorizedCode = str;
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
