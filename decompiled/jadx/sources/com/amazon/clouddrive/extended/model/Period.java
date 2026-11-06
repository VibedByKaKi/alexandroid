package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Period implements Comparable<Period> {
    private long numberOfIntervals;
    private String timeInterval;

    @Override // java.lang.Comparable
    public int compareTo(Period period) {
        if (period == null) {
            return -1;
        }
        if (period == this) {
            return 0;
        }
        String timeInterval = getTimeInterval();
        String timeInterval2 = period.getTimeInterval();
        if (timeInterval != timeInterval2) {
            if (timeInterval == null) {
                return -1;
            }
            if (timeInterval2 == null) {
                return 1;
            }
            int compareTo = timeInterval.compareTo(timeInterval2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (getNumberOfIntervals() < period.getNumberOfIntervals()) {
            return -1;
        }
        return getNumberOfIntervals() > period.getNumberOfIntervals() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Period) && compareTo((Period) obj) == 0;
    }

    public long getNumberOfIntervals() {
        return this.numberOfIntervals;
    }

    public String getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return (getTimeInterval() == null ? 0 : getTimeInterval().hashCode()) + 1 + ((int) getNumberOfIntervals());
    }

    public void setNumberOfIntervals(long j) {
        this.numberOfIntervals = j;
    }

    public void setTimeInterval(String str) {
        this.timeInterval = str;
    }
}
