package com.amazon.tarazed.event;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/amazon/tarazed/event/TarazedLocalEventType;", "", "(Ljava/lang/String;I)V", "SESSION_REQUEST_RECEIVED", "SESSION_VERIFIED", "IOT_CONNECTED", "PERMISSION_ACCEPTED", "PERMISSION_REJECTED", "PERMISSION_TIMEOUT", "WEBRTC_CONNECTING", "WEBRTC_CONNECTED", "WEBRTC_PAUSED", "WEBRTC_DISCONNECTED", "PAUSE_SESSION", "RESUME_SESSION", "SUSPEND_SESSION", "IOT_CONNECTION_LOST", "END_SESSION", "TERMINATE_SESSION", "SESSION_TERMINATED", "IOT_CONNECTION_FAILED", "APP_TO_FOREGROUND", "APP_TO_BACKGROUND", "SCREEN_CAPTURE_ACCEPTED", "SCREEN_CAPTURE_STOPPED", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TarazedLocalEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedLocalEventType[] $VALUES;
    public static final TarazedLocalEventType SESSION_REQUEST_RECEIVED = new TarazedLocalEventType("SESSION_REQUEST_RECEIVED", 0);
    public static final TarazedLocalEventType SESSION_VERIFIED = new TarazedLocalEventType("SESSION_VERIFIED", 1);
    public static final TarazedLocalEventType IOT_CONNECTED = new TarazedLocalEventType("IOT_CONNECTED", 2);
    public static final TarazedLocalEventType PERMISSION_ACCEPTED = new TarazedLocalEventType("PERMISSION_ACCEPTED", 3);
    public static final TarazedLocalEventType PERMISSION_REJECTED = new TarazedLocalEventType("PERMISSION_REJECTED", 4);
    public static final TarazedLocalEventType PERMISSION_TIMEOUT = new TarazedLocalEventType("PERMISSION_TIMEOUT", 5);
    public static final TarazedLocalEventType WEBRTC_CONNECTING = new TarazedLocalEventType("WEBRTC_CONNECTING", 6);
    public static final TarazedLocalEventType WEBRTC_CONNECTED = new TarazedLocalEventType("WEBRTC_CONNECTED", 7);
    public static final TarazedLocalEventType WEBRTC_PAUSED = new TarazedLocalEventType("WEBRTC_PAUSED", 8);
    public static final TarazedLocalEventType WEBRTC_DISCONNECTED = new TarazedLocalEventType("WEBRTC_DISCONNECTED", 9);
    public static final TarazedLocalEventType PAUSE_SESSION = new TarazedLocalEventType("PAUSE_SESSION", 10);
    public static final TarazedLocalEventType RESUME_SESSION = new TarazedLocalEventType("RESUME_SESSION", 11);
    public static final TarazedLocalEventType SUSPEND_SESSION = new TarazedLocalEventType("SUSPEND_SESSION", 12);
    public static final TarazedLocalEventType IOT_CONNECTION_LOST = new TarazedLocalEventType("IOT_CONNECTION_LOST", 13);
    public static final TarazedLocalEventType END_SESSION = new TarazedLocalEventType("END_SESSION", 14);
    public static final TarazedLocalEventType TERMINATE_SESSION = new TarazedLocalEventType("TERMINATE_SESSION", 15);
    public static final TarazedLocalEventType SESSION_TERMINATED = new TarazedLocalEventType("SESSION_TERMINATED", 16);
    public static final TarazedLocalEventType IOT_CONNECTION_FAILED = new TarazedLocalEventType("IOT_CONNECTION_FAILED", 17);
    public static final TarazedLocalEventType APP_TO_FOREGROUND = new TarazedLocalEventType("APP_TO_FOREGROUND", 18);
    public static final TarazedLocalEventType APP_TO_BACKGROUND = new TarazedLocalEventType("APP_TO_BACKGROUND", 19);
    public static final TarazedLocalEventType SCREEN_CAPTURE_ACCEPTED = new TarazedLocalEventType("SCREEN_CAPTURE_ACCEPTED", 20);
    public static final TarazedLocalEventType SCREEN_CAPTURE_STOPPED = new TarazedLocalEventType("SCREEN_CAPTURE_STOPPED", 21);

    private static final /* synthetic */ TarazedLocalEventType[] $values() {
        return new TarazedLocalEventType[]{SESSION_REQUEST_RECEIVED, SESSION_VERIFIED, IOT_CONNECTED, PERMISSION_ACCEPTED, PERMISSION_REJECTED, PERMISSION_TIMEOUT, WEBRTC_CONNECTING, WEBRTC_CONNECTED, WEBRTC_PAUSED, WEBRTC_DISCONNECTED, PAUSE_SESSION, RESUME_SESSION, SUSPEND_SESSION, IOT_CONNECTION_LOST, END_SESSION, TERMINATE_SESSION, SESSION_TERMINATED, IOT_CONNECTION_FAILED, APP_TO_FOREGROUND, APP_TO_BACKGROUND, SCREEN_CAPTURE_ACCEPTED, SCREEN_CAPTURE_STOPPED};
    }

    static {
        TarazedLocalEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TarazedLocalEventType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedLocalEventType> getEntries() {
        return $ENTRIES;
    }

    public static TarazedLocalEventType valueOf(String str) {
        return (TarazedLocalEventType) Enum.valueOf(TarazedLocalEventType.class, str);
    }

    public static TarazedLocalEventType[] values() {
        return (TarazedLocalEventType[]) $VALUES.clone();
    }
}
