package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
abstract class ImmediateFuture<V> implements ListenableFuture<V> {
    private static final String TAG = "ImmediateFuture";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {

        @NonNull
        private final Throwable mCause;

        public ImmediateFailedFuture(@NonNull Throwable th) {
            this.mCause = th;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        @Nullable
        public V get() throws ExecutionException {
            throw new ExecutionException(this.mCause);
        }

        @NonNull
        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture(null);

        @Nullable
        private final V mValue;

        public ImmediateSuccessfulFuture(@Nullable V v) {
            this.mValue = v;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        @Nullable
        public V get() {
            return this.mValue;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, "]]", this.mValue);
        }
    }

    public static <V> ListenableFuture<V> nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(@NonNull Throwable th) {
            super(th);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Delayed delayed) {
            return -1;
        }
    }
}
