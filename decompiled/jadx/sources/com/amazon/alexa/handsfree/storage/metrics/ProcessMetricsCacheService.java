package com.amazon.alexa.handsfree.storage.metrics;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsEmitter;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsRecordMode;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.metrics.caching.MetricSerializer;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.storage.dependencies.FalcoStorageComponent;
import com.amazon.alexa.handsfree.storage.metrics.database.MetricsCacheDatabaseHelper;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ProcessMetricsCacheService extends SafeDequeueJobIntentService {

    @VisibleForTesting
    static final int JOB_ID = 198273;

    @VisibleForTesting
    static final String METRICS_ENABLED_METRIC_NAME = "METRICS_ENABLED";
    private static final String TAG = "ProcessMetricCacheSrvc";

    @Inject
    Initializer mInitializer;

    @Inject
    MetricSerializer mMetricSerializer;

    @Inject
    MetricsBuilderProvider mMetricsBuilderProvider;

    @Inject
    MetricsCacheDatabaseHelper mMetricsCacheDatabaseHelper;

    @Inject
    MetricsEmitter mMetricsEmitter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceHelper {
        @Inject
        public ServiceHelper() {
        }

        public void emitMetricsInCache(@NonNull Context context) {
            ProcessMetricsCacheService.enqueueWork(context, new Intent(context, (Class<?>) ProcessMetricsCacheService.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) ProcessMetricsCacheService.class, JOB_ID, intent);
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ((FalcoStorageComponent) AhfComponentsProvider.getComponent(this, FalcoStorageComponent.class)).inject(this);
        this.mInitializer.initialize(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@Nullable Intent intent) {
        if (intent == null) {
            Log.w(TAG, "Received a null intent, ignoring");
            return;
        }
        List<String> cachedMetricGroups = this.mMetricsCacheDatabaseHelper.getCachedMetricGroups();
        if (cachedMetricGroups.size() > 0) {
            try {
                try {
                    Iterator<String> it2 = cachedMetricGroups.iterator();
                    while (it2.hasNext()) {
                        List<Metric> deserializeMetricsList = this.mMetricSerializer.deserializeMetricsList(it2.next());
                        if (deserializeMetricsList != null && !deserializeMetricsList.isEmpty()) {
                            this.mMetricsEmitter.recordMetrics(MetricsRecordMode.FORCE_RECORD, this, this, (Metric[]) deserializeMetricsList.toArray(new Metric[0]));
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Exception when recording metrics", e, new Object[0]);
                }
            } finally {
                this.mMetricsCacheDatabaseHelper.clearDatabase();
            }
        }
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(TAG, METRICS_ENABLED_METRIC_NAME).emit(MetricsRecordMode.FORCE_RECORD, this);
    }
}
