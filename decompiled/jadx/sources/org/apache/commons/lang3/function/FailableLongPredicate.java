package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableLongPredicate<E extends Throwable> {
    public static final FailableLongPredicate FALSE;
    public static final FailableLongPredicate TRUE;

    static {
        final int i = 0;
        FALSE = new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = FailableLongPredicate.lambda$static$0(j);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableLongPredicate.lambda$static$1(j);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        TRUE = new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = FailableLongPredicate.lambda$static$0(j);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableLongPredicate.lambda$static$1(j);
                        return lambda$static$1;
                }
            }
        };
    }

    static <E extends Throwable> FailableLongPredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$0(FailableLongPredicate failableLongPredicate, long j) throws Throwable {
        return test(j) && failableLongPredicate.test(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$0(long j) throws Throwable {
        return !test(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$0(FailableLongPredicate failableLongPredicate, long j) throws Throwable {
        return test(j) || failableLongPredicate.test(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(long j) throws Throwable {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(long j) throws Throwable {
        return true;
    }

    static <E extends Throwable> FailableLongPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableLongPredicate<E> and(FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new FailableLongPredicate$$ExternalSyntheticLambda0(this, failableLongPredicate, 0);
    }

    default FailableLongPredicate<E> negate() {
        return new FailableLongPredicate() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j) {
                boolean lambda$negate$0;
                lambda$negate$0 = FailableLongPredicate.this.lambda$negate$0(j);
                return lambda$negate$0;
            }
        };
    }

    default FailableLongPredicate<E> or(FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new FailableLongPredicate$$ExternalSyntheticLambda0(this, failableLongPredicate, 1);
    }

    boolean test(long j) throws Throwable;
}
