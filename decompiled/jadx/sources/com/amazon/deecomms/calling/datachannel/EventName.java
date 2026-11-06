package com.amazon.deecomms.calling.datachannel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum EventName {
    RESERVE_IN_CALL_CONTROLS("reserve_in_call_controls"),
    SCREEN_EVENT("screen_event"),
    BEGIN_APPLICATION("begin_application"),
    EXIT_APPLICATION("exit_application"),
    NEW_SCREEN_ORIENTATION("new_screen_orientation");

    private final String value;

    EventName(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
