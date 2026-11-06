package com.here.sdk.transport;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CarSpecifications {

    @Nullable
    public Integer grossWeightInKilograms = null;

    @Nullable
    public Integer heightInCentimeters = null;

    @Nullable
    public Integer widthInCentimeters = null;

    @Nullable
    public Integer lengthInCentimeters = null;

    @Nullable
    public Integer axleCount = null;

    @Nullable
    public Integer trailerCount = null;

    @Nullable
    public Integer trailerAxleCount = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CarSpecifications)) {
            return false;
        }
        CarSpecifications carSpecifications = (CarSpecifications) obj;
        return Objects.equals(this.grossWeightInKilograms, carSpecifications.grossWeightInKilograms) && Objects.equals(this.heightInCentimeters, carSpecifications.heightInCentimeters) && Objects.equals(this.widthInCentimeters, carSpecifications.widthInCentimeters) && Objects.equals(this.lengthInCentimeters, carSpecifications.lengthInCentimeters) && Objects.equals(this.axleCount, carSpecifications.axleCount) && Objects.equals(this.trailerCount, carSpecifications.trailerCount) && Objects.equals(this.trailerAxleCount, carSpecifications.trailerAxleCount);
    }

    public int hashCode() {
        Integer num = this.grossWeightInKilograms;
        int hashCode = (JfifUtil.MARKER_EOI + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.heightInCentimeters;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.widthInCentimeters;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.lengthInCentimeters;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.axleCount;
        int hashCode5 = (hashCode4 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.trailerCount;
        int hashCode6 = (hashCode5 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Integer num7 = this.trailerAxleCount;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }
}
