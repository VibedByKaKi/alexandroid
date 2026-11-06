package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoCoordinatesKeyframe {

    @NonNull
    public final Duration duration;

    @NonNull
    public final GeoCoordinates value;

    public GeoCoordinatesKeyframe(@NonNull GeoCoordinates geoCoordinates, @NonNull Duration duration) {
        GeoCoordinatesKeyframe create = create(geoCoordinates, duration);
        this.value = create.value;
        this.duration = create.duration;
    }

    private static native GeoCoordinatesKeyframe create(@NonNull GeoCoordinates geoCoordinates, @NonNull Duration duration);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoCoordinatesKeyframe)) {
            return false;
        }
        GeoCoordinatesKeyframe geoCoordinatesKeyframe = (GeoCoordinatesKeyframe) obj;
        return Objects.equals(this.value, geoCoordinatesKeyframe.value) && Objects.equals(this.duration, geoCoordinatesKeyframe.duration);
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.value;
        int hashCode = (JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
