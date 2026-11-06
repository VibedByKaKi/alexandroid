package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a7\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\n\u0010\u0012\u001a\u00020\u0002*\u00020\u0001\u001a\u0013\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u000b*\u00020\u0014H\u0000¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"asImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroid/graphics/Bitmap;", "createImageBitmap", "bytes", "", "ActualImageBitmap", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m4510ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, @NotNull ColorSpace colorSpace) {
        Bitmap createBitmap;
        m4511toBitmapConfig1JJdX4A(i3);
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m4511toBitmapConfig1JJdX4A(i3), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return new AndroidImageBitmap(createBitmap);
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    public static final ImageBitmap createImageBitmap(@NotNull byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    @NotNull
    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m4511toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        return ImageBitmapConfig.m4871equalsimpl0(i, companion.m4876getArgb8888_sVssgQ()) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.m4871equalsimpl0(i, companion.m4875getAlpha8_sVssgQ()) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.m4871equalsimpl0(i, companion.m4879getRgb565_sVssgQ()) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.m4871equalsimpl0(i, companion.m4877getF16_sVssgQ()) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.m4871equalsimpl0(i, companion.m4878getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ImageBitmapConfig.INSTANCE.m4875getAlpha8_sVssgQ() : config == Bitmap.Config.RGB_565 ? ImageBitmapConfig.INSTANCE.m4879getRgb565_sVssgQ() : config == Bitmap.Config.ARGB_4444 ? ImageBitmapConfig.INSTANCE.m4876getArgb8888_sVssgQ() : config == Bitmap.Config.RGBA_F16 ? ImageBitmapConfig.INSTANCE.m4877getF16_sVssgQ() : config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.INSTANCE.m4878getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m4876getArgb8888_sVssgQ();
    }
}
