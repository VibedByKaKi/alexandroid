package com.amazon.apl.android.primitive;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListItemSpan implements LeadingMarginSpan {
    private static final String DEFAULT_BULLET = " • ";
    private final int mBulletWidth;

    public ListItemSpan(@NonNull TextPaint textPaint) {
        this.mBulletWidth = (int) Math.ceil(textPaint.measureText(DEFAULT_BULLET));
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NonNull Canvas canvas, @NonNull Paint paint, int i, int i2, int i3, int i4, int i5, @NonNull CharSequence charSequence, int i6, int i7, boolean z, @Nullable Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (i2 < 0) {
                canvas.drawText(DEFAULT_BULLET, i - this.mBulletWidth, i4, paint);
            } else {
                canvas.drawText(DEFAULT_BULLET, i, i4, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.mBulletWidth;
    }

    public String toString() {
        return String.format("ListItemSpan{bulletWidth=%d}", Integer.valueOf(this.mBulletWidth));
    }
}
