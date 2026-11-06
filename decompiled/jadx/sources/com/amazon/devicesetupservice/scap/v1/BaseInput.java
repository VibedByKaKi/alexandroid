package com.amazon.devicesetupservice.scap.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
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
@XmlName("BaseInput")
@Documentation("Base input structure for all APIs.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class BaseInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BaseInput");
    private String accessToken;
    private String nonce;
    private String response;
    private String sessionState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String accessToken;
        protected String nonce;
        protected String response;
        protected String sessionState;

        public void populate(BaseInput baseInput) {
            baseInput.setNonce(this.nonce);
            baseInput.setSessionState(this.sessionState);
            baseInput.setResponse(this.response);
            baseInput.setAccessToken(this.accessToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withResponse(String str) {
            this.response = str;
            return this;
        }

        public Builder withSessionState(String str) {
            this.sessionState = str;
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
        if (!(obj instanceof BaseInput)) {
            return false;
        }
        BaseInput baseInput = (BaseInput) obj;
        return Objects.equals(getNonce(), baseInput.getNonce()) && Objects.equals(getSessionState(), baseInput.getSessionState()) && Objects.equals(getResponse(), baseInput.getResponse()) && Objects.equals(getAccessToken(), baseInput.getAccessToken());
    }

    @HttpHeader("x-amz-access-token")
    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @Documentation("Temporary field to enable the caller to pre-load the desired response\n        for development testing. If present, the response object will be\n        initialized by parsing this JSON string. This field will be discarded\n        when the API is fully functional.")
    @Deprecated
    public String getResponse() {
        return this.response;
    }

    @Documentation("Temporary field to persist the DSS-side session state. It is an\n        arbitrary string returned on each call and passed back on the next one.\n        This field will be discarded when the API is fully functional.")
    @Deprecated
    public String getSessionState() {
        return this.sessionState;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionState(), getResponse(), getAccessToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setResponse(String str) {
        this.response = str;
    }

    public void setSessionState(String str) {
        this.sessionState = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionState=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionState, ", response=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.response, ", accessToken=*** REDACTED ***)", sb);
    }
}
