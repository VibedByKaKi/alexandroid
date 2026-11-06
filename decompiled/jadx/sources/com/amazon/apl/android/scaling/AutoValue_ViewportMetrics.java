package com.amazon.apl.android.scaling;

import com.amazon.apl.android.scaling.ViewportMetrics;
import com.amazon.apl.enums.ScreenShape;
import com.amazon.apl.enums.ViewportMode;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ViewportMetrics extends ViewportMetrics {
    private final int dpi;
    private final int height;
    private final int maxHeight;
    private final int maxWidth;
    private final int minHeight;
    private final int minWidth;
    private final ViewportMode mode;
    private final Scaling scaling;
    private final ScreenShape shape;
    private final String theme;
    private final int width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ViewportMetrics.Builder {
        private Integer dpi;
        private Integer height;
        private Integer maxHeight;
        private Integer maxWidth;
        private Integer minHeight;
        private Integer minWidth;
        private ViewportMode mode;
        private Scaling scaling;
        private ScreenShape shape;
        private String theme;
        private Integer width;

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics build() {
            String str = this.width == null ? " width" : "";
            if (this.minWidth == null) {
                str = str.concat(" minWidth");
            }
            if (this.maxWidth == null) {
                str = str.concat(" maxWidth");
            }
            if (this.height == null) {
                str = str.concat(" height");
            }
            if (this.minHeight == null) {
                str = str.concat(" minHeight");
            }
            if (this.maxHeight == null) {
                str = str.concat(" maxHeight");
            }
            if (this.dpi == null) {
                str = str.concat(" dpi");
            }
            if (this.shape == null) {
                str = str.concat(" shape");
            }
            if (this.theme == null) {
                str = str.concat(" theme");
            }
            if (this.mode == null) {
                str = str.concat(" mode");
            }
            if (this.scaling == null) {
                str = str.concat(" scaling");
            }
            if (str.isEmpty()) {
                return new AutoValue_ViewportMetrics(this.width.intValue(), this.minWidth.intValue(), this.maxWidth.intValue(), this.height.intValue(), this.minHeight.intValue(), this.maxHeight.intValue(), this.dpi.intValue(), this.shape, this.theme, this.mode, this.scaling);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder dpi(int i) {
            this.dpi = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder height(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder maxHeight(int i) {
            this.maxHeight = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder maxWidth(int i) {
            this.maxWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder minHeight(int i) {
            this.minHeight = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder minWidth(int i) {
            this.minWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder mode(ViewportMode viewportMode) {
            if (viewportMode != null) {
                this.mode = viewportMode;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null mode");
            return null;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder scaling(Scaling scaling) {
            if (scaling != null) {
                this.scaling = scaling;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null scaling");
            return null;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder shape(ScreenShape screenShape) {
            if (screenShape != null) {
                this.shape = screenShape;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null shape");
            return null;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder theme(String str) {
            if (str != null) {
                this.theme = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null theme");
            return null;
        }

        @Override // com.amazon.apl.android.scaling.ViewportMetrics.Builder
        public ViewportMetrics.Builder width(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_ViewportMetrics(int i, int i2, int i3, int i4, int i5, int i6, int i7, ScreenShape screenShape, String str, ViewportMode viewportMode, Scaling scaling) {
        this.width = i;
        this.minWidth = i2;
        this.maxWidth = i3;
        this.height = i4;
        this.minHeight = i5;
        this.maxHeight = i6;
        this.dpi = i7;
        this.shape = screenShape;
        this.theme = str;
        this.mode = viewportMode;
        this.scaling = scaling;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int dpi() {
        return this.dpi;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewportMetrics) {
            ViewportMetrics viewportMetrics = (ViewportMetrics) obj;
            if (this.width == viewportMetrics.width() && this.minWidth == viewportMetrics.minWidth() && this.maxWidth == viewportMetrics.maxWidth() && this.height == viewportMetrics.height() && this.minHeight == viewportMetrics.minHeight() && this.maxHeight == viewportMetrics.maxHeight() && this.dpi == viewportMetrics.dpi() && this.shape.equals(viewportMetrics.shape()) && this.theme.equals(viewportMetrics.theme()) && this.mode.equals(viewportMetrics.mode()) && this.scaling.equals(viewportMetrics.scaling())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.scaling.hashCode() ^ ((((((((((((((((((((this.width ^ 1000003) * 1000003) ^ this.minWidth) * 1000003) ^ this.maxWidth) * 1000003) ^ this.height) * 1000003) ^ this.minHeight) * 1000003) ^ this.maxHeight) * 1000003) ^ this.dpi) * 1000003) ^ this.shape.hashCode()) * 1000003) ^ this.theme.hashCode()) * 1000003) ^ this.mode.hashCode()) * 1000003);
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int height() {
        return this.height;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int maxHeight() {
        return this.maxHeight;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int maxWidth() {
        return this.maxWidth;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int minHeight() {
        return this.minHeight;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int minWidth() {
        return this.minWidth;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public ViewportMode mode() {
        return this.mode;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public Scaling scaling() {
        return this.scaling;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public ScreenShape shape() {
        return this.shape;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public String theme() {
        return this.theme;
    }

    @Override // com.amazon.apl.android.scaling.ViewportMetrics
    public int width() {
        return this.width;
    }
}
