package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.SpanUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AsyncDrawableSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int alignment;
    private final AsyncDrawable drawable;
    private final boolean replacementTextIsLink;
    private final MarkwonTheme theme;

    public AsyncDrawableSpan(@NonNull MarkwonTheme markwonTheme, @NonNull AsyncDrawable asyncDrawable, int i, boolean z) {
        this.theme = markwonTheme;
        this.drawable = asyncDrawable;
        this.alignment = i;
        this.replacementTextIsLink = z;
    }

    private static float textCenterY(int i, int i2, @NonNull Paint paint) {
        return (int) (ErrorUtils$$ExternalSyntheticOutline0.m(i2, i, 2, i) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        int i6;
        this.drawable.initWithKnownDimensions(SpanUtils.width(canvas, charSequence), paint.getTextSize());
        AsyncDrawable asyncDrawable = this.drawable;
        if (!asyncDrawable.hasResult()) {
            float textCenterY = textCenterY(i3, i5, paint);
            if (this.replacementTextIsLink) {
                this.theme.applyLinkStyle(paint);
            }
            canvas.drawText(charSequence, i, i2, f, textCenterY, paint);
            return;
        }
        int i7 = i5 - asyncDrawable.getBounds().bottom;
        int save = canvas.save();
        try {
            int i8 = this.alignment;
            if (2 != i8) {
                if (1 == i8) {
                    i6 = paint.getFontMetricsInt().descent;
                }
                canvas.translate(f, i7);
                asyncDrawable.draw(canvas);
                canvas.restoreToCount(save);
            }
            i6 = ((i5 - i3) - asyncDrawable.getBounds().height()) / 2;
            i7 -= i6;
            canvas.translate(f, i7);
            asyncDrawable.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @NonNull
    public AsyncDrawable getDrawable() {
        return this.drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (!this.drawable.hasResult()) {
            if (this.replacementTextIsLink) {
                this.theme.applyLinkStyle(paint);
            }
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = this.drawable.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
