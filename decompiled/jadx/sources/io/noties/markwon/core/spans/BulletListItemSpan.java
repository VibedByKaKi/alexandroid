package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.LeadingMarginUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BulletListItemSpan implements LeadingMarginSpan {
    private static final boolean IS_NOUGAT = false;
    private final int level;
    private MarkwonTheme theme;
    private final Paint paint = ObjectsPool.paint();
    private final RectF circle = ObjectsPool.rectF();
    private final Rect rectangle = ObjectsPool.rect();

    public BulletListItemSpan(@NonNull MarkwonTheme markwonTheme, @IntRange(from = 0) int i) {
        this.theme = markwonTheme;
        this.level = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        if (z && LeadingMarginUtils.selfStart(i6, charSequence, this)) {
            this.paint.set(paint);
            this.theme.applyListItemStyle(this.paint);
            int save = canvas.save();
            try {
                int blockMargin = this.theme.getBlockMargin();
                int bulletWidth = this.theme.getBulletWidth((int) ((this.paint.descent() - this.paint.ascent()) + 0.5f));
                int i10 = (blockMargin - bulletWidth) / 2;
                if (IS_NOUGAT) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (blockMargin * this.level)) : (blockMargin * this.level) - i;
                    int i11 = (i10 * i2) + i;
                    int i12 = (i2 * bulletWidth) + i11;
                    int i13 = i2 * width;
                    i8 = Math.min(i11, i12) + i13;
                    i9 = Math.max(i11, i12) + i13;
                } else {
                    if (i2 <= 0) {
                        i -= blockMargin;
                    }
                    i8 = i + i10;
                    i9 = i8 + bulletWidth;
                }
                int descent = (i4 + ((int) (((this.paint.descent() + this.paint.ascent()) / 2.0f) + 0.5f))) - (bulletWidth / 2);
                int i14 = bulletWidth + descent;
                int i15 = this.level;
                if (i15 != 0 && i15 != 1) {
                    this.rectangle.set(i8, descent, i9, i14);
                    this.paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.rectangle, this.paint);
                    canvas.restoreToCount(save);
                }
                this.circle.set(i8, descent, i9, i14);
                this.paint.setStyle(this.level == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                canvas.drawOval(this.circle, this.paint);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.theme.getBlockMargin();
    }
}
