package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VADDismissalReason;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "NETWORK_LOST", "AUDIO_FOCUS_LOST", "ERROR", "USER_EXIT_INTENT", "USER_CLOSED", "AUTO_CLOSE_TIMER", "DEEPLINK_NAVIGATION", "BACKGROUND", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VADDismissalReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VADDismissalReason[] $VALUES;
    public static final VADDismissalReason NONE = new VADDismissalReason("NONE", 0);
    public static final VADDismissalReason NETWORK_LOST = new VADDismissalReason("NETWORK_LOST", 1);
    public static final VADDismissalReason AUDIO_FOCUS_LOST = new VADDismissalReason("AUDIO_FOCUS_LOST", 2);
    public static final VADDismissalReason ERROR = new VADDismissalReason("ERROR", 3);
    public static final VADDismissalReason USER_EXIT_INTENT = new VADDismissalReason("USER_EXIT_INTENT", 4);
    public static final VADDismissalReason USER_CLOSED = new VADDismissalReason("USER_CLOSED", 5);
    public static final VADDismissalReason AUTO_CLOSE_TIMER = new VADDismissalReason("AUTO_CLOSE_TIMER", 6);
    public static final VADDismissalReason DEEPLINK_NAVIGATION = new VADDismissalReason("DEEPLINK_NAVIGATION", 7);
    public static final VADDismissalReason BACKGROUND = new VADDismissalReason("BACKGROUND", 8);

    private static final /* synthetic */ VADDismissalReason[] $values() {
        return new VADDismissalReason[]{NONE, NETWORK_LOST, AUDIO_FOCUS_LOST, ERROR, USER_EXIT_INTENT, USER_CLOSED, AUTO_CLOSE_TIMER, DEEPLINK_NAVIGATION, BACKGROUND};
    }

    static {
        VADDismissalReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VADDismissalReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VADDismissalReason> getEntries() {
        return $ENTRIES;
    }

    public static VADDismissalReason valueOf(String str) {
        return (VADDismissalReason) Enum.valueOf(VADDismissalReason.class, str);
    }

    public static VADDismissalReason[] values() {
        return (VADDismissalReason[]) $VALUES.clone();
    }
}
