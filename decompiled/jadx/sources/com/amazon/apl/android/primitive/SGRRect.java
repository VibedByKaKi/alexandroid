package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.AutoValue_SGRRect;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SGRRect {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder bottom(float f);

        public abstract SGRRect build();

        public abstract Builder left(float f);

        public abstract Builder radii(float[] fArr);

        public abstract Builder right(float f);

        public abstract Builder top(float f);
    }

    public static Builder builder() {
        return new AutoValue_SGRRect.Builder();
    }

    public static SGRRect create(float[] fArr, float[] fArr2) {
        return builder().left(fArr[0]).top(fArr[1]).right(fArr[2]).bottom(fArr[3]).radii(fArr2).build();
    }

    public abstract float getBottom();

    public abstract float getLeft();

    public abstract float[] getRadii();

    public abstract float getRight();

    public abstract float getTop();

    public int intBottom() {
        return Math.round(getBottom());
    }

    public int intLeft() {
        return Math.round(getLeft());
    }

    public int intRight() {
        return Math.round(getRight());
    }

    public int intTop() {
        return Math.round(getTop());
    }
}
