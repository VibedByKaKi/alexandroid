package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AtomicSafeInitializer<T> extends AbstractConcurrentInitializer<T, ConcurrentException> {
    private static final Object NO_INIT = new Object();
    private final AtomicReference<AtomicSafeInitializer<T>> factory;
    private final AtomicReference<T> reference;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<I extends AtomicSafeInitializer<T>, T> extends AbstractConcurrentInitializer.AbstractBuilder<I, T, Builder<I, T>, ConcurrentException> {
        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
            return (I) new AtomicSafeInitializer(getInitializer(), getCloser());
        }
    }

    public AtomicSafeInitializer() {
        this.factory = new AtomicReference<>();
        this.reference = new AtomicReference<>(getNoInit());
    }

    public static <T> Builder<AtomicSafeInitializer<T>, T> builder() {
        return new Builder<>();
    }

    private T getNoInit() {
        return (T) NO_INIT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        r3.reference.set(initialize());
     */
    @Override // org.apache.commons.lang3.function.FailableSupplier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<T> r0 = r3.reference
            java.lang.Object r0 = r0.get()
            java.lang.Object r1 = r3.getNoInit()
            if (r0 != r1) goto L3e
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> r1 = r3.factory
        Le:
            r0 = 0
            boolean r2 = r1.compareAndSet(r0, r3)
            if (r2 == 0) goto L37
            java.util.concurrent.atomic.AtomicReference<T> r1 = r3.reference     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r3.initialize()     // Catch: java.lang.Throwable -> L1f
            r1.set(r2)     // Catch: java.lang.Throwable -> L1f
            goto L0
        L1f:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> r3 = r3.factory
            r3.set(r0)
            java.lang.Throwable r3 = org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r1)
            boolean r0 = r3 instanceof org.apache.commons.lang3.concurrent.ConcurrentException
            if (r0 == 0) goto L30
            org.apache.commons.lang3.concurrent.ConcurrentException r3 = (org.apache.commons.lang3.concurrent.ConcurrentException) r3
            goto L36
        L30:
            org.apache.commons.lang3.concurrent.ConcurrentException r0 = new org.apache.commons.lang3.concurrent.ConcurrentException
            r0.<init>(r3)
            r3 = r0
        L36:
            throw r3
        L37:
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto Le
            goto L0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.concurrent.AtomicSafeInitializer.get():java.lang.Object");
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public ConcurrentException getTypedException(Exception exc) {
        return new ConcurrentException(exc);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public boolean isInitialized() {
        return this.reference.get() != NO_INIT;
    }

    private AtomicSafeInitializer(FailableSupplier<T, ConcurrentException> failableSupplier, FailableConsumer<T, ConcurrentException> failableConsumer) {
        super(failableSupplier, failableConsumer);
        this.factory = new AtomicReference<>();
        this.reference = new AtomicReference<>(getNoInit());
    }
}
