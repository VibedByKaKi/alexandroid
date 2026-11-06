package com.here.sdk.animation;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.Anchor2D;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Anchor2DKeyframe {

    @NonNull
    public final Duration duration;

    @NonNull
    public final Anchor2D value;

    public Anchor2DKeyframe(@NonNull Anchor2D anchor2D, @NonNull Duration duration) {
        Anchor2DKeyframe create = create(anchor2D, duration);
        this.value = create.value;
        this.duration = create.duration;
    }

    private static native Anchor2DKeyframe create(@NonNull Anchor2D anchor2D, @NonNull Duration duration);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Anchor2DKeyframe)) {
            return false;
        }
        Anchor2DKeyframe anchor2DKeyframe = (Anchor2DKeyframe) obj;
        return Objects.equals(this.value, anchor2DKeyframe.value) && Objects.equals(this.duration, anchor2DKeyframe.duration);
    }

    public int hashCode() {
        Anchor2D anchor2D = this.value;
        int hashCode = (JfifUtil.MARKER_EOI + (anchor2D != null ? anchor2D.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
