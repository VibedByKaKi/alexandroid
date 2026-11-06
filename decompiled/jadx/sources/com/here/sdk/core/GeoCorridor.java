package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoCorridor {

    @Nullable
    public final Integer halfWidthInMeters;

    @NonNull
    public final List<GeoCoordinates> polyline;

    public GeoCorridor(@NonNull List<GeoCoordinates> list, int i) {
        GeoCorridor make = make(list, i);
        this.polyline = make.polyline;
        this.halfWidthInMeters = make.halfWidthInMeters;
    }

    private static native GeoCorridor make(@NonNull List<GeoCoordinates> list);

    private static native GeoCorridor make(@NonNull List<GeoCoordinates> list, int i);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoCorridor)) {
            return false;
        }
        GeoCorridor geoCorridor = (GeoCorridor) obj;
        return Objects.equals(this.polyline, geoCorridor.polyline) && Objects.equals(this.halfWidthInMeters, geoCorridor.halfWidthInMeters);
    }

    public int hashCode() {
        List<GeoCoordinates> list = this.polyline;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.halfWidthInMeters;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public GeoCorridor(@NonNull List<GeoCoordinates> list) {
        GeoCorridor make = make(list);
        this.polyline = make.polyline;
        this.halfWidthInMeters = make.halfWidthInMeters;
    }
}
