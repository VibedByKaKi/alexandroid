package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableDoublePredicate<E extends Throwable> {
    public static final FailableDoublePredicate FALSE;
    public static final FailableDoublePredicate TRUE;

    static {
        final int i = 0;
        FALSE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = FailableDoublePredicate.lambda$static$0(d);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableDoublePredicate.lambda$static$1(d);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        TRUE = new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = FailableDoublePredicate.lambda$static$0(d);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableDoublePredicate.lambda$static$1(d);
                        return lambda$static$1;
                }
            }
        };
    }

    static <E extends Throwable> FailableDoublePredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$0(FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
        return test(d) && failableDoublePredicate.test(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$0(double d) throws Throwable {
        return !test(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$0(FailableDoublePredicate failableDoublePredicate, double d) throws Throwable {
        return test(d) || failableDoublePredicate.test(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(double d) throws Throwable {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(double d) throws Throwable {
        return true;
    }

    static <E extends Throwable> FailableDoublePredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableDoublePredicate<E> and(FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new FailableDoublePredicate$$ExternalSyntheticLambda0(this, failableDoublePredicate, 1);
    }

    default FailableDoublePredicate<E> negate() {
        return new FailableDoublePredicate() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d) {
                boolean lambda$negate$0;
                lambda$negate$0 = FailableDoublePredicate.this.lambda$negate$0(d);
                return lambda$negate$0;
            }
        };
    }

    default FailableDoublePredicate<E> or(FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new FailableDoublePredicate$$ExternalSyntheticLambda0(this, failableDoublePredicate, 0);
    }

    boolean test(double d) throws Throwable;
}
