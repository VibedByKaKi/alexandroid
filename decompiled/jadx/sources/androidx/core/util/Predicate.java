package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes13.dex */
public interface Predicate<T> {
    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) Object obj) {
        return obj == null ? new Predicate$$ExternalSyntheticLambda1(0) : new Predicate$$ExternalSyntheticLambda2(obj, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> and(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate$$ExternalSyntheticLambda0(this, predicate, 1);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> negate() {
        return new Predicate$$ExternalSyntheticLambda2(this, 1);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> or(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate$$ExternalSyntheticLambda0(this, predicate, 0);
    }

    boolean test(T t);
}
