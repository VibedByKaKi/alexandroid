package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ComparableUtils$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Comparable f$0;
    public final /* synthetic */ Comparable f$1;

    public /* synthetic */ ComparableUtils$$ExternalSyntheticLambda2(Comparable comparable, Comparable comparable2, int i) {
        this.$r8$classId = i;
        this.f$0 = comparable;
        this.f$1 = comparable2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$between$0;
        boolean lambda$betweenExclusive$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$between$0 = ComparableUtils.lambda$between$0(this.f$0, this.f$1, (Comparable) obj);
                return lambda$between$0;
            default:
                lambda$betweenExclusive$0 = ComparableUtils.lambda$betweenExclusive$0(this.f$0, this.f$1, (Comparable) obj);
                return lambda$betweenExclusive$0;
        }
    }
}
