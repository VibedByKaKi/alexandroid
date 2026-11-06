package com.amazon.alexa.handsfree.foxtrot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AppChangeReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String BROADCAST_RECEIVED_SUCCESS = "broadcastReceivedSuccess";
    private static final String TAG = "AppChangeReceiver";
    private final Initializer mInitializer;

    public AppChangeReceiver() {
        this(InitializerProvider.getInitializer());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null) {
            Log.e(TAG, "onReceive: app change broadcast isn't received properly, context is null.");
            return;
        }
        String str = TAG;
        Log.d(str, "onReceive: Initialize via app change broadcast receiver.");
        this.mInitializer.initialize(context);
        MetricsBuilder newBuilder = MetricsBuilderProvider.getInstance(context).newBuilder();
        if (intent == null) {
            Log.e(str, "onReceive: app change broadcast isn't received properly, intent is null.");
            newBuilder.withPercentileMetricFailure(str, BROADCAST_RECEIVED_SUCCESS);
            newBuilder.emit(context);
            return;
        }
        newBuilder.withPercentileMetricSuccess(str, BROADCAST_RECEIVED_SUCCESS);
        if (intent.hasExtra(FoxtrotAPIConstants.FOXTROT_BROADCAST_EXTRA_STATE)) {
            String stringExtra = intent.getStringExtra(FoxtrotAPIConstants.FOXTROT_BROADCAST_EXTRA_STATE);
            Log.d(str, "onReceive: app state changed: " + stringExtra);
            newBuilder.withPerformanceMetric(str, stringExtra);
        }
        newBuilder.emit(context);
    }

    @VisibleForTesting
    public AppChangeReceiver(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
