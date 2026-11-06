package com.amazon.alexa.handsfree.notification.configurations.timebased;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TimeIntervalConfigHandler implements NotificationQuotaManager.QuotaConstraintsHandler {
    private static final String TAG = "TimeIntervalConfigHandler";
    private final ConfigurationProvider mConfigurationProvider;
    private final Context mContext;

    public TimeIntervalConfigHandler(@NonNull Context context) {
        this(context, NotificationModule.getInstance().getContract() != null ? NotificationModule.getInstance().getContract().getConfigurationProvider() : null);
    }

    @NonNull
    private List<Long> getDefaultConfigTimeIntervals(@NonNull NotificationType notificationType) {
        ArrayList arrayList = new ArrayList();
        try {
            int length = this.mContext.getResources().getIntArray(notificationType.getDefaultTimeIntervalsResId()).length;
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(r5[i]));
            }
            return arrayList;
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "getDefaultConfigTimeIntervals exception", e, new Object[0]);
            return arrayList;
        }
    }

    @Nullable
    private List<Long> getRemoteConfigTimeIntervals(@NonNull NotificationType notificationType) {
        ConfigurationProvider configurationProvider = this.mConfigurationProvider;
        if (configurationProvider != null) {
            return configurationProvider.getNotificationTimeIntervals(this.mContext, notificationType.getRemoteConfigKey());
        }
        Log.e(TAG, "Configuration Provider is null");
        return null;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    @NonNull
    public List<Long> getConfigTimeIntervals(@NonNull NotificationType notificationType) {
        List<Long> remoteConfigTimeIntervals = getRemoteConfigTimeIntervals(notificationType);
        if (remoteConfigTimeIntervals == null || remoteConfigTimeIntervals.isEmpty()) {
            Log.d(TAG, "Remotely configured time intervals can not be loaded, using default");
            return getDefaultConfigTimeIntervals(notificationType);
        }
        Log.d(TAG, "Remotely configured notification time intervals: " + remoteConfigTimeIntervals);
        return remoteConfigTimeIntervals;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    public int getTotalNotifications(@NonNull NotificationType notificationType) {
        return getConfigTimeIntervals(notificationType).size();
    }

    @Inject
    @VisibleForTesting
    public TimeIntervalConfigHandler(@NonNull Context context, @Nullable ConfigurationProvider configurationProvider) {
        this.mContext = context;
        this.mConfigurationProvider = configurationProvider;
    }
}
