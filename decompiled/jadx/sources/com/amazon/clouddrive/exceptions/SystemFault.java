package com.amazon.clouddrive.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemFault extends RetryException {
    private static final long serialVersionUID = -1;

    public SystemFault(String str, String str2, String str3) {
        super(500, str, str2, str3);
    }

    @Override // com.amazon.clouddrive.exceptions.RetryException, com.amazon.clouddrive.exceptions.CloudDriveException
    public int getHttpCode() {
        return 500;
    }

    public SystemFault(Throwable th) {
        super(th);
    }

    public SystemFault(String str) {
        super(str);
    }

    public SystemFault(String str, Throwable th) {
        super(str, th);
    }

    public SystemFault() {
    }
}
