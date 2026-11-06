package com.amazon.deecomms.notifications.model;

import android.os.Bundle;
import com.amazon.deecomms.api.navigation.CommsView;
import com.amazon.deecomms.common.ApplicationManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultPushNotificationAction implements PushNotificationAction {
    private final ApplicationManager applicationManager;

    public DefaultPushNotificationAction(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    @Override // com.amazon.deecomms.notifications.model.PushNotificationAction
    public void doRouteAction() {
        this.applicationManager.navigateToView(CommsView.ReactNativeConversationList, new Bundle(), true);
    }
}
