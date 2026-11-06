package com.amazon.alexa.handsfree.notification.configurations.quicksettings;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.R;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class QuickSettingsConfigHandler implements NotificationQuotaManager.QuotaConstraintsHandler {
    private static final String TAG = "QuickSettingsConfigHandler";
    private final ConfigurationProvider mConfigurationProvider;
    private final Context mContext;

    public QuickSettingsConfigHandler(@NonNull Context context) {
        this(context, NotificationModule.getInstance().getContract().getConfigurationProvider());
    }

    @NonNull
    private List<Long> getDefaultConfigTimeIntervals() {
        int[] intArray = this.mContext.getResources().getIntArray(R.array.quick_settings_notification_time_intervals);
        ArrayList arrayList = new ArrayList(intArray.length);
        for (int i : intArray) {
            arrayList.add(Long.valueOf(Integer.valueOf(i).longValue()));
        }
        Log.d(TAG, "Default configured quick settings notification intervals: " + arrayList);
        return arrayList;
    }

    @Nullable
    private List<Long> getRemoteConfigTimeIntervals(@NonNull NotificationType notificationType) {
        return this.mConfigurationProvider.getNotificationTimeIntervals(this.mContext, notificationType.getRemoteConfigKey());
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    @NonNull
    public List<Long> getConfigTimeIntervals(@NonNull NotificationType notificationType) {
        List<Long> remoteConfigTimeIntervals = getRemoteConfigTimeIntervals(notificationType);
        if (remoteConfigTimeIntervals == null || remoteConfigTimeIntervals.isEmpty()) {
            Log.d(TAG, "Remotely configured time intervals can not be loaded, using default");
            return getDefaultConfigTimeIntervals();
        }
        Log.d(TAG, "Remotely configured quick settings notification time intervals: " + remoteConfigTimeIntervals);
        return remoteConfigTimeIntervals;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    public int getTotalNotifications(@NonNull NotificationType notificationType) {
        return getConfigTimeIntervals(notificationType).size();
    }

    @Inject
    @VisibleForTesting
    public QuickSettingsConfigHandler(@NonNull Context context, @NonNull ConfigurationProvider configurationProvider) {
        this.mContext = context;
        this.mConfigurationProvider = configurationProvider;
    }
}
