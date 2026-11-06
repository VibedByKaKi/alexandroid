package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ParameterConfiguration {

    @NonNull
    public Pedestrian pedestrian = new Pedestrian();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Pedestrian {
        public double walkingSpeedInMetersPerSecond = 1.0d;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Pedestrian) && Double.compare(this.walkingSpeedInMetersPerSecond, ((Pedestrian) obj).walkingSpeedInMetersPerSecond) == 0;
        }

        public int hashCode() {
            return JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.walkingSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.walkingSpeedInMetersPerSecond) >>> 32)));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParameterConfiguration) {
            return Objects.equals(this.pedestrian, ((ParameterConfiguration) obj).pedestrian);
        }
        return false;
    }

    public int hashCode() {
        Pedestrian pedestrian = this.pedestrian;
        return JfifUtil.MARKER_EOI + (pedestrian != null ? pedestrian.hashCode() : 0);
    }
}
