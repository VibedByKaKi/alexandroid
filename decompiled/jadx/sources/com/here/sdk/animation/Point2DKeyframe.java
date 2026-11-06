package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.Point2D;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Point2DKeyframe {

    @NonNull
    public final Duration duration;

    @NonNull
    public final Point2D value;

    public Point2DKeyframe(@NonNull Point2D point2D, @NonNull Duration duration) {
        Point2DKeyframe create = create(point2D, duration);
        this.value = create.value;
        this.duration = create.duration;
    }

    private static native Point2DKeyframe create(@NonNull Point2D point2D, @NonNull Duration duration);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point2DKeyframe)) {
            return false;
        }
        Point2DKeyframe point2DKeyframe = (Point2DKeyframe) obj;
        return Objects.equals(this.value, point2DKeyframe.value) && Objects.equals(this.duration, point2DKeyframe.duration);
    }

    public int hashCode() {
        Point2D point2D = this.value;
        int hashCode = (JfifUtil.MARKER_EOI + (point2D != null ? point2D.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
