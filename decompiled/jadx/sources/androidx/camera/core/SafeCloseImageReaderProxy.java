package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SafeCloseImageReaderProxy implements ImageReaderProxy {
    private ForwardingImageProxy.OnImageCloseListener mForwardingImageCloseListener;

    @GuardedBy("mLock")
    private final ImageReaderProxy mImageReaderProxy;

    @Nullable
    private final Surface mSurface;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private int mOutstandingImages = 0;

    @GuardedBy("mLock")
    private boolean mIsClosed = false;
    private final ForwardingImageProxy.OnImageCloseListener mImageCloseListener = new SafeCloseImageReaderProxy$$ExternalSyntheticLambda1(this, 0);

    public SafeCloseImageReaderProxy(@NonNull ImageReaderProxy imageReaderProxy) {
        this.mImageReaderProxy = imageReaderProxy;
        this.mSurface = imageReaderProxy.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageProxy imageProxy) {
        ForwardingImageProxy.OnImageCloseListener onImageCloseListener;
        synchronized (this.mLock) {
            try {
                int i = this.mOutstandingImages - 1;
                this.mOutstandingImages = i;
                if (this.mIsClosed && i == 0) {
                    close();
                }
                onImageCloseListener = this.mForwardingImageCloseListener;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (onImageCloseListener != null) {
            onImageCloseListener.onImageClose(imageProxy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Nullable
    @GuardedBy("mLock")
    private ImageProxy wrapImageProxy(@Nullable ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        this.mOutstandingImages++;
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
        singleCloseImageProxy.addOnImageCloseListener(this.mImageCloseListener);
        return singleCloseImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireLatestImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireNextImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            try {
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                }
                this.mImageReaderProxy.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getCapacity() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages() - this.mOutstandingImages;
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    @NonNull
    @VisibleForTesting
    public ImageReaderProxy getImageReaderProxy() {
        ImageReaderProxy imageReaderProxy;
        synchronized (this.mLock) {
            imageReaderProxy = this.mImageReaderProxy;
        }
        return imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    @VisibleForTesting
    public boolean isClosed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mIsClosed;
        }
        return z;
    }

    public void safeClose() {
        synchronized (this.mLock) {
            try {
                this.mIsClosed = true;
                this.mImageReaderProxy.clearOnImageAvailableListener();
                if (this.mOutstandingImages == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        synchronized (this.mLock) {
            this.mImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    SafeCloseImageReaderProxy.this.lambda$setOnImageAvailableListener$1(onImageAvailableListener, imageReaderProxy);
                }
            }, executor);
        }
    }

    public void setOnImageCloseListener(@NonNull ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.mLock) {
            this.mForwardingImageCloseListener = onImageCloseListener;
        }
    }
}
