package com.amazon.apl.android.graphic;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.amazon.apl.android.AVGFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AVGDropShadowFilter implements AVGFilter {
    private static final int ALPHA_BITMASK = -16777216;
    private final int mColor;
    private final float mHorizontalOffset;
    private float mLastScaledRadius;
    private final float mRadius;
    final Paint mShadowPaint = new Paint();
    final Paint mTransferPaint;
    private final float mVerticalOffset;

    public AVGDropShadowFilter(int i, float f, float f2, float f3) {
        Paint paint = new Paint();
        this.mTransferPaint = paint;
        this.mLastScaledRadius = -1.0f;
        this.mColor = i;
        this.mRadius = f;
        this.mHorizontalOffset = f2;
        this.mVerticalOffset = f3;
        paint.setColor((-16777216) | i);
        paint.setColorFilter(new PorterDuffColorFilter(i | ViewCompat.MEASURED_SIZE_MASK, PorterDuff.Mode.DST_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    }

    @Override // com.amazon.apl.android.AVGFilter
    public void apply(@NonNull Bitmap bitmap, float f, float f2) {
        float min = Math.min(f, f2) * this.mRadius;
        if (min < 0.0f) {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        if (this.mLastScaledRadius != min) {
            Paint paint = this.mShadowPaint;
            if (min != 0.0f) {
                paint.setMaskFilter(new BlurMaskFilter(min, BlurMaskFilter.Blur.NORMAL));
            } else {
                paint.setMaskFilter(null);
            }
            this.mLastScaledRadius = min;
        }
        Bitmap extractAlpha = bitmap.extractAlpha(this.mShadowPaint, new int[2]);
        canvas.translate(this.mHorizontalOffset * f, this.mVerticalOffset * f2);
        canvas.drawBitmap(extractAlpha, r0[0], r0[1], this.mTransferPaint);
        extractAlpha.recycle();
    }
}
