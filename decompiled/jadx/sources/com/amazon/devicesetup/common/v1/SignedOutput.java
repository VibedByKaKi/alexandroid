package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("SignedOutput")
@Documentation("Base structure to group all signed outputs.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class SignedOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.SignedOutput");
    private String signature;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String signature;

        public void populate(SignedOutput signedOutput) {
            signedOutput.setSignature(this.signature);
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
        if (obj instanceof SignedOutput) {
            return Objects.equals(getSignature(), ((SignedOutput) obj).getSignature());
        }
        return false;
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSignature());
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.signature, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("SignedOutput(signature="));
    }
}
