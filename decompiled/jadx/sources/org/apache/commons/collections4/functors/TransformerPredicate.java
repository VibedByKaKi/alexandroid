package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class TransformerPredicate<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = -2407966402920578741L;
    private final Transformer<? super T, Boolean> iTransformer;

    public TransformerPredicate(Transformer<? super T, Boolean> transformer) {
        this.iTransformer = transformer;
    }

    public static <T> Predicate<T> transformerPredicate(Transformer<? super T, Boolean> transformer) {
        if (transformer != null) {
            return new TransformerPredicate(transformer);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("The transformer to call must not be null");
        return null;
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        Boolean transform = this.iTransformer.transform(t);
        if (transform != null) {
            return transform.booleanValue();
        }
        throw new FunctorException("Transformer must return an instanceof Boolean, it was a null object");
    }

    public Transformer<? super T, Boolean> getTransformer() {
        return this.iTransformer;
    }
}
