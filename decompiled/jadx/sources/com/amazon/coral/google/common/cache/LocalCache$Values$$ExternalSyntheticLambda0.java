package com.amazon.coral.google.common.cache;

import com.amazon.coral.google.common.cache.LocalCache;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class LocalCache$Values$$ExternalSyntheticLambda0 implements BiPredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Predicate f$0;

    public /* synthetic */ LocalCache$Values$$ExternalSyntheticLambda0(Predicate predicate, int i) {
        this.$r8$classId = i;
        this.f$0 = predicate;
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        boolean lambda$removeIf$0;
        boolean lambda$removeIf$02;
        int i = this.$r8$classId;
        Predicate predicate = this.f$0;
        switch (i) {
            case 0:
                lambda$removeIf$0 = LocalCache.Values.lambda$removeIf$0(predicate, obj, obj2);
                return lambda$removeIf$0;
            default:
                lambda$removeIf$02 = LocalCache.EntrySet.lambda$removeIf$0(predicate, obj, obj2);
                return lambda$removeIf$02;
        }
    }
}
