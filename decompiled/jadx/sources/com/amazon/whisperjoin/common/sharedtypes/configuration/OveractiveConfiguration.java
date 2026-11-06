package com.amazon.whisperjoin.common.sharedtypes.configuration;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OveractiveConfiguration {
    private final long mBucketLengthMs;
    private final long mMonitoringWindowMs;
    private final double mThresholdPercentage;

    public OveractiveConfiguration(long j, long j2, double d) {
        this.mBucketLengthMs = j;
        this.mMonitoringWindowMs = j2;
        this.mThresholdPercentage = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OveractiveConfiguration overactiveConfiguration = (OveractiveConfiguration) obj;
        return new EqualsBuilder().append(this.mBucketLengthMs, overactiveConfiguration.mBucketLengthMs).append(this.mMonitoringWindowMs, overactiveConfiguration.mMonitoringWindowMs).append(this.mThresholdPercentage, overactiveConfiguration.mThresholdPercentage).isEquals();
    }

    public long getBucketLengthMs() {
        return this.mBucketLengthMs;
    }

    public long getMonitoringWindowMs() {
        return this.mMonitoringWindowMs;
    }

    public double getThresholdPercentage() {
        return this.mThresholdPercentage;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mBucketLengthMs).append(this.mMonitoringWindowMs).append(this.mThresholdPercentage).toHashCode();
    }

    public String toString() {
        return "OveractiveConfiguration{mBucketLengthMs=" + this.mBucketLengthMs + ", mMonitoringWindowMs=" + this.mMonitoringWindowMs + ", mThresholdPercentage=" + this.mThresholdPercentage + AbstractJsonLexerKt.END_OBJ;
    }
}
