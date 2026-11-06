package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TimestampPair {
    private Long absoluteTimeInMillis;
    private Long relativeTimeInMillis;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TimestampPairBuilder {
        private Long absoluteTimeInMillis;
        private Long relativeTimeInMillis;

        public TimestampPairBuilder absoluteTimeInMillis(Long l) {
            this.absoluteTimeInMillis = l;
            return this;
        }

        public TimestampPair build() {
            return new TimestampPair(this.relativeTimeInMillis, this.absoluteTimeInMillis);
        }

        public TimestampPairBuilder relativeTimeInMillis(Long l) {
            this.relativeTimeInMillis = l;
            return this;
        }

        public String toString() {
            return "TimestampPair.TimestampPairBuilder(relativeTimeInMillis=" + this.relativeTimeInMillis + ", absoluteTimeInMillis=" + this.absoluteTimeInMillis + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public TimestampPair(Long l, Long l2) {
        this.relativeTimeInMillis = l;
        this.absoluteTimeInMillis = l2;
    }

    public static TimestampPairBuilder builder() {
        return new TimestampPairBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof TimestampPair;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimestampPair)) {
            return false;
        }
        TimestampPair timestampPair = (TimestampPair) obj;
        if (!timestampPair.canEqual(this)) {
            return false;
        }
        Long relativeTimeInMillis = getRelativeTimeInMillis();
        Long relativeTimeInMillis2 = timestampPair.getRelativeTimeInMillis();
        if (relativeTimeInMillis != null ? !relativeTimeInMillis.equals(relativeTimeInMillis2) : relativeTimeInMillis2 != null) {
            return false;
        }
        Long absoluteTimeInMillis = getAbsoluteTimeInMillis();
        Long absoluteTimeInMillis2 = timestampPair.getAbsoluteTimeInMillis();
        return absoluteTimeInMillis != null ? absoluteTimeInMillis.equals(absoluteTimeInMillis2) : absoluteTimeInMillis2 == null;
    }

    public Long getAbsoluteTimeInMillis() {
        return this.absoluteTimeInMillis;
    }

    public Long getRelativeTimeInMillis() {
        return this.relativeTimeInMillis;
    }

    public int hashCode() {
        Long relativeTimeInMillis = getRelativeTimeInMillis();
        int hashCode = relativeTimeInMillis == null ? 43 : relativeTimeInMillis.hashCode();
        Long absoluteTimeInMillis = getAbsoluteTimeInMillis();
        return ((hashCode + 59) * 59) + (absoluteTimeInMillis != null ? absoluteTimeInMillis.hashCode() : 43);
    }
}
