package com.amazon.apl.android.primitive;

import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class AccessibilityAdjustableRange {
    public static AccessibilityAdjustableRange create(BoundObject boundObject, APLEnum aPLEnum) {
        return new AutoValue_AccessibilityAdjustableRange(nGetMinValue(boundObject.getNativeHandle(), aPLEnum.getIndex()), nGetMaxValue(boundObject.getNativeHandle(), aPLEnum.getIndex()), nGetCurrentValue(boundObject.getNativeHandle(), aPLEnum.getIndex()));
    }

    private static native float nGetCurrentValue(long j, int i);

    private static native float nGetMaxValue(long j, int i);

    private static native float nGetMinValue(long j, int i);

    public abstract float currentValue();

    public abstract float maxValue();

    public abstract float minValue();

    public static AccessibilityAdjustableRange create(float f, float f2, float f3) {
        return new AutoValue_AccessibilityAdjustableRange(f, f2, f3);
    }
}
