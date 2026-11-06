package com.google.common.util.concurrent;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible
/* loaded from: classes8.dex */
public abstract class AbstractFuture<V> extends AbstractFutureState<V> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED;
        static final Cancellation CAUSELESS_INTERRUPTED;
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (AbstractFutureState.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new Cancellation(false, null);
                CAUSELESS_INTERRUPTED = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DelegatingToFuture<V> implements Runnable {
        final ListenableFuture<? extends V> future;
        final AbstractFuture<V> owner;

        public DelegatingToFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.owner = abstractFuture;
            this.future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value() != this) {
                return;
            }
            if (AbstractFutureState.casValue(this.owner, this, AbstractFuture.getFutureValue(this.future))) {
                AbstractFuture.complete(this.owner, false);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Failure {
        static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        public Failure(Throwable th) {
            this.exception = (Throwable) Preconditions.checkNotNull(th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Trusted<V> extends ListenableFuture<V> {
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            appendResultObject(sb, uninterruptibly);
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void addPendingString(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object value = value();
        if (value instanceof DelegatingToFuture) {
            sb.append(", setFuture=[");
            appendUserObject(sb, ((DelegatingToFuture) value).future);
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        } else {
            try {
                str = Strings.emptyToNull(pendingToString());
            } catch (Throwable th) {
                Platform.rethrowIfErrorOtherThanStackOverflow(th);
                str = "Exception thrown from implementation: " + th.getClass();
            }
            if (str != null) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, ", info=[", str, MarkdownConstants.RIGHT_BRACKET);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            addDoneString(sb);
        }
    }

    private void appendResultObject(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Throwable th) {
            Platform.rethrowIfErrorOtherThanStackOverflow(th);
            sb.append("Exception thrown from implementation: ");
            sb.append(th.getClass());
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private Listener clearListeners(Listener listener) {
        Listener gasListeners = gasListeners(Listener.TOMBSTONE);
        Listener listener2 = listener;
        while (gasListeners != null) {
            Listener listener3 = gasListeners.next;
            gasListeners.next = listener2;
            listener2 = gasListeners;
            gasListeners = listener3;
        }
        return listener2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void complete(AbstractFuture<?> abstractFuture, boolean z) {
        Listener listener = null;
        while (true) {
            abstractFuture.releaseWaiters();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            Listener clearListeners = abstractFuture.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                Runnable runnable = clearListeners.task;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof DelegatingToFuture) {
                    DelegatingToFuture delegatingToFuture = (DelegatingToFuture) runnable2;
                    abstractFuture = delegatingToFuture.owner;
                    if (abstractFuture.value() == delegatingToFuture && AbstractFutureState.casValue(abstractFuture, delegatingToFuture, getFutureValue(delegatingToFuture.future))) {
                        break;
                    }
                } else {
                    Executor executor = clearListeners.executor;
                    Objects.requireNonNull(executor);
                    executeListener(runnable2, executor);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractFutureState.log.get().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public static <V> V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).cause);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).exception);
        }
        return obj == AbstractFutureState.NULL ? (V) NullnessCasts.uncheckedNull() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof Trusted) {
            Object value = ((AbstractFuture) listenableFuture).value();
            if (value instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) value;
                if (cancellation.wasInterrupted) {
                    value = cancellation.cause != null ? new Cancellation(false, cancellation.cause) : Cancellation.CAUSELESS_CANCELLED;
                }
            }
            Objects.requireNonNull(value);
            return value;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!AbstractFutureState.GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            Cancellation cancellation2 = Cancellation.CAUSELESS_CANCELLED;
            Objects.requireNonNull(cancellation2);
            return cancellation2;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            if (!isCancelled) {
                return uninterruptibly == null ? AbstractFutureState.NULL : uninterruptibly;
            }
            return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
        } catch (Error | Exception e) {
            return new Failure(e);
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new Cancellation(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
        } catch (ExecutionException e3) {
            if (!isCancelled) {
                return new Failure(e3.getCause());
            }
            return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
        }
    }

    @ParametricNullness
    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Platform.interruptCurrentThread();
                }
                throw th;
            }
        }
        if (z) {
            Platform.interruptCurrentThread();
        }
        return v;
    }

    public static boolean notInstanceOfDelegatingToFuture(Object obj) {
        return !(obj instanceof DelegatingToFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listeners;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listeners = listeners()) != Listener.TOMBSTONE) {
            Listener listener = new Listener(runnable, executor);
            do {
                listener.next = listeners;
                if (casListeners(listeners, listener)) {
                    return;
                } else {
                    listeners = listeners();
                }
            } while (listeners != Listener.TOMBSTONE);
        }
        executeListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        Cancellation cancellation;
        Object value = value();
        if (!(value == null) && !(value instanceof DelegatingToFuture)) {
            return false;
        }
        if (AbstractFutureState.GENERATE_CANCELLATION_CAUSES) {
            cancellation = new Cancellation(z, new CancellationException("Future.cancel() was called."));
        } else {
            cancellation = z ? Cancellation.CAUSELESS_INTERRUPTED : Cancellation.CAUSELESS_CANCELLED;
            Objects.requireNonNull(cancellation);
        }
        boolean z2 = false;
        while (true) {
            if (AbstractFutureState.casValue(this, value, cancellation)) {
                complete(this, z);
                if (!(value instanceof DelegatingToFuture)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((DelegatingToFuture) value).future;
                if (!(listenableFuture instanceof Trusted)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (AbstractFuture) listenableFuture;
                value = this.value();
                if (!(value == null) && !(value instanceof DelegatingToFuture)) {
                    break;
                }
                z2 = true;
            } else {
                value = this.value();
                if (notInstanceOfDelegatingToFuture(value)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return (V) Platform.get(this, j, timeUnit);
    }

    @ParametricNullness
    public final V getFromAlreadyDoneTrustedFuture() throws ExecutionException {
        Object value = value();
        if (!(value == null) && !(value instanceof DelegatingToFuture)) {
            return (V) getDoneValue(value);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot get() on a pending future.");
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return value() instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object value = value();
        return notInstanceOfDelegatingToFuture(value) & (value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @CanIgnoreReturnValue
    public boolean set(@ParametricNullness V v) {
        if (v == null) {
            v = (V) AbstractFutureState.NULL;
        }
        if (!AbstractFutureState.casValue(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setException(Throwable th) {
        if (!AbstractFutureState.casValue(this, null, new Failure((Throwable) Preconditions.checkNotNull(th)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        Preconditions.checkNotNull(listenableFuture);
        Object value = value();
        if (value == null) {
            if (listenableFuture.isDone()) {
                if (!AbstractFutureState.casValue(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            DelegatingToFuture delegatingToFuture = new DelegatingToFuture(this, listenableFuture);
            if (AbstractFutureState.casValue(this, null, delegatingToFuture)) {
                try {
                    listenableFuture.addListener(delegatingToFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Error | Exception unused) {
                        failure = Failure.FALLBACK_INSTANCE;
                    }
                    AbstractFutureState.casValue(this, delegatingToFuture, failure);
                }
                return true;
            }
            value = value();
        }
        if (value instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) value).wasInterrupted);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object value = value();
        if (value instanceof Failure) {
            return ((Failure) value).exception;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object value = value();
        return (value instanceof Cancellation) && ((Cancellation) value).wasInterrupted;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        return (V) Platform.get(this);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Listener {
        static final Listener TOMBSTONE = new Listener();
        final Executor executor;
        Listener next;
        final Runnable task;

        public Listener() {
            this.task = null;
            this.executor = null;
        }

        public Listener(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    @ForOverride
    public void afterDone() {
    }

    public void interruptTask() {
    }
}
