package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PlaneProxy {
        @NonNull
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    Rect getCropRect();

    int getFormat();

    int getHeight();

    @Nullable
    @ExperimentalGetImage
    Image getImage();

    @NonNull
    ImageInfo getImageInfo();

    @NonNull
    @SuppressLint({"ArrayReturn"})
    PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(@Nullable Rect rect);

    @NonNull
    default Bitmap toBitmap() {
        return ImageUtil.createBitmapFromImageProxy(this);
    }
}
