package com.amazon.minerva.client.thirdparty.aggregation;

import com.amazon.minerva.client.thirdparty.metric.AggregatedLong;
import com.amazon.minerva.client.thirdparty.utils.CustomMath;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SimpleAvgAggregatedLongKeyValPair implements AggregatedLongKeyValPair {
    private long mSum = 0;
    private long mCount = 0;

    @Override // com.amazon.minerva.client.thirdparty.aggregation.AggregatedLongKeyValPair
    public void addValue(long j) {
        this.mSum = CustomMath.addExact(this.mSum, j);
        this.mCount++;
    }

    @Override // com.amazon.minerva.client.thirdparty.aggregation.AggregatedLongKeyValPair
    public AggregatedLong getAggregatedValue() {
        long j = this.mCount;
        if (j == 0) {
            return null;
        }
        return new AggregatedLong(Collections.singletonList(Long.valueOf(Math.round(this.mSum / j))), Collections.singletonList(Long.valueOf(this.mCount)));
    }
}
