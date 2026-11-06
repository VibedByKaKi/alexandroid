package com.amazon.apl.android.scaling;

import com.amazon.apl.android.scaling.AutoValue_ViewportMetrics;
import com.amazon.apl.enums.ScreenShape;
import com.amazon.apl.enums.ViewportMode;
import com.google.auto.value.AutoValue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ViewportMetrics {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ViewportMetrics build();

        public abstract Builder dpi(int i);

        public abstract Builder height(int i);

        public abstract Builder maxHeight(int i);

        public abstract Builder maxWidth(int i);

        public abstract Builder minHeight(int i);

        public abstract Builder minWidth(int i);

        public abstract Builder mode(ViewportMode viewportMode);

        public abstract Builder scaling(Scaling scaling);

        public abstract Builder shape(ScreenShape screenShape);

        public abstract Builder theme(String str);

        public abstract Builder width(int i);
    }

    public static Builder builder() {
        return new AutoValue_ViewportMetrics.Builder().scaling(new Scaling()).minHeight(0).maxHeight(0).minWidth(0).maxWidth(0);
    }

    public float density() {
        return dpi() / 160;
    }

    public abstract int dpi();

    public abstract int height();

    public abstract int maxHeight();

    public abstract int maxWidth();

    public abstract int minHeight();

    public abstract int minWidth();

    public abstract ViewportMode mode();

    public abstract Scaling scaling();

    public abstract ScreenShape shape();

    public abstract String theme();

    public String toString() {
        return "ViewportMetrics{width=" + width() + ", minWidth=" + minWidth() + ", maxWidth=" + maxWidth() + ", height=" + height() + ", minHeight=" + minHeight() + ", maxHeight=" + maxHeight() + ", dpi=" + dpi() + ", shape=" + shape() + ", theme='" + theme() + "', mode=" + mode() + ", density=" + density() + AbstractJsonLexerKt.END_OBJ;
    }

    public abstract int width();
}
