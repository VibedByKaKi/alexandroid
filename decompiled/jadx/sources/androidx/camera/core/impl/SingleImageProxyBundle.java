package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class SingleImageProxyBundle implements ImageProxyBundle {
    private final int mCaptureId;
    private final ImageProxy mImageProxy;

    public SingleImageProxyBundle(@NonNull ImageProxy imageProxy, @NonNull String str) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("ImageProxy has no associated ImageInfo");
            throw null;
        }
        Integer num = (Integer) imageInfo.getTagBundle().getTag(str);
        if (num == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("ImageProxy has no associated tag");
            throw null;
        }
        this.mCaptureId = num.intValue();
        this.mImageProxy = imageProxy;
    }

    public void close() {
        this.mImageProxy.close();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @NonNull
    public List<Integer> getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.mCaptureId));
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @NonNull
    public ListenableFuture<ImageProxy> getImageProxy(int i) {
        return i != this.mCaptureId ? Futures.immediateFailedFuture(new IllegalArgumentException("Capture id does not exist in the bundle")) : Futures.immediateFuture(this.mImageProxy);
    }

    public SingleImageProxyBundle(@NonNull ImageProxy imageProxy, int i) {
        this.mCaptureId = i;
        this.mImageProxy = imageProxy;
    }
}
