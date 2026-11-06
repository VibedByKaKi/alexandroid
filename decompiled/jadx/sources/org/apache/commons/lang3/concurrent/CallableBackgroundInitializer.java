package org.apache.commons.lang3.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CallableBackgroundInitializer<T> extends BackgroundInitializer<T> {
    private final Callable<T> callable;

    public CallableBackgroundInitializer(Callable<T> callable) {
        checkCallable(callable);
        this.callable = callable;
    }

    private void checkCallable(Callable<T> callable) {
        Objects.requireNonNull(callable, "callable");
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer, org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public Exception getTypedException(Exception exc) {
        return new Exception(exc);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public T initialize() throws Exception {
        return this.callable.call();
    }

    public CallableBackgroundInitializer(Callable<T> callable, ExecutorService executorService) {
        super(executorService);
        checkCallable(callable);
        this.callable = callable;
    }
}
