package com.amazon.clouddrive.exceptions;

import com.amazon.clouddrive.model.CloudDriveResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StreamInterruptedException extends NoRetryException {
    private final CloudDriveResponse mPartialResponse;

    public StreamInterruptedException(CloudDriveResponse cloudDriveResponse) {
        this.mPartialResponse = cloudDriveResponse;
    }

    public <T extends CloudDriveResponse> T getPartialResponse(Class<T> cls) {
        return cls.cast(this.mPartialResponse);
    }

    public StreamInterruptedException(CloudDriveResponse cloudDriveResponse, Throwable th) {
        super(th);
        this.mPartialResponse = cloudDriveResponse;
    }

    public StreamInterruptedException(CloudDriveResponse cloudDriveResponse, String str) {
        super(str);
        this.mPartialResponse = cloudDriveResponse;
    }

    public StreamInterruptedException(CloudDriveResponse cloudDriveResponse, String str, Throwable th) {
        super(str, th);
        this.mPartialResponse = cloudDriveResponse;
    }

    public StreamInterruptedException(CloudDriveResponse cloudDriveResponse, String str, String str2, String str3) {
        super(str, str2, str3);
        this.mPartialResponse = cloudDriveResponse;
    }
}
