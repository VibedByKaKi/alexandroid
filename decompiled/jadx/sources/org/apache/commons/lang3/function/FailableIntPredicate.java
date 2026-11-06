package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableIntPredicate<E extends Throwable> {
    public static final FailableIntPredicate FALSE;
    public static final FailableIntPredicate TRUE;

    static {
        final int i = 0;
        FALSE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i2) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = FailableIntPredicate.lambda$static$0(i2);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableIntPredicate.lambda$static$1(i2);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        TRUE = new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i22) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = FailableIntPredicate.lambda$static$0(i22);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableIntPredicate.lambda$static$1(i22);
                        return lambda$static$1;
                }
            }
        };
    }

    static <E extends Throwable> FailableIntPredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$0(FailableIntPredicate failableIntPredicate, int i) throws Throwable {
        return test(i) && failableIntPredicate.test(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$0(int i) throws Throwable {
        return !test(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$0(FailableIntPredicate failableIntPredicate, int i) throws Throwable {
        return test(i) || failableIntPredicate.test(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(int i) throws Throwable {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(int i) throws Throwable {
        return true;
    }

    static <E extends Throwable> FailableIntPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableIntPredicate<E> and(FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new FailableIntPredicate$$ExternalSyntheticLambda0(this, failableIntPredicate, 0);
    }

    default FailableIntPredicate<E> negate() {
        return new FailableIntPredicate() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda4
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i) {
                boolean lambda$negate$0;
                lambda$negate$0 = FailableIntPredicate.this.lambda$negate$0(i);
                return lambda$negate$0;
            }
        };
    }

    default FailableIntPredicate<E> or(FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new FailableIntPredicate$$ExternalSyntheticLambda0(this, failableIntPredicate, 1);
    }

    boolean test(int i) throws Throwable;
}
