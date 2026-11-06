package com.amazon.dee.app.services.network;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NetworkException extends IOException {
    private String responseBody;
    private int statusCode;

    public NetworkException(int i, String str, String str2) {
        super(str);
        this.statusCode = i;
        this.responseBody = str2;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkException{statusCode=");
        sb.append(this.statusCode);
        sb.append(", responseBody='");
        return a$$ExternalSyntheticOutline0.m(sb, this.responseBody, "'}");
    }
}
