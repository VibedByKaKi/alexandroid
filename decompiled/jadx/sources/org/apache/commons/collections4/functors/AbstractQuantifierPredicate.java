package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractQuantifierPredicate<T> implements PredicateDecorator<T>, Serializable {
    private static final long serialVersionUID = -3094696765038308799L;
    protected final Predicate<? super T>[] iPredicates;

    public AbstractQuantifierPredicate(Predicate<? super T>... predicateArr) {
        this.iPredicates = predicateArr;
    }

    @Override // org.apache.commons.collections4.functors.PredicateDecorator
    public Predicate<? super T>[] getPredicates() {
        return FunctorUtils.copy(this.iPredicates);
    }
}
