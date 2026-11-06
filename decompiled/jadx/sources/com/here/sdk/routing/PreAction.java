package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PreAction {

    @NonNull
    public PreActionType action = PreActionType.BOARD;

    @NonNull
    public Duration duration = Duration.ofSeconds(0);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreAction)) {
            return false;
        }
        PreAction preAction = (PreAction) obj;
        return Objects.equals(this.action, preAction.action) && Objects.equals(this.duration, preAction.duration);
    }

    public int hashCode() {
        PreActionType preActionType = this.action;
        int hashCode = (JfifUtil.MARKER_EOI + (preActionType != null ? preActionType.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
