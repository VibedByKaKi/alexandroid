package com.amazon.alexa.notification.api.actions.registry.lists;

import android.content.Context;
import com.amazon.alexa.notification.api.actions.model.DisplayType;
import com.amazon.alexa.notification.api.actions.model.HandlerId;
import com.amazon.alexa.notification.api.actions.model.NotificationAction;
import com.amazon.alexa.notification.api.actions.model.NotificationActionList;
import com.amazon.alexa.notification.api.actions.model.NotificationActionType;
import com.amazon.alexa.notification.api.actions.model.OwnerId;
import com.amazon.alexa.notifications.api.R;
import com.google.common.collect.ImmutableList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ExampleNotificationActionList extends NotificationActionList {
    public ExampleNotificationActionList(Context context) {
        setActionListId("exampleActionList");
        setOwnerId(OwnerId.NOTIFICATIONS);
        NotificationAction.NotificationActionBuilder builder = NotificationAction.builder();
        DisplayType displayType = DisplayType.BUTTON;
        NotificationAction build = builder.displayType(displayType).actionType(NotificationActionType.deeplink()).actionId("exampleDeepLinkAction").label(context.getString(R.string.open_link)).build();
        NotificationAction.NotificationActionBuilder displayType2 = NotificationAction.builder().displayType(displayType);
        HandlerId handlerId = HandlerId.EXAMPLE;
        setActions(ImmutableList.of(build, displayType2.actionType(NotificationActionType.backgroundTask(handlerId)).actionId("exampleAuthenticationRequired").label(context.getString(R.string.auth)).build(), NotificationAction.builder().displayType(displayType).actionType(NotificationActionType.backgroundTask(handlerId)).actionId("exampleDestructiveAction").label(context.getString(R.string.delete)).build()));
    }
}
