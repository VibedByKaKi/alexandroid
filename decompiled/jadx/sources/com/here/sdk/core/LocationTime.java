package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocationTime {

    @NonNull
    public final Date localTime;

    @NonNull
    public final Duration utcOffset;

    @NonNull
    public final Date utcTime;

    public LocationTime(@NonNull Date date, @NonNull Date date2, @NonNull Duration duration) {
        this.localTime = date;
        this.utcTime = date2;
        this.utcOffset = duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationTime)) {
            return false;
        }
        LocationTime locationTime = (LocationTime) obj;
        return Objects.equals(this.localTime, locationTime.localTime) && Objects.equals(this.utcTime, locationTime.utcTime) && Objects.equals(this.utcOffset, locationTime.utcOffset);
    }

    public int hashCode() {
        Date date = this.localTime;
        int hashCode = (JfifUtil.MARKER_EOI + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.utcTime;
        int hashCode2 = (hashCode + (date2 != null ? date2.hashCode() : 0)) * 31;
        Duration duration = this.utcOffset;
        return hashCode2 + (duration != null ? duration.hashCode() : 0);
    }
}
