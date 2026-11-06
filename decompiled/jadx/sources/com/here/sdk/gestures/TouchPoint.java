package com.here.sdk.gestures;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.Point2D;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TouchPoint {

    @NonNull
    public Point2D coordinates;
    public long id;

    @NonNull
    public TouchPhase phase;

    public TouchPoint(long j, @NonNull Point2D point2D, @NonNull TouchPhase touchPhase) {
        this.id = j;
        this.coordinates = point2D;
        this.phase = touchPhase;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TouchPoint)) {
            return false;
        }
        TouchPoint touchPoint = (TouchPoint) obj;
        return this.id == touchPoint.id && Objects.equals(this.coordinates, touchPoint.coordinates) && Objects.equals(this.phase, touchPoint.phase);
    }

    public int hashCode() {
        long j = this.id;
        int i = (JfifUtil.MARKER_EOI + ((int) (j ^ (j >>> 32)))) * 31;
        Point2D point2D = this.coordinates;
        int hashCode = (i + (point2D != null ? point2D.hashCode() : 0)) * 31;
        TouchPhase touchPhase = this.phase;
        return hashCode + (touchPhase != null ? touchPhase.hashCode() : 0);
    }
}
