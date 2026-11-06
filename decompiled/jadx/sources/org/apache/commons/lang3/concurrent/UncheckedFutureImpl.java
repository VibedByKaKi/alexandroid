package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.lang3.exception.UncheckedInterruptedException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class UncheckedFutureImpl<V> extends AbstractFutureProxy<V> implements UncheckedFuture<V> {
    public UncheckedFutureImpl(Future<V> future) {
        super(future);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractFutureProxy, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        try {
            return (V) super.get(j, timeUnit);
        } catch (InterruptedException e) {
            throw new UncheckedInterruptedException(e);
        } catch (ExecutionException e2) {
            throw new UncheckedExecutionException(e2);
        } catch (TimeoutException e3) {
            throw new UncheckedTimeoutException(e3);
        }
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractFutureProxy, java.util.concurrent.Future
    public V get() {
        try {
            return (V) super.get();
        } catch (InterruptedException e) {
            throw new UncheckedInterruptedException(e);
        } catch (ExecutionException e2) {
            throw new UncheckedExecutionException(e2);
        }
    }
}
