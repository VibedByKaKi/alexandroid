package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.SGRRect;
import java.util.Arrays;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SGRRect extends SGRRect {
    private final float bottom;
    private final float left;
    private final float[] radii;
    private final float right;
    private final float top;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SGRRect.Builder {
        private Float bottom;
        private Float left;
        private float[] radii;
        private Float right;
        private Float top;

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect.Builder bottom(float f) {
            this.bottom = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect build() {
            String str = this.left == null ? " left" : "";
            if (this.top == null) {
                str = str.concat(" top");
            }
            if (this.right == null) {
                str = str.concat(" right");
            }
            if (this.bottom == null) {
                str = str.concat(" bottom");
            }
            if (this.radii == null) {
                str = str.concat(" radii");
            }
            if (str.isEmpty()) {
                return new AutoValue_SGRRect(this.left.floatValue(), this.top.floatValue(), this.right.floatValue(), this.bottom.floatValue(), this.radii);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect.Builder left(float f) {
            this.left = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect.Builder radii(float[] fArr) {
            if (fArr != null) {
                this.radii = fArr;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null radii");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect.Builder right(float f) {
            this.right = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRRect.Builder
        public SGRRect.Builder top(float f) {
            this.top = Float.valueOf(f);
            return this;
        }
    }

    private AutoValue_SGRRect(float f, float f2, float f3, float f4, float[] fArr) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.radii = fArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SGRRect) {
            SGRRect sGRRect = (SGRRect) obj;
            if (Float.floatToIntBits(this.left) == Float.floatToIntBits(sGRRect.getLeft()) && Float.floatToIntBits(this.top) == Float.floatToIntBits(sGRRect.getTop()) && Float.floatToIntBits(this.right) == Float.floatToIntBits(sGRRect.getRight()) && Float.floatToIntBits(this.bottom) == Float.floatToIntBits(sGRRect.getBottom())) {
                if (Arrays.equals(this.radii, sGRRect instanceof AutoValue_SGRRect ? ((AutoValue_SGRRect) sGRRect).radii : sGRRect.getRadii())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.primitive.SGRRect
    public float getBottom() {
        return this.bottom;
    }

    @Override // com.amazon.apl.android.primitive.SGRRect
    public float getLeft() {
        return this.left;
    }

    @Override // com.amazon.apl.android.primitive.SGRRect
    public float[] getRadii() {
        return this.radii;
    }

    @Override // com.amazon.apl.android.primitive.SGRRect
    public float getRight() {
        return this.right;
    }

    @Override // com.amazon.apl.android.primitive.SGRRect
    public float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Arrays.hashCode(this.radii) ^ ((((((((Float.floatToIntBits(this.left) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.top)) * 1000003) ^ Float.floatToIntBits(this.right)) * 1000003) ^ Float.floatToIntBits(this.bottom)) * 1000003);
    }

    public String toString() {
        return "SGRRect{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", radii=" + Arrays.toString(this.radii) + StringSubstitutor.DEFAULT_VAR_END;
    }
}
