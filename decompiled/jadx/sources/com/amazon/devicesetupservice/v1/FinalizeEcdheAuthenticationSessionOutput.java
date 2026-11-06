package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("FinalizeEcdheAuthenticationSessionOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class FinalizeEcdheAuthenticationSessionOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.FinalizeEcdheAuthenticationSessionOutput");
    private String endpointToUse;
    private ByteBuffer sessionKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected ByteBuffer sessionKey;

        public FinalizeEcdheAuthenticationSessionOutput build() {
            FinalizeEcdheAuthenticationSessionOutput finalizeEcdheAuthenticationSessionOutput = new FinalizeEcdheAuthenticationSessionOutput();
            populate(finalizeEcdheAuthenticationSessionOutput);
            return finalizeEcdheAuthenticationSessionOutput;
        }

        public void populate(FinalizeEcdheAuthenticationSessionOutput finalizeEcdheAuthenticationSessionOutput) {
            finalizeEcdheAuthenticationSessionOutput.setSessionKey(this.sessionKey);
            finalizeEcdheAuthenticationSessionOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withSessionKey(ByteBuffer byteBuffer) {
            this.sessionKey = byteBuffer;
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
        if (!(obj instanceof FinalizeEcdheAuthenticationSessionOutput)) {
            return false;
        }
        FinalizeEcdheAuthenticationSessionOutput finalizeEcdheAuthenticationSessionOutput = (FinalizeEcdheAuthenticationSessionOutput) obj;
        return Objects.equals(getSessionKey(), finalizeEcdheAuthenticationSessionOutput.getSessionKey()) && Objects.equals(getEndpointToUse(), finalizeEcdheAuthenticationSessionOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @Sensitive
    public ByteBuffer getSessionKey() {
        return this.sessionKey;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSessionKey(), getEndpointToUse());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setSessionKey(ByteBuffer byteBuffer) {
        this.sessionKey = byteBuffer;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSessionKey(getSessionKey());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("FinalizeEcdheAuthenticationSessionOutput(sessionKey=*** REDACTED ***, endpointToUse="));
    }
}
