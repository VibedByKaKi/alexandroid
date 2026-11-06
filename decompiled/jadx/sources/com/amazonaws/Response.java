package com.amazonaws;

import com.amazonaws.http.HttpResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final class Response<T> {
    private final HttpResponse httpResponse;
    private final T response;

    public Response(T t, HttpResponse httpResponse) {
        this.response = t;
        this.httpResponse = httpResponse;
    }

    public T getAwsResponse() {
        return this.response;
    }

    public HttpResponse getHttpResponse() {
        return this.httpResponse;
    }
}
