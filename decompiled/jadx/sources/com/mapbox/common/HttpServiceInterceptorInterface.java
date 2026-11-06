package com.mapbox.common;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface HttpServiceInterceptorInterface {
    void onRequest(@NonNull HttpRequest httpRequest, @NonNull HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    void onResponse(@NonNull HttpResponse httpResponse, @NonNull HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
