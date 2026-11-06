package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i, @NonNull String str, @Nullable Throwable th) {
        super(str, th);
        this.mImageCaptureError = i;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
