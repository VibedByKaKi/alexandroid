package com.facebook.react.common.futures;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.dee.app.metrics.MetricsConstants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\n\u0010\t\u001a\u00060\nj\u0002`\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0016J \u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J\u001d\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/common/futures/SimpleSettableFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Future;", "<init>", "()V", "readyLatch", "Ljava/util/concurrent/CountDownLatch;", "result", "Ljava/lang/Object;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "set", "", "(Ljava/lang/Object;)V", "setException", "cancel", "", "mayInterruptIfRunning", "isCancelled", "isDone", MetricsConstants.Method.CACHE_GET, "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "getOrThrow", "checkNotSet", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleSettableFuture<T> implements Future<T> {

    @Nullable
    private Exception exception;

    @NotNull
    private final CountDownLatch readyLatch = new CountDownLatch(1);

    @Nullable
    private T result;

    private final void checkNotSet() {
        if (this.readyLatch.getCount() != 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m("Result has already been set!");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get(long timeout, @NotNull TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        unit.getClass();
        if (!this.readyLatch.await(timeout, unit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        Exception exc = this.exception;
        if (exc == null) {
            return this.result;
        }
        throw new ExecutionException(exc);
    }

    @Nullable
    public final T getOrThrow(long timeout, @NotNull TimeUnit unit) {
        unit.getClass();
        try {
            return get(timeout, unit);
        } catch (InterruptedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (ExecutionException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (TimeoutException e3) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.readyLatch.getCount() == 0;
    }

    public final void set(@Nullable T result) {
        checkNotSet();
        this.result = result;
        this.readyLatch.countDown();
    }

    public final void setException(@NotNull Exception exception) {
        exception.getClass();
        checkNotSet();
        this.exception = exception;
        this.readyLatch.countDown();
    }

    @Nullable
    public final T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (ExecutionException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get() throws InterruptedException, ExecutionException {
        this.readyLatch.await();
        Exception exc = this.exception;
        if (exc == null) {
            return this.result;
        }
        throw new ExecutionException(exc);
    }
}
