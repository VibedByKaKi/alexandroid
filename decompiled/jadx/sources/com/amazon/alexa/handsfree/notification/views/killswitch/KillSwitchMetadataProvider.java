package com.amazon.alexa.handsfree.notification.views.killswitch;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.notification.metrics.MetricType;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.Locale;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class KillSwitchMetadataProvider implements NotificationMetadataProvider {
    private static final String TAG = "KillSwitchMetadataProvider";
    private final ConfigurationProvider mConfigurationProvider;

    public KillSwitchMetadataProvider() {
        this(NotificationModule.getInstance().getContract().getConfigurationProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider
    @Nullable
    public NotificationMetadata getNotificationMetadata(@NonNull Context context) {
        MetricsBuilderProvider metricsBuilderProvider = MetricsBuilderProvider.getInstance(context);
        if (!this.mConfigurationProvider.isActive(context, ConfigurationProvider.ConfigComponent.HANDS_FREE)) {
            String str = TAG;
            Log.d(str, "Remotely configured to be disabled");
            metricsBuilderProvider.newBuilder().withPerformanceMetric(str, String.format(Locale.US, MetricType.HANDSFREE_NOT_ACTIVE.getValue(), "getNotificationMetadata")).emit(context);
            return NotificationMetadata.KILL_SWITCH_ON;
        }
        if (this.mConfigurationProvider.isActive(context, ConfigurationProvider.ConfigComponent.NOTIFICATION)) {
            return NotificationMetadata.KILL_SWITCH_OFF;
        }
        String str2 = TAG;
        Log.d(str2, "Remotely configured notifications turned off");
        metricsBuilderProvider.newBuilder().withPerformanceMetric(str2, MetricType.NOTIFICATION_NOT_ACTIVE.getValue()).emit(context);
        return null;
    }

    @Inject
    @VisibleForTesting
    public KillSwitchMetadataProvider(@NonNull ConfigurationProvider configurationProvider) {
        this.mConfigurationProvider = configurationProvider;
    }
}
