package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Point2D;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Easing extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        SAMPLED_DATA_POINT_COUNT_TOO_SMALL(1),
        SAMPLED_DATA_POINTS_FIRST_X_VALUE_INVALID(2),
        SAMPLED_DATA_POINTS_LAST_X_VALUE_INVALID(3),
        SAMPLED_DATA_X_VALUE_OUT_OF_RANGE(4),
        SAMPLED_DATA_X_VALUES_NON_MONOTONIC(5);

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

    public Easing(@NonNull EasingFunction easingFunction) {
        this(make(easingFunction), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull EasingFunction easingFunction);

    private static native long make(@NonNull List<Point2D> list) throws InstantiationException;

    public Easing(@NonNull List<Point2D> list) throws InstantiationException {
        this(make(list), null);
        cacheThisInstance();
    }

    public Easing(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.animation.Easing.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Easing.disposeNativeHandle(j2);
            }
        });
    }
}
