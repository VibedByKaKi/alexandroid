package com.amazon.alexa.client.alexaservice.base.metrics.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.base.application.ContextModule;
import com.amazon.alexa.client.crashreporting.CrashReportingModule;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Component;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricsBroadcastReceiver extends BroadcastReceiver {
    private static final String EXECUTOR_NAME = "client-metrics-receiver";

    @VisibleForTesting
    static final String EXTRA_API_CALL_ID = "com.amazon.alexa.intent.extras.API_CALL_ID";

    @VisibleForTesting
    static final String EXTRA_CLIENT = "com.amazon.alexa.intent.extras.CLIENT";

    @VisibleForTesting
    static final String EXTRA_DIALOG_TURN_ID = "com.amazon.alexa.intent.extras.DIALOG_TURN_ID";

    @VisibleForTesting
    static final String EXTRA_EVENT_ID = "com.amazon.alexa.intent.extras.EVENT_ID";

    @VisibleForTesting
    static final String EXTRA_EVENT_VALUE = "com.amazon.alexa.intent.extras.EVENT_VALUE";

    @VisibleForTesting
    static final String EXTRA_INVOCATION_TYPE = "com.amazon.alexa.intent.extras.INVOCATION_TYPE";

    @VisibleForTesting
    static final String EXTRA_LATENCY = "com.amazon.alexa.intent.extras.EVENT_LATENCY";

    @VisibleForTesting
    static final String EXTRA_NAME = "com.amazon.alexa.intent.extras.EVENT_NAME";

    @VisibleForTesting
    static final String EXTRA_SOFTWARE_VERSION = "com.amazon.alexa.intent.extras.SOFTWARE_VERSION";

    @VisibleForTesting
    static final String EXTRA_SOURCE_PACKAGE = "com.amazon.alexa.intent.extras.SOURCE_PACKAGE";

    @VisibleForTesting
    static final String EXTRA_TIMESTAMP = "com.amazon.alexa.intent.extras.EVENT_TIMESTAMP";
    private static final String TAG = "MetricsBroadcastReceiver";
    private static final String VOICE_INTERACTION_METRIC_BROADCAST = "com.amazon.alexa.intent.action.REPORT_VOICE_INTERACTION_METRIC_EVENT";

    @Inject
    ClientMetricsDao clientMetricsDao;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {ContextModule.class, CrashReportingModule.class, ClientMetricsModule.class})
    @Singleton
    public interface Injector {
        void inject(MetricsBroadcastReceiver metricsBroadcastReceiver);
    }

    private ClientMetricData createMetricData(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_NAME);
        String stringExtra2 = intent.getStringExtra(EXTRA_EVENT_ID);
        long longExtra = intent.getLongExtra(EXTRA_TIMESTAMP, -1L);
        long longExtra2 = intent.getLongExtra(EXTRA_LATENCY, -1L);
        String stringExtra3 = intent.getStringExtra(EXTRA_SOURCE_PACKAGE);
        Bundle bundleExtra = intent.getBundleExtra(EXTRA_CLIENT);
        String stringExtra4 = intent.getStringExtra(EXTRA_DIALOG_TURN_ID);
        Integer valueOf = Integer.valueOf(intent.getIntExtra(EXTRA_EVENT_VALUE, 1));
        String str = TAG;
        String packageName = bundleExtra != null ? new ExtendedClient(bundleExtra).getActiveSubClient().getPackageName() : null;
        String stringFromIntent = getStringFromIntent(intent, EXTRA_INVOCATION_TYPE, null);
        String stringFromIntent2 = getStringFromIntent(intent, EXTRA_SOFTWARE_VERSION, "");
        String stringFromIntent3 = getStringFromIntent(intent, EXTRA_API_CALL_ID, "");
        if (longExtra < 0) {
            Log.w(str, "Received client metric event without a timestamp");
            return null;
        }
        if (packageName == null) {
            Log.w(str, "Received client metric event without a client");
            return null;
        }
        if (TextUtils.isEmpty(stringExtra3)) {
            Log.w(str, "Received client metric event without source package name");
            return null;
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            Log.w(str, "Received client metric event without event id");
            return null;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            return ClientMetricData.builder().setEventName(stringExtra).setEventId(stringExtra2).setEventValue(valueOf).setEventTimestampMs(longExtra).setLatencyMs(Long.valueOf(longExtra2)).setSourcePackageName(stringExtra3).setClientPackageName(packageName).setInvocationType(stringFromIntent).setDialogTurnId(stringExtra4).setSoftwareVersion(stringFromIntent2).setApiCallId(stringFromIntent3).build();
        }
        Log.w(str, "Received client metric event without event name");
        return null;
    }

    private MetricType getMetricType(String str) {
        return VOICE_INTERACTION_METRIC_BROADCAST.equals(str) ? MetricType.VOICE_INTERACTION : MetricType.GENERIC;
    }

    private String getStringFromIntent(Intent intent, String str, String str2) {
        String stringExtra = intent.hasExtra(str) ? intent.getStringExtra(str) : null;
        return stringExtra == null ? str2 : stringExtra;
    }

    private void injectDependencies(Context context) {
        DaggerMetricsBroadcastReceiver_Injector.builder().contextModule(new ContextModule(context)).build().inject(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        final MetricType metricType = getMetricType(intent.getAction());
        final ClientMetricData createMetricData = createMetricData(intent);
        if (createMetricData != null) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            injectDependencies(context);
            ManagedExecutorFactory.newSingleThreadCachedThreadPool(EXECUTOR_NAME).submit(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.base.metrics.client.MetricsBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MetricsBroadcastReceiver.this.clientMetricsDao.storeClientMetricData(createMetricData, metricType);
                    } catch (Exception e) {
                        Log.e(MetricsBroadcastReceiver.TAG, "Error occurred in storing metrics into DB ", e);
                    }
                    goAsync.finish();
                }
            });
        }
    }
}
