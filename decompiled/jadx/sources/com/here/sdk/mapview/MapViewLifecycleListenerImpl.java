package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class MapViewLifecycleListenerImpl extends NativeBase implements MapViewLifecycleListener {
    public MapViewLifecycleListenerImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewLifecycleListenerImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapViewLifecycleListenerImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.mapview.MapViewLifecycleListener
    public native void onAttach(@NonNull MapViewBase mapViewBase);

    @Override // com.here.sdk.mapview.MapViewLifecycleListener
    public native void onDestroy();

    @Override // com.here.sdk.mapview.MapViewLifecycleListener
    public native void onDetach(@NonNull MapViewBase mapViewBase);

    @Override // com.here.sdk.mapview.MapViewLifecycleListener
    public native void onPause();

    @Override // com.here.sdk.mapview.MapViewLifecycleListener
    public native void onResume();
}
