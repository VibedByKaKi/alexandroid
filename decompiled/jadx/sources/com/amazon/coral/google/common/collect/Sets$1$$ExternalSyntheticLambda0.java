package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.Collections2;
import com.amazon.coral.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Sets$1$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Collection f$0;

    public /* synthetic */ Sets$1$$ExternalSyntheticLambda0(Collection collection, int i) {
        this.$r8$classId = i;
        this.f$0 = collection;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$stream$0;
        boolean lambda$parallelStream$1;
        boolean lambda$stream$02;
        boolean lambda$retainAll$1;
        int i = this.$r8$classId;
        Collection collection = this.f$0;
        switch (i) {
            case 0:
                lambda$stream$0 = Sets.AnonymousClass1.lambda$stream$0((Set) collection, obj);
                return lambda$stream$0;
            case 1:
                lambda$parallelStream$1 = Sets.AnonymousClass3.lambda$parallelStream$1((Set) collection, obj);
                return lambda$parallelStream$1;
            case 2:
                lambda$stream$02 = Sets.AnonymousClass3.lambda$stream$0((Set) collection, obj);
                return lambda$stream$02;
            default:
                lambda$retainAll$1 = Collections2.FilteredCollection.lambda$retainAll$1(collection, obj);
                return lambda$retainAll$1;
        }
    }
}
