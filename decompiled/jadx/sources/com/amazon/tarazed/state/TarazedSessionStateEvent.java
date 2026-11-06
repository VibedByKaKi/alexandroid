package com.amazon.tarazed.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/tarazed/state/TarazedSessionStateEvent;", "", "(Ljava/lang/String;I)V", "INITIALIZE_SESSION", "ON_SIGNALING_CHANNEL_CONNECTED", "ON_SESSION_VERIFIED", "ON_SESSION_PERMISSION_ACCEPTED", "ON_SESSION_PERMISSION_REJECTED", "ON_SESSION_PERMISSION_TIMED_OUT", "ON_MEDIA_CONNECTED", "ON_SESSION_PAUSE", "ON_SESSION_RESUME", "ON_SESSION_RECONNECTING", "ON_SESSION_RECONNECTED_WHILE_ACTIVE", "ON_SESSION_RECONNECTED_WHILE_PAUSED", "ON_SESSION_END", "ON_SESSION_SUSPENDING", "ON_SESSION_SUSPENDED", "ON_SESSION_ENDED", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TarazedSessionStateEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedSessionStateEvent[] $VALUES;
    public static final TarazedSessionStateEvent INITIALIZE_SESSION = new TarazedSessionStateEvent("INITIALIZE_SESSION", 0);
    public static final TarazedSessionStateEvent ON_SIGNALING_CHANNEL_CONNECTED = new TarazedSessionStateEvent("ON_SIGNALING_CHANNEL_CONNECTED", 1);
    public static final TarazedSessionStateEvent ON_SESSION_VERIFIED = new TarazedSessionStateEvent("ON_SESSION_VERIFIED", 2);
    public static final TarazedSessionStateEvent ON_SESSION_PERMISSION_ACCEPTED = new TarazedSessionStateEvent("ON_SESSION_PERMISSION_ACCEPTED", 3);
    public static final TarazedSessionStateEvent ON_SESSION_PERMISSION_REJECTED = new TarazedSessionStateEvent("ON_SESSION_PERMISSION_REJECTED", 4);
    public static final TarazedSessionStateEvent ON_SESSION_PERMISSION_TIMED_OUT = new TarazedSessionStateEvent("ON_SESSION_PERMISSION_TIMED_OUT", 5);
    public static final TarazedSessionStateEvent ON_MEDIA_CONNECTED = new TarazedSessionStateEvent("ON_MEDIA_CONNECTED", 6);
    public static final TarazedSessionStateEvent ON_SESSION_PAUSE = new TarazedSessionStateEvent("ON_SESSION_PAUSE", 7);
    public static final TarazedSessionStateEvent ON_SESSION_RESUME = new TarazedSessionStateEvent("ON_SESSION_RESUME", 8);
    public static final TarazedSessionStateEvent ON_SESSION_RECONNECTING = new TarazedSessionStateEvent("ON_SESSION_RECONNECTING", 9);
    public static final TarazedSessionStateEvent ON_SESSION_RECONNECTED_WHILE_ACTIVE = new TarazedSessionStateEvent("ON_SESSION_RECONNECTED_WHILE_ACTIVE", 10);
    public static final TarazedSessionStateEvent ON_SESSION_RECONNECTED_WHILE_PAUSED = new TarazedSessionStateEvent("ON_SESSION_RECONNECTED_WHILE_PAUSED", 11);
    public static final TarazedSessionStateEvent ON_SESSION_END = new TarazedSessionStateEvent("ON_SESSION_END", 12);
    public static final TarazedSessionStateEvent ON_SESSION_SUSPENDING = new TarazedSessionStateEvent("ON_SESSION_SUSPENDING", 13);
    public static final TarazedSessionStateEvent ON_SESSION_SUSPENDED = new TarazedSessionStateEvent("ON_SESSION_SUSPENDED", 14);
    public static final TarazedSessionStateEvent ON_SESSION_ENDED = new TarazedSessionStateEvent("ON_SESSION_ENDED", 15);

    private static final /* synthetic */ TarazedSessionStateEvent[] $values() {
        return new TarazedSessionStateEvent[]{INITIALIZE_SESSION, ON_SIGNALING_CHANNEL_CONNECTED, ON_SESSION_VERIFIED, ON_SESSION_PERMISSION_ACCEPTED, ON_SESSION_PERMISSION_REJECTED, ON_SESSION_PERMISSION_TIMED_OUT, ON_MEDIA_CONNECTED, ON_SESSION_PAUSE, ON_SESSION_RESUME, ON_SESSION_RECONNECTING, ON_SESSION_RECONNECTED_WHILE_ACTIVE, ON_SESSION_RECONNECTED_WHILE_PAUSED, ON_SESSION_END, ON_SESSION_SUSPENDING, ON_SESSION_SUSPENDED, ON_SESSION_ENDED};
    }

    static {
        TarazedSessionStateEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TarazedSessionStateEvent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedSessionStateEvent> getEntries() {
        return $ENTRIES;
    }

    public static TarazedSessionStateEvent valueOf(String str) {
        return (TarazedSessionStateEvent) Enum.valueOf(TarazedSessionStateEvent.class, str);
    }

    public static TarazedSessionStateEvent[] values() {
        return (TarazedSessionStateEvent[]) $VALUES.clone();
    }
}
