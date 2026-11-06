package com.mapbox.maps.renderer;

import android.view.Surface;
import androidx.annotation.Keep;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes9.dex */
class SurfaceWrapper {
    private long peer = 0;

    static {
        try {
            BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        } catch (Throwable unused) {
        }
    }

    public SurfaceWrapper() {
        initialize();
    }

    private native void initialize();

    private native long nativeGetANativeWindow();

    private native void nativeRelease();

    private native void nativeSetSurface(Surface surface);

    public native void finalize();

    public long getANativeWindow() {
        return nativeGetANativeWindow();
    }

    public void releaseSurface() {
        nativeRelease();
    }

    public void setSurface(Surface surface) {
        nativeSetSurface(surface);
    }
}
