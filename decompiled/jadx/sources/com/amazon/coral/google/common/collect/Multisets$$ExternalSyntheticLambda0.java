package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.ImmutableMultiset;
import java.util.function.ObjIntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Multisets$$ExternalSyntheticLambda0 implements ObjIntConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Multisets$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i) {
        int i2 = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i2) {
            case 0:
                ((Multiset) obj2).add(obj, i);
                break;
            default:
                ((ImmutableMultiset.Builder) obj2).lambda$addAll$0(obj, i);
                break;
        }
    }
}
