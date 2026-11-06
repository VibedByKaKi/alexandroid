package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.AutoValue_SGRadii;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SGRadii {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder bottomLeft(float f);

        public abstract Builder bottomRight(float f);

        public abstract SGRadii build();

        public abstract Builder topLeft(float f);

        public abstract Builder topRight(float f);
    }

    public static Builder builder() {
        return new AutoValue_SGRadii.Builder();
    }

    public static SGRadii create(float[] fArr) {
        return builder().topLeft(fArr[0]).topRight(fArr[1]).bottomRight(fArr[2]).bottomLeft(fArr[3]).build();
    }

    public abstract float bottomLeft();

    public abstract float bottomRight();

    public float[] toFloatArray() {
        return new float[]{topLeft(), topLeft(), topRight(), topRight(), bottomRight(), bottomRight(), bottomLeft(), bottomLeft()};
    }

    public abstract float topLeft();

    public abstract float topRight();
}
