package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CustomTypefaceSpan extends MetricAffectingSpan {
    private final boolean mergeStyles;
    private final Typeface typeface;

    public CustomTypefaceSpan(@NonNull Typeface typeface, boolean z) {
        this.typeface = typeface;
        this.mergeStyles = z;
    }

    @NonNull
    public static CustomTypefaceSpan create(@NonNull Typeface typeface) {
        return create(typeface, false);
    }

    private void updatePaint(@NonNull TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (!this.mergeStyles || typeface == null || typeface.getStyle() == 0) {
            textPaint.setTypeface(this.typeface);
        } else {
            textPaint.setTypeface(Typeface.create(this.typeface, typeface.getStyle() | this.typeface.getStyle()));
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NonNull TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @NonNull
    public static CustomTypefaceSpan create(@NonNull Typeface typeface, boolean z) {
        return new CustomTypefaceSpan(typeface, z);
    }

    @Deprecated
    public CustomTypefaceSpan(@NonNull Typeface typeface) {
        this(typeface, false);
    }
}
