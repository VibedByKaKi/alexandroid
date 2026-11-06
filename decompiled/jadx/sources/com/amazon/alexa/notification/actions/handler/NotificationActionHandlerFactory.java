package com.amazon.alexa.notification.actions.handler;

import android.content.Context;
import com.amazon.alexa.notification.api.actions.NotificationActionHandler;
import com.amazon.alexa.notification.api.actions.model.HandlerId;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface NotificationActionHandlerFactory {
    NotificationActionHandler getHandler(HandlerId handlerId, Context context);
}
