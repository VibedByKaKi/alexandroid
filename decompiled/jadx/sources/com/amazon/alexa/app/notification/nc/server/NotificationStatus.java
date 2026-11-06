package com.amazon.alexa.app.notification.nc.server;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationStatus {
    private final String notificationId;
    private final Status status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        SUCCESS,
        INVALID_INPUT,
        THROTTLED,
        DEPENDENCY_FAILURE,
        UNKNOWN_ERROR
    }

    public NotificationStatus(String str, Status status) {
        this.notificationId = str;
        this.status = status;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public Status getStatus() {
        return this.status;
    }
}
