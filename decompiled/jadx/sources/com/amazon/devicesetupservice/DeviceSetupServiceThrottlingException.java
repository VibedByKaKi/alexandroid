package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.AwsErrorType;
import com.amazon.coral.annotation.AwsQueryError;
import com.amazon.coral.annotation.AwsQueryErrorType;
import com.amazon.coral.annotation.AwsSoap11Error;
import com.amazon.coral.annotation.AwsSoap12Error;
import com.amazon.coral.annotation.BsfError;
import com.amazon.coral.annotation.BsfErrorType;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpError;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AwsSoap11Error(code = "DeviceSetupServiceThrottlingException", httpCode = 500, type = AwsErrorType.Sender)
@Shape
@HttpError(httpCode = 429)
@AwsQueryError(code = "DeviceSetupServiceThrottlingException", httpCode = 400, type = AwsQueryErrorType.Sender)
@XmlNamespace("http://device-setup-service.amazon.com/")
@BsfError(BsfErrorType.BadArgs)
@CoralSuppressWarnings
@AwsSoap12Error(code = "DeviceSetupServiceThrottlingException", httpCode = 400, type = AwsErrorType.Sender)
@Generated
@XmlName("DeviceSetupServiceThrottlingException")
@Documentation("For DSS coral throttling. With 429 httpresponsecode and Retry-After header. Retry-After value is in seconds.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DeviceSetupServiceThrottlingException extends DeviceSetupServiceUnavailableException {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.DeviceSetupServiceThrottlingException");
    private static final long serialVersionUID = -1;
    private int retryAfterInSeconds;

    public DeviceSetupServiceThrottlingException(Throwable th) {
        initCause(th);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSetupServiceThrottlingException) {
            return super.equals(obj) && Integer.valueOf(getRetryAfterInSeconds()).equals(Integer.valueOf(((DeviceSetupServiceThrottlingException) obj).getRetryAfterInSeconds()));
        }
        return false;
    }

    @HttpHeader("Retry-After")
    public int getRetryAfterInSeconds() {
        return this.retryAfterInSeconds;
    }

    @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), Integer.valueOf(getRetryAfterInSeconds()));
    }

    public void setRetryAfterInSeconds(int i) {
        this.retryAfterInSeconds = i;
    }

    @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMessage(getMessage());
        builder.withRetryAfterInSeconds(getRetryAfterInSeconds());
        builder.withCause(getCause());
        return builder;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceSetupServiceUnavailableException.Builder {
        private Throwable cause;
        protected int retryAfterInSeconds;

        @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException.Builder
        public DeviceSetupServiceThrottlingException build() {
            DeviceSetupServiceThrottlingException deviceSetupServiceThrottlingException = new DeviceSetupServiceThrottlingException(this.message, this.cause);
            populate(deviceSetupServiceThrottlingException);
            return deviceSetupServiceThrottlingException;
        }

        public void populate(DeviceSetupServiceThrottlingException deviceSetupServiceThrottlingException) {
            super.populate((DeviceSetupServiceUnavailableException) deviceSetupServiceThrottlingException);
            deviceSetupServiceThrottlingException.setRetryAfterInSeconds(this.retryAfterInSeconds);
        }

        public Builder withRetryAfterInSeconds(int i) {
            this.retryAfterInSeconds = i;
            return this;
        }

        @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException.Builder
        public Builder withCause(Throwable th) {
            this.cause = th;
            return this;
        }

        @Override // com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException.Builder
        public Builder withMessage(String str) {
            super.withMessage(str);
            return this;
        }
    }

    public DeviceSetupServiceThrottlingException() {
    }

    public DeviceSetupServiceThrottlingException(String str) {
        super(str);
    }

    public DeviceSetupServiceThrottlingException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
