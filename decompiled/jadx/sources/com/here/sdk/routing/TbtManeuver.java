package com.here.sdk.routing;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TbtManeuver {
    public int distanceToNextManeuverInMeters;
    public int linkIndex;

    public TbtManeuver(int i, int i2) {
        this.distanceToNextManeuverInMeters = i;
        this.linkIndex = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TbtManeuver)) {
            return false;
        }
        TbtManeuver tbtManeuver = (TbtManeuver) obj;
        return this.distanceToNextManeuverInMeters == tbtManeuver.distanceToNextManeuverInMeters && this.linkIndex == tbtManeuver.linkIndex;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + this.distanceToNextManeuverInMeters) * 31) + this.linkIndex;
    }
}
