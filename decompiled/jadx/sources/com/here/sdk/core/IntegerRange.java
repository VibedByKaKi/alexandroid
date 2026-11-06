package com.here.sdk.core;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class IntegerRange {

    @Nullable
    public Integer max = null;
    public int min;

    public IntegerRange(int i) {
        this.min = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntegerRange)) {
            return false;
        }
        IntegerRange integerRange = (IntegerRange) obj;
        return this.min == integerRange.min && Objects.equals(this.max, integerRange.max);
    }

    public int hashCode() {
        int i = (JfifUtil.MARKER_EOI + this.min) * 31;
        Integer num = this.max;
        return i + (num != null ? num.hashCode() : 0);
    }
}
