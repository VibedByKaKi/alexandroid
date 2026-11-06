package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@Generated
@XmlName("ErrorInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ErrorInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.ErrorInfo");
    private String cause;
    private String code;
    private String details;
    private String operation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String cause;
        protected String code;
        protected String details;
        protected String operation;

        public ErrorInfo build() {
            ErrorInfo errorInfo = new ErrorInfo();
            populate(errorInfo);
            return errorInfo;
        }

        public void populate(ErrorInfo errorInfo) {
            errorInfo.setOperation(this.operation);
            errorInfo.setCause(this.cause);
            errorInfo.setDetails(this.details);
            errorInfo.setCode(this.code);
        }

        public Builder withCause(String str) {
            this.cause = str;
            return this;
        }

        public Builder withCode(String str) {
            this.code = str;
            return this;
        }

        public Builder withDetails(String str) {
            this.details = str;
            return this;
        }

        public Builder withOperation(String str) {
            this.operation = str;
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
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return Objects.equals(getOperation(), errorInfo.getOperation()) && Objects.equals(getCause(), errorInfo.getCause()) && Objects.equals(getDetails(), errorInfo.getDetails()) && Objects.equals(getCode(), errorInfo.getCode());
    }

    @MaxLength(200)
    @MinLength(1)
    @Required
    public String getCause() {
        return this.cause;
    }

    @MaxLength(50)
    @MinLength(7)
    public String getCode() {
        return this.code;
    }

    @MaxLength(10240)
    @MinLength(0)
    public String getDetails() {
        return this.details;
    }

    @MaxLength(200)
    @MinLength(1)
    @Required
    public String getOperation() {
        return this.operation;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getOperation(), getCause(), getDetails(), getCode());
    }

    public void setCause(String str) {
        this.cause = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setDetails(String str) {
        this.details = str;
    }

    public void setOperation(String str) {
        this.operation = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withOperation(getOperation());
        builder.withCause(getCause());
        builder.withDetails(getDetails());
        builder.withCode(getCode());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorInfo(operation=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.operation, ", cause=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.cause, ", details=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.details, ", code=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.code, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
