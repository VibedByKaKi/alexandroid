package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableBiPredicate<T, U, E extends Throwable> {
    public static final FailableBiPredicate FALSE;
    public static final FailableBiPredicate TRUE;

    static {
        final int i = 0;
        FALSE = new FailableBiPredicate() { // from class: org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = FailableBiPredicate.lambda$static$0(obj, obj2);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableBiPredicate.lambda$static$1(obj, obj2);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        TRUE = new FailableBiPredicate() { // from class: org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda3
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = FailableBiPredicate.lambda$static$0(obj, obj2);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailableBiPredicate.lambda$static$1(obj, obj2);
                        return lambda$static$1;
                }
            }
        };
    }

    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(FailableBiPredicate failableBiPredicate, Object obj, Object obj2) throws Throwable {
        return test(obj, obj2) && failableBiPredicate.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$0(Object obj, Object obj2) throws Throwable {
        return !test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$0(FailableBiPredicate failableBiPredicate, Object obj, Object obj2) throws Throwable {
        return test(obj, obj2) || failableBiPredicate.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Object obj, Object obj2) throws Throwable {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(Object obj, Object obj2) throws Throwable {
        return true;
    }

    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> truePredicate() {
        return TRUE;
    }

    default FailableBiPredicate<T, U, E> and(FailableBiPredicate<? super T, ? super U, E> failableBiPredicate) {
        Objects.requireNonNull(failableBiPredicate);
        return new FailableBiPredicate$$ExternalSyntheticLambda1(this, failableBiPredicate, 0);
    }

    default FailableBiPredicate<T, U, E> negate() {
        return new FailableBiPredicate() { // from class: org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean lambda$negate$0;
                lambda$negate$0 = FailableBiPredicate.this.lambda$negate$0(obj, obj2);
                return lambda$negate$0;
            }
        };
    }

    default FailableBiPredicate<T, U, E> or(FailableBiPredicate<? super T, ? super U, E> failableBiPredicate) {
        Objects.requireNonNull(failableBiPredicate);
        return new FailableBiPredicate$$ExternalSyntheticLambda1(this, failableBiPredicate, 1);
    }

    boolean test(T t, U u) throws Throwable;
}
