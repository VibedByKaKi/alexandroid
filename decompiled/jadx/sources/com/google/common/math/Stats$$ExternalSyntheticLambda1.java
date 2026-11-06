package com.google.common.math;

import java.util.function.ObjLongConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Stats$$ExternalSyntheticLambda1 implements ObjLongConsumer {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j) {
        switch (this.$r8$classId) {
            case 0:
                ((StatsAccumulator) obj).add(j);
                break;
            default:
                ((com.amazon.coral.google.common.math.StatsAccumulator) obj).add(j);
                break;
        }
    }
}
