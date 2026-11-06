package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.engine.SDKNativeEngine;
import com.here.sdk.core.threading.PlatformThreading;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Authentication extends NativeBase {
    public Authentication(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.Authentication.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Authentication.disposeNativeHandle(j2);
            }
        });
    }

    @NonNull
    public static native AuthenticationData authenticate(@NonNull SDKNativeEngine sDKNativeEngine) throws AuthenticationException;

    public static native void authenticate(@NonNull SDKNativeEngine sDKNativeEngine, @NonNull AuthenticationCallback authenticationCallback);

    public static native void authenticate(@NonNull SDKNativeEngine sDKNativeEngine, @NonNull AuthenticationCallback authenticationCallback, @NonNull PlatformThreading platformThreading);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);
}
