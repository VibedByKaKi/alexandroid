package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.Maps;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda44 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda44(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                CollectCollectors.lambda$toMultiset$4((Function) this.f$0, (ToIntFunction) this.f$1, (Multiset) obj, obj2);
                break;
            case 1:
                CollectCollectors.lambda$toImmutableMultiset$1((Function) this.f$0, (ToIntFunction) this.f$1, (Multiset) obj, obj2);
                break;
            case 2:
                ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$2((Function) this.f$0, (ToIntFunction) this.f$1, (Multiset) obj, obj2);
                break;
            default:
                ((Maps.TransformedEntriesMap) this.f$0).lambda$forEach$0((BiConsumer) this.f$1, obj, obj2);
                break;
        }
    }
}
