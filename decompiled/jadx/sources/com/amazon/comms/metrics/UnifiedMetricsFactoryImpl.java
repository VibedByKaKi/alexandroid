package com.amazon.comms.metrics;

import android.content.Context;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.amazon.common.NativeBinding$$ExternalSyntheticLambda0;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.metrics.publisher.MetricsPublisher;
import com.amazon.comms.util.LooperExecutor;
import com.amazon.deecomms.util.LogsUtil$$ExternalSyntheticLambda0;
import it.innove.Peripheral$$ExternalSyntheticLambda1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnifiedMetricsFactoryImpl implements UnifiedMetricsFactory {
    private static final String RECORDING_EXEC = "recordingExec";
    private static LooperExecutor mLooperExecutor;
    private static Set<MetricsPublisher> mMetricsPublishers;
    private static Runnable mPartialCleanupOnStandbyRunnable;
    private static UnifiedMetricsFactoryImpl mUnifiedMetricsFactoryImpl;
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private static CommsLogger mLog = CommsLogger.getLogger(UnifiedMetricsFactoryImpl.class);
    private static final Object lockObject = new Object();

    public static UnifiedMetricsFactory getInstance() {
        UnifiedMetricsFactoryImpl unifiedMetricsFactoryImpl;
        synchronized (lockObject) {
            try {
                if (mUnifiedMetricsFactoryImpl == null) {
                    mLog.d("UnifiedMetricsFactoryImpl is null, creating an instance");
                    mUnifiedMetricsFactoryImpl = new UnifiedMetricsFactoryImpl();
                }
                unifiedMetricsFactoryImpl = mUnifiedMetricsFactoryImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unifiedMetricsFactoryImpl;
    }

    private static boolean isNullOrEmpty(Set<?> set) {
        return set == null || set.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0() {
        synchronized (lockObject) {
            try {
                if (!this.initialized.get()) {
                    mLog.w("UnifiedMetricsFactoryImpl has not been initialized");
                    return;
                }
                if (isNullOrEmpty(mMetricsPublishers)) {
                    mLog.w("Cannot initialize since mMetricsPublishers is null or empty");
                    return;
                }
                Iterator<MetricsPublisher> it2 = mMetricsPublishers.iterator();
                while (it2.hasNext()) {
                    it2.next().shutdownTracePublisherService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$1(Set set, Context context) {
        synchronized (lockObject) {
            try {
                if (!this.initialized.get()) {
                    mLog.w("No longer initialized. Won't update metrics publishers");
                    return;
                }
                Set<MetricsPublisher> set2 = mMetricsPublishers;
                if (set2 == null) {
                    mLog.w("mMetricsPublisher is already null, cannot update it");
                    return;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    MetricsPublisher metricsPublisher = (MetricsPublisher) it2.next();
                    if (!set2.contains(metricsPublisher)) {
                        metricsPublisher.initialize(context);
                        set2.add(metricsPublisher);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordTrace$3(String str, String str2, String str3, String str4, String str5) {
        Set<MetricsPublisher> set;
        synchronized (lockObject) {
            try {
                set = this.initialized.get() ? mMetricsPublishers : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isNullOrEmpty(set)) {
            return;
        }
        Iterator<MetricsPublisher> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().recordTrace(str, str2, str3, str4, str5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recordWithPublishers$2(Set set, Priority priority, UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination) {
        try {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                MetricsPublisher metricsPublisher = (MetricsPublisher) it2.next();
                if (priority == null) {
                    mLog.w("Priority is null. Use NORMAL as default.");
                    unifiedMetricEvent.setPriority(Priority.NORMAL);
                } else {
                    unifiedMetricEvent.setPriority(priority);
                }
                metricsPublisher.record(unifiedMetricEvent, metricsDestination);
            }
        } catch (Throwable th) {
            mLog.e(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shutdown$4(Set set) {
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((MetricsPublisher) it2.next()).shutdown();
            }
            set.clear();
        }
    }

    private void recordWithPublishers(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination, Priority priority, Set<MetricsPublisher> set) {
        if (!this.initialized.get()) {
            mLog.e("Cannot record the metric since UnifiedMetricsFactoryImpl has not been initialized");
            return;
        }
        if (unifiedMetricEvent == null) {
            mLog.e("Cannot record the metric since unifiedMetricEvent is null.");
            return;
        }
        if (metricsDestination == null) {
            mLog.e("Cannot record the metric since metricsDestination is null.");
            return;
        }
        synchronized (lockObject) {
            try {
                if (isNullOrEmpty(set)) {
                    mLog.e("Cannot record the metric since metricsPublishers is null or empty.");
                    return;
                }
                LooperExecutor looperExecutor = mLooperExecutor;
                if (looperExecutor == null) {
                    mLog.e("Cannot record the metric since mLooperExecutor is null.");
                } else {
                    looperExecutor.execute(new Schedulers$$ExternalSyntheticLambda1(22, set, priority, unifiedMetricEvent, metricsDestination));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void releaseInstance() {
        synchronized (lockObject) {
            try {
                UnifiedMetricsFactoryImpl unifiedMetricsFactoryImpl = mUnifiedMetricsFactoryImpl;
                if (unifiedMetricsFactoryImpl != null) {
                    unifiedMetricsFactoryImpl.shutdown();
                    mUnifiedMetricsFactoryImpl = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetPublisherServiceAutoShutdown() {
        mLooperExecutor.cancel(mPartialCleanupOnStandbyRunnable);
        mLog.d("Posting delayed shutdown for " + Integer.toString(15000) + " milliseconds.");
        mLooperExecutor.postDelayedRunnable(mPartialCleanupOnStandbyRunnable, 15000L);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public UnifiedMetricEvent createMetricEvent(String str, String str2) {
        return new UnifiedMetricEventImpl(str, str2);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void initialize(Context context, Set<MetricsPublisher> set) {
        if (this.initialized.get()) {
            mLog.d("UnifiedMetricsFactoryImpl has already been initialized");
            return;
        }
        if (context == null) {
            mLog.e("Cannot initialize since Context is null.");
            return;
        }
        if (isNullOrEmpty(set)) {
            mLog.e("Cannot initialize since metricsPublishers is null or empty.");
            return;
        }
        synchronized (lockObject) {
            mMetricsPublishers = new HashSet();
            LooperExecutor looperExecutor = new LooperExecutor(RECORDING_EXEC);
            mLooperExecutor = looperExecutor;
            looperExecutor.requestStart();
            mPartialCleanupOnStandbyRunnable = new NativeBinding$$ExternalSyntheticLambda0(this, 18);
            mLooperExecutor.execute(new LogsUtil$$ExternalSyntheticLambda0(this, 11, set, context));
        }
        this.initialized.set(true);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void record(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination, Priority priority) {
        Set<MetricsPublisher> set;
        synchronized (lockObject) {
            set = mMetricsPublishers;
        }
        recordWithPublishers(unifiedMetricEvent, metricsDestination, priority, set);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void recordTrace(String str, String str2, String str3, String str4, String str5) {
        if (!this.initialized.get()) {
            mLog.e("Cannot record the metric since UnifiedMetricsFactoryImpl has not been initialized");
            return;
        }
        synchronized (lockObject) {
            try {
                if (isNullOrEmpty(mMetricsPublishers)) {
                    mLog.e("Cannot recordTrace since metricsPublishers is null or empty.");
                    return;
                }
                LooperExecutor looperExecutor = mLooperExecutor;
                if (looperExecutor == null) {
                    mLog.e("Cannot recordTrace since mLooperExecutor is null.");
                } else {
                    looperExecutor.execute(new Peripheral$$ExternalSyntheticLambda1(this, str, str2, str3, str4, str5, 7));
                    resetPublisherServiceAutoShutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void shutdown() {
        if (!this.initialized.get()) {
            mLog.i("No need to shutdown since since UnifiedMetricsFactoryImpl has not been initialized");
            return;
        }
        synchronized (lockObject) {
            try {
                LooperExecutor looperExecutor = mLooperExecutor;
                if (looperExecutor == null) {
                    mLog.i("No need to shutdown since mLooperExecutor is null.");
                    return;
                }
                looperExecutor.cancel(mPartialCleanupOnStandbyRunnable);
                if (isNullOrEmpty(mMetricsPublishers)) {
                    mLog.i("No need to shutdown since mMetricsPublishers is null or empty.");
                    return;
                }
                mLooperExecutor.execute(new NativeBinding$$ExternalSyntheticLambda0(mMetricsPublishers, 19));
                mLooperExecutor.requestStop();
                mLooperExecutor = null;
                mMetricsPublishers = null;
                mPartialCleanupOnStandbyRunnable = null;
                this.initialized.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void record(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination) {
        record(unifiedMetricEvent, metricsDestination, Priority.NORMAL);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void record(UnifiedMetricEvent unifiedMetricEvent, Priority priority) {
        record(unifiedMetricEvent, MetricsDestination.ALL, priority);
    }

    @Override // com.amazon.comms.metrics.UnifiedMetricsFactory
    public void record(UnifiedMetricEvent unifiedMetricEvent) {
        record(unifiedMetricEvent, Priority.NORMAL);
    }
}
