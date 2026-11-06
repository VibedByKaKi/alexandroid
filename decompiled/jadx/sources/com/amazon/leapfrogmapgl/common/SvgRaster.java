package com.amazon.leapfrogmapgl.common;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/leapfrogmapgl/common/SvgRaster;", "", "<init>", "()V", "render", "Landroid/graphics/Bitmap;", "stream", "Ljava/io/InputStream;", "width", "", "height", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SvgRaster {

    @NotNull
    public static final SvgRaster INSTANCE = new SvgRaster();

    private SvgRaster() {
    }

    @NotNull
    public final Bitmap render(@NotNull InputStream stream, int width, int height) {
        stream.getClass();
        SVG fromInputStream = SVG.getFromInputStream(stream);
        fromInputStream.setDocumentWidth(width);
        fromInputStream.setDocumentHeight(height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        fromInputStream.renderToCanvas(new Canvas(createBitmap));
        return createBitmap;
    }
}
