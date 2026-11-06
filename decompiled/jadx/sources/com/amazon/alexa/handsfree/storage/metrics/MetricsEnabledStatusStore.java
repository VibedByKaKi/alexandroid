package com.amazon.alexa.handsfree.storage.metrics;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricsEnabledStatusStore {

    @VisibleForTesting
    static final String KILL_SWITCH_PREFERENCE_KEY = "com.amazon.alexa.handsfree.metrics.initialization";

    @VisibleForTesting
    static final String METRICS_STATUS_PREFERENCE_KEY = "com.amazon.handsfree.metrics.status";

    @VisibleForTesting
    static final String SHARED_PREFERENCES_FILE = "com.amazon.alexa.handsfree.metrics.utils.MetricsEnabledStatusStore";
    private final ProcessMetricsCacheService.ServiceHelper mProcessMetricsCacheServiceHelper;

    @Inject
    public MetricsEnabledStatusStore(@NonNull ProcessMetricsCacheService.ServiceHelper serviceHelper) {
        this.mProcessMetricsCacheServiceHelper = serviceHelper;
    }

    public boolean canEmitMetrics(@NonNull Context context) {
        return isEnabled(context) && !isKillSwitchEnabled(context);
    }

    public void emitMetricsInCache(@NonNull Context context) {
        if (canEmitMetrics(context)) {
            this.mProcessMetricsCacheServiceHelper.emitMetricsInCache(context);
        }
    }

    @VisibleForTesting
    public SharedPreferences getSharedPreferences(@NonNull Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_FILE, 0);
    }

    @VisibleForTesting
    public boolean isEnabled(@NonNull Context context) {
        return getSharedPreferences(context).getBoolean(METRICS_STATUS_PREFERENCE_KEY, true);
    }

    @VisibleForTesting
    public boolean isKillSwitchEnabled(@NonNull Context context) {
        return getSharedPreferences(context).getBoolean(KILL_SWITCH_PREFERENCE_KEY, false);
    }

    public void setEnabled(@NonNull Context context, boolean z) {
        getSharedPreferences(context).edit().putBoolean(METRICS_STATUS_PREFERENCE_KEY, z).apply();
    }

    public void setKillSwitchEnabled(@NonNull Context context, boolean z) {
        getSharedPreferences(context).edit().putBoolean(KILL_SWITCH_PREFERENCE_KEY, z).apply();
        if (canEmitMetrics(context)) {
            this.mProcessMetricsCacheServiceHelper.emitMetricsInCache(context);
        }
    }
}
