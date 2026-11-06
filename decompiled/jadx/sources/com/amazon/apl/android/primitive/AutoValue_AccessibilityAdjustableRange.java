package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_AccessibilityAdjustableRange extends AccessibilityAdjustableRange {
    private final float currentValue;
    private final float maxValue;
    private final float minValue;

    public AutoValue_AccessibilityAdjustableRange(float f, float f2, float f3) {
        this.minValue = f;
        this.maxValue = f2;
        this.currentValue = f3;
    }

    @Override // com.amazon.apl.android.primitive.AccessibilityAdjustableRange
    public float currentValue() {
        return this.currentValue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccessibilityAdjustableRange) {
            AccessibilityAdjustableRange accessibilityAdjustableRange = (AccessibilityAdjustableRange) obj;
            if (Float.floatToIntBits(this.minValue) == Float.floatToIntBits(accessibilityAdjustableRange.minValue()) && Float.floatToIntBits(this.maxValue) == Float.floatToIntBits(accessibilityAdjustableRange.maxValue()) && Float.floatToIntBits(this.currentValue) == Float.floatToIntBits(accessibilityAdjustableRange.currentValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.currentValue) ^ ((((Float.floatToIntBits(this.minValue) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.maxValue)) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.AccessibilityAdjustableRange
    public float maxValue() {
        return this.maxValue;
    }

    @Override // com.amazon.apl.android.primitive.AccessibilityAdjustableRange
    public float minValue() {
        return this.minValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityAdjustableRange{minValue=");
        sb.append(this.minValue);
        sb.append(", maxValue=");
        sb.append(this.maxValue);
        sb.append(", currentValue=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.currentValue);
    }
}
