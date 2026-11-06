package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class TransformedPredicate<T> implements PredicateDecorator<T>, Serializable {
    private static final long serialVersionUID = -5596090919668315834L;
    private final Predicate<? super T> iPredicate;
    private final Transformer<? super T, ? extends T> iTransformer;

    public TransformedPredicate(Transformer<? super T, ? extends T> transformer, Predicate<? super T> predicate) {
        this.iTransformer = transformer;
        this.iPredicate = predicate;
    }

    public static <T> Predicate<T> transformedPredicate(Transformer<? super T, ? extends T> transformer, Predicate<? super T> predicate) {
        if (transformer == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The transformer to call must not be null");
            return null;
        }
        if (predicate != null) {
            return new TransformedPredicate(transformer, predicate);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The predicate to call must not be null");
        return null;
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        return this.iPredicate.evaluate(this.iTransformer.transform(t));
    }

    @Override // org.apache.commons.collections4.functors.PredicateDecorator
    public Predicate<? super T>[] getPredicates() {
        return new Predicate[]{this.iPredicate};
    }

    public Transformer<? super T, ? extends T> getTransformer() {
        return this.iTransformer;
    }
}
