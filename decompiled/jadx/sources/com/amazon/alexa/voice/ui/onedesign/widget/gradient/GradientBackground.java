package com.amazon.alexa.voice.ui.onedesign.widget.gradient;

import android.graphics.drawable.Drawable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GradientBackground implements GradientBackgroundModel {
    private final int color;
    private final Drawable drawable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        int color;
        Drawable drawable;

        public GradientBackground build() {
            return new GradientBackground(this);
        }

        public Builder color(int i) {
            this.color = i;
            return this;
        }

        public Builder drawable(Drawable drawable) {
            this.drawable = drawable;
            return this;
        }
    }

    public GradientBackground(Builder builder) {
        this.drawable = builder.drawable;
        this.color = builder.color;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GradientBackground.class != obj.getClass()) {
            return false;
        }
        GradientBackground gradientBackground = (GradientBackground) obj;
        Drawable drawable = this.drawable;
        Drawable drawable2 = gradientBackground.drawable;
        if (drawable == null ? drawable2 == null : drawable.equals(drawable2)) {
            return this.color == gradientBackground.color;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientBackgroundModel
    public int getColor() {
        return this.color;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.GradientBackgroundModel
    public Drawable getDrawable() {
        return this.drawable;
    }

    public int hashCode() {
        Drawable drawable = this.drawable;
        return ((JfifUtil.MARKER_EOI + (drawable != null ? drawable.hashCode() : 0)) * 31) + this.color;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GradientBackground{drawable=");
        sb.append(this.drawable);
        sb.append(", color=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.color, AbstractJsonLexerKt.END_OBJ);
    }
}
