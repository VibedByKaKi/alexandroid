package com.here.sdk.mapview;

import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class MapIdleListenerImpl extends NativeBase implements MapIdleListener {
    public MapIdleListenerImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapIdleListenerImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapIdleListenerImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.mapview.MapIdleListener
    public native void onMapBusy();

    @Override // com.here.sdk.mapview.MapIdleListener
    public native void onMapIdle();
}
