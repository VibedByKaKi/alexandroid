package com.amazon.apl.android;

import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.apl.android.AutoValue_StaticLayoutBuilder;
import com.google.auto.value.AutoValue;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class StaticLayoutBuilder {
    private static final String TAG = "StaticLayoutBuilder";
    private static Constructor sConstructor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder alignment(Layout.Alignment alignment);

        public abstract Builder aplVersionCode(int i);

        public StaticLayout build() throws LayoutBuilderException {
            return get().build();
        }

        public abstract Builder ellipsizedWidth(int i);

        public abstract StaticLayoutBuilder get();

        public abstract Builder innerWidth(int i);

        public abstract Builder limitLines(boolean z);

        public abstract Builder lineSpacing(float f);

        public abstract Builder maxLines(int i);

        public abstract Builder text(@NonNull CharSequence charSequence);

        public abstract Builder textDirection(TextDirectionHeuristic textDirectionHeuristic);

        public abstract Builder textPaint(@NonNull TextPaint textPaint);

        public abstract Builder useFixLineHeightCalculation(boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LayoutBuilderException extends Exception {
        public LayoutBuilderException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Builder create() {
        return new AutoValue_StaticLayoutBuilder.Builder().text("").lineSpacing(0.0f).aplVersionCode(0).textDirection(TextDirectionHeuristics.LTR).useFixLineHeightCalculation(false);
    }

    private float getAdjustedLineSpacing() {
        if (useFixLineHeightCalculation()) {
            return 1.0f;
        }
        Paint.FontMetrics fontMetrics = textPaint().getFontMetrics();
        float abs = Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent);
        return abs == 0.0f ? lineSpacing() : Math.abs(lineSpacing() * fontMetrics.ascent) / abs;
    }

    public abstract Layout.Alignment alignment();

    public abstract int aplVersionCode();

    @NonNull
    public StaticLayout build() throws LayoutBuilderException {
        StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(text(), 0, text().length(), textPaint(), innerWidth()).setAlignment(alignment()).setLineSpacing(0.0f, getAdjustedLineSpacing()).setBreakStrategy(0).setMaxLines(limitLines() ? maxLines() : Integer.MAX_VALUE).setTextDirection(textDirection());
        if (limitLines()) {
            textDirection.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(ellipsizedWidth());
        }
        textDirection.setUseLineSpacingFromFallbacks(true);
        return textDirection.build();
    }

    public abstract int ellipsizedWidth();

    public abstract int innerWidth();

    public abstract boolean limitLines();

    public abstract float lineSpacing();

    public abstract int maxLines();

    public abstract CharSequence text();

    public abstract TextDirectionHeuristic textDirection();

    public abstract TextPaint textPaint();

    public abstract boolean useFixLineHeightCalculation();
}
