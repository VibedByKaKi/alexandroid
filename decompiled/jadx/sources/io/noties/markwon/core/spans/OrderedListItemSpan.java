package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.LeadingMarginUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class OrderedListItemSpan implements LeadingMarginSpan {
    private int margin;
    private final String number;
    private final Paint paint = ObjectsPool.paint();
    private final MarkwonTheme theme;

    public OrderedListItemSpan(@NonNull MarkwonTheme markwonTheme, @NonNull String str) {
        this.theme = markwonTheme;
        this.number = str;
    }

    public static void measure(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            OrderedListItemSpan[] orderedListItemSpanArr = (OrderedListItemSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), OrderedListItemSpan.class);
            if (orderedListItemSpanArr != null) {
                TextPaint paint = textView.getPaint();
                for (OrderedListItemSpan orderedListItemSpan : orderedListItemSpanArr) {
                    orderedListItemSpan.margin = (int) (paint.measureText(orderedListItemSpan.number) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && LeadingMarginUtils.selfStart(i6, charSequence, this)) {
            this.paint.set(paint);
            this.theme.applyListItemStyle(this.paint);
            int measureText = (int) (this.paint.measureText(this.number) + 0.5f);
            int blockMargin = this.theme.getBlockMargin();
            if (measureText > blockMargin) {
                this.margin = measureText;
                blockMargin = measureText;
            } else {
                this.margin = 0;
            }
            if (i2 > 0) {
                i8 = ((blockMargin * i2) + i) - measureText;
            } else {
                i8 = (blockMargin - measureText) + (i2 * blockMargin) + i;
            }
            canvas.drawText(this.number, i8, i4, this.paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.margin, this.theme.getBlockMargin());
    }
}
