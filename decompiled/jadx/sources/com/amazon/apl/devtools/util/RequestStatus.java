package com.amazon.apl.devtools.util;

import com.amazon.apl.devtools.enums.DTError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RequestStatus {
    private final String mCustomErrorMessage;
    private final DTError mError;
    private final int mId;
    private final ExecutionStatus mStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ExecutionStatus {
        SUCCESSFUL,
        FAILED
    }

    private RequestStatus(ExecutionStatus executionStatus, int i, DTError dTError, String str) {
        this.mStatus = executionStatus;
        this.mId = i;
        this.mError = dTError;
        this.mCustomErrorMessage = str.isEmpty() ? dTError.getErrorMsg() : str;
    }

    public static RequestStatus failed(int i, DTError dTError) {
        return new RequestStatus(ExecutionStatus.FAILED, i, dTError);
    }

    public static RequestStatus successful() {
        return new RequestStatus(ExecutionStatus.SUCCESSFUL);
    }

    public DTError getError() {
        return this.mError;
    }

    public String getErrorMessage() {
        return this.mCustomErrorMessage;
    }

    public ExecutionStatus getExecutionStatus() {
        return this.mStatus;
    }

    public int getId() {
        return this.mId;
    }

    public static RequestStatus failed(int i, DTError dTError, String str) {
        return new RequestStatus(ExecutionStatus.FAILED, i, dTError, str);
    }

    private RequestStatus(ExecutionStatus executionStatus, int i, DTError dTError) {
        this(executionStatus, i, dTError, "");
    }

    private RequestStatus(ExecutionStatus executionStatus) {
        this(executionStatus, 0, DTError.UNKNOWN_ERROR);
    }
}
