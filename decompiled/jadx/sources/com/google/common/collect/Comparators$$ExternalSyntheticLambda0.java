package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Comparators$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Comparator f$1;

    public /* synthetic */ Comparators$$ExternalSyntheticLambda0(int i, Comparator comparator, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = comparator;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        TopKSelector least;
        com.amazon.coral.google.common.collect.TopKSelector least2;
        switch (this.$r8$classId) {
            case 0:
                least = TopKSelector.least(this.f$0, this.f$1);
                return least;
            default:
                least2 = com.amazon.coral.google.common.collect.TopKSelector.least(this.f$0, this.f$1);
                return least2;
        }
    }
}
