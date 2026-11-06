package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class BitmapCompat {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(27)
    public static class Api27Impl {
        private Api27Impl() {
        }

        public static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(config, true);
        }

        public static Bitmap createBitmapWithSourceColorspace(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        public static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private BitmapCompat() {
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, int i, int i2, Rect rect, boolean z) {
        int i3;
        double floor;
        Bitmap bitmap2;
        int i4;
        int i5;
        if (i <= 0 || i2 <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("dstW and dstH must be > 0!");
            return null;
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            Single$$ExternalSyntheticBUOutline0.m$3("srcRect must be contained by srcBm!");
            return null;
        }
        Bitmap copyBitmapIfHardware = Api27Impl.copyBitmapIfHardware(bitmap);
        int width = rect != null ? rect.width() : bitmap.getWidth();
        int height = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        int i6 = rect != null ? rect.left : 0;
        int i7 = rect != null ? rect.top : 0;
        if (i6 == 0 && i7 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == copyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : copyBitmapIfHardware;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        Api29Impl.setPaintBlendMode(paint);
        if (width == i && height == i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, copyBitmapIfHardware.getConfig());
            new Canvas(createBitmap).drawBitmap(copyBitmapIfHardware, -i6, -i7, paint);
            return createBitmap;
        }
        double log = Math.log(2.0d);
        if (f > 1.0f) {
            i3 = i6;
            floor = Math.ceil(Math.log(f) / log);
        } else {
            i3 = i6;
            floor = Math.floor(Math.log(f) / log);
        }
        int i8 = (int) floor;
        int ceil = (int) (f2 > 1.0f ? Math.ceil(Math.log(f2) / log) : Math.floor(Math.log(f2) / log));
        if (!z || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            bitmap2 = null;
            i4 = i3;
            i5 = 0;
        } else {
            Bitmap createBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(i8 > 0 ? sizeAtStep(width, i, 1, i8) : width, ceil > 0 ? sizeAtStep(height, i2, 1, ceil) : height, bitmap, true);
            new Canvas(createBitmapWithSourceColorspace).drawBitmap(copyBitmapIfHardware, -i3, -i7, paint);
            bitmap2 = copyBitmapIfHardware;
            copyBitmapIfHardware = createBitmapWithSourceColorspace;
            i5 = 1;
            i7 = 0;
            i4 = 0;
        }
        Rect rect2 = new Rect(i4, i7, width, height);
        Rect rect3 = new Rect();
        int i9 = i8;
        int i10 = ceil;
        while (true) {
            if (i9 == 0 && i10 == 0) {
                break;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            int i11 = i9;
            int i12 = i5;
            rect3.set(0, 0, sizeAtStep(width, i, i9, i8), sizeAtStep(height, i2, i10, ceil));
            boolean z2 = i11 == 0 && i10 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
            if (bitmap2 == null || bitmap2 == bitmap || ((z && !Api27Impl.isAlreadyF16AndLinear(bitmap2)) || (z2 && (!z3 || i12 != 0)))) {
                if (bitmap2 != bitmap && bitmap2 != null) {
                    bitmap2.recycle();
                }
                bitmap2 = Api27Impl.createBitmapWithSourceColorspace(sizeAtStep(width, i, i11 > 0 ? i12 : i11, i8), sizeAtStep(height, i2, i10 > 0 ? i12 : i10, ceil), bitmap, z && !z2);
            }
            new Canvas(bitmap2).drawBitmap(copyBitmapIfHardware, rect2, rect3, paint);
            rect2.set(rect3);
            Bitmap bitmap3 = bitmap2;
            bitmap2 = copyBitmapIfHardware;
            copyBitmapIfHardware = bitmap3;
            i9 = i11;
            i5 = i12;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return copyBitmapIfHardware;
    }

    @ReplaceWith(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int getAllocationByteCount(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @ReplaceWith(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean hasMipMap(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @ReplaceWith(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void setHasMipMap(Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }

    @VisibleForTesting
    public static int sizeAtStep(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }
}
