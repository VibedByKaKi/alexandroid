package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import io.noties.markwon.core.MarkwonTheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ThematicBreakSpan implements LeadingMarginSpan {
    private final MarkwonTheme theme;
    private final Rect rect = ObjectsPool.rect();
    private final Paint paint = ObjectsPool.paint();

    public ThematicBreakSpan(@NonNull MarkwonTheme markwonTheme) {
        this.theme = markwonTheme;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int m = ErrorUtils$$ExternalSyntheticOutline0.m(i5, i3, 2, i3);
        this.paint.set(paint);
        this.theme.applyThematicBreakStyle(this.paint);
        int strokeWidth = (int) ((((int) (this.paint.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i8 = i;
            i -= canvas.getWidth();
        }
        this.rect.set(i, m - strokeWidth, i8, m + strokeWidth);
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
