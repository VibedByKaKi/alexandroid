package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MAPFuture<T> {
    @FireOsSdk
    T get() throws MAPCallbackErrorException, InterruptedException, ExecutionException;

    @FireOsSdk
    T get(long j, TimeUnit timeUnit) throws MAPCallbackErrorException, InterruptedException, ExecutionException, TimeoutException;
}
