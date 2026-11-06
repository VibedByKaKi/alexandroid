package com.amazon.alexa.logupload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class LogUploadException extends Exception {
    public static final int CODE_BAD_HTTP_RESPONSE = 2;
    public static final int CODE_NETWORK_CALL = 1;
    private int exceptionCode;
    private int exceptionSubCode;

    public LogUploadException(Exception exc) {
        super(exc);
    }

    public int getExceptionCode() {
        return this.exceptionCode;
    }

    public int getExceptionSubCode() {
        return this.exceptionSubCode;
    }

    public void setExceptionCode(int i) {
        this.exceptionCode = i;
    }

    public void setExceptionSubCode(int i) {
        this.exceptionSubCode = i;
    }

    public LogUploadException(String str) {
        super(str);
    }

    public LogUploadException(String str, Exception exc) {
        super(str, exc);
    }
}
