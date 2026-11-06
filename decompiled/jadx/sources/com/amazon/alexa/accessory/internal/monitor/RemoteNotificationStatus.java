package com.amazon.alexa.accessory.internal.monitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum RemoteNotificationStatus {
    NO_ACTIVITY(1),
    REMINDER(2),
    TIMER(4),
    ALARM(8),
    ANNOUNCEMENT(16);

    public final int value;

    RemoteNotificationStatus(int i) {
        this.value = i;
    }
}
