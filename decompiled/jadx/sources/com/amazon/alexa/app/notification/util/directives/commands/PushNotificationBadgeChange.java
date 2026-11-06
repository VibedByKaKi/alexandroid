package com.amazon.alexa.app.notification.util.directives.commands;

import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class PushNotificationBadgeChange {
    private String destinationActorId;
    private String destinationUserId;
    private int unreadLegalCount;

    public Optional<String> getDestinationActorId() {
        return Optional.ofNullable(this.destinationActorId);
    }

    public String getDestinationUserId() {
        return this.destinationUserId;
    }

    public int getUnreadLegalCount() {
        return this.unreadLegalCount;
    }
}
