package com.amazon.alexa.voice.ui.onedesign.widget.gradient;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Gradient implements GradientModel {
    private final int bottomColor;
    private final int height;
    private final int topColor;
    private final int width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        int bottomColor;
        int height;
        int topColor;
        int width;

        public Builder bottomColor(int i) {
            this.bottomColor = i;
            return this;
        }

        public Gradient build() {
            return new Gradient(this);
        }

        public Builder height(int i) {
            this.height = i;
            return this;
        }

        public Builder topColor(int i) {
            this.topColor = i;
            return this;
        }

        public Builder width(int i) {
            this.width = i;
            return this;
        }
    }

    public Gradient(Builder builder) {
        this.topColor = builder.topColor;
        this.bottomColor = builder.bottomColor;
        this.width = builder.width;
        this.height = builder.height;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Gradient.class != obj.getClass()) {
            return false;
        }
        Gradient gradient = (Gradient) obj;
        return this.topColor == gradient.topColor && this.bottomColor == gradient.bottomColor && this.width == gradient.width && this.height == gradient.height;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientModel
    public int getBottomColor() {
        return this.bottomColor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientModel
    public int getHeight() {
        return this.height;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientModel
    public int getTopColor() {
        return this.topColor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientModel
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((((JfifUtil.MARKER_EOI + this.topColor) * 31) + this.bottomColor) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Gradient{topColor=");
        sb.append(this.topColor);
        sb.append(", bottomColor=");
        sb.append(this.bottomColor);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.height, AbstractJsonLexerKt.END_OBJ);
    }
}
