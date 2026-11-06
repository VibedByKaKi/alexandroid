package com.amazon.alexa.handsfree.notification.configurations.languageswitching;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.R;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LanguageSwitchingConfigHandler implements NotificationQuotaManager.QuotaConstraintsHandler {
    private static final String TAG = "LanguageSwitchingConfigHandler";
    private final Context mContext;

    public LanguageSwitchingConfigHandler(@NonNull Context context) {
        this.mContext = context;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    @NonNull
    public List<Long> getConfigTimeIntervals(@NonNull NotificationType notificationType) {
        int[] intArray = this.mContext.getResources().getIntArray(R.array.dls_notification_time_intervals);
        ArrayList arrayList = new ArrayList(intArray.length);
        for (int i : intArray) {
            arrayList.add(Long.valueOf(Integer.valueOf(i).longValue()));
        }
        Log.d(TAG, "Default configured notification intervals: " + arrayList);
        return arrayList;
    }

    @Override // com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager.QuotaConstraintsHandler
    public int getTotalNotifications(@NonNull NotificationType notificationType) {
        return getConfigTimeIntervals(notificationType).size();
    }
}
