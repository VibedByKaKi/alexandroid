package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.primitive.Rect;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_Rect extends Rect {
    private final float height;
    private final float left;
    private final float top;
    private final float width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Rect.Builder {
        private Float height;
        private Float left;
        private Float top;
        private Float width;

        @Override // com.amazon.apl.android.primitive.Rect.Builder
        public Rect build() {
            String str = this.left == null ? " left" : "";
            if (this.top == null) {
                str = str.concat(" top");
            }
            if (this.width == null) {
                str = str.concat(" width");
            }
            if (this.height == null) {
                str = str.concat(" height");
            }
            if (str.isEmpty()) {
                return new AutoValue_Rect(this.left.floatValue(), this.top.floatValue(), this.width.floatValue(), this.height.floatValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.Rect.Builder
        public Rect.Builder height(float f) {
            this.height = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Rect.Builder
        public Rect.Builder left(float f) {
            this.left = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Rect.Builder
        public Rect.Builder top(float f) {
            this.top = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Rect.Builder
        public Rect.Builder width(float f) {
            this.width = Float.valueOf(f);
            return this;
        }
    }

    private AutoValue_Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.width = f3;
        this.height = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            if (Float.floatToIntBits(this.left) == Float.floatToIntBits(rect.getLeft()) && Float.floatToIntBits(this.top) == Float.floatToIntBits(rect.getTop()) && Float.floatToIntBits(this.width) == Float.floatToIntBits(rect.getWidth()) && Float.floatToIntBits(this.height) == Float.floatToIntBits(rect.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.primitive.Rect
    public float getHeight() {
        return this.height;
    }

    @Override // com.amazon.apl.android.primitive.Rect
    public float getLeft() {
        return this.left;
    }

    @Override // com.amazon.apl.android.primitive.Rect
    public float getTop() {
        return this.top;
    }

    @Override // com.amazon.apl.android.primitive.Rect
    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.height) ^ ((((((Float.floatToIntBits(this.left) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.top)) * 1000003) ^ Float.floatToIntBits(this.width)) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Rect{left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.height);
    }
}
