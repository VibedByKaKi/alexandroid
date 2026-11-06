package com.amazon.alexa.ra.rtvi;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tJ\u0013\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/PendingHandoff;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", JoinPoint.SYNCHRONIZATION_LOCK, "value", "Ljava/lang/Object;", "waiter", "Lkotlin/Function1;", "", "await", "onReady", "publish", "newValue", "(Ljava/lang/Object;)V", "cancelAwait", MetricsConstants.Method.CACHE_CLEAR, "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PendingHandoff<T> {

    @NotNull
    private final Object lock = new Object();

    @Nullable
    private T value;

    @Nullable
    private Function1<? super T, Unit> waiter;

    public final void await(@NotNull Function1<? super T, Unit> onReady) {
        T t;
        onReady.getClass();
        synchronized (this.lock) {
            t = this.value;
            if (t == null) {
                this.waiter = onReady;
            }
        }
        if (t != null) {
            onReady.invoke(t);
        }
    }

    public final void cancelAwait() {
        synchronized (this.lock) {
            try {
                if (this.value == null) {
                    this.waiter = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            this.value = null;
            this.waiter = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void publish(T newValue) {
        Function1<? super T, Unit> function1;
        synchronized (this.lock) {
            this.value = newValue;
            function1 = this.waiter;
            this.waiter = null;
            Unit unit = Unit.INSTANCE;
        }
        if (function1 != null) {
            function1.invoke(newValue);
        }
    }
}
