package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class IfClosure<E> implements Closure<E>, Serializable {
    private static final long serialVersionUID = 3518477308466486130L;
    private final Closure<? super E> iFalseClosure;
    private final Predicate<? super E> iPredicate;
    private final Closure<? super E> iTrueClosure;

    public IfClosure(Predicate<? super E> predicate, Closure<? super E> closure, Closure<? super E> closure2) {
        this.iPredicate = predicate;
        this.iTrueClosure = closure;
        this.iFalseClosure = closure2;
    }

    public static <E> Closure<E> ifClosure(Predicate<? super E> predicate, Closure<? super E> closure, Closure<? super E> closure2) {
        if (predicate == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Predicate must not be null");
            return null;
        }
        if (closure != null && closure2 != null) {
            return new IfClosure(predicate, closure, closure2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Closures must not be null");
        return null;
    }

    @Override // org.apache.commons.collections4.Closure
    public void execute(E e) {
        if (this.iPredicate.evaluate(e)) {
            this.iTrueClosure.execute(e);
        } else {
            this.iFalseClosure.execute(e);
        }
    }

    public Closure<? super E> getFalseClosure() {
        return this.iFalseClosure;
    }

    public Predicate<? super E> getPredicate() {
        return this.iPredicate;
    }

    public Closure<? super E> getTrueClosure() {
        return this.iTrueClosure;
    }

    public IfClosure(Predicate<? super E> predicate, Closure<? super E> closure) {
        this(predicate, closure, NOPClosure.nopClosure());
    }

    public static <E> Closure<E> ifClosure(Predicate<? super E> predicate, Closure<? super E> closure) {
        return ifClosure(predicate, closure, NOPClosure.nopClosure());
    }
}
