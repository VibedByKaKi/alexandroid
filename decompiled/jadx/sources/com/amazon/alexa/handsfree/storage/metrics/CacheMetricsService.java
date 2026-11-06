package com.amazon.alexa.handsfree.storage.metrics;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.storage.dependencies.FalcoStorageComponent;
import com.amazon.alexa.handsfree.storage.metrics.database.MetricsCacheDatabaseHelper;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CacheMetricsService extends SafeDequeueJobIntentService {

    @VisibleForTesting
    static final String EXTRA_SERIALIZED_METRICS = "serialized_metrics";

    @VisibleForTesting
    static final int JOB_ID = 198274;
    private static final String TAG = "CacheMetricsService";

    @Inject
    Initializer mInitializer;

    @Inject
    MetricsCacheDatabaseHelper mMetricsCacheDatabaseHelper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceHelper {
        @Inject
        public ServiceHelper() {
        }

        public void cacheMetrics(@NonNull Context context, @NonNull String str) {
            Intent intent = new Intent();
            intent.putExtra(CacheMetricsService.EXTRA_SERIALIZED_METRICS, str);
            CacheMetricsService.enqueueWork(context, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) CacheMetricsService.class, JOB_ID, intent);
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ((FalcoStorageComponent) AhfComponentsProvider.getComponent(this, FalcoStorageComponent.class)).inject(this);
        this.mInitializer.initialize(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_SERIALIZED_METRICS);
        if (stringExtra == null) {
            Log.w(TAG, "Intent contains no serialized metrics, ignoring.");
        } else {
            this.mMetricsCacheDatabaseHelper.putMetricGroupIntoCache(stringExtra);
        }
    }
}
