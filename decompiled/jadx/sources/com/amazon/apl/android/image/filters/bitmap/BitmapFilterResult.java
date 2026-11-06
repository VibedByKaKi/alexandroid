package com.amazon.apl.android.image.filters.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amazon.apl.android.bitmap.BitmapCreationException;
import com.amazon.apl.android.bitmap.IBitmapFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BitmapFilterResult implements FilterResult {
    protected final Bitmap mBitmap;
    protected final IBitmapFactory mBitmapFactory;

    public BitmapFilterResult(Bitmap bitmap, IBitmapFactory iBitmapFactory) {
        this.mBitmap = bitmap;
        this.mBitmapFactory = iBitmapFactory;
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.FilterResult
    public Bitmap getBitmap(Size size) {
        if (size.equals(getSize())) {
            return this.mBitmap;
        }
        try {
            if (size.width() <= this.mBitmap.getWidth() && size.height() <= this.mBitmap.getHeight()) {
                return this.mBitmapFactory.createBitmap(this.mBitmap, 0, 0, size.width(), size.height(), null, false);
            }
            Bitmap createBitmap = this.mBitmapFactory.createBitmap(size.width(), size.height());
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, Math.min(this.mBitmap.getWidth(), size.width()), Math.min(this.mBitmap.getHeight(), size.height()));
            canvas.drawBitmap(this.mBitmap, rect, rect, (Paint) null);
            return createBitmap;
        } catch (BitmapCreationException unused) {
            return this.mBitmap;
        }
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.FilterResult
    public Size getSize() {
        return Size.create(this.mBitmap.getWidth(), this.mBitmap.getHeight());
    }
}
