package com.amazon.alexa.handsfree.notification.views.lockscreen;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.R;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ShowOnLockscreenNotificationPresenter extends NotificationViewPresenter {

    @VisibleForTesting
    static final int SETTINGS_RES_ID = R.string.handsfreeSettingsId;

    public ShowOnLockscreenNotificationPresenter() {
        this(new DismissIntentProvider(), new ShowOnLockscreenMetadataProvider(), NotificationType.SHOW_ON_LOCK_SCREEN);
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        Intent intent = new Intent(context.getString(SETTINGS_RES_ID));
        putNotificationIntentExtras(context, intent);
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    @Inject
    @VisibleForTesting
    public ShowOnLockscreenNotificationPresenter(@NonNull DismissIntentProvider dismissIntentProvider, @NonNull NotificationMetadataProvider notificationMetadataProvider, @NonNull NotificationType notificationType) {
        super(dismissIntentProvider, notificationType, notificationMetadataProvider);
    }
}
