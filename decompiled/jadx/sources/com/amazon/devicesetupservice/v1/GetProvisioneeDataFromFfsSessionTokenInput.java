package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
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
@XmlName("GetProvisioneeDataFromFfsSessionTokenInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetProvisioneeDataFromFfsSessionTokenInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetProvisioneeDataFromFfsSessionTokenInput");
    private DeviceAuthInfo provisioneeAuthInfo;
    private String signature;
    private ByteBuffer signedPayload;
    private String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected DeviceAuthInfo provisioneeAuthInfo;
        protected String signature;
        protected ByteBuffer signedPayload;
        protected String token;

        public GetProvisioneeDataFromFfsSessionTokenInput build() {
            GetProvisioneeDataFromFfsSessionTokenInput getProvisioneeDataFromFfsSessionTokenInput = new GetProvisioneeDataFromFfsSessionTokenInput();
            populate(getProvisioneeDataFromFfsSessionTokenInput);
            return getProvisioneeDataFromFfsSessionTokenInput;
        }

        public void populate(GetProvisioneeDataFromFfsSessionTokenInput getProvisioneeDataFromFfsSessionTokenInput) {
            getProvisioneeDataFromFfsSessionTokenInput.setToken(this.token);
            getProvisioneeDataFromFfsSessionTokenInput.setSignedPayload(this.signedPayload);
            getProvisioneeDataFromFfsSessionTokenInput.setSignature(this.signature);
            getProvisioneeDataFromFfsSessionTokenInput.setProvisioneeAuthInfo(this.provisioneeAuthInfo);
        }

        public Builder withProvisioneeAuthInfo(DeviceAuthInfo deviceAuthInfo) {
            this.provisioneeAuthInfo = deviceAuthInfo;
            return this;
        }

        public Builder withSignature(String str) {
            this.signature = str;
            return this;
        }

        public Builder withSignedPayload(ByteBuffer byteBuffer) {
            this.signedPayload = byteBuffer;
            return this;
        }

        public Builder withToken(String str) {
            this.token = str;
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
        if (!(obj instanceof GetProvisioneeDataFromFfsSessionTokenInput)) {
            return false;
        }
        GetProvisioneeDataFromFfsSessionTokenInput getProvisioneeDataFromFfsSessionTokenInput = (GetProvisioneeDataFromFfsSessionTokenInput) obj;
        return Objects.equals(getToken(), getProvisioneeDataFromFfsSessionTokenInput.getToken()) && Objects.equals(getSignedPayload(), getProvisioneeDataFromFfsSessionTokenInput.getSignedPayload()) && Objects.equals(getSignature(), getProvisioneeDataFromFfsSessionTokenInput.getSignature()) && Objects.equals(getProvisioneeAuthInfo(), getProvisioneeDataFromFfsSessionTokenInput.getProvisioneeAuthInfo());
    }

    public DeviceAuthInfo getProvisioneeAuthInfo() {
        return this.provisioneeAuthInfo;
    }

    @MaxLength(2048)
    @Required
    @MinLength(1)
    @Documentation("Signature validating a payload. This will be Base64 encoded string.\n        Signature length varies based on what kind of key was used to compute\n        the signature.")
    public String getSignature() {
        return this.signature;
    }

    @MaxLength(1048576)
    @MinLength(0)
    @Required
    public ByteBuffer getSignedPayload() {
        return this.signedPayload;
    }

    @MaxLength(255)
    @Required
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getToken(), getSignedPayload(), getSignature(), getProvisioneeAuthInfo());
    }

    public void setProvisioneeAuthInfo(DeviceAuthInfo deviceAuthInfo) {
        this.provisioneeAuthInfo = deviceAuthInfo;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignedPayload(ByteBuffer byteBuffer) {
        this.signedPayload = byteBuffer;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withToken(getToken());
        builder.withSignedPayload(getSignedPayload());
        builder.withSignature(getSignature());
        builder.withProvisioneeAuthInfo(getProvisioneeAuthInfo());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetProvisioneeDataFromFfsSessionTokenInput(token=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.token, ", signedPayload=", sb);
        sb.append(String.valueOf(this.signedPayload));
        sb.append(", signature=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.signature, ", provisioneeAuthInfo=", sb);
        sb.append(String.valueOf(this.provisioneeAuthInfo));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
