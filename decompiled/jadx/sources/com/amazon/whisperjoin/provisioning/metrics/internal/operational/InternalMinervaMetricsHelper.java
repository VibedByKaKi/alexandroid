package com.amazon.whisperjoin.provisioning.metrics.internal.operational;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.minerva.client.thirdparty.api.MetricEvent;
import com.amazon.minerva.client.thirdparty.api.Predefined;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class InternalMinervaMetricsHelper {
    private static final String APP_CLIENT_NAME_METRIC = "AppClient";
    private static final String APP_CLIENT_VERSION = "AppVersion";
    private static final String TAG = "com.amazon.whisperjoin.provisioning.metrics.internal.operational.InternalMinervaMetricsHelper";
    private static final String TARGET_DEVICE_PIVOT = "TargetDevice";
    private static AmazonMinerva sMinervaClient;
    private static final Map<String, String> sPivotMap = new ConcurrentHashMap();

    private static void addAppVersionPivot(Context context) {
        try {
            addPivot("AppVersion", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static void addPivot(String str, String str2) {
        sPivotMap.put(str, str2);
    }

    public static void init(Context context, AmazonMinerva amazonMinerva) {
        sMinervaClient = amazonMinerva;
        addPivot(APP_CLIENT_NAME_METRIC, context.getPackageName());
        addAppVersionPivot(context);
    }

    public static MetricEvent newMetricEvent(String str, String str2) {
        MetricEvent metricEvent = new MetricEvent(str, str2);
        populatePivots(metricEvent);
        return metricEvent;
    }

    public static MetricEvent newMetricEventForEndpoint(String str, String str2, String str3) {
        MetricEvent metricEvent = new MetricEvent(str, str2);
        metricEvent.addString(TARGET_DEVICE_PIVOT, str3);
        return metricEvent;
    }

    private static void populatePivots(MetricEvent metricEvent) {
        for (Map.Entry<String, String> entry : sPivotMap.entrySet()) {
            metricEvent.addString(entry.getKey(), entry.getValue());
        }
    }

    public static void record(MetricEvent metricEvent) {
        Log.i(TAG, metricEvent.toString());
        metricEvent.addPredefined(Predefined.DEVICE_TYPE);
        metricEvent.addPredefined(Predefined.COUNTRY_OF_RESIDENCE);
        sMinervaClient.record(metricEvent);
    }

    public void finalize() {
    }
}
