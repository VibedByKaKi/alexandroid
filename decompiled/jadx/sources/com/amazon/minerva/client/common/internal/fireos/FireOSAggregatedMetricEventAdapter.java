package com.amazon.minerva.client.common.internal.fireos;

import com.amazon.minerva.client.api.AggregatedMetricEvent;
import com.amazon.minerva.client.common.api.AggregationType;
import com.amazon.minerva.client.common.internal.AggregatedMetricEventAdapter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FireOSAggregatedMetricEventAdapter extends FireOSMetricEventAdapter implements AggregatedMetricEventAdapter {
    private AggregatedMetricEvent mFireOSAggregatedMetricEvent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.minerva.client.common.internal.fireos.FireOSAggregatedMetricEventAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$minerva$client$common$api$AggregationType;

        static {
            int[] iArr = new int[AggregationType.values().length];
            $SwitchMap$com$amazon$minerva$client$common$api$AggregationType = iArr;
            try {
                iArr[AggregationType.SIMPLE_SUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$minerva$client$common$api$AggregationType[AggregationType.SIMPLE_AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FireOSAggregatedMetricEventAdapter(String str, String str2, int i) {
        AggregatedMetricEvent aggregatedMetricEvent = new AggregatedMetricEvent(str, str2, i);
        this.mFireOSAggregatedMetricEvent = aggregatedMetricEvent;
        super.setFireOsMetricEvent(aggregatedMetricEvent);
    }

    @Override // com.amazon.minerva.client.common.internal.AggregatedMetricEventAdapter
    public void addAggregatedDouble(String str, double d, AggregationType aggregationType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$minerva$client$common$api$AggregationType[aggregationType.ordinal()];
        if (i == 1) {
            this.mFireOSAggregatedMetricEvent.addAggregatedDouble(str, d, com.amazon.minerva.client.api.AggregationType.SIMPLE_SUM);
        } else if (i == 2) {
            this.mFireOSAggregatedMetricEvent.addAggregatedDouble(str, d, com.amazon.minerva.client.api.AggregationType.SIMPLE_AVG);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Unsupported aggregation function found");
        }
    }

    @Override // com.amazon.minerva.client.common.internal.AggregatedMetricEventAdapter
    public void addAggregatedLong(String str, long j, AggregationType aggregationType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$minerva$client$common$api$AggregationType[aggregationType.ordinal()];
        if (i == 1) {
            this.mFireOSAggregatedMetricEvent.addAggregatedLong(str, j, com.amazon.minerva.client.api.AggregationType.SIMPLE_SUM);
        } else if (i == 2) {
            this.mFireOSAggregatedMetricEvent.addAggregatedLong(str, j, com.amazon.minerva.client.api.AggregationType.SIMPLE_AVG);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Unsupported aggregation function found");
        }
    }

    public void setFireOSAggregatedMetricEvent(AggregatedMetricEvent aggregatedMetricEvent) {
        this.mFireOSAggregatedMetricEvent = aggregatedMetricEvent;
        super.setFireOsMetricEvent(aggregatedMetricEvent);
    }

    public FireOSAggregatedMetricEventAdapter(String str, String str2) {
        AggregatedMetricEvent aggregatedMetricEvent = new AggregatedMetricEvent(str, str2);
        this.mFireOSAggregatedMetricEvent = aggregatedMetricEvent;
        super.setFireOsMetricEvent(aggregatedMetricEvent);
    }

    public FireOSAggregatedMetricEventAdapter(AggregatedMetricEvent aggregatedMetricEvent) {
        this.mFireOSAggregatedMetricEvent = aggregatedMetricEvent;
        super.setFireOsMetricEvent(aggregatedMetricEvent);
    }
}
