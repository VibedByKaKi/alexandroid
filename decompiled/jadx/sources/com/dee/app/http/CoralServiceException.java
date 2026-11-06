package com.dee.app.http;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CoralServiceException extends Exception {
    private String responseBody;
    private int statusCode;

    public CoralServiceException(String str, int i) {
        super(str);
        this.statusCode = i;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public CoralServiceException(String str) {
        super(str);
    }

    public CoralServiceException() {
    }

    public CoralServiceException(String str, Throwable th) {
        super(str, th);
    }

    public CoralServiceException(Throwable th) {
        super(th);
    }

    public CoralServiceException(String str, int i, String str2) {
        this(str, i);
        this.responseBody = str2;
    }
}
