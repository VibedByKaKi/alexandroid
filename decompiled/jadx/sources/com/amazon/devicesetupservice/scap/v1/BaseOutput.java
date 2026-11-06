package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BaseOutput")
@Documentation("Base output structure for all APIs.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class BaseOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BaseOutput");
    private String nonce;
    private String sessionId;
    private String sessionState;
    private String signature;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String nonce;
        protected String sessionId;
        protected String sessionState;
        protected String signature;

        public void populate(BaseOutput baseOutput) {
            baseOutput.setNonce(this.nonce);
            baseOutput.setSignature(this.signature);
            baseOutput.setSessionId(this.sessionId);
            baseOutput.setSessionState(this.sessionState);
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder withSessionState(String str) {
            this.sessionState = str;
            return this;
        }

        public Builder withSignature(String str) {
            this.signature = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOutput)) {
            return false;
        }
        BaseOutput baseOutput = (BaseOutput) obj;
        return Objects.equals(getNonce(), baseOutput.getNonce()) && Objects.equals(getSignature(), baseOutput.getSignature()) && Objects.equals(getSessionId(), baseOutput.getSessionId()) && Objects.equals(getSessionState(), baseOutput.getSessionState());
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @MaxLength(255)
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getSessionId() {
        return this.sessionId;
    }

    @Documentation("Temporary field to persist the DSS-side session state. It is an\n        arbitrary string returned on each call and passed back on the next one.\n        This field will be discarded when the API is fully functional.")
    @Deprecated
    public String getSessionState() {
        return this.sessionState;
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSignature(), getSessionId(), getSessionState());
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSessionState(String str) {
        this.sessionState = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseOutput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", signature=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.signature, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", sessionState=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sessionState, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
