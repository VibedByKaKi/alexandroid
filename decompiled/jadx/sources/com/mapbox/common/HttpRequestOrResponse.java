package com.mapbox.common;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HttpRequestOrResponse {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        HTTP_REQUEST,
        HTTP_RESPONSE
    }

    public HttpRequestOrResponse(@NonNull HttpRequest httpRequest) {
        this.type = Type.HTTP_REQUEST;
        this.value = httpRequest;
    }

    public static HttpRequestOrResponse valueOf(@NonNull HttpRequest httpRequest) {
        return new HttpRequestOrResponse(httpRequest);
    }

    @NonNull
    public HttpRequest getHttpRequest() {
        if (isHttpRequest()) {
            return (HttpRequest) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (HttpRequest)");
        return null;
    }

    @NonNull
    public HttpResponse getHttpResponse() {
        if (isHttpResponse()) {
            return (HttpResponse) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (HttpResponse)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isHttpRequest() {
        return this.type == Type.HTTP_REQUEST;
    }

    public boolean isHttpResponse() {
        return this.type == Type.HTTP_RESPONSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static HttpRequestOrResponse valueOf(@NonNull HttpResponse httpResponse) {
        return new HttpRequestOrResponse(httpResponse);
    }

    public HttpRequestOrResponse(@NonNull HttpResponse httpResponse) {
        this.type = Type.HTTP_RESPONSE;
        this.value = httpResponse;
    }
}
