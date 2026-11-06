package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TimingInfo {
    private static final double TIME_CONVERSION = 1000.0d;
    static final int UNKNOWN = -1;
    private Long endTimeNano;
    private final Long startEpochTimeMilli;
    private final long startTimeNano;

    public TimingInfo(Long l, long j, Long l2) {
        this.startEpochTimeMilli = l;
        this.startTimeNano = j;
        this.endTimeNano = l2;
    }

    public static double durationMilliOf(long j, long j2) {
        return ((j2 - j) / 1000) / 1000.0d;
    }

    public static TimingInfo newTimingInfoFullSupport(long j, long j2, long j3) {
        return new TimingInfoFullSupport(Long.valueOf(j), j2, Long.valueOf(j3));
    }

    public static TimingInfo startTiming() {
        return new TimingInfo(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo startTimingFullSupport() {
        return new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo unmodifiableTimingInfo(long j, long j2, Long l) {
        return new TimingInfoUnmodifiable(Long.valueOf(j), j2, l);
    }

    public TimingInfo endTiming() {
        this.endTimeNano = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> getAllCounters() {
        return Collections.EMPTY_MAP;
    }

    public List<TimingInfo> getAllSubMeasurements(String str) {
        return null;
    }

    public Number getCounter(String str) {
        return null;
    }

    @Deprecated
    public final long getElapsedTimeMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1L;
        }
        return timeTakenMillisIfKnown.longValue();
    }

    @Deprecated
    public final long getEndEpochTimeMilli() {
        Long endEpochTimeMilliIfKnown = getEndEpochTimeMilliIfKnown();
        if (endEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return endEpochTimeMilliIfKnown.longValue();
    }

    public final Long getEndEpochTimeMilliIfKnown() {
        if (!isStartEpochTimeMilliKnown() || !isEndTimeKnown()) {
            return null;
        }
        return Long.valueOf(((this.endTimeNano.longValue() - this.startTimeNano) / 1000000) + this.startEpochTimeMilli.longValue());
    }

    @Deprecated
    public final long getEndTime() {
        return getEndEpochTimeMilli();
    }

    public final long getEndTimeNano() {
        Long l = this.endTimeNano;
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final Long getEndTimeNanoIfKnown() {
        return this.endTimeNano;
    }

    public TimingInfo getLastSubMeasurement(String str) {
        return null;
    }

    @Deprecated
    public final long getStartEpochTimeMilli() {
        Long startEpochTimeMilliIfKnown = getStartEpochTimeMilliIfKnown();
        if (startEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return startEpochTimeMilliIfKnown.longValue();
    }

    public final Long getStartEpochTimeMilliIfKnown() {
        return this.startEpochTimeMilli;
    }

    @Deprecated
    public final long getStartTime() {
        return isStartEpochTimeMilliKnown() ? this.startEpochTimeMilli.longValue() : this.startTimeNano / 1000000;
    }

    public final long getStartTimeNano() {
        return this.startTimeNano;
    }

    public TimingInfo getSubMeasurement(String str) {
        return null;
    }

    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return Collections.EMPTY_MAP;
    }

    @Deprecated
    public final double getTimeTakenMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1.0d;
        }
        return timeTakenMillisIfKnown.doubleValue();
    }

    public final Double getTimeTakenMillisIfKnown() {
        if (isEndTimeKnown()) {
            return Double.valueOf(durationMilliOf(this.startTimeNano, this.endTimeNano.longValue()));
        }
        return null;
    }

    public final boolean isEndTimeKnown() {
        return this.endTimeNano != null;
    }

    public final boolean isStartEpochTimeMilliKnown() {
        return this.startEpochTimeMilli != null;
    }

    @Deprecated
    public void setEndTime(long j) {
        this.endTimeNano = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
    }

    public void setEndTimeNano(long j) {
        this.endTimeNano = Long.valueOf(j);
    }

    public final String toString() {
        return String.valueOf(getTimeTakenMillis());
    }

    public TimingInfo getSubMeasurement(String str, int i) {
        return null;
    }

    public static TimingInfo unmodifiableTimingInfo(long j, Long l) {
        return new TimingInfoUnmodifiable(null, j, l);
    }

    public static TimingInfo newTimingInfoFullSupport(long j, long j2) {
        return new TimingInfoFullSupport(null, j, Long.valueOf(j2));
    }

    public void incrementCounter(String str) {
    }

    public static TimingInfo startTimingFullSupport(long j) {
        return new TimingInfoFullSupport(null, j, null);
    }

    public void addSubMeasurement(String str, TimingInfo timingInfo) {
    }

    public void setCounter(String str, long j) {
    }
}
