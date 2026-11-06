package com.amazon.alexa.handsfree.notification.configurations.utterancebased;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.R;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UtteranceConfigHandler implements NotificationQuotaManager.QuotaConstraintsHandler {
    private static final String TAG = "UtteranceConfigHandler";
    private final ConfigurationProvider mConfigurationProvider;
    private final Context mContext;

    public UtteranceConfigHandler(@NonNull Context context) {
        this(context, NotificationModule.getInstance().getContract().getConfigurationProvider());
    }

    private int getDefaultLimit(int i) {
        return this.mContext.getResources().getInteger(i);
    }

    public int getConfigDaysAfterFirstUtterance(@NonNull NotificationType notificationType) {
        Integer maxDaysAfterFirstUtterance = this.mConfigurationProvider.getMaxDaysAfterFirstUtterance(this.mContext, notificationType.getRemoteConfigKey());
        if (maxDaysAfterFirstUtterance != null) {
            Log.d(TAG, "Remotely configured maximum days after first utterance notification: " + maxDaysAfterFirstUtterance);
            return maxDaysAfterFirstUtterance.intValue();
        }
        int defaultLimit = getDefaultLimit(R.integer.maximum_days_after_first_utterance);
        Log.d(TAG, "Remotely configured maximum days after first utterance notification can not be loaded, using default: " + defaultLimit);
        return defaultLimit;
    }

    public int getConfigHoursBeforeNextUtterance(@NonNull NotificationType notificationType) {
        Integer minHoursBeforeNextUtterance = this.mConfigurationProvider.getMinHoursBeforeNextUtterance(this.mContext, notificationType.getRemoteConfigKey());
        if (minHoursBeforeNextUtterance != null) {
            Log.d(TAG, "Remotely configured minimum hours for next utterance notification: " + minHoursBeforeNextUtterance);
            return minHoursBeforeNextUtterance.intValue();
        }
        int defaultLimit = getDefaultLimit(R.integer.minimum_hours_before_next_utterance);
        Log.d(TAG, "Remotely configured minimum hours for next utterance notification can not be loaded, using default: " + defaultLimit);
        return defaultLimit;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    public List<Long> getConfigTimeIntervals(@NonNull NotificationType notificationType) {
        return null;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    public int getTotalNotifications(@NonNull NotificationType notificationType) {
        Integer utteranceNotificationMaxCount = this.mConfigurationProvider.getUtteranceNotificationMaxCount(this.mContext, notificationType.getRemoteConfigKey());
        if (utteranceNotificationMaxCount != null) {
            Log.d(TAG, "Remotely configured maximum count for " + notificationType + " notifications: " + utteranceNotificationMaxCount);
            return utteranceNotificationMaxCount.intValue();
        }
        int defaultLimit = getDefaultLimit(R.integer.maximum_count);
        Log.d(TAG, "Remotely configured maximum count for " + notificationType + " notifications can not be loaded, using default: " + defaultLimit);
        return defaultLimit;
    }

    @Inject
    @VisibleForTesting
    public UtteranceConfigHandler(@NonNull Context context, @NonNull ConfigurationProvider configurationProvider) {
        this.mContext = context;
        this.mConfigurationProvider = configurationProvider;
    }
}
