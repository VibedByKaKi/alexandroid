package com.amazon.alexa.handsfree.notification.views.enablehandsfree;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import com.amazon.alexa.handsfree.notification.views.enablehandsfree.EnableHandsFreeNotification;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnableHandsFreeNotificationPresenter extends NotificationViewPresenter {
    public EnableHandsFreeNotificationPresenter() {
        super(new DismissIntentProvider(), NotificationType.ENABLE_HANDS_FREE, new EnableHandsFreeMetadataProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        return EnableHandsFreeNotification.getActionPendingIntent(context, EnableHandsFreeNotification.ClickSource.MAIN_AREA);
    }
}
