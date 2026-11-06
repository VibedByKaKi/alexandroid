package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class CatchAndRethrowClosure<E> implements Closure<E> {
    @Override // org.apache.commons.collections4.Closure
    public void execute(E e) {
        try {
            executeAndThrow(e);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new FunctorException(th);
        }
    }

    public abstract void executeAndThrow(E e) throws Throwable;
}
