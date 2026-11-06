package com.here.sdk.core.threading;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class AndroidPlatformThreading implements PlatformThreading {
    @Override // com.here.sdk.core.threading.PlatformThreading
    public TaskHandle postToMainThread(Runnable runnable) {
        return postToMainThread(runnable, 0L);
    }

    @Override // com.here.sdk.core.threading.PlatformThreading
    public TaskHandle runOnMainThread(Runnable runnable) {
        return MainThreadTaskRunner.run(runnable);
    }

    @Override // com.here.sdk.core.threading.PlatformThreading
    public TaskHandle postToMainThread(Runnable runnable, long j) {
        return MainThreadTaskRunner.post(runnable, j);
    }
}
