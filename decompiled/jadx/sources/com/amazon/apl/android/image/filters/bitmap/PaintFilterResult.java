package com.amazon.apl.android.image.filters.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.amazon.apl.android.bitmap.BitmapCreationException;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.android.image.filters.SolidFilterOperation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PaintFilterResult implements FilterResult {
    private final IBitmapFactory mBitmapFactory;
    private final SolidFilterOperation.PaintProvider mPaintProvider;

    public PaintFilterResult(SolidFilterOperation.PaintProvider paintProvider, IBitmapFactory iBitmapFactory) {
        this.mPaintProvider = paintProvider;
        this.mBitmapFactory = iBitmapFactory;
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.FilterResult
    public Bitmap getBitmap(Size size) {
        try {
            Bitmap createBitmap = this.mBitmapFactory.createBitmap(size.width(), size.height());
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            canvas.drawRect(rect, this.mPaintProvider.getPaint(rect));
            return createBitmap;
        } catch (BitmapCreationException unused) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.FilterResult
    public Size getSize() {
        return Size.ZERO;
    }
}
