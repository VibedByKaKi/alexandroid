package com.amazon.apl.android.image.filters.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amazon.apl.android.bitmap.BitmapCreationException;
import com.amazon.apl.android.bitmap.IBitmapFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BitmapRegionFilterResult implements FilterResult {
    protected final Bitmap mBitmap;
    protected final IBitmapFactory mBitmapFactory;
    private final Rect mDecodeRegion;
    private final Rect mRequestedSourceRegion;

    public BitmapRegionFilterResult(Bitmap bitmap, IBitmapFactory iBitmapFactory, Rect rect, Rect rect2) {
        this.mBitmap = bitmap;
        this.mBitmapFactory = iBitmapFactory;
        this.mRequestedSourceRegion = rect;
        this.mDecodeRegion = rect2;
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.FilterResult
    public Bitmap getBitmap(Size size) {
        if (size.equals(getSize()) && this.mRequestedSourceRegion.equals(this.mDecodeRegion)) {
            return this.mBitmap;
        }
        Rect rect = this.mRequestedSourceRegion;
        int i = rect.left;
        Rect rect2 = this.mDecodeRegion;
        int i2 = i - rect2.left;
        int i3 = rect.top - rect2.top;
        Rect rect3 = new Rect(i2, i3, Math.round(this.mRequestedSourceRegion.width() * (this.mBitmap.getWidth() / this.mDecodeRegion.width())) + i2, Math.round(this.mRequestedSourceRegion.height() * (this.mBitmap.getHeight() / this.mDecodeRegion.height())) + i3);
        try {
            Bitmap createBitmap = this.mBitmapFactory.createBitmap(size.width(), size.height());
            new Canvas(createBitmap).drawBitmap(this.mBitmap, rect3, new Rect(0, 0, size.width(), size.height()), (Paint) null);
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
