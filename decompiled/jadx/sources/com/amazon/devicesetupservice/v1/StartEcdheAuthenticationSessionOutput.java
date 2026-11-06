package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
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
@XmlName("StartEcdheAuthenticationSessionOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class StartEcdheAuthenticationSessionOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.StartEcdheAuthenticationSessionOutput");
    private String continuationToken;
    private String ecdhePublicKey;
    private String ecdsaSignature;
    private String endpointToUse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String continuationToken;
        protected String ecdhePublicKey;
        protected String ecdsaSignature;
        protected String endpointToUse;

        public StartEcdheAuthenticationSessionOutput build() {
            StartEcdheAuthenticationSessionOutput startEcdheAuthenticationSessionOutput = new StartEcdheAuthenticationSessionOutput();
            populate(startEcdheAuthenticationSessionOutput);
            return startEcdheAuthenticationSessionOutput;
        }

        public void populate(StartEcdheAuthenticationSessionOutput startEcdheAuthenticationSessionOutput) {
            startEcdheAuthenticationSessionOutput.setContinuationToken(this.continuationToken);
            startEcdheAuthenticationSessionOutput.setEcdhePublicKey(this.ecdhePublicKey);
            startEcdheAuthenticationSessionOutput.setEcdsaSignature(this.ecdsaSignature);
            startEcdheAuthenticationSessionOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withContinuationToken(String str) {
            this.continuationToken = str;
            return this;
        }

        public Builder withEcdhePublicKey(String str) {
            this.ecdhePublicKey = str;
            return this;
        }

        public Builder withEcdsaSignature(String str) {
            this.ecdsaSignature = str;
            return this;
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
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
        if (!(obj instanceof StartEcdheAuthenticationSessionOutput)) {
            return false;
        }
        StartEcdheAuthenticationSessionOutput startEcdheAuthenticationSessionOutput = (StartEcdheAuthenticationSessionOutput) obj;
        return Objects.equals(getContinuationToken(), startEcdheAuthenticationSessionOutput.getContinuationToken()) && Objects.equals(getEcdhePublicKey(), startEcdheAuthenticationSessionOutput.getEcdhePublicKey()) && Objects.equals(getEcdsaSignature(), startEcdheAuthenticationSessionOutput.getEcdsaSignature()) && Objects.equals(getEndpointToUse(), startEcdheAuthenticationSessionOutput.getEndpointToUse());
    }

    @MaxLength(36)
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getContinuationToken() {
        return this.continuationToken;
    }

    @MaxLength(4096)
    @MinLength(1)
    public String getEcdhePublicKey() {
        return this.ecdhePublicKey;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getEcdsaSignature() {
        return this.ecdsaSignature;
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getContinuationToken(), getEcdhePublicKey(), getEcdsaSignature(), getEndpointToUse());
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setEcdhePublicKey(String str) {
        this.ecdhePublicKey = str;
    }

    public void setEcdsaSignature(String str) {
        this.ecdsaSignature = str;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withContinuationToken(getContinuationToken());
        builder.withEcdhePublicKey(getEcdhePublicKey());
        builder.withEcdsaSignature(getEcdsaSignature());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartEcdheAuthenticationSessionOutput(continuationToken=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.continuationToken, ", ecdhePublicKey=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.ecdhePublicKey, ", ecdsaSignature=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.ecdsaSignature, ", endpointToUse=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
