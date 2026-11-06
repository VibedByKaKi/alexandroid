package com.amazon.clouddrive.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TooManyRequests extends NoRetryException {
    private static final int TOO_MANY_REQUEST_CODE = 429;
    private static final long serialVersionUID = -1;

    public TooManyRequests(String str, String str2, String str3) {
        super(429, str, str2, str3);
    }

    @Override // com.amazon.clouddrive.exceptions.NoRetryException, com.amazon.clouddrive.exceptions.CloudDriveException
    public int getHttpCode() {
        return 429;
    }

    public TooManyRequests(Throwable th) {
        super(th);
    }

    public TooManyRequests(String str) {
        super(str);
    }

    public TooManyRequests(String str, Throwable th) {
        super(str, th);
    }

    public TooManyRequests() {
    }
}
