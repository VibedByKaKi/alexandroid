package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.imagecapture.TakePictureManager;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_TakePictureManager_CaptureError extends TakePictureManager.CaptureError {
    private final ImageCaptureException imageCaptureException;
    private final int requestId;

    public AutoValue_TakePictureManager_CaptureError(int i, ImageCaptureException imageCaptureException) {
        this.requestId = i;
        if (imageCaptureException != null) {
            this.imageCaptureException = imageCaptureException;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null imageCaptureException");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TakePictureManager.CaptureError) {
            TakePictureManager.CaptureError captureError = (TakePictureManager.CaptureError) obj;
            if (this.requestId == captureError.getRequestId() && this.imageCaptureException.equals(captureError.getImageCaptureException())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    @NonNull
    public ImageCaptureException getImageCaptureException() {
        return this.imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public int getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.imageCaptureException.hashCode() ^ ((this.requestId ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CaptureError{requestId=" + this.requestId + ", imageCaptureException=" + this.imageCaptureException + StringSubstitutor.DEFAULT_VAR_END;
    }
}
