package com.amazon.apl.viewhost.message.notification;

import com.amazon.apl.viewhost.internal.message.notification.ScreenLockStatusChangedImpl;
import com.amazon.apl.viewhost.message.BaseMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ScreenLockStatusChanged extends BaseMessage {
    public static ScreenLockStatusChanged create(NotificationMessage notificationMessage) {
        return new ScreenLockStatusChangedImpl(notificationMessage);
    }

    public abstract boolean hasScreenLockStatusChanged();
}
