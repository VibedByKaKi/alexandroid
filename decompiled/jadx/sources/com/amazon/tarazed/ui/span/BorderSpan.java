package com.amazon.tarazed.ui.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJR\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/tarazed/ui/span/BorderSpan;", "Landroid/text/style/ReplacementSpan;", ViewProps.BORDER_COLOR, "", ViewProps.BORDER_WIDTH, "", "cornerRadius", ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_VERTICAL, "(IFFFF)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class BorderSpan extends ReplacementSpan {
    private final int borderColor;
    private final float borderWidth;
    private final float cornerRadius;
    private final float paddingHorizontal;
    private final float paddingVertical;

    public /* synthetic */ BorderSpan(int i, float f, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, f2, (i2 & 8) != 0 ? 5.0f : f3, (i2 & 16) != 0 ? 5.0f : f4);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        canvas.getClass();
        paint.getClass();
        if (text == null) {
            return;
        }
        float f = y;
        RectF rectF = new RectF(x, (paint.ascent() + f) - this.paddingVertical, (this.paddingHorizontal * 2) + paint.measureText(text, start, end) + x + this.borderWidth, paint.descent() + f + this.paddingVertical);
        Paint paint2 = new Paint(paint);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.borderWidth);
        paint2.setColor(this.borderColor);
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f2, f2, paint2);
        canvas.drawText(text, start, end, x + this.paddingHorizontal + this.borderWidth, f, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        paint.getClass();
        return (int) ((2 * this.paddingHorizontal) + paint.measureText(text, start, end) + this.borderWidth);
    }

    public BorderSpan(int i, float f, float f2, float f3, float f4) {
        this.borderColor = i;
        this.borderWidth = f;
        this.cornerRadius = f2;
        this.paddingHorizontal = f3;
        this.paddingVertical = f4;
    }
}
