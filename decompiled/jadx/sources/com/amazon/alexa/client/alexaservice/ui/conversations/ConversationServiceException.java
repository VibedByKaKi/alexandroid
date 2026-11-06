package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.annotations.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ConversationServiceException extends IOException {
    private final int errorCode;
    private final String errorMsg;
    private final ErrorType errorType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        HTTP_ERROR,
        NO_NETWORK_CONNECTIVITY,
        TIMEOUT,
        CONTENT_ERROR
    }

    public ConversationServiceException(@NonNull String str, int i, @NonNull ErrorType errorType) {
        super(str);
        this.errorCode = i;
        this.errorMsg = str;
        this.errorType = errorType;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public ConversationServiceException(String str, int i) {
        this(str, i, ErrorType.HTTP_ERROR);
    }

    public ConversationServiceException(@NonNull String str, @NonNull ErrorType errorType) {
        this(str, 0, errorType);
    }
}
