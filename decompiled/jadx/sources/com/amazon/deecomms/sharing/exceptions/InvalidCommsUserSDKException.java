package com.amazon.deecomms.sharing.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class InvalidCommsUserSDKException extends SharingSDKException {
    static final String CODE = "2012";
    final String reason;

    public InvalidCommsUserSDKException(String str) {
        super(str);
        this.reason = str;
    }

    @Override // com.amazon.deecomms.sharing.exceptions.SharingSDKException
    public String getCode() {
        return CODE;
    }

    @Override // com.amazon.deecomms.sharing.exceptions.SharingSDKException
    public String getErrorMessage() {
        return this.reason;
    }

    @Override // com.amazon.deecomms.sharing.exceptions.SharingSDKException, java.lang.Throwable
    public String getMessage() {
        return CODE;
    }
}
