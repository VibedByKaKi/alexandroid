package com.amazon.deecomms.sharing.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SharingSDKException extends Exception {
    final String code;
    final String message;

    public SharingSDKException(String str, String str2) {
        super(str);
        this.message = str;
        this.code = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getErrorMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public SharingSDKException(String str) {
        super(str);
        this.message = str;
        this.code = str;
    }
}
