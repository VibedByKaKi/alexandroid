package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ComparableUtils$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Comparable f$0;

    public /* synthetic */ ComparableUtils$$ExternalSyntheticLambda0(Comparable comparable, int i) {
        this.$r8$classId = i;
        this.f$0 = comparable;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$ge$0;
        boolean lambda$gt$0;
        boolean lambda$lt$0;
        boolean lambda$le$0;
        int i = this.$r8$classId;
        Comparable comparable = this.f$0;
        Comparable comparable2 = (Comparable) obj;
        switch (i) {
            case 0:
                lambda$ge$0 = ComparableUtils.lambda$ge$0(comparable, comparable2);
                return lambda$ge$0;
            case 1:
                lambda$gt$0 = ComparableUtils.lambda$gt$0(comparable, comparable2);
                return lambda$gt$0;
            case 2:
                lambda$lt$0 = ComparableUtils.lambda$lt$0(comparable, comparable2);
                return lambda$lt$0;
            default:
                lambda$le$0 = ComparableUtils.lambda$le$0(comparable, comparable2);
                return lambda$le$0;
        }
    }
}
