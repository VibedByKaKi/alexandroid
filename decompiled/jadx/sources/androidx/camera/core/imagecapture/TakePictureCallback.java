package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
interface TakePictureCallback {
    boolean isAborted();

    @MainThread
    void onCaptureFailure(@NonNull ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i);

    void onCaptureStarted();

    @MainThread
    void onFinalResult(@NonNull ImageCapture.OutputFileResults outputFileResults);

    @MainThread
    void onFinalResult(@NonNull ImageProxy imageProxy);

    @MainThread
    void onImageCaptured();

    void onPostviewBitmapAvailable(@NonNull Bitmap bitmap);

    @MainThread
    void onProcessFailure(@NonNull ImageCaptureException imageCaptureException);
}
