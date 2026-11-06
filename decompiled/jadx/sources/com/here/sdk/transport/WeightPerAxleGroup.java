package com.here.sdk.transport;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class WeightPerAxleGroup {

    @Nullable
    public Integer singleAxleGroupInKilograms = null;

    @Nullable
    public Integer tandemAxleGroupInKilograms = null;

    @Nullable
    public Integer tripleAxleGroupInKilograms = null;

    @Nullable
    public Integer quadAxleGroupInKilograms = null;

    @Nullable
    public Integer quintAxleGroupInKilograms = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeightPerAxleGroup)) {
            return false;
        }
        WeightPerAxleGroup weightPerAxleGroup = (WeightPerAxleGroup) obj;
        return Objects.equals(this.singleAxleGroupInKilograms, weightPerAxleGroup.singleAxleGroupInKilograms) && Objects.equals(this.tandemAxleGroupInKilograms, weightPerAxleGroup.tandemAxleGroupInKilograms) && Objects.equals(this.tripleAxleGroupInKilograms, weightPerAxleGroup.tripleAxleGroupInKilograms) && Objects.equals(this.quadAxleGroupInKilograms, weightPerAxleGroup.quadAxleGroupInKilograms) && Objects.equals(this.quintAxleGroupInKilograms, weightPerAxleGroup.quintAxleGroupInKilograms);
    }

    public int hashCode() {
        Integer num = this.singleAxleGroupInKilograms;
        int hashCode = (JfifUtil.MARKER_EOI + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.tandemAxleGroupInKilograms;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.tripleAxleGroupInKilograms;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.quadAxleGroupInKilograms;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.quintAxleGroupInKilograms;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }
}
