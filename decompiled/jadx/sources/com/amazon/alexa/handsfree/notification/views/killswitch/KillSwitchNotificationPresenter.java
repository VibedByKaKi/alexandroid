package com.amazon.alexa.handsfree.notification.views.killswitch;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class KillSwitchNotificationPresenter extends NotificationViewPresenter {
    public KillSwitchNotificationPresenter() {
        this(new DismissIntentProvider(), NotificationType.KILL_SWITCH, new KillSwitchMetadataProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        return null;
    }

    @Inject
    @VisibleForTesting
    public KillSwitchNotificationPresenter(@NonNull DismissIntentProvider dismissIntentProvider, @NonNull NotificationType notificationType, @NonNull KillSwitchMetadataProvider killSwitchMetadataProvider) {
        super(dismissIntentProvider, notificationType, killSwitchMetadataProvider);
    }
}
