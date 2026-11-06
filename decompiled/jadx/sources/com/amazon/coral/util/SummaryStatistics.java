package com.amazon.coral.util;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SummaryStatistics {
    private final long count;
    private final double mean;
    private final double sampleVariance;
    private final double variance;

    public SummaryStatistics(double d, double d2, double d3, long j) {
        this.mean = d;
        this.variance = d2;
        this.sampleVariance = d3;
        this.count = j;
    }

    public long getCount() {
        return this.count;
    }

    public double getMean() {
        return this.mean;
    }

    public double getSampleVariance() {
        return this.sampleVariance;
    }

    public double getVariance() {
        return this.variance;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SummaryStatistics{mean=");
        sb.append(this.mean);
        sb.append(", variance=");
        sb.append(this.variance);
        sb.append(", sampleVariance=");
        sb.append(this.sampleVariance);
        sb.append(", count=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.count, AbstractJsonLexerKt.END_OBJ);
    }
}
