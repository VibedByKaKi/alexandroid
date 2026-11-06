package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoOrientation;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoOrientationKeyframe {

    @NonNull
    public final Duration duration;

    @NonNull
    public final GeoOrientation value;

    public GeoOrientationKeyframe(@NonNull GeoOrientation geoOrientation, @NonNull Duration duration) {
        GeoOrientationKeyframe create = create(geoOrientation, duration);
        this.value = create.value;
        this.duration = create.duration;
    }

    private static native GeoOrientationKeyframe create(@NonNull GeoOrientation geoOrientation, @NonNull Duration duration);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoOrientationKeyframe)) {
            return false;
        }
        GeoOrientationKeyframe geoOrientationKeyframe = (GeoOrientationKeyframe) obj;
        return Objects.equals(this.value, geoOrientationKeyframe.value) && Objects.equals(this.duration, geoOrientationKeyframe.duration);
    }

    public int hashCode() {
        GeoOrientation geoOrientation = this.value;
        int hashCode = (JfifUtil.MARKER_EOI + (geoOrientation != null ? geoOrientation.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
