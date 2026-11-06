package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("FinalizeEcdheAuthenticationSessionInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class FinalizeEcdheAuthenticationSessionInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.FinalizeEcdheAuthenticationSessionInput");
    private String continuationToken;
    private ByteBuffer payload;

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
        if (!(obj instanceof FinalizeEcdheAuthenticationSessionInput)) {
            return false;
        }
        FinalizeEcdheAuthenticationSessionInput finalizeEcdheAuthenticationSessionInput = (FinalizeEcdheAuthenticationSessionInput) obj;
        return super.equals(obj) && Objects.equals(getContinuationToken(), finalizeEcdheAuthenticationSessionInput.getContinuationToken()) && Objects.equals(getPayload(), finalizeEcdheAuthenticationSessionInput.getPayload());
    }

    @MaxLength(36)
    @Required
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getContinuationToken() {
        return this.continuationToken;
    }

    @MaxLength(1048576)
    @MinLength(0)
    @Required
    public ByteBuffer getPayload() {
        return this.payload;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getContinuationToken(), getPayload());
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withContinuationToken(getContinuationToken());
        builder.withPayload(getPayload());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("FinalizeEcdheAuthenticationSessionInput(super=");
        sb.append(super.toString());
        sb.append(", , continuationToken=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.continuationToken, ", payload=", sb);
        sb.append(String.valueOf(this.payload));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String continuationToken;
        protected ByteBuffer payload;

        public FinalizeEcdheAuthenticationSessionInput build() {
            FinalizeEcdheAuthenticationSessionInput finalizeEcdheAuthenticationSessionInput = new FinalizeEcdheAuthenticationSessionInput();
            populate(finalizeEcdheAuthenticationSessionInput);
            return finalizeEcdheAuthenticationSessionInput;
        }

        public void populate(FinalizeEcdheAuthenticationSessionInput finalizeEcdheAuthenticationSessionInput) {
            super.populate((AuthenticatedInput) finalizeEcdheAuthenticationSessionInput);
            finalizeEcdheAuthenticationSessionInput.setContinuationToken(this.continuationToken);
            finalizeEcdheAuthenticationSessionInput.setPayload(this.payload);
        }

        public Builder withContinuationToken(String str) {
            this.continuationToken = str;
            return this;
        }

        public Builder withPayload(ByteBuffer byteBuffer) {
            this.payload = byteBuffer;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
