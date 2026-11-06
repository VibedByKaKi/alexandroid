package com.amazon.clouddrive.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RetryException extends CloudDriveException {
    private final int mHttpCode;

    public RetryException() {
        this.mHttpCode = -1;
    }

    @Override // com.amazon.clouddrive.exceptions.CloudDriveException
    public int getHttpCode() {
        return this.mHttpCode;
    }

    public RetryException(Throwable th) {
        super(th);
        this.mHttpCode = -1;
    }

    public RetryException(String str) {
        super(str);
        this.mHttpCode = -1;
    }

    public RetryException(String str, Throwable th) {
        super(str, th);
        this.mHttpCode = -1;
    }

    public RetryException(int i, String str, String str2, String str3) {
        super(str, str2, str3);
        this.mHttpCode = i;
    }
}
