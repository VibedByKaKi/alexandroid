package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoOrientationUpdate {

    @Nullable
    public final Double bearing;

    @Nullable
    public final Double tilt;

    public GeoOrientationUpdate(@Nullable Double d, @Nullable Double d2) {
        GeoOrientationUpdate make = make(d, d2);
        this.bearing = make.bearing;
        this.tilt = make.tilt;
    }

    private static native GeoOrientationUpdate make(@NonNull GeoOrientation geoOrientation);

    private static native GeoOrientationUpdate make(@Nullable Double d, @Nullable Double d2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoOrientationUpdate)) {
            return false;
        }
        GeoOrientationUpdate geoOrientationUpdate = (GeoOrientationUpdate) obj;
        return Objects.equals(this.bearing, geoOrientationUpdate.bearing) && Objects.equals(this.tilt, geoOrientationUpdate.tilt);
    }

    public int hashCode() {
        Double d = this.bearing;
        int hashCode = (JfifUtil.MARKER_EOI + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.tilt;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public GeoOrientationUpdate(@NonNull GeoOrientation geoOrientation) {
        GeoOrientationUpdate make = make(geoOrientation);
        this.bearing = make.bearing;
        this.tilt = make.tilt;
    }
}
