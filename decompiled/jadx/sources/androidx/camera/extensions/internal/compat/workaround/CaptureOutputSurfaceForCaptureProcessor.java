package androidx.camera.extensions.internal.compat.workaround;

import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OptIn(markerClass = {ExperimentalGetImage.class})
/* loaded from: classes.dex */
public class CaptureOutputSurfaceForCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "CaptureOutputSurface";
    private static final long UNSPECIFIED_TIMESTAMP = -1;

    @GuardedBy("mLock")
    private final ImageWriter mImageWriter;

    @GuardedBy("mLock")
    private final ImageReaderProxy mIntermediateImageReader;
    private final boolean mNeedIntermediaSurface;
    private final boolean mNeedOverrideTimestamp;

    @NonNull
    private final Surface mOutputSurface;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mIsClosed = false;
    long mOutputImageTimeStamp = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(23)
    public static final class Api23Impl {
        private Api23Impl() {
        }

        public static void setImageTimestamp(@NonNull Image image, long j) {
            image.setTimestamp(j);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(29)
    public static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        public static void close(ImageWriter imageWriter) {
            imageWriter.close();
        }

        @NonNull
        public static ImageWriter newInstance(@NonNull Surface surface, int i, int i2) {
            return ImageWriter.newInstance(surface, i, i2);
        }

        public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public CaptureOutputSurfaceForCaptureProcessor(@NonNull Surface surface, @NonNull Size size, boolean z) {
        this.mNeedOverrideTimestamp = z;
        boolean z2 = DeviceQuirks.get(CaptureOutputSurfaceOccupiedQuirk.class) != null || z;
        this.mNeedIntermediaSurface = z2;
        if (!z2) {
            this.mOutputSurface = surface;
            this.mIntermediateImageReader = null;
            this.mImageWriter = null;
        } else {
            Logger.d(TAG, "Enabling intermediate surface");
            ImageReaderProxy createIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
            this.mIntermediateImageReader = createIsolatedReader;
            this.mOutputSurface = createIsolatedReader.getSurface();
            this.mImageWriter = ImageWriterCompat.newInstance(surface, 2, 35);
            createIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    CaptureOutputSurfaceForCaptureProcessor.this.lambda$new$0(imageReaderProxy);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        Image image;
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    return;
                }
                ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                if (acquireNextImage != null && (image = acquireNextImage.getImage()) != null) {
                    if (this.mNeedOverrideTimestamp) {
                        long j = this.mOutputImageTimeStamp;
                        if (j != -1) {
                            Api23Impl.setImageTimestamp(image, j);
                        }
                    }
                    ImageWriterCompat.queueInputImage(this.mImageWriter, image);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            try {
                this.mIsClosed = true;
                if (this.mNeedIntermediaSurface) {
                    this.mIntermediateImageReader.clearOnImageAvailableListener();
                    this.mIntermediateImageReader.close();
                    ImageWriterCompat.close(this.mImageWriter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public Surface getSurface() {
        return this.mOutputSurface;
    }

    public void setOutputImageTimestamp(long j) {
        if (this.mNeedOverrideTimestamp) {
            this.mOutputImageTimeStamp = j;
        }
    }
}
