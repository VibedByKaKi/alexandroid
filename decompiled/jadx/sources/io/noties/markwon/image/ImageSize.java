package io.noties.markwon.image;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ImageSize {
    public final Dimension height;
    public final Dimension width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Dimension {
        public final String unit;
        public final float value;

        public Dimension(float f, @Nullable String str) {
            this.value = f;
            this.unit = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Dimension{value=");
            sb.append(this.value);
            sb.append(", unit='");
            return a$$ExternalSyntheticOutline0.m(sb, this.unit, "'}");
        }
    }

    public ImageSize(@Nullable Dimension dimension, @Nullable Dimension dimension2) {
        this.width = dimension;
        this.height = dimension2;
    }

    public String toString() {
        return "ImageSize{width=" + this.width + ", height=" + this.height + AbstractJsonLexerKt.END_OBJ;
    }
}
