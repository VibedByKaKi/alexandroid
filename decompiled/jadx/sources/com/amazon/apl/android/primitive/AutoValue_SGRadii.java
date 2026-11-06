package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.primitive.SGRadii;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SGRadii extends SGRadii {
    private final float bottomLeft;
    private final float bottomRight;
    private final float topLeft;
    private final float topRight;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SGRadii.Builder {
        private Float bottomLeft;
        private Float bottomRight;
        private Float topLeft;
        private Float topRight;

        @Override // com.amazon.apl.android.primitive.SGRadii.Builder
        public SGRadii.Builder bottomLeft(float f) {
            this.bottomLeft = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRadii.Builder
        public SGRadii.Builder bottomRight(float f) {
            this.bottomRight = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRadii.Builder
        public SGRadii build() {
            String str = this.topLeft == null ? " topLeft" : "";
            if (this.topRight == null) {
                str = str.concat(" topRight");
            }
            if (this.bottomRight == null) {
                str = str.concat(" bottomRight");
            }
            if (this.bottomLeft == null) {
                str = str.concat(" bottomLeft");
            }
            if (str.isEmpty()) {
                return new AutoValue_SGRadii(this.topLeft.floatValue(), this.topRight.floatValue(), this.bottomRight.floatValue(), this.bottomLeft.floatValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.SGRadii.Builder
        public SGRadii.Builder topLeft(float f) {
            this.topLeft = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.SGRadii.Builder
        public SGRadii.Builder topRight(float f) {
            this.topRight = Float.valueOf(f);
            return this;
        }
    }

    private AutoValue_SGRadii(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomRight = f3;
        this.bottomLeft = f4;
    }

    @Override // com.amazon.apl.android.primitive.SGRadii
    public float bottomLeft() {
        return this.bottomLeft;
    }

    @Override // com.amazon.apl.android.primitive.SGRadii
    public float bottomRight() {
        return this.bottomRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SGRadii) {
            SGRadii sGRadii = (SGRadii) obj;
            if (Float.floatToIntBits(this.topLeft) == Float.floatToIntBits(sGRadii.topLeft()) && Float.floatToIntBits(this.topRight) == Float.floatToIntBits(sGRadii.topRight()) && Float.floatToIntBits(this.bottomRight) == Float.floatToIntBits(sGRadii.bottomRight()) && Float.floatToIntBits(this.bottomLeft) == Float.floatToIntBits(sGRadii.bottomLeft())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottomLeft) ^ ((((((Float.floatToIntBits(this.topLeft) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.topRight)) * 1000003) ^ Float.floatToIntBits(this.bottomRight)) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SGRadii{topLeft=");
        sb.append(this.topLeft);
        sb.append(", topRight=");
        sb.append(this.topRight);
        sb.append(", bottomRight=");
        sb.append(this.bottomRight);
        sb.append(", bottomLeft=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.bottomLeft);
    }

    @Override // com.amazon.apl.android.primitive.SGRadii
    public float topLeft() {
        return this.topLeft;
    }

    @Override // com.amazon.apl.android.primitive.SGRadii
    public float topRight() {
        return this.topRight;
    }
}
