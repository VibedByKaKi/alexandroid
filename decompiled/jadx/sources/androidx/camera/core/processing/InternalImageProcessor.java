package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.work.impl.Processor$$ExternalSyntheticLambda2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class InternalImageProcessor {

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(@NonNull CameraEffect cameraEffect) {
        Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        try {
            completer.set(this.mImageProcessor.process(request));
        } catch (ProcessingException e) {
            this.mErrorListener.accept(e);
            completer.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$safeProcess$1(ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Processor$$ExternalSyntheticLambda2(this, 2, request, completer));
        return "InternalImageProcessor#process " + request.hashCode();
    }

    @NonNull
    public ImageProcessor.Response safeProcess(@NonNull ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new InternalImageProcessor$$ExternalSyntheticLambda1(this, request)).get();
        } catch (Exception e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
