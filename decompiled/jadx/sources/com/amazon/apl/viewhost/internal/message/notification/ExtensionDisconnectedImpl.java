package com.amazon.apl.viewhost.internal.message.notification;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.message.notification.ExtensionDisconnected;
import com.amazon.apl.viewhost.message.notification.NotificationMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionDisconnectedImpl extends ExtensionDisconnected {

    @NonNull
    private final NotificationMessage mNotificationMessage;

    public ExtensionDisconnectedImpl(NotificationMessage notificationMessage) {
        this.mNotificationMessage = notificationMessage;
    }

    @Override // com.amazon.apl.viewhost.message.notification.ExtensionDisconnected
    public String getDisconnectedExtensionUri() {
        return this.mNotificationMessage.getPayload().decodeKeyedContainer().decodeSingleValue("uri").decodeString();
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public DocumentHandle getDocument() {
        return this.mNotificationMessage.getDocument();
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public int getId() {
        return this.mNotificationMessage.getId();
    }

    @Override // com.amazon.apl.viewhost.message.notification.ExtensionDisconnected
    public boolean isExtensionRequired() {
        return this.mNotificationMessage.getPayload().decodeKeyedContainer().decodeSingleValue("required").decodeBoolean().booleanValue();
    }
}
