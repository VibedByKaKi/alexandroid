package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface RequestProcessor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Request {
        @NonNull
        Config getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(@NonNull Request request, @NonNull Callback callback);

    void stopRepeating();

    int submit(@NonNull Request request, @NonNull Callback callback);

    int submit(@NonNull List<Request> list, @NonNull Callback callback);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        default void onCaptureSequenceAborted(int i) {
        }

        default void onCaptureCompleted(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(@NonNull Request request, @NonNull CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceCompleted(int i, long j) {
        }

        default void onCaptureBufferLost(@NonNull Request request, long j, int i) {
        }

        default void onCaptureStarted(@NonNull Request request, long j, long j2) {
        }
    }
}
