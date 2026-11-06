package org.apache.commons.collections4.functors;

import java.util.Collection;
import org.apache.commons.collections4.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class NonePredicate<T> extends AbstractQuantifierPredicate<T> {
    private static final long serialVersionUID = 2007613066565892961L;

    public NonePredicate(Predicate<? super T>... predicateArr) {
        super(predicateArr);
    }

    public static <T> Predicate<T> nonePredicate(Predicate<? super T>... predicateArr) {
        FunctorUtils.validate(predicateArr);
        return predicateArr.length == 0 ? TruePredicate.truePredicate() : new NonePredicate(FunctorUtils.copy(predicateArr));
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        for (Predicate<? super T> predicate : this.iPredicates) {
            if (predicate.evaluate(t)) {
                return false;
            }
        }
        return true;
    }

    public static <T> Predicate<T> nonePredicate(Collection<? extends Predicate<? super T>> collection) {
        Predicate[] validate = FunctorUtils.validate(collection);
        if (validate.length == 0) {
            return TruePredicate.truePredicate();
        }
        return new NonePredicate(validate);
    }
}
