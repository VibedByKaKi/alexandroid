package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TbtManeuverAction {

    @NonNull
    public String action;

    @Nullable
    public String orientation;

    @Nullable
    public Integer roundaboutExit;

    @NonNull
    public String trafficDirection;

    @Nullable
    public String turn;

    public TbtManeuverAction(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.action = str;
        this.trafficDirection = str2;
        this.orientation = str3;
        this.turn = str4;
        this.roundaboutExit = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TbtManeuverAction)) {
            return false;
        }
        TbtManeuverAction tbtManeuverAction = (TbtManeuverAction) obj;
        return Objects.equals(this.action, tbtManeuverAction.action) && Objects.equals(this.trafficDirection, tbtManeuverAction.trafficDirection) && Objects.equals(this.orientation, tbtManeuverAction.orientation) && Objects.equals(this.turn, tbtManeuverAction.turn) && Objects.equals(this.roundaboutExit, tbtManeuverAction.roundaboutExit);
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.trafficDirection;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.orientation;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.turn;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.roundaboutExit;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }
}
