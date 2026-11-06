package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TimingInfo {
    private TimestampPair guiCallRequestTime;
    private TimestampPair outboundCallRequestTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TimingInfoBuilder {
        private TimestampPair guiCallRequestTime;
        private TimestampPair outboundCallRequestTime;

        public TimingInfo build() {
            return new TimingInfo(this.guiCallRequestTime, this.outboundCallRequestTime);
        }

        public TimingInfoBuilder guiCallRequestTime(TimestampPair timestampPair) {
            this.guiCallRequestTime = timestampPair;
            return this;
        }

        public TimingInfoBuilder outboundCallRequestTime(TimestampPair timestampPair) {
            this.outboundCallRequestTime = timestampPair;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("TimingInfo.TimingInfoBuilder(guiCallRequestTime=", String.valueOf(this.guiCallRequestTime), ", outboundCallRequestTime=", String.valueOf(this.outboundCallRequestTime), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public TimingInfo(TimestampPair timestampPair, TimestampPair timestampPair2) {
        this.guiCallRequestTime = timestampPair;
        this.outboundCallRequestTime = timestampPair2;
    }

    public static TimingInfoBuilder builder() {
        return new TimingInfoBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof TimingInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimingInfo)) {
            return false;
        }
        TimingInfo timingInfo = (TimingInfo) obj;
        if (!timingInfo.canEqual(this)) {
            return false;
        }
        TimestampPair guiCallRequestTime = getGuiCallRequestTime();
        TimestampPair guiCallRequestTime2 = timingInfo.getGuiCallRequestTime();
        if (guiCallRequestTime != null ? !guiCallRequestTime.equals(guiCallRequestTime2) : guiCallRequestTime2 != null) {
            return false;
        }
        TimestampPair outboundCallRequestTime = getOutboundCallRequestTime();
        TimestampPair outboundCallRequestTime2 = timingInfo.getOutboundCallRequestTime();
        return outboundCallRequestTime != null ? outboundCallRequestTime.equals(outboundCallRequestTime2) : outboundCallRequestTime2 == null;
    }

    public TimestampPair getGuiCallRequestTime() {
        return this.guiCallRequestTime;
    }

    public TimestampPair getOutboundCallRequestTime() {
        return this.outboundCallRequestTime;
    }

    public int hashCode() {
        TimestampPair guiCallRequestTime = getGuiCallRequestTime();
        int hashCode = guiCallRequestTime == null ? 43 : guiCallRequestTime.hashCode();
        TimestampPair outboundCallRequestTime = getOutboundCallRequestTime();
        return ((hashCode + 59) * 59) + (outboundCallRequestTime != null ? outboundCallRequestTime.hashCode() : 43);
    }
}
