package com.mapbox.common.experimental.wss_backend;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mapbox.common.HttpRequestError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface RequestObserver {
    void onData(long j, @NonNull WsOpCode wsOpCode, boolean z);

    void onFailed(long j, @NonNull HttpRequestError httpRequestError, @Nullable Integer num);

    void onResponse(long j, @NonNull ResponseData responseData);

    void onSucceeded(long j);

    void onSwitchingProtocols(long j);
}
