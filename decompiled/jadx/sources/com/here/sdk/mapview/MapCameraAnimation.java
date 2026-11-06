package com.here.sdk.mapview;

import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapCameraAnimation extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        EMPTY_TRACK_LIST(1),
        MULTIPLE_CAMERA_POSITION_TRACKS(2),
        CAMERA_POSITION_MODIFIED_BY_CAMERA_LOOKAT_TARGET_TRACK(3),
        CAMERA_POSITION_MODIFIED_BY_CAMERA_LOOKAT_ORIENTATION_TRACK(4),
        CAMERA_POSITION_MODIFIED_BY_CAMERA_LOOKAT_DISTANCE_TRACK(5),
        MULTIPLE_CAMERA_ORIENTATION_TRACKS(6),
        CAMERA_ORIENTATION_MODIFIED_BY_CAMERA_LOOKAT_ORIENTATION_TRACK(7),
        CAMERA_ORIENTATION_MODIFIED_BY_CAMERA_LOOKAT_DISTANCE_TRACK(8),
        MULTIPLE_CAMERA_LOOKAT_TARGET_TRACKS(9),
        CAMERA_LOOKAT_TARGET_MODIFIED_BY_CAMERA_POSITION_TRACK(10),
        CAMERA_LOOKAT_TARGET_MODIFIED_BY_CAMERA_ORIENTATION_TRACK(11),
        MULTIPLE_CAMERA_LOOKAT_ORIENTATION_TRACKS(12),
        CAMERA_LOOKAT_ORIENTATION_MODIFIED_BY_CAMERA_POSITION_TRACK(13),
        CAMERA_LOOKAT_ORIENTATION_MODIFIED_BY_CAMERA_ORIENTATION_TRACK(14),
        MULTIPLE_CAMERA_LOOKAT_DISTANCE_TRACKS(15),
        CAMERA_LOOKAT_DISTANCE_MODIFIED_BY_CAMERA_POSITION_TRACK(16),
        CAMERA_LOOKAT_DISTANCE_MODIFIED_BY_CAMERA_ORIENTATION_TRACK(17),
        MULTIPLE_CAMERA_FIELD_OF_VIEW_TRACKS(18),
        MULTIPLE_CAMERA_FOCAL_LENGTH_TRACKS(19),
        MULTIPLE_CAMERA_PRINCIPAL_POINT_TRACKS(20);

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

    public MapCameraAnimation(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCameraAnimation.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapCameraAnimation.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);
}
