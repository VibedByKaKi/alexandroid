package com.amazon.apl.android.primitive;

import androidx.annotation.NonNull;
import com.amazon.apl.android.primitive.AutoValue_Radii;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Radii {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder bottomLeft(float f);

        public abstract Builder bottomRight(float f);

        public abstract Radii build();

        public abstract Builder topLeft(float f);

        public abstract Builder topRight(float f);
    }

    public static Builder builder() {
        return new AutoValue_Radii.Builder();
    }

    public static Radii create(BoundObject boundObject, APLEnum aPLEnum, @NonNull IMetricsTransform iMetricsTransform) {
        return builder().topLeft(iMetricsTransform.toViewhost(nGetTopLeft(boundObject.getNativeHandle(), aPLEnum.getIndex()))).topRight(iMetricsTransform.toViewhost(nGetTopRight(boundObject.getNativeHandle(), aPLEnum.getIndex()))).bottomRight(iMetricsTransform.toViewhost(nGetBottomRight(boundObject.getNativeHandle(), aPLEnum.getIndex()))).bottomLeft(iMetricsTransform.toViewhost(nGetBottomLeft(boundObject.getNativeHandle(), aPLEnum.getIndex()))).build();
    }

    private static native float nGetBottomLeft(long j, int i);

    private static native float nGetBottomRight(long j, int i);

    private static native float nGetTopLeft(long j, int i);

    private static native float nGetTopRight(long j, int i);

    public abstract float bottomLeft();

    public abstract float bottomRight();

    public Radii inset(float f) {
        return builder().topLeft(Math.max(0.0f, topLeft() - f)).topRight(Math.max(0.0f, topRight() - f)).bottomRight(Math.max(0.0f, bottomRight() - f)).bottomLeft(Math.max(0.0f, bottomLeft() - f)).build();
    }

    public float[] toFloatArray() {
        return new float[]{topLeft(), topLeft(), topRight(), topRight(), bottomRight(), bottomRight(), bottomLeft(), bottomLeft()};
    }

    public abstract float topLeft();

    public abstract float topRight();

    public static Radii create(float f) {
        return builder().topLeft(f).topRight(f).bottomRight(f).bottomLeft(f).build();
    }

    public static Radii create(float f, float f2, float f3, float f4) {
        return builder().topLeft(f).topRight(f2).bottomRight(f3).bottomLeft(f4).build();
    }
}
