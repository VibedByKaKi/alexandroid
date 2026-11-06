package com.here.sdk.routing;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVDetails {
    public double consumptionInKilowattHour;

    public EVDetails(double d) {
        this.consumptionInKilowattHour = d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EVDetails) && Double.compare(this.consumptionInKilowattHour, ((EVDetails) obj).consumptionInKilowattHour) == 0;
    }

    public int hashCode() {
        return JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.consumptionInKilowattHour) ^ (Double.doubleToLongBits(this.consumptionInKilowattHour) >>> 32)));
    }
}
