package com.amazon.apl.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import com.amazon.apl.android.StaticLayoutBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_StaticLayoutBuilder extends StaticLayoutBuilder {
    private final Layout.Alignment alignment;
    private final int aplVersionCode;
    private final int ellipsizedWidth;
    private final int innerWidth;
    private final boolean limitLines;
    private final float lineSpacing;
    private final int maxLines;
    private final CharSequence text;
    private final TextDirectionHeuristic textDirection;
    private final TextPaint textPaint;
    private final boolean useFixLineHeightCalculation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends StaticLayoutBuilder.Builder {
        private Layout.Alignment alignment;
        private Integer aplVersionCode;
        private Integer ellipsizedWidth;
        private Integer innerWidth;
        private Boolean limitLines;
        private Float lineSpacing;
        private Integer maxLines;
        private CharSequence text;
        private TextDirectionHeuristic textDirection;
        private TextPaint textPaint;
        private Boolean useFixLineHeightCalculation;

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder alignment(Layout.Alignment alignment) {
            if (alignment != null) {
                this.alignment = alignment;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null alignment");
            return null;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder aplVersionCode(int i) {
            this.aplVersionCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder ellipsizedWidth(int i) {
            this.ellipsizedWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder get() {
            String str = this.text == null ? " text" : "";
            if (this.textPaint == null) {
                str = str.concat(" textPaint");
            }
            if (this.lineSpacing == null) {
                str = str.concat(" lineSpacing");
            }
            if (this.innerWidth == null) {
                str = str.concat(" innerWidth");
            }
            if (this.alignment == null) {
                str = str.concat(" alignment");
            }
            if (this.limitLines == null) {
                str = str.concat(" limitLines");
            }
            if (this.maxLines == null) {
                str = str.concat(" maxLines");
            }
            if (this.ellipsizedWidth == null) {
                str = str.concat(" ellipsizedWidth");
            }
            if (this.aplVersionCode == null) {
                str = str.concat(" aplVersionCode");
            }
            if (this.textDirection == null) {
                str = str.concat(" textDirection");
            }
            if (this.useFixLineHeightCalculation == null) {
                str = str.concat(" useFixLineHeightCalculation");
            }
            if (str.isEmpty()) {
                return new AutoValue_StaticLayoutBuilder(this.text, this.textPaint, this.lineSpacing.floatValue(), this.innerWidth.intValue(), this.alignment, this.limitLines.booleanValue(), this.maxLines.intValue(), this.ellipsizedWidth.intValue(), this.aplVersionCode.intValue(), this.textDirection, this.useFixLineHeightCalculation.booleanValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder innerWidth(int i) {
            this.innerWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder limitLines(boolean z) {
            this.limitLines = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder lineSpacing(float f) {
            this.lineSpacing = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder maxLines(int i) {
            this.maxLines = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder text(CharSequence charSequence) {
            if (charSequence != null) {
                this.text = charSequence;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null text");
            return null;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder textDirection(TextDirectionHeuristic textDirectionHeuristic) {
            if (textDirectionHeuristic != null) {
                this.textDirection = textDirectionHeuristic;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null textDirection");
            return null;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder textPaint(TextPaint textPaint) {
            if (textPaint != null) {
                this.textPaint = textPaint;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null textPaint");
            return null;
        }

        @Override // com.amazon.apl.android.StaticLayoutBuilder.Builder
        public StaticLayoutBuilder.Builder useFixLineHeightCalculation(boolean z) {
            this.useFixLineHeightCalculation = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_StaticLayoutBuilder(CharSequence charSequence, TextPaint textPaint, float f, int i, Layout.Alignment alignment, boolean z, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, boolean z2) {
        this.text = charSequence;
        this.textPaint = textPaint;
        this.lineSpacing = f;
        this.innerWidth = i;
        this.alignment = alignment;
        this.limitLines = z;
        this.maxLines = i2;
        this.ellipsizedWidth = i3;
        this.aplVersionCode = i4;
        this.textDirection = textDirectionHeuristic;
        this.useFixLineHeightCalculation = z2;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public Layout.Alignment alignment() {
        return this.alignment;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public int aplVersionCode() {
        return this.aplVersionCode;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public int ellipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticLayoutBuilder) {
            StaticLayoutBuilder staticLayoutBuilder = (StaticLayoutBuilder) obj;
            if (this.text.equals(staticLayoutBuilder.text()) && this.textPaint.equals(staticLayoutBuilder.textPaint()) && Float.floatToIntBits(this.lineSpacing) == Float.floatToIntBits(staticLayoutBuilder.lineSpacing()) && this.innerWidth == staticLayoutBuilder.innerWidth() && this.alignment.equals(staticLayoutBuilder.alignment()) && this.limitLines == staticLayoutBuilder.limitLines() && this.maxLines == staticLayoutBuilder.maxLines() && this.ellipsizedWidth == staticLayoutBuilder.ellipsizedWidth() && this.aplVersionCode == staticLayoutBuilder.aplVersionCode() && this.textDirection.equals(staticLayoutBuilder.textDirection()) && this.useFixLineHeightCalculation == staticLayoutBuilder.useFixLineHeightCalculation()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((this.text.hashCode() ^ 1000003) * 1000003) ^ this.textPaint.hashCode()) * 1000003) ^ Float.floatToIntBits(this.lineSpacing)) * 1000003) ^ this.innerWidth) * 1000003) ^ this.alignment.hashCode()) * 1000003) ^ (this.limitLines ? 1231 : 1237)) * 1000003) ^ this.maxLines) * 1000003) ^ this.ellipsizedWidth) * 1000003) ^ this.aplVersionCode) * 1000003) ^ this.textDirection.hashCode()) * 1000003) ^ (this.useFixLineHeightCalculation ? 1231 : 1237);
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public int innerWidth() {
        return this.innerWidth;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public boolean limitLines() {
        return this.limitLines;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public float lineSpacing() {
        return this.lineSpacing;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public int maxLines() {
        return this.maxLines;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public CharSequence text() {
        return this.text;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public TextDirectionHeuristic textDirection() {
        return this.textDirection;
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public TextPaint textPaint() {
        return this.textPaint;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StaticLayoutBuilder{text=");
        sb.append((Object) this.text);
        sb.append(", textPaint=");
        sb.append(this.textPaint);
        sb.append(", lineSpacing=");
        sb.append(this.lineSpacing);
        sb.append(", innerWidth=");
        sb.append(this.innerWidth);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", limitLines=");
        sb.append(this.limitLines);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", ellipsizedWidth=");
        sb.append(this.ellipsizedWidth);
        sb.append(", aplVersionCode=");
        sb.append(this.aplVersionCode);
        sb.append(", textDirection=");
        sb.append(this.textDirection);
        sb.append(", useFixLineHeightCalculation=");
        return a$$ExternalSyntheticOutline0.m(sb, this.useFixLineHeightCalculation, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.StaticLayoutBuilder
    public boolean useFixLineHeightCalculation() {
        return this.useFixLineHeightCalculation;
    }
}
