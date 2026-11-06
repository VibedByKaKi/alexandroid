package com.amazon.alexa.notification.api.actions.registry.lists;

import android.content.Context;
import com.amazon.alexa.notification.api.actions.model.DisplayType;
import com.amazon.alexa.notification.api.actions.model.HandlerId;
import com.amazon.alexa.notification.api.actions.model.NotificationAction;
import com.amazon.alexa.notification.api.actions.model.NotificationActionList;
import com.amazon.alexa.notification.api.actions.model.NotificationActionType;
import com.amazon.alexa.notification.api.actions.model.OwnerId;
import com.google.common.collect.ImmutableList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DeepLinkTestNotificationActionList extends NotificationActionList {
    public DeepLinkTestNotificationActionList(Context context) {
        setActionListId("DeepLinkTestActionList1");
        setOwnerId(OwnerId.NOTIFICATIONS);
        NotificationAction.NotificationActionBuilder builder = NotificationAction.builder();
        DisplayType displayType = DisplayType.BUTTON;
        setActions(ImmutableList.of(builder.displayType(displayType).actionType(NotificationActionType.deeplink()).actionId("DeepLinkTestButton1").label("Link 1").build(), NotificationAction.builder().displayType(displayType).actionType(NotificationActionType.deeplink()).actionId("MockDeepLinkButton2").label("Link 2").build(), NotificationAction.builder().displayType(displayType).actionType(NotificationActionType.backgroundTask(HandlerId.EXAMPLE)).actionId("MockCustomHandlerButton1").label("Example Handler").build()));
    }
}
