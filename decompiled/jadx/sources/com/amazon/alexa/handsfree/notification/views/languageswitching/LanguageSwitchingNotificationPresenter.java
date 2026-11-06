package com.amazon.alexa.handsfree.notification.views.languageswitching;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import com.amazon.alexa.handsfree.notification.views.decider.DeciderMetadataProvider;
import com.amazon.alexa.handsfree.notification.views.decider.DeciderNotificationPresenter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LanguageSwitchingNotificationPresenter extends NotificationViewPresenter {
    public static final String IS_LS_PAGE_LAUNCHED_FROM_NOTIFICATION = "isLSPageLaunchedFromNotification";

    @VisibleForTesting
    static final String LANGUAGE_SWITCHING_INTENT = "com.amazon.alexa.handsfree.DYNAMICLANGUAGESWITCHING";
    private final DismissIntentProvider mDismissIntentProvider;
    private final HandsFreeSetupStateProvider mHandsFreeSetupStateProvider;
    private final NotificationMetadataProvider mNotificationMetadataProvider;
    private final NotificationType mNotificationType;

    public LanguageSwitchingNotificationPresenter() {
        this(new DismissIntentProvider(), NotificationType.LANGUAGE_SWITCHING, new LanguageSwitchingMetadataProvider(), NotificationModule.getInstance().getContract().getHandsFreeSetupStateProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        if (!this.mHandsFreeSetupStateProvider.isHandsFreeSetupComplete(context)) {
            return new DeciderNotificationPresenter(this.mDismissIntentProvider, this.mNotificationType, new DeciderMetadataProvider(), this.mHandsFreeSetupStateProvider).getContentIntent(context);
        }
        Intent intent = new Intent(LANGUAGE_SWITCHING_INTENT);
        putNotificationIntentExtras(context, intent);
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public void putNotificationIntentExtras(@NonNull Context context, @NonNull Intent intent) {
        super.putNotificationIntentExtras(context, intent);
        intent.putExtra(IS_LS_PAGE_LAUNCHED_FROM_NOTIFICATION, true);
    }

    @Inject
    @VisibleForTesting
    public LanguageSwitchingNotificationPresenter(@NonNull DismissIntentProvider dismissIntentProvider, @NonNull NotificationType notificationType, @NonNull NotificationMetadataProvider notificationMetadataProvider, @NonNull HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        super(dismissIntentProvider, notificationType, notificationMetadataProvider);
        this.mDismissIntentProvider = dismissIntentProvider;
        this.mNotificationType = notificationType;
        this.mNotificationMetadataProvider = notificationMetadataProvider;
        this.mHandsFreeSetupStateProvider = handsFreeSetupStateProvider;
    }
}
