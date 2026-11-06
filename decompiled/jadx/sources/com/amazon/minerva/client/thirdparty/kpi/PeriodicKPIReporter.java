package com.amazon.minerva.client.thirdparty.kpi;

import android.util.Log;
import com.amazon.minerva.client.thirdparty.MinervaServiceAndroidAdapter;
import com.amazon.minerva.client.thirdparty.api.MetricEvent;
import com.amazon.minerva.client.thirdparty.metric.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PeriodicKPIReporter extends AbstractKPIReporter {
    private static final int DEFAULT_REPORT_TIME_IN_SECONDS = 1;
    private static final String TAG = "PeriodicKPIReporter";
    protected MinervaServiceAndroidAdapter mMinervaServiceAndroidAdapter;
    private ScheduledExecutorService mScheduler;

    public PeriodicKPIReporter() {
        schedulePeriodicReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordKPIMetricEvents() {
        Iterator<Map.Entry<String, MetricEvent>> it2 = transferToMetricEvent().entrySet().iterator();
        while (it2.hasNext()) {
            MetricEvent value = it2.next().getValue();
            value.setClientTimestamp(Timestamp.now());
            this.mMinervaServiceAndroidAdapter.record("", value.getMetricGroupId(), value.getSchemaId(), value.getMetricEventId().toString(), value.getClientTimestamp().getEpochMillis(), (int) (value.getClientTimestamp().getTimeZoneOffset() / 60000), value.getKeyValuePairsAsDataPoints());
            value.clear();
        }
    }

    private void schedulePeriodicReport() {
        Runnable runnable = new Runnable() { // from class: com.amazon.minerva.client.thirdparty.kpi.PeriodicKPIReporter.1
            @Override // java.lang.Runnable
            public void run() {
                PeriodicKPIReporter.this.recordKPIMetricEvents();
            }
        };
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.mScheduler = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(runnable, 1L, 1L, TimeUnit.SECONDS);
    }

    private synchronized Map<String, MetricEvent> transferToMetricEvent() {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            for (Map.Entry<String, HashMap<String, Long>> entry : this.mKPIMap.entrySet()) {
                String key = entry.getKey();
                HashMap<String, Long> value = entry.getValue();
                MetricEvent metricEvent = new MetricEvent(KPIConstant.KPI_METRIC_GROUP_ID, KPIConstant.KPI_METRIC_SCHEMA_ID);
                metricEvent.addString(KPIConstant.CUSTOMER_METRIC_GROUP_ID, key);
                for (Map.Entry<String, Long> entry2 : value.entrySet()) {
                    metricEvent.addLong(entry2.getKey(), entry2.getValue().longValue());
                }
                hashMap.put(key, metricEvent);
            }
            this.mKPIMap.clear();
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public void flush() {
        recordKPIMetricEvents();
    }

    public void setMinervaServiceAndroidAdapter(MinervaServiceAndroidAdapter minervaServiceAndroidAdapter) {
        this.mMinervaServiceAndroidAdapter = minervaServiceAndroidAdapter;
    }

    @Override // com.amazon.minerva.client.thirdparty.kpi.AbstractKPIReporter
    public void shutdown() {
        Log.i(TAG, "Shutdown was invoked.");
        recordKPIMetricEvents();
        this.mScheduler.shutdownNow();
    }
}
