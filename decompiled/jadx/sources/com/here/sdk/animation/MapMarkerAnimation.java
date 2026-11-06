package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMarkerAnimation extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        INCOMPATIBLE_TRACK(0);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorCode error;

        public InstantiationException(InstantiationErrorCode instantiationErrorCode) {
            super(instantiationErrorCode.toString());
            this.error = instantiationErrorCode;
        }
    }

    public MapMarkerAnimation(@NonNull MapItemKeyFrameTrack mapItemKeyFrameTrack) throws InstantiationException {
        this(make(mapItemKeyFrameTrack), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull MapItemKeyFrameTrack mapItemKeyFrameTrack) throws InstantiationException;

    public MapMarkerAnimation(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.animation.MapMarkerAnimation.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapMarkerAnimation.disposeNativeHandle(j2);
            }
        });
    }
}
