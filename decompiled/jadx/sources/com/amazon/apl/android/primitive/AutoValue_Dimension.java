package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_Dimension extends Dimension {
    private final float value;

    public AutoValue_Dimension(float f) {
        this.value = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Dimension) && Float.floatToIntBits(this.value) == Float.floatToIntBits(((Dimension) obj).value());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value) ^ 1000003;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("Dimension{value="), StringSubstitutor.DEFAULT_VAR_END, this.value);
    }

    @Override // com.amazon.apl.android.primitive.Dimension
    public float value() {
        return this.value;
    }
}
