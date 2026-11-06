package org.joda.time;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ReadWritableInstant extends ReadableInstant {
    void add(long j);

    void add(DurationFieldType durationFieldType, int i);

    void add(ReadableDuration readableDuration);

    void add(ReadableDuration readableDuration, int i);

    void add(ReadablePeriod readablePeriod);

    void add(ReadablePeriod readablePeriod, int i);

    void set(DateTimeFieldType dateTimeFieldType, int i);

    void setChronology(Chronology chronology);

    void setMillis(long j);

    void setMillis(ReadableInstant readableInstant);

    void setZone(DateTimeZone dateTimeZone);

    void setZoneRetainFields(DateTimeZone dateTimeZone);
}
