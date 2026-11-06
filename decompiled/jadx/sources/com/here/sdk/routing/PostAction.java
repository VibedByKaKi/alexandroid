package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PostAction {

    @NonNull
    public PostActionType action = PostActionType.CHARGING_SETUP;

    @NonNull
    public Duration duration = Duration.ofSeconds(0);

    @Nullable
    public ChargingActionDetails chargingDetails = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PostAction)) {
            return false;
        }
        PostAction postAction = (PostAction) obj;
        return Objects.equals(this.action, postAction.action) && Objects.equals(this.duration, postAction.duration) && Objects.equals(this.chargingDetails, postAction.chargingDetails);
    }

    public int hashCode() {
        PostActionType postActionType = this.action;
        int hashCode = (JfifUtil.MARKER_EOI + (postActionType != null ? postActionType.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        int hashCode2 = (hashCode + (duration != null ? duration.hashCode() : 0)) * 31;
        ChargingActionDetails chargingActionDetails = this.chargingDetails;
        return hashCode2 + (chargingActionDetails != null ? chargingActionDetails.hashCode() : 0);
    }
}
