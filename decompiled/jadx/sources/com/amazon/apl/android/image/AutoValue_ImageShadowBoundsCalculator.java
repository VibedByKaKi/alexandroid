package com.amazon.apl.android.image;

import com.amazon.apl.android.image.ImageShadowBoundsCalculator;
import com.amazon.apl.android.primitive.Rect;
import com.amazon.apl.enums.ImageAlign;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ImageShadowBoundsCalculator extends ImageShadowBoundsCalculator {
    private final ImageAlign align;
    private final Rect bounds;
    private final android.graphics.Rect imageBounds;
    private final Rect innerBounds;
    private final int offsetX;
    private final int offsetY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ImageShadowBoundsCalculator.Builder {
        private ImageAlign align;
        private Rect bounds;
        private android.graphics.Rect imageBounds;
        private Rect innerBounds;
        private Integer offsetX;
        private Integer offsetY;

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder align(ImageAlign imageAlign) {
            if (imageAlign != null) {
                this.align = imageAlign;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null align");
            return null;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder bounds(Rect rect) {
            if (rect != null) {
                this.bounds = rect;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null bounds");
            return null;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator build() {
            String str = this.imageBounds == null ? " imageBounds" : "";
            if (this.align == null) {
                str = str.concat(" align");
            }
            if (this.bounds == null) {
                str = str.concat(" bounds");
            }
            if (this.innerBounds == null) {
                str = str.concat(" innerBounds");
            }
            if (this.offsetX == null) {
                str = str.concat(" offsetX");
            }
            if (this.offsetY == null) {
                str = str.concat(" offsetY");
            }
            if (str.isEmpty()) {
                return new AutoValue_ImageShadowBoundsCalculator(this.imageBounds, this.align, this.bounds, this.innerBounds, this.offsetX.intValue(), this.offsetY.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder imageBounds(android.graphics.Rect rect) {
            if (rect != null) {
                this.imageBounds = rect;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null imageBounds");
            return null;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder innerBounds(Rect rect) {
            if (rect != null) {
                this.innerBounds = rect;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null innerBounds");
            return null;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder offsetX(int i) {
            this.offsetX = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator.Builder
        public ImageShadowBoundsCalculator.Builder offsetY(int i) {
            this.offsetY = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_ImageShadowBoundsCalculator(android.graphics.Rect rect, ImageAlign imageAlign, Rect rect2, Rect rect3, int i, int i2) {
        this.imageBounds = rect;
        this.align = imageAlign;
        this.bounds = rect2;
        this.innerBounds = rect3;
        this.offsetX = i;
        this.offsetY = i2;
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public ImageAlign align() {
        return this.align;
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public Rect bounds() {
        return this.bounds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageShadowBoundsCalculator) {
            ImageShadowBoundsCalculator imageShadowBoundsCalculator = (ImageShadowBoundsCalculator) obj;
            if (this.imageBounds.equals(imageShadowBoundsCalculator.imageBounds()) && this.align.equals(imageShadowBoundsCalculator.align()) && this.bounds.equals(imageShadowBoundsCalculator.bounds()) && this.innerBounds.equals(imageShadowBoundsCalculator.innerBounds()) && this.offsetX == imageShadowBoundsCalculator.offsetX() && this.offsetY == imageShadowBoundsCalculator.offsetY()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.offsetY ^ ((((((((((this.imageBounds.hashCode() ^ 1000003) * 1000003) ^ this.align.hashCode()) * 1000003) ^ this.bounds.hashCode()) * 1000003) ^ this.innerBounds.hashCode()) * 1000003) ^ this.offsetX) * 1000003);
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public android.graphics.Rect imageBounds() {
        return this.imageBounds;
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public Rect innerBounds() {
        return this.innerBounds;
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public int offsetX() {
        return this.offsetX;
    }

    @Override // com.amazon.apl.android.image.ImageShadowBoundsCalculator
    public int offsetY() {
        return this.offsetY;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageShadowBoundsCalculator{imageBounds=");
        sb.append(this.imageBounds);
        sb.append(", align=");
        sb.append(this.align);
        sb.append(", bounds=");
        sb.append(this.bounds);
        sb.append(", innerBounds=");
        sb.append(this.innerBounds);
        sb.append(", offsetX=");
        sb.append(this.offsetX);
        sb.append(", offsetY=");
        return a$$ExternalSyntheticOutline0.m(sb, this.offsetY, StringSubstitutor.DEFAULT_VAR_END);
    }
}
