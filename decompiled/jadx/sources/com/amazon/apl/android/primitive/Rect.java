package com.amazon.apl.android.primitive;

import androidx.annotation.NonNull;
import com.amazon.apl.android.primitive.AutoValue_Rect;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Rect {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Rect build();

        public abstract Builder height(float f);

        public abstract Builder left(float f);

        public abstract Builder top(float f);

        public abstract Builder width(float f);
    }

    public static Builder builder() {
        return new AutoValue_Rect.Builder();
    }

    public static Rect create(BoundObject boundObject, APLEnum aPLEnum, @NonNull IMetricsTransform iMetricsTransform) {
        float[] nGetRect = nGetRect(boundObject.getNativeHandle(), aPLEnum.getIndex());
        return builder().left(iMetricsTransform.toViewhost(nGetRect[0])).top(iMetricsTransform.toViewhost(nGetRect[1])).width(iMetricsTransform.toViewhost(nGetRect[2])).height(iMetricsTransform.toViewhost(nGetRect[3])).build();
    }

    private static native float[] nGetRect(long j, int i);

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

    public Rect inset(float f) {
        Builder pVar = builder().left(getLeft() + f).top(getTop() + f);
        float f2 = f * 2.0f;
        return pVar.width(Math.max(0.0f, getWidth() - f2)).height(Math.max(0.0f, getHeight() - f2)).build();
    }

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
