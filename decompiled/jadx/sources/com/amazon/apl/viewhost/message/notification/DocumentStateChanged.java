package com.amazon.apl.viewhost.message.notification;

import com.amazon.apl.viewhost.internal.message.notification.DocumentStateChangedImpl;
import com.amazon.apl.viewhost.message.BaseMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class DocumentStateChanged extends BaseMessage {
    public static DocumentStateChanged create(NotificationMessage notificationMessage) {
        return new DocumentStateChangedImpl(notificationMessage);
    }

    public abstract String getReason();

    public abstract String getState();
}
