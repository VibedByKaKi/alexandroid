package com.google.common.hash;

import java.io.Serializable;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class BloomFilter$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ BloomFilter$$ExternalSyntheticLambda0(Serializable serializable, long j, double d, int i) {
        this.$r8$classId = i;
        this.f$0 = serializable;
        this.f$1 = j;
        this.f$2 = d;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        BloomFilter create;
        com.amazon.coral.google.common.hash.BloomFilter create2;
        switch (this.$r8$classId) {
            case 0:
                create = BloomFilter.create((Funnel) this.f$0, this.f$1, this.f$2);
                return create;
            default:
                create2 = com.amazon.coral.google.common.hash.BloomFilter.create((com.amazon.coral.google.common.hash.Funnel) this.f$0, this.f$1, this.f$2);
                return create2;
        }
    }
}
