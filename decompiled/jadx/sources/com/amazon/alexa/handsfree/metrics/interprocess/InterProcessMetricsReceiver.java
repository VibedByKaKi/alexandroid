package com.amazon.alexa.handsfree.metrics.interprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.metrics.interprocess.BroadcastingMetricsReporter;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InterProcessMetricsReceiver extends BroadcastReceiver {
    private static final String TAG = "IPCMetricReceiver";

    public void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        InterProcessMetricReportingJobIntentService.enqueueWork(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        String action = intent.getAction();
        Log.i(TAG, "intent action: " + action);
        if (BroadcastingMetricsReporter.REPORT_METRIC_DATA_ACTION.equals(action)) {
            enqueueWork(context, intent);
            return;
        }
        Log.w(TAG, "not enqueueing work because we do not handle this intent action: " + action);
    }
}
