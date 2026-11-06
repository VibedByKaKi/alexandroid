package com.amazon.minerva.client.thirdparty.storage;

import android.util.Log;
import com.amazon.minerva.client.thirdparty.configuration.MetricsConfigurationHelper;
import com.amazon.minerva.client.thirdparty.utils.BackgroundThreadFactory;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class AbstractBatchCreatorScheduler {
    private static final String TAG = "AbstractBatchCreatorScheduler";
    private static final String THREAD_NAME_BATCH_OPEN_TIME_WATCHER = "MnvBchOpnWch_";
    private static final int THREAD_POOL_TERMINATION_WAIT_MS = 5000;
    private final BatchOpenTimeWatcher mBatchOpenTimeWatcher = new BatchOpenTimeWatcher();
    private final MetricsConfigurationHelper mMetricsConfigurationHelper;
    protected final AtomicLong mTimeSinceLastPublish;
    protected final ScheduledExecutorService threadPool;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class BatchOpenTimeWatcher implements Callable<Void> {
        private BatchOpenTimeWatcher() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            AbstractBatchCreatorScheduler.this.checkBatchOpenTimeAndEnqueueIfReady();
            AbstractBatchCreatorScheduler.this.scheduleBatchOpenTimeWatcher();
            return null;
        }
    }

    public AbstractBatchCreatorScheduler(MetricsConfigurationHelper metricsConfigurationHelper, String str) {
        Objects.requireNonNull(metricsConfigurationHelper, "metricsConfigurationHelper cannot be null.");
        this.mMetricsConfigurationHelper = metricsConfigurationHelper;
        AtomicLong atomicLong = new AtomicLong();
        this.mTimeSinceLastPublish = atomicLong;
        atomicLong.set(System.currentTimeMillis());
        this.threadPool = Executors.newSingleThreadScheduledExecutor(new BackgroundThreadFactory(a$$ExternalSyntheticOutline0.m(THREAD_NAME_BATCH_OPEN_TIME_WATCHER, str)));
    }

    public abstract void checkBatchOpenTimeAndEnqueueIfReady();

    public boolean maxBatchOpenTimeReached() {
        return System.currentTimeMillis() - this.mTimeSinceLastPublish.get() >= this.mMetricsConfigurationHelper.getStorageConfiguration().getMaxBatchOpenTimeMillis();
    }

    public void scheduleBatchOpenTimeWatcher() {
        try {
            this.threadPool.schedule(this.mBatchOpenTimeWatcher, this.mMetricsConfigurationHelper.getStorageConfiguration().getCheckBatchOpenTimeMillis(), TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
            Log.e(TAG, "Unexpected rejected execution exception while scheduling LastPublishTimeWatcher");
        }
    }

    public void shutdown() {
        List<Runnable> shutdownNow = this.threadPool.shutdownNow();
        if (shutdownNow == null || shutdownNow.size() <= 0) {
            return;
        }
        Log.i(TAG, String.format("shutdown called with %d pending tasks", Integer.valueOf(shutdownNow.size())));
    }
}
