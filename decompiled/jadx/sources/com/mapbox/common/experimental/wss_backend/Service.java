package com.mapbox.common.experimental.wss_backend;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.common.ResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface Service {
    long allocateId();

    void cancelConnection(long j, @NonNull ResultCallback resultCallback);

    void connect(long j, @NonNull Request request, @NonNull RequestObserver requestObserver);

    void setPingTimeout(long j);

    void write(long j, @NonNull Data data);
}
