package com.amazon.alexa.handsfree.latencyreporter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LatencyReceiver extends BroadcastReceiver {
    static final String EXTRA_IDENTIFIER = "identifier";
    static final String EXTRA_TIMESTAMP = "timestamp";
    static final String EXTRA_TIMESTAMP_NAME = "timestampName";
    static final String REPORT_TIMESTAMP_DATA_ACTION = "com.amazon.alexa.handsfree.intent.action.REPORT_TIMESTAMP_DATA_EVENT";
    private static final String TAG = "LatencyReceiver";
    private final TimestampIntentConverter mTimestampIntentConverter;

    public LatencyReceiver() {
        this(new TimestampIntentConverter());
    }

    public void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        LatencyJobIntentService.enqueueWork(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (REPORT_TIMESTAMP_DATA_ACTION.equals(intent.getAction())) {
            enqueueWork(context, this.mTimestampIntentConverter.convertToIntent(intent.getStringExtra(EXTRA_TIMESTAMP_NAME), intent.getStringExtra("identifier"), intent.getLongExtra("timestamp", 0L)));
            return;
        }
        if (LatencyReporter.REPORT_LATENCY_DATA_ACTION.equals(intent.getAction())) {
            Log.d(TAG, "onReceive: enqueue work to LatencyJobIntentService.");
            enqueueWork(context, intent);
        }
    }

    public LatencyReceiver(@NonNull TimestampIntentConverter timestampIntentConverter) {
        this.mTimestampIntentConverter = timestampIntentConverter;
    }
}
