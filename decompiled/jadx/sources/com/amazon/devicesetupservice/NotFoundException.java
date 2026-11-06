package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.AwsErrorType;
import com.amazon.coral.annotation.AwsQueryError;
import com.amazon.coral.annotation.AwsQueryErrorType;
import com.amazon.coral.annotation.AwsSoap11Error;
import com.amazon.coral.annotation.AwsSoap12Error;
import com.amazon.coral.annotation.BsfError;
import com.amazon.coral.annotation.BsfErrorType;
import com.amazon.coral.annotation.CoralSuppressWarnings;
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
@AwsSoap11Error(code = "NotFoundException", httpCode = 500, type = AwsErrorType.Sender)
@Shape
@HttpError(httpCode = 404)
@AwsQueryError(code = "NotFoundException", httpCode = 400, type = AwsQueryErrorType.Sender)
@XmlNamespace("http://device-setup-service.amazon.com/")
@BsfError(BsfErrorType.BadArgs)
@CoralSuppressWarnings
@AwsSoap12Error(code = "NotFoundException", httpCode = 400, type = AwsErrorType.Sender)
@Generated
@XmlName("NotFoundException")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class NotFoundException extends RuntimeException {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.NotFoundException");
    private static final long serialVersionUID = -1;

    public NotFoundException(Throwable th) {
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
        if (obj instanceof NotFoundException) {
            return Objects.equals(getMessage(), ((NotFoundException) obj).getMessage());
        }
        return false;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getMessage());
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMessage(getMessage());
        builder.withCause(getCause());
        return builder;
    }

    public NotFoundException() {
    }

    public NotFoundException(String str) {
        super(str);
    }

    public NotFoundException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        private Throwable cause;
        protected String message;

        public NotFoundException build() {
            NotFoundException notFoundException = new NotFoundException(this.message, this.cause);
            populate(notFoundException);
            return notFoundException;
        }

        public Builder withCause(Throwable th) {
            this.cause = th;
            return this;
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public void populate(NotFoundException notFoundException) {
        }
    }
}
