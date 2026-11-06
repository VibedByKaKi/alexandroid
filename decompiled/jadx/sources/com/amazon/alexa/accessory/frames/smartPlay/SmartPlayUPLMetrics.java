package com.amazon.alexa.accessory.frames.smartPlay;

import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class SmartPlayUPLMetrics {
    private static final String TAG = "SmartPlayUPLMetrics";
    private Map<String, MobilyticsMetricsTimer> uplMetricsTimers = new HashMap();

    public void cancelUPLMetricTimer(String str) {
        this.uplMetricsTimers.remove(str);
    }

    public void recordUPLMetricTimer(String str) {
        if (this.uplMetricsTimers.containsKey(str)) {
            MetricsRecorder.getInstance().recordTimer(this.uplMetricsTimers.get(str));
        } else {
            Log.w(TAG, "Missing timer for metric %s", str);
        }
    }

    public void startUPLMetricTimer(String str) {
        this.uplMetricsTimers.put(str, MetricsRecorder.getInstance().startTimer(str));
    }
}
