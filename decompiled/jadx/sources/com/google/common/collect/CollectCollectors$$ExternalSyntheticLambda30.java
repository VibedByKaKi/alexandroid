package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda30 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda30(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object lambda$flatteningToImmutableListMultimap$0;
        Stream lambda$flatteningToImmutableListMultimap$1;
        Object lambda$flatteningToImmutableSetMultimap$0;
        Stream lambda$flatteningToImmutableSetMultimap$1;
        ImmutableSortedMultiset lambda$toImmutableSortedMultiset$4;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$flatteningToImmutableListMultimap$0 = CollectCollectors.lambda$flatteningToImmutableListMultimap$0((Function) obj2, obj);
                return lambda$flatteningToImmutableListMultimap$0;
            case 1:
                lambda$flatteningToImmutableListMultimap$1 = CollectCollectors.lambda$flatteningToImmutableListMultimap$1((Function) obj2, obj);
                return lambda$flatteningToImmutableListMultimap$1;
            case 2:
                lambda$flatteningToImmutableSetMultimap$0 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$0((Function) obj2, obj);
                return lambda$flatteningToImmutableSetMultimap$0;
            case 3:
                lambda$flatteningToImmutableSetMultimap$1 = CollectCollectors.lambda$flatteningToImmutableSetMultimap$1((Function) obj2, obj);
                return lambda$flatteningToImmutableSetMultimap$1;
            default:
                lambda$toImmutableSortedMultiset$4 = ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$4((Comparator) obj2, (Multiset) obj);
                return lambda$toImmutableSortedMultiset$4;
        }
    }
}
