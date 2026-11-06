package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LazyInitializer<T> extends AbstractConcurrentInitializer<T, ConcurrentException> {
    private static final Object NO_INIT = new Object();
    private volatile T object;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<I extends LazyInitializer<T>, T> extends AbstractConcurrentInitializer.AbstractBuilder<I, T, Builder<I, T>, ConcurrentException> {
        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
            return (I) new LazyInitializer(getInitializer(), getCloser());
        }
    }

    public LazyInitializer() {
        this.object = (T) NO_INIT;
    }

    public static <T> Builder<LazyInitializer<T>, T> builder() {
        return new Builder<>();
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws ConcurrentException {
        T t;
        T t2 = this.object;
        Object obj = NO_INIT;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = this.object;
                if (t == obj) {
                    t = initialize();
                    this.object = t;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public ConcurrentException getTypedException(Exception exc) {
        return new ConcurrentException(exc);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public boolean isInitialized() {
        return this.object != NO_INIT;
    }

    private LazyInitializer(FailableSupplier<T, ConcurrentException> failableSupplier, FailableConsumer<T, ConcurrentException> failableConsumer) {
        super(failableSupplier, failableConsumer);
        this.object = (T) NO_INIT;
    }
}
