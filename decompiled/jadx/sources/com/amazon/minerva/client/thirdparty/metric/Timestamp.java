package com.amazon.minerva.client.thirdparty.metric;

import java.util.Objects;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Timestamp {
    private final long epochMillis;
    private final TimeZone timeZone;

    private Timestamp(long j, TimeZone timeZone) {
        this.epochMillis = j;
        this.timeZone = timeZone;
    }

    public static Timestamp now() {
        return new Timestamp(System.currentTimeMillis(), TimeZone.getDefault());
    }

    public static Timestamp of(long j, TimeZone timeZone) {
        Objects.requireNonNull(timeZone, "Time zone cannot be null");
        return new Timestamp(j, (TimeZone) timeZone.clone());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Timestamp.class == obj.getClass()) {
            Timestamp timestamp = (Timestamp) obj;
            if (this.epochMillis == timestamp.epochMillis && Objects.equals(this.timeZone, timestamp.timeZone)) {
                return true;
            }
        }
        return false;
    }

    public long getEpochMillis() {
        return this.epochMillis;
    }

    public TimeZone getTimeZone() {
        return (TimeZone) this.timeZone.clone();
    }

    public int getTimeZoneOffset() {
        return this.timeZone.getOffset(this.epochMillis);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.epochMillis), this.timeZone);
    }

    public String toString() {
        return this.epochMillis + "@" + this.timeZone.getID();
    }
}
