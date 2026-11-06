package com.here.sdk.core.threading;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface PlatformThreading {
    @NonNull
    TaskHandle postToMainThread(@NonNull Runnable runnable);

    @NonNull
    TaskHandle postToMainThread(@NonNull Runnable runnable, long j);

    @NonNull
    TaskHandle runOnMainThread(@NonNull Runnable runnable);
}
