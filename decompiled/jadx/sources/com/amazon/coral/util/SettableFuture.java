package com.amazon.coral.util;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public class SettableFuture<T> implements Future<T> {
    private boolean canceled = false;
    private boolean completed = false;
    private T obj = null;
    private Exception exception = null;
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (isCancelled() || isDone()) {
            return false;
        }
        set(null);
        this.canceled = true;
        if (z) {
            this.countDownLatch.countDown();
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (isCancelled()) {
            throw new CancellationException("The future was already canceled!");
        }
        if (this.exception != null) {
            throw new ExecutionException("A runtime exception was already thrown!", getException());
        }
        if (!this.countDownLatch.await(j, timeUnit)) {
            throw new TimeoutException("The timeout limit has been reached!");
        }
        if (isCancelled()) {
            throw new CancellationException("The future has been cancelled while waiting!");
        }
        if (this.exception == null) {
            return this.obj;
        }
        throw new ExecutionException("A runtime exception has been thrown while the future was waiting!", getException());
    }

    public Exception getException() {
        return this.exception;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.canceled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.completed;
    }

    public void set(T t) {
        T t2;
        if (isDone() && ((t != null && (t2 = this.obj) != null && !t2.equals(t)) || ((t == null && this.obj != null) || (t != null && this.obj == null)))) {
            Single$$ExternalSyntheticBUOutline0.m$2("The future has already been set and does not support a different value to be set!");
            return;
        }
        if (t != null) {
            this.obj = t;
        }
        this.completed = true;
        this.countDownLatch.countDown();
    }

    public void setException(Exception exc) {
        if (isCancelled()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot set exception if the future has been canceled!");
        } else if (getException() != null && !getException().equals(exc)) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot set two different exceptions on the same future!");
        } else {
            this.exception = exc;
            set(null);
        }
    }

    @Override // java.util.concurrent.Future
    public T get() {
        if (!isCancelled()) {
            if (this.exception == null) {
                try {
                    this.countDownLatch.await();
                    if (!isCancelled()) {
                        if (this.exception == null) {
                            return this.obj;
                        }
                        OnnxMap$$ExternalSyntheticBUOutline0.m("A runtime exception has been thrown while the future was waiting!", getException());
                        return null;
                    }
                    throw new CancellationException("The future has been canceled while waiting!");
                } catch (InterruptedException e) {
                    OnnxMap$$ExternalSyntheticBUOutline0.m("The wait has been interrupted!", e);
                    return null;
                }
            }
            OnnxMap$$ExternalSyntheticBUOutline0.m("A runtime exception was already thrown!", getException());
            return null;
        }
        throw new CancellationException("The future was already cancelled!");
    }
}
