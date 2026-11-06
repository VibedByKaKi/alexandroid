package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import io.noties.markwon.core.MarkwonTheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CodeSpan extends MetricAffectingSpan {
    private final MarkwonTheme theme;

    public CodeSpan(@NonNull MarkwonTheme markwonTheme) {
        this.theme = markwonTheme;
    }

    private void apply(TextPaint textPaint) {
        this.theme.applyCodeTextStyle(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
        textPaint.bgColor = this.theme.getCodeBackgroundColor(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
