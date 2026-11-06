package org.apache.commons.collections4.functors;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class FunctorUtils {
    private FunctorUtils() {
    }

    public static <T> Predicate<T>[] copy(Predicate<? super T>... predicateArr) {
        if (predicateArr == null) {
            return null;
        }
        return (Predicate[]) predicateArr.clone();
    }

    public static <T> Predicate<? super T>[] validate(Collection<? extends Predicate<? super T>> collection) {
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The predicate collection must not be null");
            return null;
        }
        Predicate<? super T>[] predicateArr = new Predicate[collection.size()];
        int i = 0;
        for (Predicate<? super T> predicate : collection) {
            predicateArr[i] = predicate;
            if (predicate == null) {
                Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(i, "The predicate collection must not contain a null predicate, index ", " was null"));
                return null;
            }
            i++;
        }
        return predicateArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Predicate<T> coerce(Predicate<? super T> predicate) {
        return predicate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <I, O> Transformer<I, O> coerce(Transformer<? super I, ? extends O> transformer) {
        return transformer;
    }

    public static <E> Closure<E>[] copy(Closure<? super E>... closureArr) {
        if (closureArr == null) {
            return null;
        }
        return (Closure[]) closureArr.clone();
    }

    public static <I, O> Transformer<I, O>[] copy(Transformer<? super I, ? extends O>... transformerArr) {
        if (transformerArr == null) {
            return null;
        }
        return (Transformer[]) transformerArr.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Closure<T> coerce(Closure<? super T> closure) {
        return closure;
    }

    public static void validate(Predicate<?>... predicateArr) {
        if (predicateArr != null) {
            for (int i = 0; i < predicateArr.length; i++) {
                if (predicateArr[i] == null) {
                    Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(i, "The predicate array must not contain a null predicate, index ", " was null"));
                    return;
                }
            }
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The predicate array must not be null");
    }

    public static void validate(Closure<?>... closureArr) {
        if (closureArr != null) {
            for (int i = 0; i < closureArr.length; i++) {
                if (closureArr[i] == null) {
                    Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(i, "The closure array must not contain a null closure, index ", " was null"));
                    return;
                }
            }
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The closure array must not be null");
    }

    public static void validate(Transformer<?, ?>... transformerArr) {
        if (transformerArr != null) {
            for (int i = 0; i < transformerArr.length; i++) {
                if (transformerArr[i] == null) {
                    Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(i, "The transformer array must not contain a null transformer, index ", " was null"));
                    return;
                }
            }
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The transformer array must not be null");
    }
}
