package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Px;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LastLineSpacingSpan implements LineHeightSpan {
    private final int spacing;

    public LastLineSpacingSpan(@Px int i) {
        this.spacing = i;
    }

    @NonNull
    public static LastLineSpacingSpan create(@Px int i) {
        return new LastLineSpacingSpan(i);
    }

    private static boolean selfEnd(int i, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        return spanEnd == i || spanEnd == i - 1;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (selfEnd(i2, charSequence, this)) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.spacing;
            fontMetricsInt.descent = i5 + i6;
            fontMetricsInt.bottom += i6;
        }
    }
}
