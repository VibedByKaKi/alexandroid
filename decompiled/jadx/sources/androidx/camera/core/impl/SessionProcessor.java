package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface SessionProcessor {
    void abortCapture(int i);

    void deInitSession();

    @Nullable
    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    @NonNull
    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    default Map<Integer, List<Size>> getSupportedPostviewSize(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    @NonNull
    SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(boolean z, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    default int startTrigger(@NonNull Config config, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CaptureCallback {
        default void onCaptureFailed(int i) {
        }

        default void onCaptureProcessProgressed(int i) {
        }

        default void onCaptureProcessStarted(int i) {
        }

        default void onCaptureSequenceAborted(int i) {
        }

        default void onCaptureSequenceCompleted(int i) {
        }

        default void onCaptureStarted(int i, long j) {
        }

        default void onCaptureCompleted(long j, int i, @NonNull CameraCaptureResult cameraCaptureResult) {
        }
    }
}
