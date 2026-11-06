package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class CameraState {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    @NonNull
    public static CameraState create(@NonNull Type type) {
        return create(type, null);
    }

    @Nullable
    public abstract StateError getError();

    @NonNull
    public abstract Type getType();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class StateError {
        @NonNull
        public static StateError create(int i) {
            return create(i, null);
        }

        @Nullable
        public abstract Throwable getCause();

        public abstract int getCode();

        @NonNull
        public ErrorType getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? ErrorType.RECOVERABLE : ErrorType.CRITICAL;
        }

        @NonNull
        public static StateError create(int i, @Nullable Throwable th) {
            return new AutoValue_CameraState_StateError(i, th);
        }
    }

    @NonNull
    public static CameraState create(@NonNull Type type, @Nullable StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }
}
