package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PedestrianProfile {
    public double walkingSpeedInMetersPerSecond = 1.0d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PedestrianProfile) && Double.compare(this.walkingSpeedInMetersPerSecond, ((PedestrianProfile) obj).walkingSpeedInMetersPerSecond) == 0;
    }

    public int hashCode() {
        return JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.walkingSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.walkingSpeedInMetersPerSecond) >>> 32)));
    }
}
