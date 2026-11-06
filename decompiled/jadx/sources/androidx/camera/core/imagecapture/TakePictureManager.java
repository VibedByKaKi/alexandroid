package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCaptureException;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface TakePictureManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class CaptureError {
        public static CaptureError of(int i, @NonNull ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i, imageCaptureException);
        }

        @NonNull
        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Provider {
        @NonNull
        TakePictureManager newInstance(@NonNull ImageCaptureControl imageCaptureControl);
    }

    @MainThread
    void abortRequests();

    @Nullable
    @VisibleForTesting
    RequestWithCallback getCapturingRequest();

    @NonNull
    @VisibleForTesting
    ImagePipeline getImagePipeline();

    @NonNull
    @VisibleForTesting
    List<RequestWithCallback> getIncompleteRequests();

    @VisibleForTesting
    boolean hasCapturingRequest();

    @MainThread
    void offerRequest(@NonNull TakePictureRequest takePictureRequest);

    @MainThread
    void pause();

    @MainThread
    void resume();

    @MainThread
    void setImagePipeline(@NonNull ImagePipeline imagePipeline);
}
