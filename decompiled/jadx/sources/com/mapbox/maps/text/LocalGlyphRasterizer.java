package com.mapbox.maps.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes9.dex */
class LocalGlyphRasterizer {

    @NonNull
    private final Canvas canvas;

    @NonNull
    private final FontMetrics fontMetrics;

    @NonNull
    private final GlyphMetrics glyphMetrics;

    @NonNull
    private final Paint paint;

    @NonNull
    private boolean useSystemFont;

    @NonNull
    private final float sdfScale = 2.0f;
    private final int borderSize = Math.round(6.0f);

    @NonNull
    private final Rect bounds = new Rect();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Keep
    public class FontMetrics {
        float ascender;
        float descender;
        int fontID;

        private FontMetrics() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Keep
    public class GlyphMetrics {
        float advance;
        float ascender;
        float descender;
        Bitmap glyphBitmap;
        float height;
        float left;
        float top;
        float width;

        private GlyphMetrics() {
        }
    }

    public LocalGlyphRasterizer() {
        this.glyphMetrics = new GlyphMetrics();
        this.fontMetrics = new FontMetrics();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(48.0f);
        this.canvas = new Canvas();
        this.useSystemFont = false;
    }

    @WorkerThread
    public FontMetrics getFontMetrics(String str, boolean z) {
        boolean z2 = this.useSystemFont;
        Paint paint = this.paint;
        if (z2) {
            paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            paint.setTypeface(Typeface.create(str, z ? 1 : 0));
        }
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        this.fontMetrics.ascender = Math.abs(fontMetrics.top) / 2.0f;
        this.fontMetrics.descender = Math.abs(fontMetrics.bottom) / 2.0f;
        this.fontMetrics.fontID = this.paint.getTypeface().hashCode();
        return this.fontMetrics;
    }

    @WorkerThread
    public GlyphMetrics getGlyphMetrics(String str, boolean z, char c) {
        String valueOf = String.valueOf(c);
        boolean z2 = this.useSystemFont;
        Paint paint = this.paint;
        if (z2) {
            paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            paint.setTypeface(Typeface.create(str, z ? 1 : 0));
        }
        this.paint.getTextBounds(valueOf, 0, 1, this.bounds);
        GlyphMetrics glyphMetrics = this.glyphMetrics;
        Rect rect = this.bounds;
        glyphMetrics.left = rect.left / 2.0f;
        glyphMetrics.width = rect.width() / 2.0f;
        this.glyphMetrics.height = this.bounds.height() / 2.0f;
        this.glyphMetrics.top = Math.abs(this.bounds.top) / 2.0f;
        this.glyphMetrics.advance = this.paint.measureText(valueOf, 0, 1) / 2.0f;
        if (this.bounds.width() > 0 && this.bounds.height() > 0) {
            this.glyphMetrics.glyphBitmap = Bitmap.createBitmap((this.borderSize * 2) + this.bounds.width(), (this.borderSize * 2) + this.bounds.height(), Bitmap.Config.ARGB_8888);
            this.canvas.setBitmap(this.glyphMetrics.glyphBitmap);
            int i = this.borderSize;
            Rect rect2 = this.bounds;
            float f = i - rect2.left;
            float f2 = i - rect2.top;
            this.canvas.drawColor(-1);
            this.canvas.drawText(valueOf, f, f2, this.paint);
        }
        return this.glyphMetrics;
    }

    public void useSystemFont() {
        this.useSystemFont = true;
    }
}
