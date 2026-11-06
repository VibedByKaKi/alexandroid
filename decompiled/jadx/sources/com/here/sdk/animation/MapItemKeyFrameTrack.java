package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapItemKeyFrameTrack extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        EMPTY_KEYFRAME_LIST(1),
        INVALID_KEYFRAME_DURATION(2);

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

    public MapItemKeyFrameTrack(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.animation.MapItemKeyFrameTrack.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapItemKeyFrameTrack.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native MapItemKeyFrameTrack moveTo(@NonNull List<GeoCoordinatesKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapItemKeyFrameTrack polylineProgress(@NonNull List<ScalarKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;
}
