package com.amazon.alexa.matter.service.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chip.devicecontroller.ChipDeviceControllerException;
import com.amazon.alexa.matter.eventbus.schema.ErrorCause;
import com.amazon.alexa.matter.eventbus.schema.ErrorStatusCode;
import com.amazon.alexa.matter.eventbus.schema.MatterSDKError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class RequestHandlingException extends Exception {

    @Nullable
    private final ErrorCause mErrorCause;

    @NonNull
    private final ErrorStatusCode mStatusCode;

    public RequestHandlingException(@Nullable String str, @NonNull ChipDeviceControllerException chipDeviceControllerException) {
        this(ErrorStatusCode.MATTER_ERROR, getCause(chipDeviceControllerException), str, chipDeviceControllerException);
    }

    @NonNull
    private static ErrorCause getCause(@NonNull ChipDeviceControllerException chipDeviceControllerException) {
        MatterSDKError matterSDKError = new MatterSDKError();
        matterSDKError.setCode(chipDeviceControllerException.errorCode);
        matterSDKError.setMessage(chipDeviceControllerException.getMessage());
        ErrorCause errorCause = new ErrorCause();
        errorCause.setMatterSDKError(matterSDKError);
        return errorCause;
    }

    @Nullable
    public ErrorCause getErrorCause() {
        return this.mErrorCause;
    }

    @NonNull
    public ErrorStatusCode getStatusCode() {
        return this.mStatusCode;
    }

    public RequestHandlingException(@NonNull ErrorStatusCode errorStatusCode, @Nullable ErrorCause errorCause, @Nullable String str) {
        super(str);
        this.mErrorCause = errorCause;
        this.mStatusCode = errorStatusCode;
    }

    public RequestHandlingException(@NonNull ErrorStatusCode errorStatusCode, @Nullable String str, @Nullable Throwable th) {
        this(errorStatusCode, null, str, th);
    }

    public RequestHandlingException(@NonNull ErrorStatusCode errorStatusCode, @Nullable ErrorCause errorCause, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.mErrorCause = errorCause;
        this.mStatusCode = errorStatusCode;
    }

    public RequestHandlingException(@NonNull ErrorStatusCode errorStatusCode, @Nullable String str) {
        this(errorStatusCode, (ErrorCause) null, str);
    }
}
