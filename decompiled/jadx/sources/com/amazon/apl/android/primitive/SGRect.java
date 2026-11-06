package com.amazon.apl.android.primitive;

import android.graphics.RectF;
import com.amazon.apl.android.primitive.AutoValue_SGRect;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SGRect {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SGRect build();

        public abstract Builder height(float f);

        public abstract Builder left(float f);

        public abstract Builder top(float f);

        public abstract Builder width(float f);
    }

    public static Builder builder() {
        return new AutoValue_SGRect.Builder();
    }

    public static SGRect create(float[] fArr) {
        return builder().left(fArr[0]).top(fArr[1]).width(fArr[2]).height(fArr[3]).build();
    }

    public RectF asRectF() {
        return new RectF(getLeft(), getTop(), getWidth() + getLeft(), getHeight() + getTop());
    }

    public float getBottom() {
        return getHeight() + getTop();
    }

    public abstract float getHeight();

    public abstract float getLeft();

    public float getRight() {
        return getWidth() + getLeft();
    }

    public abstract float getTop();

    public abstract float getWidth();

    public int intBottom() {
        return Math.round(getBottom());
    }

    public int intHeight() {
        return Math.round(getHeight());
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

    public int intWidth() {
        return Math.round(getWidth());
    }
}
