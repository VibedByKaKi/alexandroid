package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class IfTransformer<I, O> implements Transformer<I, O>, Serializable {
    private static final long serialVersionUID = 8069309411242014252L;
    private final Transformer<? super I, ? extends O> iFalseTransformer;
    private final Predicate<? super I> iPredicate;
    private final Transformer<? super I, ? extends O> iTrueTransformer;

    public IfTransformer(Predicate<? super I> predicate, Transformer<? super I, ? extends O> transformer, Transformer<? super I, ? extends O> transformer2) {
        this.iPredicate = predicate;
        this.iTrueTransformer = transformer;
        this.iFalseTransformer = transformer2;
    }

    public static <T> Transformer<T, T> ifTransformer(Predicate<? super T> predicate, Transformer<? super T, ? extends T> transformer) {
        if (predicate == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Predicate must not be null");
            return null;
        }
        if (transformer != null) {
            return new IfTransformer(predicate, transformer, NOPTransformer.nopTransformer());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Transformer must not be null");
        return null;
    }

    public Transformer<? super I, ? extends O> getFalseTransformer() {
        return this.iFalseTransformer;
    }

    public Predicate<? super I> getPredicate() {
        return this.iPredicate;
    }

    public Transformer<? super I, ? extends O> getTrueTransformer() {
        return this.iTrueTransformer;
    }

    @Override // org.apache.commons.collections4.Transformer
    public O transform(I i) {
        return this.iPredicate.evaluate(i) ? this.iTrueTransformer.transform(i) : this.iFalseTransformer.transform(i);
    }

    public static <I, O> Transformer<I, O> ifTransformer(Predicate<? super I> predicate, Transformer<? super I, ? extends O> transformer, Transformer<? super I, ? extends O> transformer2) {
        if (predicate == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Predicate must not be null");
            return null;
        }
        if (transformer != null && transformer2 != null) {
            return new IfTransformer(predicate, transformer, transformer2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Transformers must not be null");
        return null;
    }
}
