package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class RequestHandler2 {
    public static RequestHandler2 adapt(RequestHandler requestHandler) {
        return new RequestHandler2Adaptor(requestHandler);
    }

    public abstract void afterError(Request<?> request, Response<?> response, Exception exc);

    public abstract void afterResponse(Request<?> request, Response<?> response);

    public abstract void beforeRequest(Request<?> request);
}
