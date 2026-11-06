package com.amazon.apl.android.primitive;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.primitive.Gradient;
import com.amazon.apl.enums.GradientSpreadMethod;
import com.amazon.apl.enums.GradientType;
import com.amazon.apl.enums.GradientUnits;
import java.util.Arrays;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_Gradient extends Gradient {
    private final float angle;
    private final float centerX;
    private final float centerY;
    private final int[] colorRange;
    private final float[] inputRange;
    private final float radius;
    private final GradientSpreadMethod spreadMethod;
    private final GradientType type;
    private final GradientUnits units;
    private final float x1;
    private final float x2;
    private final float y1;
    private final float y2;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Gradient.Builder {
        private Float angle;
        private Float centerX;
        private Float centerY;
        private int[] colorRange;
        private float[] inputRange;
        private Float radius;
        private GradientSpreadMethod spreadMethod;
        private GradientType type;
        private GradientUnits units;
        private Float x1;
        private Float x2;
        private Float y1;
        private Float y2;

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder angle(float f) {
            this.angle = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient build() {
            String str = this.type == null ? " type" : "";
            if (this.angle == null) {
                str = str.concat(" angle");
            }
            if (this.inputRange == null) {
                str = str.concat(" inputRange");
            }
            if (this.colorRange == null) {
                str = str.concat(" colorRange");
            }
            if (this.x1 == null) {
                str = str.concat(" x1");
            }
            if (this.y1 == null) {
                str = str.concat(" y1");
            }
            if (this.x2 == null) {
                str = str.concat(" x2");
            }
            if (this.y2 == null) {
                str = str.concat(" y2");
            }
            if (this.centerX == null) {
                str = str.concat(" centerX");
            }
            if (this.centerY == null) {
                str = str.concat(" centerY");
            }
            if (this.radius == null) {
                str = str.concat(" radius");
            }
            if (str.isEmpty()) {
                return new AutoValue_Gradient(this.type, this.angle.floatValue(), this.inputRange, this.colorRange, this.x1.floatValue(), this.y1.floatValue(), this.x2.floatValue(), this.y2.floatValue(), this.centerX.floatValue(), this.centerY.floatValue(), this.radius.floatValue(), this.spreadMethod, this.units);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder centerX(float f) {
            this.centerX = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder centerY(float f) {
            this.centerY = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder colorRange(int[] iArr) {
            if (iArr != null) {
                this.colorRange = iArr;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null colorRange");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder inputRange(float[] fArr) {
            if (fArr != null) {
                this.inputRange = fArr;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null inputRange");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder radius(float f) {
            this.radius = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder spreadMethod(GradientSpreadMethod gradientSpreadMethod) {
            this.spreadMethod = gradientSpreadMethod;
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder type(GradientType gradientType) {
            if (gradientType != null) {
                this.type = gradientType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder units(GradientUnits gradientUnits) {
            this.units = gradientUnits;
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder x1(float f) {
            this.x1 = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder x2(float f) {
            this.x2 = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder y1(float f) {
            this.y1 = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.Gradient.Builder
        public Gradient.Builder y2(float f) {
            this.y2 = Float.valueOf(f);
            return this;
        }
    }

    private AutoValue_Gradient(GradientType gradientType, float f, float[] fArr, int[] iArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @Nullable GradientSpreadMethod gradientSpreadMethod, @Nullable GradientUnits gradientUnits) {
        this.type = gradientType;
        this.angle = f;
        this.inputRange = fArr;
        this.colorRange = iArr;
        this.x1 = f2;
        this.y1 = f3;
        this.x2 = f4;
        this.y2 = f5;
        this.centerX = f6;
        this.centerY = f7;
        this.radius = f8;
        this.spreadMethod = gradientSpreadMethod;
        this.units = gradientUnits;
    }

    public boolean equals(Object obj) {
        GradientSpreadMethod gradientSpreadMethod;
        GradientUnits gradientUnits;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Gradient) {
            Gradient gradient = (Gradient) obj;
            if (this.type.equals(gradient.getType()) && Float.floatToIntBits(this.angle) == Float.floatToIntBits(gradient.getAngle())) {
                boolean z = gradient instanceof AutoValue_Gradient;
                if (Arrays.equals(this.inputRange, z ? ((AutoValue_Gradient) gradient).inputRange : gradient.getInputRange())) {
                    if (Arrays.equals(this.colorRange, z ? ((AutoValue_Gradient) gradient).colorRange : gradient.getColorRange()) && Float.floatToIntBits(this.x1) == Float.floatToIntBits(gradient.getX1()) && Float.floatToIntBits(this.y1) == Float.floatToIntBits(gradient.getY1()) && Float.floatToIntBits(this.x2) == Float.floatToIntBits(gradient.getX2()) && Float.floatToIntBits(this.y2) == Float.floatToIntBits(gradient.getY2()) && Float.floatToIntBits(this.centerX) == Float.floatToIntBits(gradient.getCenterX()) && Float.floatToIntBits(this.centerY) == Float.floatToIntBits(gradient.getCenterY()) && Float.floatToIntBits(this.radius) == Float.floatToIntBits(gradient.getRadius()) && ((gradientSpreadMethod = this.spreadMethod) != null ? gradientSpreadMethod.equals(gradient.getSpreadMethod()) : gradient.getSpreadMethod() == null) && ((gradientUnits = this.units) != null ? gradientUnits.equals(gradient.getUnits()) : gradient.getUnits() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getAngle() {
        return this.angle;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getCenterX() {
        return this.centerX;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getCenterY() {
        return this.centerY;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    @NonNull
    public int[] getColorRange() {
        return this.colorRange;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    @NonNull
    public float[] getInputRange() {
        return this.inputRange;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getRadius() {
        return this.radius;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    @Nullable
    public GradientSpreadMethod getSpreadMethod() {
        return this.spreadMethod;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    @NonNull
    public GradientType getType() {
        return this.type;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    @Nullable
    public GradientUnits getUnits() {
        return this.units;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getX1() {
        return this.x1;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getX2() {
        return this.x2;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getY1() {
        return this.y1;
    }

    @Override // com.amazon.apl.android.primitive.Gradient
    public float getY2() {
        return this.y2;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.angle)) * 1000003) ^ Arrays.hashCode(this.inputRange)) * 1000003) ^ Arrays.hashCode(this.colorRange)) * 1000003) ^ Float.floatToIntBits(this.x1)) * 1000003) ^ Float.floatToIntBits(this.y1)) * 1000003) ^ Float.floatToIntBits(this.x2)) * 1000003) ^ Float.floatToIntBits(this.y2)) * 1000003) ^ Float.floatToIntBits(this.centerX)) * 1000003) ^ Float.floatToIntBits(this.centerY)) * 1000003) ^ Float.floatToIntBits(this.radius)) * 1000003;
        GradientSpreadMethod gradientSpreadMethod = this.spreadMethod;
        int hashCode2 = (hashCode ^ (gradientSpreadMethod == null ? 0 : gradientSpreadMethod.hashCode())) * 1000003;
        GradientUnits gradientUnits = this.units;
        return hashCode2 ^ (gradientUnits != null ? gradientUnits.hashCode() : 0);
    }

    public String toString() {
        return "Gradient{type=" + this.type + ", angle=" + this.angle + ", inputRange=" + Arrays.toString(this.inputRange) + ", colorRange=" + Arrays.toString(this.colorRange) + ", x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ", radius=" + this.radius + ", spreadMethod=" + this.spreadMethod + ", units=" + this.units + StringSubstitutor.DEFAULT_VAR_END;
    }
}
