package com.amazon.tarazed.notifier;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/amazon/tarazed/notifier/TarazedNotificationEvent;", "", "(Ljava/lang/String;I)V", "MEDIA_CONNECTING", "MEDIA_PERMISSION_ACCEPTED", "PERMISSION_REJECTED", "PERMISSION_TIMEOUT", "MEDIA_CONNECTED", "MEDIA_DISCONNECTED", "MEDIA_FAILED", "MEDIA_STOPPED", "IOT_DISCONNECTED", "SESSION_ACTIVE", "SESSION_SUSPENDED", "SESSION_END", "SESSION_TERMINATED", "SESSION_ENDING_3P_APP_EVENT", "SESSION_ENDING_INACTIVITY", "PROFILE_SWITCH", "SESSION_PAUSE_CUSTOMER", "SESSION_RESUME_CUSTOMER", "SESSION_PAUSE_AGENT", "SESSION_RESUME_AGENT", "SESSION_PAUSE_3P_APP_EVENT", "SESSION_PAUSE_3P_APP_EVENT_WITHIN_APP", "SESSION_STARTING_3P_BACKGROUND", "APP_FOREGROUND", "RESUME_REQUESTED", "ACCESSIBILITY_STATE_CHANGED", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedNotificationEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedNotificationEvent[] $VALUES;
    public static final TarazedNotificationEvent MEDIA_CONNECTING = new TarazedNotificationEvent("MEDIA_CONNECTING", 0);
    public static final TarazedNotificationEvent MEDIA_PERMISSION_ACCEPTED = new TarazedNotificationEvent("MEDIA_PERMISSION_ACCEPTED", 1);
    public static final TarazedNotificationEvent PERMISSION_REJECTED = new TarazedNotificationEvent("PERMISSION_REJECTED", 2);
    public static final TarazedNotificationEvent PERMISSION_TIMEOUT = new TarazedNotificationEvent("PERMISSION_TIMEOUT", 3);
    public static final TarazedNotificationEvent MEDIA_CONNECTED = new TarazedNotificationEvent("MEDIA_CONNECTED", 4);
    public static final TarazedNotificationEvent MEDIA_DISCONNECTED = new TarazedNotificationEvent("MEDIA_DISCONNECTED", 5);
    public static final TarazedNotificationEvent MEDIA_FAILED = new TarazedNotificationEvent("MEDIA_FAILED", 6);
    public static final TarazedNotificationEvent MEDIA_STOPPED = new TarazedNotificationEvent("MEDIA_STOPPED", 7);
    public static final TarazedNotificationEvent IOT_DISCONNECTED = new TarazedNotificationEvent("IOT_DISCONNECTED", 8);
    public static final TarazedNotificationEvent SESSION_ACTIVE = new TarazedNotificationEvent("SESSION_ACTIVE", 9);
    public static final TarazedNotificationEvent SESSION_SUSPENDED = new TarazedNotificationEvent("SESSION_SUSPENDED", 10);
    public static final TarazedNotificationEvent SESSION_END = new TarazedNotificationEvent("SESSION_END", 11);
    public static final TarazedNotificationEvent SESSION_TERMINATED = new TarazedNotificationEvent("SESSION_TERMINATED", 12);
    public static final TarazedNotificationEvent SESSION_ENDING_3P_APP_EVENT = new TarazedNotificationEvent("SESSION_ENDING_3P_APP_EVENT", 13);
    public static final TarazedNotificationEvent SESSION_ENDING_INACTIVITY = new TarazedNotificationEvent("SESSION_ENDING_INACTIVITY", 14);
    public static final TarazedNotificationEvent PROFILE_SWITCH = new TarazedNotificationEvent("PROFILE_SWITCH", 15);
    public static final TarazedNotificationEvent SESSION_PAUSE_CUSTOMER = new TarazedNotificationEvent("SESSION_PAUSE_CUSTOMER", 16);
    public static final TarazedNotificationEvent SESSION_RESUME_CUSTOMER = new TarazedNotificationEvent("SESSION_RESUME_CUSTOMER", 17);
    public static final TarazedNotificationEvent SESSION_PAUSE_AGENT = new TarazedNotificationEvent("SESSION_PAUSE_AGENT", 18);
    public static final TarazedNotificationEvent SESSION_RESUME_AGENT = new TarazedNotificationEvent("SESSION_RESUME_AGENT", 19);
    public static final TarazedNotificationEvent SESSION_PAUSE_3P_APP_EVENT = new TarazedNotificationEvent("SESSION_PAUSE_3P_APP_EVENT", 20);
    public static final TarazedNotificationEvent SESSION_PAUSE_3P_APP_EVENT_WITHIN_APP = new TarazedNotificationEvent("SESSION_PAUSE_3P_APP_EVENT_WITHIN_APP", 21);
    public static final TarazedNotificationEvent SESSION_STARTING_3P_BACKGROUND = new TarazedNotificationEvent("SESSION_STARTING_3P_BACKGROUND", 22);
    public static final TarazedNotificationEvent APP_FOREGROUND = new TarazedNotificationEvent("APP_FOREGROUND", 23);
    public static final TarazedNotificationEvent RESUME_REQUESTED = new TarazedNotificationEvent("RESUME_REQUESTED", 24);
    public static final TarazedNotificationEvent ACCESSIBILITY_STATE_CHANGED = new TarazedNotificationEvent("ACCESSIBILITY_STATE_CHANGED", 25);

    private static final /* synthetic */ TarazedNotificationEvent[] $values() {
        return new TarazedNotificationEvent[]{MEDIA_CONNECTING, MEDIA_PERMISSION_ACCEPTED, PERMISSION_REJECTED, PERMISSION_TIMEOUT, MEDIA_CONNECTED, MEDIA_DISCONNECTED, MEDIA_FAILED, MEDIA_STOPPED, IOT_DISCONNECTED, SESSION_ACTIVE, SESSION_SUSPENDED, SESSION_END, SESSION_TERMINATED, SESSION_ENDING_3P_APP_EVENT, SESSION_ENDING_INACTIVITY, PROFILE_SWITCH, SESSION_PAUSE_CUSTOMER, SESSION_RESUME_CUSTOMER, SESSION_PAUSE_AGENT, SESSION_RESUME_AGENT, SESSION_PAUSE_3P_APP_EVENT, SESSION_PAUSE_3P_APP_EVENT_WITHIN_APP, SESSION_STARTING_3P_BACKGROUND, APP_FOREGROUND, RESUME_REQUESTED, ACCESSIBILITY_STATE_CHANGED};
    }

    static {
        TarazedNotificationEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TarazedNotificationEvent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedNotificationEvent> getEntries() {
        return $ENTRIES;
    }

    public static TarazedNotificationEvent valueOf(String str) {
        return (TarazedNotificationEvent) Enum.valueOf(TarazedNotificationEvent.class, str);
    }

    public static TarazedNotificationEvent[] values() {
        return (TarazedNotificationEvent[]) $VALUES.clone();
    }
}
