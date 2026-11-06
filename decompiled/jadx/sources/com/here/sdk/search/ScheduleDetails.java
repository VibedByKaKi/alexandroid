package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ScheduleDetails {

    @NonNull
    public String duration;

    @NonNull
    public String recurrence;

    @NonNull
    public String start;

    public ScheduleDetails(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.start = str;
        this.duration = str2;
        this.recurrence = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduleDetails)) {
            return false;
        }
        ScheduleDetails scheduleDetails = (ScheduleDetails) obj;
        return Objects.equals(this.start, scheduleDetails.start) && Objects.equals(this.duration, scheduleDetails.duration) && Objects.equals(this.recurrence, scheduleDetails.recurrence);
    }

    public int hashCode() {
        String str = this.start;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.duration;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.recurrence;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
