package com.here.sdk.routing;

import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class CalculateTrafficOnRouteCallbackImpl extends NativeBase implements CalculateTrafficOnRouteCallback {
    public CalculateTrafficOnRouteCallbackImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.CalculateTrafficOnRouteCallbackImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                CalculateTrafficOnRouteCallbackImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.routing.CalculateTrafficOnRouteCallback
    public native void onTrafficOnRouteCalculated(@Nullable RoutingError routingError, @Nullable TrafficOnRoute trafficOnRoute);
}
