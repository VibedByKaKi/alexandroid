package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Closure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ForClosure<E> implements Closure<E> {
    private final Closure<? super E> iClosure;
    private final int iCount;

    public ForClosure(int i, Closure<? super E> closure) {
        this.iCount = i;
        this.iClosure = closure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Closure<E> forClosure(int i, Closure<? super E> closure) {
        return (i <= 0 || closure == 0) ? NOPClosure.nopClosure() : i == 1 ? closure : new ForClosure(i, closure);
    }

    @Override // org.apache.commons.collections4.Closure
    public void execute(E e) {
        for (int i = 0; i < this.iCount; i++) {
            this.iClosure.execute(e);
        }
    }

    public Closure<? super E> getClosure() {
        return this.iClosure;
    }

    public int getCount() {
        return this.iCount;
    }
}
