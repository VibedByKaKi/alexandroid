package com.amazon.alexa.handsfree.notification.views;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.notification.metrics.MetricType;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NotificationStateProvider {
    private static final String TAG = "NotificationStateProvider";
    private final ConfigurationProvider mConfigurationProvider;

    public NotificationStateProvider() {
        this(NotificationModule.getInstance().getContract().getConfigurationProvider());
    }

    public boolean isNotificationDisabled(@NonNull Context context) {
        MetricsBuilderProvider metricsBuilderProvider = MetricsBuilderProvider.getInstance(context);
        if (!this.mConfigurationProvider.isActive(context, ConfigurationProvider.ConfigComponent.HANDS_FREE)) {
            String str = TAG;
            Log.d(str, "Remotely configured to be disabled");
            metricsBuilderProvider.newBuilder().withPerformanceMetric(str, MetricType.HANDSFREE_NOT_ACTIVE.getValue()).emit(context);
            return true;
        }
        if (this.mConfigurationProvider.isActive(context, ConfigurationProvider.ConfigComponent.NOTIFICATION)) {
            return false;
        }
        String str2 = TAG;
        Log.d(str2, "Remotely configured notifications turned off");
        metricsBuilderProvider.newBuilder().withPerformanceMetric(str2, MetricType.NOTIFICATION_NOT_ACTIVE.getValue()).emit(context);
        return true;
    }

    @Inject
    @VisibleForTesting
    public NotificationStateProvider(@NonNull ConfigurationProvider configurationProvider) {
        this.mConfigurationProvider = configurationProvider;
    }
}
