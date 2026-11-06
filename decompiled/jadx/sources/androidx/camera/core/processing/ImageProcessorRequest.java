package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ImageProcessorRequest implements ImageProcessor.Request {

    @NonNull
    private final ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(@NonNull ImageProxy imageProxy, int i) {
        this.mImageProxy = imageProxy;
        this.mOutputFormat = i;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    @NonNull
    public ImageProxy getInputImage() {
        return this.mImageProxy;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.mOutputFormat;
    }
}
