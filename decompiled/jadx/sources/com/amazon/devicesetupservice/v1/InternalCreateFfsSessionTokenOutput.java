package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("InternalCreateFfsSessionTokenOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalCreateFfsSessionTokenOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalCreateFfsSessionTokenOutput");
    private String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String token;

        public InternalCreateFfsSessionTokenOutput build() {
            InternalCreateFfsSessionTokenOutput internalCreateFfsSessionTokenOutput = new InternalCreateFfsSessionTokenOutput();
            populate(internalCreateFfsSessionTokenOutput);
            return internalCreateFfsSessionTokenOutput;
        }

        public void populate(InternalCreateFfsSessionTokenOutput internalCreateFfsSessionTokenOutput) {
            internalCreateFfsSessionTokenOutput.setToken(this.token);
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
        if (obj instanceof InternalCreateFfsSessionTokenOutput) {
            return Objects.equals(getToken(), ((InternalCreateFfsSessionTokenOutput) obj).getToken());
        }
        return false;
    }

    @MaxLength(255)
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getToken());
    }

    public void setToken(String str) {
        this.token = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withToken(getToken());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.token, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("InternalCreateFfsSessionTokenOutput(token="));
    }
}
