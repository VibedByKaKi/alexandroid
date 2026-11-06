package com.amazon.alexa.app.notification.dagger;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.app.notification.branch.BranchRoutingDelegate;
import com.amazon.alexa.app.notification.branch.BranchSdkClient;
import com.amazon.alexa.app.notification.messaging.receivers.EventBusMessagingReceiver;
import com.amazon.alexa.app.notification.tap.NotificationTapAcknowledger;
import com.amazon.alexa.protocols.messaging.MessagingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface NotificationService {
    void attachBranchRoutingDelegate(BranchRoutingDelegate branchRoutingDelegate);

    void detachBranchRoutingDelegate(BranchRoutingDelegate branchRoutingDelegate);

    EventBusMessagingReceiver getEventBusMessagingReceiver();

    MessagingService getMessagingService();

    NotificationTapAcknowledger getNotificationTapAcknowledger();

    void initBranchIntegration(BranchSdkClient branchSdkClient, boolean z);

    void initNotificationActions();

    void onBranchActivityStart(Activity activity);

    void onBranchAuthenticated(@Nullable String str);

    void onBranchNewIntent(Activity activity, @Nullable Intent intent);

    void onBranchRoutingStateChanged();
}
