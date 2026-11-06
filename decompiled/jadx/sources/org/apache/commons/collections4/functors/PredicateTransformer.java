package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PredicateTransformer<T> implements Transformer<T, Boolean>, Serializable {
    private static final long serialVersionUID = 5278818408044349346L;
    private final Predicate<? super T> iPredicate;

    public PredicateTransformer(Predicate<? super T> predicate) {
        this.iPredicate = predicate;
    }

    public static <T> Transformer<T, Boolean> predicateTransformer(Predicate<? super T> predicate) {
        if (predicate != null) {
            return new PredicateTransformer(predicate);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Predicate must not be null");
        return null;
    }

    public Predicate<? super T> getPredicate() {
        return this.iPredicate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.collections4.Transformer
    public Boolean transform(T t) {
        return Boolean.valueOf(this.iPredicate.evaluate(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.Transformer
    public /* bridge */ /* synthetic */ Boolean transform(Object obj) {
        return transform((PredicateTransformer<T>) obj);
    }
}
