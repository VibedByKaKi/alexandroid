package com.amazon.alexa.handsfree.notification.views.permission;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class PermissionNotificationPresenter extends NotificationViewPresenter {
    private final HandsFreeSetupStateProvider mHandsFreeSetupStateProvider;

    public PermissionNotificationPresenter() {
        this(new DismissIntentProvider(), new PermissionMetadataProvider(), NotificationModule.getInstance().getContract().getHandsFreeSetupStateProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        return PendingIntent.getService(context, 0, getSetupFlowServiceIntent(context), 201326592);
    }

    @NonNull
    @VisibleForTesting
    public Intent getSetupFlowServiceIntent(@NonNull Context context) {
        Intent setupFlowIntent = this.mHandsFreeSetupStateProvider.getSetupFlowIntent(context);
        putNotificationIntentExtras(context, setupFlowIntent);
        return setupFlowIntent;
    }

    @Inject
    @VisibleForTesting
    public PermissionNotificationPresenter(@NonNull DismissIntentProvider dismissIntentProvider, @NonNull PermissionMetadataProvider permissionMetadataProvider, @NonNull HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        super(dismissIntentProvider, NotificationType.PERMISSION_REQUEST, permissionMetadataProvider);
        this.mHandsFreeSetupStateProvider = handsFreeSetupStateProvider;
    }
}
