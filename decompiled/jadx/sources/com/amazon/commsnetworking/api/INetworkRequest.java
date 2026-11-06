package com.amazon.commsnetworking.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import okhttp3.Call;
import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface INetworkRequest {
    Request buildRequest();

    boolean canRetry(INetworkResponse iNetworkResponse);

    void cancel();

    int getAttemptCount();

    @Nullable
    String getHeaderByName(@NonNull String str);

    @NonNull
    String getRequestId();

    void prepareForRetry(INetworkResponse iNetworkResponse);

    INetworkRequest removeHeader(@NonNull String str);

    void setCall(@NonNull Call call);

    INetworkRequest withHeader(@NonNull String str, @NonNull String str2);

    INetworkRequest withMediaType(@NonNull String str);

    INetworkRequest withParameter(@NonNull String str, @NonNull String str2);

    INetworkRequest withPayload(@NonNull String str, @NonNull File file);

    INetworkRequest withPayload(@NonNull String str, @NonNull String str2);

    INetworkRequest withPayload(@NonNull String str, byte[] bArr);

    INetworkRequest withRetry(@NonNull RetryHandler retryHandler, int i);
}
