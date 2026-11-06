package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MaxAxleGroupWeight {

    @NonNull
    public String axleGroupType;
    public int maxWeightInKilograms;

    public MaxAxleGroupWeight(int i, @NonNull String str) {
        this.maxWeightInKilograms = i;
        this.axleGroupType = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxAxleGroupWeight)) {
            return false;
        }
        MaxAxleGroupWeight maxAxleGroupWeight = (MaxAxleGroupWeight) obj;
        return this.maxWeightInKilograms == maxAxleGroupWeight.maxWeightInKilograms && Objects.equals(this.axleGroupType, maxAxleGroupWeight.axleGroupType);
    }

    public int hashCode() {
        int i = (JfifUtil.MARKER_EOI + this.maxWeightInKilograms) * 31;
        String str = this.axleGroupType;
        return i + (str != null ? str.hashCode() : 0);
    }
}
