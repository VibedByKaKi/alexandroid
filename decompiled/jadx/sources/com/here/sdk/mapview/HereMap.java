package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class HereMap extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RenderListener {
        void onFramePrepared();

        void onRenderTargetReleased();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RenderListenerImpl extends NativeBase implements RenderListener {
        public RenderListenerImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.HereMap.RenderListenerImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    RenderListenerImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.HereMap.RenderListener
        public native void onFramePrepared();

        @Override // com.here.sdk.mapview.HereMap.RenderListener
        public native void onRenderTargetReleased();
    }

    public HereMap(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.HereMap.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                HereMap.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void addMapIdleListener(@NonNull MapIdleListener mapIdleListener);

    @NonNull
    public native Style getStyle();

    public native void removeMapIdleListener(@NonNull MapIdleListener mapIdleListener);

    public native void setRenderListener(@Nullable RenderListener renderListener);
}
