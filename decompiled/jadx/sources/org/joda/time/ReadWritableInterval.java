package org.joda.time;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ReadWritableInterval extends ReadableInterval {
    void setChronology(Chronology chronology);

    void setDurationAfterStart(ReadableDuration readableDuration);

    void setDurationBeforeEnd(ReadableDuration readableDuration);

    void setEnd(ReadableInstant readableInstant);

    void setEndMillis(long j);

    void setInterval(long j, long j2);

    void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2);

    void setInterval(ReadableInterval readableInterval);

    void setPeriodAfterStart(ReadablePeriod readablePeriod);

    void setPeriodBeforeEnd(ReadablePeriod readablePeriod);

    void setStart(ReadableInstant readableInstant);

    void setStartMillis(long j);
}
