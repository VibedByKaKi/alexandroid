package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.exceptions.BadToken;
import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.clouddrive.exceptions.ConflictError;
import com.amazon.clouddrive.exceptions.Forbidden;
import com.amazon.clouddrive.exceptions.InvalidParameter;
import com.amazon.clouddrive.exceptions.NoRetryException;
import com.amazon.clouddrive.exceptions.PreConditionFailure;
import com.amazon.clouddrive.exceptions.ResourceNotFound;
import com.amazon.clouddrive.exceptions.RetryException;
import com.amazon.clouddrive.exceptions.SystemFault;
import com.amazon.clouddrive.exceptions.SystemUnavailable;
import com.amazon.clouddrive.exceptions.TooManyRequests;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveExceptionBuilder {
    public static final int TOO_MANY_REQUEST_CODE = 429;
    private String mLogRef;
    private String mMessage;
    private String mNodeId;
    private final int mResponseCode;
    private String mServerErrorCode;
    private String mTimestamp;

    public CloudDriveExceptionBuilder(int i) {
        this.mResponseCode = i;
    }

    public CloudDriveException build() {
        int i = this.mResponseCode;
        return i != 400 ? i != 401 ? i != 403 ? i != 404 ? i != 409 ? i != 412 ? i != 429 ? i != 500 ? i != 503 ? (i < 500 || i >= 600) ? new NoRetryException(this.mResponseCode, this.mMessage, this.mServerErrorCode, this.mLogRef) : new RetryException(this.mResponseCode, this.mMessage, this.mServerErrorCode, this.mLogRef) : new SystemUnavailable(this.mMessage, this.mServerErrorCode, this.mLogRef) : new SystemFault(this.mMessage, this.mServerErrorCode, this.mLogRef) : new TooManyRequests(this.mMessage, this.mServerErrorCode, this.mLogRef) : new PreConditionFailure(this.mMessage, this.mServerErrorCode, this.mLogRef) : new ConflictError(this.mMessage, this.mServerErrorCode, this.mLogRef, this.mNodeId) : new ResourceNotFound(this.mMessage, this.mServerErrorCode, this.mLogRef) : new Forbidden(this.mMessage, this.mServerErrorCode, this.mLogRef) : new BadToken(this.mMessage, this.mServerErrorCode, this.mLogRef) : new InvalidParameter(this.mMessage, this.mServerErrorCode, this.mLogRef);
    }

    public CloudDriveExceptionBuilder withConflictNodeId(String str) {
        this.mNodeId = str;
        return this;
    }

    public CloudDriveExceptionBuilder withLogRef(String str) {
        this.mLogRef = str;
        return this;
    }

    public CloudDriveExceptionBuilder withMessage(String str) {
        this.mMessage = str;
        return this;
    }

    public CloudDriveExceptionBuilder withServerErrorCode(String str) {
        this.mServerErrorCode = str;
        return this;
    }

    public CloudDriveExceptionBuilder withTimestamp(String str) {
        this.mTimestamp = str;
        return this;
    }
}
