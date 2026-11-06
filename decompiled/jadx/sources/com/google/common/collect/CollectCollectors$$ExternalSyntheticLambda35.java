package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda35 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;
    public final /* synthetic */ ToIntFunction f$1;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda35(Function function, ToIntFunction toIntFunction, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
        this.f$1 = toIntFunction;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                CollectCollectors.lambda$toImmutableMultiset$0(this.f$0, this.f$1, (Multiset) obj, obj2);
                break;
            case 1:
                CollectCollectors.lambda$toMultiset$0(this.f$0, this.f$1, (Multiset) obj, obj2);
                break;
            default:
                ImmutableSortedMultiset.mapAndAdd(obj2, (Multiset) obj, this.f$0, this.f$1);
                break;
        }
    }
}
