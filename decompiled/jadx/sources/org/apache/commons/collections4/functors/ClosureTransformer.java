package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ClosureTransformer<T> implements Transformer<T, T>, Serializable {
    private static final long serialVersionUID = 478466901448617286L;
    private final Closure<? super T> iClosure;

    public ClosureTransformer(Closure<? super T> closure) {
        this.iClosure = closure;
    }

    public static <T> Transformer<T, T> closureTransformer(Closure<? super T> closure) {
        if (closure != null) {
            return new ClosureTransformer(closure);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Closure must not be null");
        return null;
    }

    public Closure<? super T> getClosure() {
        return this.iClosure;
    }

    @Override // org.apache.commons.collections4.Transformer
    public T transform(T t) {
        this.iClosure.execute(t);
        return t;
    }
}
