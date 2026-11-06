package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AtomicInitializer<T> extends AbstractConcurrentInitializer<T, ConcurrentException> {
    private static final Object NO_INIT = new Object();
    private final AtomicReference<T> reference;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<I extends AtomicInitializer<T>, T> extends AbstractConcurrentInitializer.AbstractBuilder<I, T, Builder<I, T>, ConcurrentException> {
        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
            return (I) new AtomicInitializer(getInitializer(), getCloser());
        }
    }

    public AtomicInitializer() {
        this.reference = new AtomicReference<>(getNoInit());
    }

    public static <T> Builder<AtomicInitializer<T>, T> builder() {
        return new Builder<>();
    }

    private T getNoInit() {
        return (T) NO_INIT;
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws ConcurrentException {
        T t = this.reference.get();
        if (t != getNoInit()) {
            return t;
        }
        T initialize = initialize();
        AtomicReference<T> atomicReference = this.reference;
        T noInit = getNoInit();
        while (!atomicReference.compareAndSet(noInit, initialize)) {
            if (atomicReference.get() != noInit) {
                return this.reference.get();
            }
        }
        return initialize;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public ConcurrentException getTypedException(Exception exc) {
        return new ConcurrentException(exc);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public boolean isInitialized() {
        return this.reference.get() != NO_INIT;
    }

    private AtomicInitializer(FailableSupplier<T, ConcurrentException> failableSupplier, FailableConsumer<T, ConcurrentException> failableConsumer) {
        super(failableSupplier, failableConsumer);
        this.reference = new AtomicReference<>(getNoInit());
    }
}
