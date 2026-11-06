package com.amazon.apl.android.scaling;

import com.amazon.apl.android.scaling.Scaling;
import com.amazon.apl.enums.ViewportMode;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_Scaling_ViewportSpecification extends Scaling.ViewportSpecification {
    private final int maxHeight;
    private final int maxWidth;
    private final int minHeight;
    private final int minWidth;
    private final ViewportMode mode;
    private final boolean round;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Scaling.ViewportSpecification.Builder {
        private Integer maxHeight;
        private Integer maxWidth;
        private Integer minHeight;
        private Integer minWidth;
        private ViewportMode mode;
        private Boolean round;

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification build() {
            String str = this.minWidth == null ? " minWidth" : "";
            if (this.maxWidth == null) {
                str = str.concat(" maxWidth");
            }
            if (this.minHeight == null) {
                str = str.concat(" minHeight");
            }
            if (this.maxHeight == null) {
                str = str.concat(" maxHeight");
            }
            if (this.round == null) {
                str = str.concat(" round");
            }
            if (this.mode == null) {
                str = str.concat(" mode");
            }
            if (str.isEmpty()) {
                return new AutoValue_Scaling_ViewportSpecification(this.minWidth.intValue(), this.maxWidth.intValue(), this.minHeight.intValue(), this.maxHeight.intValue(), this.round.booleanValue(), this.mode);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder maxHeight(int i) {
            this.maxHeight = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder maxWidth(int i) {
            this.maxWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder minHeight(int i) {
            this.minHeight = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder minWidth(int i) {
            this.minWidth = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder mode(ViewportMode viewportMode) {
            if (viewportMode != null) {
                this.mode = viewportMode;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null mode");
            return null;
        }

        @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification.Builder
        public Scaling.ViewportSpecification.Builder round(boolean z) {
            this.round = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_Scaling_ViewportSpecification(int i, int i2, int i3, int i4, boolean z, ViewportMode viewportMode) {
        this.minWidth = i;
        this.maxWidth = i2;
        this.minHeight = i3;
        this.maxHeight = i4;
        this.round = z;
        this.mode = viewportMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Scaling.ViewportSpecification) {
            Scaling.ViewportSpecification viewportSpecification = (Scaling.ViewportSpecification) obj;
            if (this.minWidth == viewportSpecification.getMinWidth() && this.maxWidth == viewportSpecification.getMaxWidth() && this.minHeight == viewportSpecification.getMinHeight() && this.maxHeight == viewportSpecification.getMaxHeight() && this.round == viewportSpecification.isRound() && this.mode.equals(viewportSpecification.getMode())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public int getMinHeight() {
        return this.minHeight;
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public int getMinWidth() {
        return this.minWidth;
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public ViewportMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode() ^ ((((((((((this.minWidth ^ 1000003) * 1000003) ^ this.maxWidth) * 1000003) ^ this.minHeight) * 1000003) ^ this.maxHeight) * 1000003) ^ (this.round ? 1231 : 1237)) * 1000003);
    }

    @Override // com.amazon.apl.android.scaling.Scaling.ViewportSpecification
    public boolean isRound() {
        return this.round;
    }

    public String toString() {
        return "ViewportSpecification{minWidth=" + this.minWidth + ", maxWidth=" + this.maxWidth + ", minHeight=" + this.minHeight + ", maxHeight=" + this.maxHeight + ", round=" + this.round + ", mode=" + this.mode + StringSubstitutor.DEFAULT_VAR_END;
    }
}
