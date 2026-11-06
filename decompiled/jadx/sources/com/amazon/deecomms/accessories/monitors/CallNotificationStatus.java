package com.amazon.deecomms.accessories.monitors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CallNotificationStatus {
    NO_ACTIVITY(1),
    MISSED_CALLS(2),
    ACTIVE_CALL(4),
    OUTBOUND_CALL(8),
    INCOMING_CALL(16);

    private final int callNotificationStatus;

    CallNotificationStatus(int i) {
        this.callNotificationStatus = i;
    }

    public int getCallNotificationStatus() {
        return this.callNotificationStatus;
    }
}
