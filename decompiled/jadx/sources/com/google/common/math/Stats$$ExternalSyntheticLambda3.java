package com.google.common.math;

import java.util.function.ObjIntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Stats$$ExternalSyntheticLambda3 implements ObjIntConsumer {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((StatsAccumulator) obj).add(i);
                break;
            default:
                ((com.amazon.coral.google.common.math.StatsAccumulator) obj).add(i);
                break;
        }
    }
}
