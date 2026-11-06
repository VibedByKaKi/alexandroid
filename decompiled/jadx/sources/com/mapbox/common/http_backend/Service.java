package com.mapbox.common.http_backend;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.common.ResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface Service {
    void cancelRequest(long j, @NonNull ResultCallback resultCallback);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    long request(@NonNull Request request, @NonNull RequestObserver requestObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void setMaxRequestsPerHost(byte b);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean supportsKeepCompression();
}
