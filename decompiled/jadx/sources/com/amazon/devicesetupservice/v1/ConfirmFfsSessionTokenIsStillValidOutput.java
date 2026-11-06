package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("ConfirmFfsSessionTokenIsStillValidOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ConfirmFfsSessionTokenIsStillValidOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ConfirmFfsSessionTokenIsStillValidOutput");
    private String customerId;
    private String publicKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String customerId;
        protected String publicKey;

        public ConfirmFfsSessionTokenIsStillValidOutput build() {
            ConfirmFfsSessionTokenIsStillValidOutput confirmFfsSessionTokenIsStillValidOutput = new ConfirmFfsSessionTokenIsStillValidOutput();
            populate(confirmFfsSessionTokenIsStillValidOutput);
            return confirmFfsSessionTokenIsStillValidOutput;
        }

        public void populate(ConfirmFfsSessionTokenIsStillValidOutput confirmFfsSessionTokenIsStillValidOutput) {
            confirmFfsSessionTokenIsStillValidOutput.setCustomerId(this.customerId);
            confirmFfsSessionTokenIsStillValidOutput.setPublicKey(this.publicKey);
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withPublicKey(String str) {
            this.publicKey = str;
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
        if (!(obj instanceof ConfirmFfsSessionTokenIsStillValidOutput)) {
            return false;
        }
        ConfirmFfsSessionTokenIsStillValidOutput confirmFfsSessionTokenIsStillValidOutput = (ConfirmFfsSessionTokenIsStillValidOutput) obj;
        return Objects.equals(getCustomerId(), confirmFfsSessionTokenIsStillValidOutput.getCustomerId()) && Objects.equals(getPublicKey(), confirmFfsSessionTokenIsStillValidOutput.getPublicKey());
    }

    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    @MaxLength(4096)
    @MinLength(1)
    public String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId(), getPublicKey());
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerId(getCustomerId());
        builder.withPublicKey(getPublicKey());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfirmFfsSessionTokenIsStillValidOutput(customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", publicKey=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.publicKey, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
