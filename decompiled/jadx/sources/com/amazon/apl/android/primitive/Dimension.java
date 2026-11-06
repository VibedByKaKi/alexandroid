package com.amazon.apl.android.primitive;

import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Dimension {
    public static Dimension create(BoundObject boundObject, APLEnum aPLEnum, IMetricsTransform iMetricsTransform) {
        return new AutoValue_Dimension(iMetricsTransform.toViewhost((float) nGetValue(boundObject.getNativeHandle(), aPLEnum.getIndex())));
    }

    private static native double nGetValue(long j, int i);

    public int intValue() {
        return Math.round(value());
    }

    public abstract float value();

    public static Dimension create(float f) {
        return new AutoValue_Dimension(f);
    }
}
