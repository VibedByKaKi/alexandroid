package org.apache.commons.lang3.concurrent;

import java.lang.Exception;
import java.util.Objects;
import org.apache.commons.lang3.builder.AbstractSupplier;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AbstractConcurrentInitializer<T, E extends Exception> implements ConcurrentInitializer<T> {
    private final FailableConsumer<? super T, ? extends Exception> closer;
    private final FailableSupplier<? extends T, ? extends Exception> initializer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AbstractBuilder<I extends AbstractConcurrentInitializer<T, E>, T, B extends AbstractBuilder<I, T, B, E>, E extends Exception> extends AbstractSupplier<I, B, E> {
        private FailableConsumer<T, ? extends Exception> closer = FailableConsumer.nop();
        private FailableSupplier<T, ? extends Exception> initializer = FailableSupplier.nul();

        public FailableConsumer<T, ? extends Exception> getCloser() {
            return this.closer;
        }

        public FailableSupplier<T, ? extends Exception> getInitializer() {
            return this.initializer;
        }

        public B setCloser(FailableConsumer<T, ? extends Exception> failableConsumer) {
            if (failableConsumer == null) {
                failableConsumer = FailableConsumer.nop();
            }
            this.closer = failableConsumer;
            return (B) asThis();
        }

        public B setInitializer(FailableSupplier<T, ? extends Exception> failableSupplier) {
            if (failableSupplier == null) {
                failableSupplier = FailableSupplier.nul();
            }
            this.initializer = failableSupplier;
            return (B) asThis();
        }
    }

    public AbstractConcurrentInitializer(FailableSupplier<? extends T, ? extends Exception> failableSupplier, FailableConsumer<? super T, ? extends Exception> failableConsumer) {
        Objects.requireNonNull(failableConsumer, "closer");
        this.closer = failableConsumer;
        Objects.requireNonNull(failableSupplier, "initializer");
        this.initializer = failableSupplier;
    }

    public void close() throws ConcurrentException {
        if (isInitialized()) {
            try {
                this.closer.accept(get());
            } catch (Exception e) {
                throw new ConcurrentException(ExceptionUtils.throwUnchecked(e));
            }
        }
    }

    public abstract E getTypedException(Exception exc);

    public T initialize() throws Exception {
        try {
            return this.initializer.get();
        } catch (Exception e) {
            ExceptionUtils.throwUnchecked(e);
            E typedException = this.getTypedException(e);
            if (typedException.getClass().isAssignableFrom(e.getClass())) {
                throw e;
            }
            throw typedException;
        }
    }

    public abstract boolean isInitialized();

    public AbstractConcurrentInitializer() {
        this(FailableSupplier.nul(), FailableConsumer.nop());
    }
}
