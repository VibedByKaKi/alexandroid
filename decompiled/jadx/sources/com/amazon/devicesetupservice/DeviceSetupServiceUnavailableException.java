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
import com.amazon.coral.annotation.Fault;
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
@AwsSoap11Error(code = "DeviceSetupServiceUnavailableException", httpCode = 500, type = AwsErrorType.Receiver)
@Shape
@HttpError(httpCode = 503)
@Fault
@Generated
@XmlName("DeviceSetupServiceUnavailableException")
@Documentation("Thrown in cases where we may need to temporarily forbid a provisioner from provisioning a device for various reasons")
@AwsQueryError(code = "DeviceSetupServiceUnavailableException", httpCode = 500, type = AwsQueryErrorType.Receiver)
@XmlNamespace("http://device-setup-service.amazon.com/")
@BsfError(BsfErrorType.ServiceFailure)
@CoralSuppressWarnings
@AwsSoap12Error(code = "DeviceSetupServiceUnavailableException", httpCode = 500, type = AwsErrorType.Receiver)
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DeviceSetupServiceUnavailableException extends RuntimeException {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.DeviceSetupServiceUnavailableException");
    private static final long serialVersionUID = -1;

    public DeviceSetupServiceUnavailableException(Throwable th) {
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
        if (obj instanceof DeviceSetupServiceUnavailableException) {
            return Objects.equals(getMessage(), ((DeviceSetupServiceUnavailableException) obj).getMessage());
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

    public DeviceSetupServiceUnavailableException() {
    }

    public DeviceSetupServiceUnavailableException(String str) {
        super(str);
    }

    public DeviceSetupServiceUnavailableException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        private Throwable cause;
        protected String message;

        public DeviceSetupServiceUnavailableException build() {
            DeviceSetupServiceUnavailableException deviceSetupServiceUnavailableException = new DeviceSetupServiceUnavailableException(this.message, this.cause);
            populate(deviceSetupServiceUnavailableException);
            return deviceSetupServiceUnavailableException;
        }

        public Builder withCause(Throwable th) {
            this.cause = th;
            return this;
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public void populate(DeviceSetupServiceUnavailableException deviceSetupServiceUnavailableException) {
        }
    }
}
