package com.facebook.datasource;

import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class AbstractDataSource<T> implements DataSource<T> {

    @Nullable
    private static volatile DataSourceInstrumenter sDataSourceInstrumenter;

    @Nullable
    private Map<String, Object> mExtras;

    @GuardedBy("this")
    @Nullable
    private T mResult = null;

    @GuardedBy("this")
    @Nullable
    private Throwable mFailureThrowable = null;

    @GuardedBy("this")
    private float mProgress = 0.0f;

    @GuardedBy("this")
    private boolean mIsClosed = false;

    @GuardedBy("this")
    private DataSourceStatus mDataSourceStatus = DataSourceStatus.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DataSourceInstrumenter {
        Runnable decorateRunnable(Runnable runnable, String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    @Nullable
    public static DataSourceInstrumenter getDataSourceInstrumenter() {
        return sDataSourceInstrumenter;
    }

    private void notifyDataSubscribers() {
        boolean hasFailed = hasFailed();
        boolean wasCancelled = wasCancelled();
        Iterator<Pair<DataSubscriber<T>, Executor>> it2 = this.mSubscribers.iterator();
        while (it2.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it2.next();
            notifyDataSubscriber((DataSubscriber) next.first, (Executor) next.second, hasFailed, wasCancelled);
        }
    }

    public static void provideInstrumenter(@Nullable DataSourceInstrumenter dataSourceInstrumenter) {
        sDataSourceInstrumenter = dataSourceInstrumenter;
    }

    private synchronized boolean setFailureInternal(@Nullable Throwable th, @Nullable Map<String, Object> map) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            this.mDataSourceStatus = DataSourceStatus.FAILURE;
            this.mFailureThrowable = th;
            this.mExtras = map;
            return true;
        }
        return false;
    }

    private synchronized boolean setProgressInternal(float f) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            if (f < this.mProgress) {
                return false;
            }
            this.mProgress = f;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0019 -> B:28:0x003a). Please report as a decompilation issue!!! */
    private boolean setResultInternal(@Nullable T t, boolean z) {
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                            if (z) {
                                this.mDataSourceStatus = DataSourceStatus.SUCCESS;
                                this.mProgress = 1.0f;
                            }
                            T t4 = this.mResult;
                            if (t4 != t) {
                                try {
                                    this.mResult = t;
                                    t2 = t4;
                                } catch (Throwable th) {
                                    th = th;
                                    t3 = t4;
                                    throw th;
                                }
                            } else {
                                t2 = null;
                            }
                            return true;
                        }
                        if (t != null) {
                            closeResult(t);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t3 = t;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t3 != null) {
                closeResult(t3);
            }
        }
    }

    private synchronized boolean wasCancelled() {
        boolean z;
        if (isClosed()) {
            z = isFinished() ? false : true;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            try {
                if (this.mIsClosed) {
                    return false;
                }
                this.mIsClosed = true;
                T t = this.mResult;
                this.mResult = null;
                if (t != null) {
                    closeResult(t);
                }
                if (!isFinished()) {
                    notifyDataSubscribers();
                }
                synchronized (this) {
                    this.mSubscribers.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized Throwable getFailureCause() {
        return this.mFailureThrowable;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized float getProgress() {
        return this.mProgress;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized T getResult() {
        return this.mResult;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasFailed() {
        return this.mDataSourceStatus == DataSourceStatus.FAILURE;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean hasMultipleResults() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
        return this.mResult != null;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isFinished() {
        return this.mDataSourceStatus != DataSourceStatus.IN_PROGRESS;
    }

    public void notifyDataSubscriber(final DataSubscriber<T> dataSubscriber, Executor executor, final boolean z, final boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.1
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    dataSubscriber.onFailure(AbstractDataSource.this);
                    return;
                }
                boolean z3 = z2;
                DataSubscriber dataSubscriber2 = dataSubscriber;
                if (z3) {
                    dataSubscriber2.onCancellation(AbstractDataSource.this);
                } else {
                    dataSubscriber2.onNewResult(AbstractDataSource.this);
                }
            }
        };
        DataSourceInstrumenter dataSourceInstrumenter = getDataSourceInstrumenter();
        if (dataSourceInstrumenter != null) {
            runnable = dataSourceInstrumenter.decorateRunnable(runnable, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnable);
    }

    public void notifyProgressUpdate() {
        Iterator<Pair<DataSubscriber<T>, Executor>> it2 = this.mSubscribers.iterator();
        while (it2.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it2.next();
            final DataSubscriber dataSubscriber = (DataSubscriber) next.first;
            ((Executor) next.second).execute(new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.2
                @Override // java.lang.Runnable
                public void run() {
                    dataSubscriber.onProgressUpdate(AbstractDataSource.this);
                }
            });
        }
    }

    public void setExtras(@Nullable Map<String, Object> map) {
        this.mExtras = map;
    }

    public boolean setFailure(@Nullable Throwable th, @Nullable Map<String, Object> map) {
        boolean failureInternal = setFailureInternal(th, map);
        if (failureInternal) {
            notifyDataSubscribers();
        }
        return failureInternal;
    }

    public boolean setProgress(float f) {
        boolean progressInternal = setProgressInternal(f);
        if (progressInternal) {
            notifyProgressUpdate();
        }
        return progressInternal;
    }

    public boolean setResult(@Nullable T t, boolean z, @Nullable Map<String, Object> map) {
        setExtras(map);
        boolean resultInternal = setResultInternal(t, z);
        if (resultInternal) {
            notifyDataSubscribers();
        }
        return resultInternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribe(com.facebook.datasource.DataSubscriber<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r3)
            com.facebook.common.internal.Preconditions.checkNotNull(r4)
            monitor-enter(r2)
            boolean r0 = r2.mIsClosed     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            goto L43
        Lf:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r2.mDataSourceStatus     // Catch: java.lang.Throwable -> Ld
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> Ld
            if (r0 != r1) goto L1e
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r0 = r2.mSubscribers     // Catch: java.lang.Throwable -> Ld
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
        L1e:
            boolean r0 = r2.hasResult()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L33
            boolean r0 = r2.isFinished()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L33
            boolean r0 = r2.wasCancelled()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L42
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.wasCancelled()
            r2.notifyDataSubscriber(r3, r4, r0, r1)
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.subscribe(com.facebook.datasource.DataSubscriber, java.util.concurrent.Executor):void");
    }

    public boolean setFailure(Throwable th) {
        return setFailure(th, null);
    }

    public boolean setResult(@Nullable T t, boolean z) {
        return setResult(t, z, null);
    }

    public void closeResult(@Nullable T t) {
    }
}
