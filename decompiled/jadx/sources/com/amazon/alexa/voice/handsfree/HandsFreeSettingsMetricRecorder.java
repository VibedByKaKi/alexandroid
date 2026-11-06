package com.amazon.alexa.voice.handsfree;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.voice.handsfree.metrics.MetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HandsFreeSettingsMetricRecorder {

    @VisibleForTesting
    static final MetricsConstants.Component METRIC_COMPONENT = MetricsConstants.Component.HANDS_FREE;

    @VisibleForTesting
    static final MetricsConstants.PageType METRIC_PAGE_TYPE = MetricsConstants.PageType.VOX_SETTINGS_MENU_ITEM;
    private static final String TAG = "HandsFreeSettingsMetricRecorder";
    private final Context mContext;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    public HandsFreeSettingsMetricRecorder(@NonNull Context context) {
        this(context, MetricsBuilderProvider.getInstance(context));
    }

    public void recordClick(@NonNull MetricsConstants.SubPageType subPageType) {
        this.mMetricsBuilderProvider.newBuilder().withClickMetric(TAG, METRIC_COMPONENT, METRIC_PAGE_TYPE, subPageType).emit(this.mContext);
    }

    public void reportOperationalMetric(@NonNull String str) {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(TAG, str).emit(this.mContext);
    }

    @VisibleForTesting
    public HandsFreeSettingsMetricRecorder(@NonNull Context context, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        this.mContext = context;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }
}
