package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ScalarKeyframe {

    @NonNull
    public final Duration duration;
    public final double value;

    public ScalarKeyframe(double d, @NonNull Duration duration) {
        ScalarKeyframe create = create(d, duration);
        this.value = create.value;
        this.duration = create.duration;
    }

    private static native ScalarKeyframe create(double d, @NonNull Duration duration);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScalarKeyframe)) {
            return false;
        }
        ScalarKeyframe scalarKeyframe = (ScalarKeyframe) obj;
        return Double.compare(this.value, scalarKeyframe.value) == 0 && Objects.equals(this.duration, scalarKeyframe.duration);
    }

    public int hashCode() {
        int doubleToLongBits = (JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32)))) * 31;
        Duration duration = this.duration;
        return doubleToLongBits + (duration != null ? duration.hashCode() : 0);
    }
}
