package com.amazon.alexa.client.alexaservice.base.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SystemErrorEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        UNSUPPORTED_OPERATION,
        UNEXPECTED_INFORMATION_RECEIVED,
        INTERNAL_ERROR,
        NO_NETWORK_CONNECTIVITY
    }

    private static SystemErrorEvent create(ErrorType errorType, String str, String str2, boolean z, DialogRequestIdentifier dialogRequestIdentifier) {
        return new AutoValue_SystemErrorEvent(errorType, str, str2, z, dialogRequestIdentifier);
    }

    public static SystemErrorEvent createInternalError(String str, String str2) {
        return create(ErrorType.INTERNAL_ERROR, str, str2, false, DialogRequestIdentifier.NONE);
    }

    public static SystemErrorEvent createUnexpectedInformation(String str, String str2) {
        return create(ErrorType.UNEXPECTED_INFORMATION_RECEIVED, str, str2, false, DialogRequestIdentifier.NONE);
    }

    public static SystemErrorEvent createUnsupportedOperation(String str, String str2) {
        return create(ErrorType.UNSUPPORTED_OPERATION, str, str2, false, DialogRequestIdentifier.NONE);
    }

    public static SystemErrorEvent createUserFacingInternalError(String str, ErrorType errorType) {
        ErrorType errorType2 = ErrorType.NO_NETWORK_CONNECTIVITY;
        return errorType.equals(errorType2) ? create(errorType2, str, null, true, DialogRequestIdentifier.NONE) : create(ErrorType.INTERNAL_ERROR, str, null, true, DialogRequestIdentifier.NONE);
    }

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    @Nullable
    public abstract String getErrorMessage();

    public abstract ErrorType getErrorType();

    @Nullable
    public abstract String getUnparsedDirective();

    public abstract boolean isUserFacing();

    public static SystemErrorEvent createInternalError(String str) {
        return createInternalError(str, null);
    }

    public static SystemErrorEvent createUnexpectedInformation(String str) {
        return createUnexpectedInformation(null, str);
    }

    public static SystemErrorEvent createUnsupportedOperation(String str) {
        return createUnsupportedOperation(null, str);
    }

    public static SystemErrorEvent createUserFacingInternalError(String str, ErrorType errorType, DialogRequestIdentifier dialogRequestIdentifier) {
        ErrorType errorType2 = ErrorType.NO_NETWORK_CONNECTIVITY;
        if (errorType.equals(errorType2)) {
            return create(errorType2, str, null, true, dialogRequestIdentifier);
        }
        return create(ErrorType.INTERNAL_ERROR, str, null, true, dialogRequestIdentifier);
    }
}
