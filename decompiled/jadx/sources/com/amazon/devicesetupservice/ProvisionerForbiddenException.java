package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.AwsErrorType;
import com.amazon.coral.annotation.AwsQueryError;
import com.amazon.coral.annotation.AwsQueryErrorType;
import com.amazon.coral.annotation.AwsSoap11Error;
import com.amazon.coral.annotation.AwsSoap12Error;
import com.amazon.coral.annotation.BsfError;
import com.amazon.coral.annotation.BsfErrorType;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpError;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AwsSoap11Error(code = "ProvisionerForbiddenException", httpCode = 500, type = AwsErrorType.Sender)
@Shape
@HttpError(httpCode = 403)
@AwsQueryError(code = "ProvisionerForbiddenException", httpCode = 400, type = AwsQueryErrorType.Sender)
@XmlNamespace("http://device-setup-service.amazon.com/")
@BsfError(BsfErrorType.BadArgs)
@CoralSuppressWarnings
@AwsSoap12Error(code = "ProvisionerForbiddenException", httpCode = 400, type = AwsErrorType.Sender)
@Generated
@XmlName("ProvisionerForbiddenException")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionerForbiddenException extends RuntimeException {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.ProvisionerForbiddenException");
    private static final long serialVersionUID = -1;
    private String forbiddenCause;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        private Throwable cause;
        protected String forbiddenCause;
        protected String message;

        public ProvisionerForbiddenException build() {
            ProvisionerForbiddenException provisionerForbiddenException = new ProvisionerForbiddenException(this.message, this.cause);
            populate(provisionerForbiddenException);
            return provisionerForbiddenException;
        }

        public void populate(ProvisionerForbiddenException provisionerForbiddenException) {
            provisionerForbiddenException.setForbiddenCause(this.forbiddenCause);
        }

        public Builder withCause(Throwable th) {
            this.cause = th;
            return this;
        }

        public Builder withForbiddenCause(String str) {
            this.forbiddenCause = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public ProvisionerForbiddenException(Throwable th) {
        initCause(th);
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
        if (!(obj instanceof ProvisionerForbiddenException)) {
            return false;
        }
        ProvisionerForbiddenException provisionerForbiddenException = (ProvisionerForbiddenException) obj;
        return Objects.equals(getMessage(), provisionerForbiddenException.getMessage()) && Objects.equals(getForbiddenCause(), provisionerForbiddenException.getForbiddenCause());
    }

    @EnumValues({ForbiddenCause.NO_ASSOCIATION_EXISTS, ForbiddenCause.NO_REGISTERED_CUSTOMER, ForbiddenCause.NOT_WHITELISTED_INTERNAL_ACCOUNT, ForbiddenCause.AUTHENTICATED_SETUP_NOT_SUPPORTED, ForbiddenCause.UNSUPPORTED_ASSOCIATION, ForbiddenCause.INVALID_PROVISIONER, ForbiddenCause.NOT_ASSOCIATED_TO_CUSTOMER, ForbiddenCause.INVALID_DHA_SIGNATURE, ForbiddenCause.SIDEWALK_PROVISIONER_CUSTOMER_OPTED_OUT, ForbiddenCause.UNSUPPORTED_PROVISIONEE_FOR_ANONYMOUS_PROVISIONING, ForbiddenCause.UNSUPPORTED_PROVISIONEE_FOR_MULTI_PARTY_PROVISIONING, ForbiddenCause.ANONYMOUS_PROVISIONING_BLOCKED_PROVISIONER, ForbiddenCause.ANONYMOUS_PROVISIONING_BLOCKED_PROVISIONEE, ForbiddenCause.ANONYMOUS_PROVISIONING_BLOCKED_REGION, "OTHER", ForbiddenCause.CBP_INGESTION_SKIPPED_NO_AUTHMATERIAL, ForbiddenCause.LTS_NOT_ALLOWED_FOR_MATTER_CUSTOMER, ForbiddenCause.UNEXPECTED_ELIGIBILITY_ACTION_FROM_DSES, ForbiddenCause.UNEXPECTED_ROTATING_ID_RESOLUTION_STATE})
    public String getForbiddenCause() {
        return this.forbiddenCause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getMessage(), getForbiddenCause());
    }

    public void setForbiddenCause(String str) {
        this.forbiddenCause = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMessage(getMessage());
        builder.withForbiddenCause(getForbiddenCause());
        builder.withCause(getCause());
        return builder;
    }

    public ProvisionerForbiddenException() {
    }

    public ProvisionerForbiddenException(String str) {
        super(str);
    }

    public ProvisionerForbiddenException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
