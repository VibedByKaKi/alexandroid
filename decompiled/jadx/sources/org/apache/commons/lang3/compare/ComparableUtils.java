package org.apache.commons.lang3.compare;

import java.util.function.Predicate;
import org.apache.commons.lang3.ObjectUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ComparableUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ComparableCheckBuilder<A extends Comparable<A>> {

        /* renamed from: a, reason: collision with root package name */
        private final A f1158a;

        private ComparableCheckBuilder(A a2) {
            this.f1158a = a2;
        }

        private boolean betweenOrdered(A a2, A a3) {
            return greaterThanOrEqualTo(a2) && lessThanOrEqualTo(a3);
        }

        private boolean betweenOrderedExclusive(A a2, A a3) {
            return greaterThan(a2) && lessThan(a3);
        }

        public boolean between(A a2, A a3) {
            return betweenOrdered(a2, a3) || betweenOrdered(a3, a2);
        }

        public boolean betweenExclusive(A a2, A a3) {
            return betweenOrderedExclusive(a2, a3) || betweenOrderedExclusive(a3, a2);
        }

        public boolean equalTo(A a2) {
            A a3 = this.f1158a;
            return a3 != null && a3.compareTo(a2) == 0;
        }

        public boolean greaterThan(A a2) {
            A a3 = this.f1158a;
            return a3 != null && a3.compareTo(a2) > 0;
        }

        public boolean greaterThanOrEqualTo(A a2) {
            A a3 = this.f1158a;
            return a3 != null && a3.compareTo(a2) >= 0;
        }

        public boolean lessThan(A a2) {
            A a3 = this.f1158a;
            return a3 != null && a3.compareTo(a2) < 0;
        }

        public boolean lessThanOrEqualTo(A a2) {
            A a3 = this.f1158a;
            return a3 != null && a3.compareTo(a2) <= 0;
        }
    }

    private ComparableUtils() {
    }

    public static <A extends Comparable<A>> Predicate<A> between(A a2, A a3) {
        return new ComparableUtils$$ExternalSyntheticLambda2(a2, a3, 0);
    }

    public static <A extends Comparable<A>> Predicate<A> betweenExclusive(A a2, A a3) {
        return new ComparableUtils$$ExternalSyntheticLambda2(a2, a3, 1);
    }

    public static <A extends Comparable<A>> Predicate<A> ge(A a2) {
        return new ComparableUtils$$ExternalSyntheticLambda0(a2, 0);
    }

    public static <A extends Comparable<A>> Predicate<A> gt(A a2) {
        return new ComparableUtils$$ExternalSyntheticLambda0(a2, 1);
    }

    public static <A extends Comparable<A>> ComparableCheckBuilder<A> is(A a2) {
        return new ComparableCheckBuilder<>(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$between$0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return is(comparable3).between(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$betweenExclusive$0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return is(comparable3).betweenExclusive(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$ge$0(Comparable comparable, Comparable comparable2) {
        return is(comparable2).greaterThanOrEqualTo(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$gt$0(Comparable comparable, Comparable comparable2) {
        return is(comparable2).greaterThan(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$le$0(Comparable comparable, Comparable comparable2) {
        return is(comparable2).lessThanOrEqualTo(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$lt$0(Comparable comparable, Comparable comparable2) {
        return is(comparable2).lessThan(comparable);
    }

    public static <A extends Comparable<A>> Predicate<A> le(A a2) {
        return new ComparableUtils$$ExternalSyntheticLambda0(a2, 3);
    }

    public static <A extends Comparable<A>> Predicate<A> lt(A a2) {
        return new ComparableUtils$$ExternalSyntheticLambda0(a2, 2);
    }

    public static <A extends Comparable<A>> A max(A a2, A a3) {
        return ObjectUtils.compare(a2, a3, false) > 0 ? a2 : a3;
    }

    public static <A extends Comparable<A>> A min(A a2, A a3) {
        return ObjectUtils.compare(a2, a3, true) < 0 ? a2 : a3;
    }
}
