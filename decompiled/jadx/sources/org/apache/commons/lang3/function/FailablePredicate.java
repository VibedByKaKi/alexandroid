package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailablePredicate<T, E extends Throwable> {
    public static final FailablePredicate FALSE;
    public static final FailablePredicate TRUE;

    static {
        final int i = 0;
        FALSE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = FailablePredicate.lambda$static$0(obj);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailablePredicate.lambda$static$1(obj);
                        return lambda$static$1;
                }
            }
        };
        final int i2 = 1;
        TRUE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                switch (i2) {
                    case 0:
                        lambda$static$0 = FailablePredicate.lambda$static$0(obj);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = FailablePredicate.lambda$static$1(obj);
                        return lambda$static$1;
                }
            }
        };
    }

    static <T, E extends Throwable> FailablePredicate<T, E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(FailablePredicate failablePredicate, Object obj) throws Throwable {
        return test(obj) && failablePredicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$0(Object obj) throws Throwable {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$0(FailablePredicate failablePredicate, Object obj) throws Throwable {
        return test(obj) || failablePredicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Object obj) throws Throwable {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(Object obj) throws Throwable {
        return true;
    }

    static <T, E extends Throwable> FailablePredicate<T, E> truePredicate() {
        return TRUE;
    }

    default FailablePredicate<T, E> and(FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate$$ExternalSyntheticLambda0(this, failablePredicate, 1);
    }

    default FailablePredicate<T, E> negate() {
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda4
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                boolean lambda$negate$0;
                lambda$negate$0 = FailablePredicate.this.lambda$negate$0(obj);
                return lambda$negate$0;
            }
        };
    }

    default FailablePredicate<T, E> or(FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate$$ExternalSyntheticLambda0(this, failablePredicate, 0);
    }

    boolean test(T t) throws Throwable;
}
