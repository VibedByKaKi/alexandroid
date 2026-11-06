package com.amazon.alexa.notification.api.actions.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum HandlerId {
    EXAMPLE(OwnerId.NOTIFICATIONS),
    REMINDERS(OwnerId.REMINDERS);

    private final OwnerId ownerId;

    HandlerId(OwnerId ownerId) {
        this.ownerId = ownerId;
    }

    public String getEventType() {
        return "actions:" + toString();
    }

    public OwnerId getOwnerId() {
        return this.ownerId;
    }
}
