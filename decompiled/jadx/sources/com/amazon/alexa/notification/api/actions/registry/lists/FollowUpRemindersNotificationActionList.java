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
public class FollowUpRemindersNotificationActionList extends NotificationActionList {
    public FollowUpRemindersNotificationActionList(Context context) {
        setActionListId("followUpRemindersActionList");
        setOwnerId(OwnerId.REMINDERS);
        NotificationAction.NotificationActionBuilder builder = NotificationAction.builder();
        DisplayType displayType = DisplayType.BUTTON;
        NotificationAction.NotificationActionBuilder displayType2 = builder.displayType(displayType);
        HandlerId handlerId = HandlerId.REMINDERS;
        setActions(ImmutableList.of(displayType2.actionType(NotificationActionType.backgroundTask(handlerId)).actionId("markAsDone").label(context.getString(R.string.mark_as_done)).build(), NotificationAction.builder().displayType(displayType).actionType(NotificationActionType.backgroundTask(handlerId)).actionId("Remind15Mins").label(context.getString(R.string.remind_me_15_mins)).build()));
    }
}
