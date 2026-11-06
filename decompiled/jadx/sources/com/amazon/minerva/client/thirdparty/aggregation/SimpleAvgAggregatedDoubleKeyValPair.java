package com.amazon.minerva.client.thirdparty.aggregation;

import com.amazon.minerva.client.thirdparty.metric.AggregatedDouble;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SimpleAvgAggregatedDoubleKeyValPair implements AggregatedDoubleKeyValPair {
    private double mSum = 0.0d;
    private double mCount = 0.0d;

    @Override // com.amazon.minerva.client.thirdparty.aggregation.AggregatedDoubleKeyValPair
    public void addValue(double d) {
        double d2 = this.mSum + d;
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            Duration$$ExternalSyntheticBUOutline0.m("Value added would overflow Double, dropped");
        } else {
            this.mSum = d2;
            this.mCount += 1.0d;
        }
    }

    @Override // com.amazon.minerva.client.thirdparty.aggregation.AggregatedDoubleKeyValPair
    public AggregatedDouble getAggregatedValue() {
        double d = this.mCount;
        if (d == 0.0d) {
            return null;
        }
        return new AggregatedDouble(Collections.singletonList(Double.valueOf(this.mSum / d)), Collections.singletonList(Double.valueOf(this.mCount)));
    }
}
