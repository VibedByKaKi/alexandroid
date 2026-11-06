package com.amazon.alexa.handsfree.storage.metrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.storage.dependencies.FalcoStorageComponent;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnableMetricsBroadcastReceiver extends BroadcastReceiver {
    public static final String ENABLE_METRICS_BROADCAST = "com.amazon.alexa.handsfree.metrics.ENABLE_METRICS";
    private static final String TAG = "EnableMetricsBrcstRcvr";

    @Inject
    MetricsEnabledStatusStore mMetricsEnabledStatusStore;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        ((FalcoStorageComponent) AhfComponentsProvider.getComponent(context, FalcoStorageComponent.class)).inject(this);
        Log.i(TAG, "Broadcast received, enabling metrics.");
        this.mMetricsEnabledStatusStore.setEnabled(context, true);
        this.mMetricsEnabledStatusStore.emitMetricsInCache(context);
    }
}
