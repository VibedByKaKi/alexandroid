package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.engine.SDKNativeEngine;
import com.here.sdk.core.errors.InstantiationErrorException;
import com.here.sdk.core.threading.TaskHandle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitRoutingEngine extends NativeBase {
    public TransitRoutingEngine() throws InstantiationErrorException {
        this(make(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make() throws InstantiationErrorException;

    private static native long make(@NonNull SDKNativeEngine sDKNativeEngine) throws InstantiationErrorException;

    @NonNull
    public native TaskHandle calculateRoute(@NonNull TransitWaypoint transitWaypoint, @NonNull TransitWaypoint transitWaypoint2, @NonNull TransitRouteOptions transitRouteOptions, @NonNull CalculateRouteCallback calculateRouteCallback);

    public TransitRoutingEngine(@NonNull SDKNativeEngine sDKNativeEngine) throws InstantiationErrorException {
        this(make(sDKNativeEngine), null);
        cacheThisInstance();
    }

    public TransitRoutingEngine(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.TransitRoutingEngine.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TransitRoutingEngine.disposeNativeHandle(j2);
            }
        });
    }
}
