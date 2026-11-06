package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/model/VoiceChatModeChangeReason;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "NETWORK_LOST", "AUDIO_FOCUS_LOST", "ERROR", "USER_EXIT_INTENT", "USER_CLOSED", "AUTO_CLOSE_TIMER", "DEEPLINK_NAVIGATION", "BACKGROUND", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoiceChatModeChangeReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceChatModeChangeReason[] $VALUES;
    public static final VoiceChatModeChangeReason NONE = new VoiceChatModeChangeReason("NONE", 0);
    public static final VoiceChatModeChangeReason NETWORK_LOST = new VoiceChatModeChangeReason("NETWORK_LOST", 1);
    public static final VoiceChatModeChangeReason AUDIO_FOCUS_LOST = new VoiceChatModeChangeReason("AUDIO_FOCUS_LOST", 2);
    public static final VoiceChatModeChangeReason ERROR = new VoiceChatModeChangeReason("ERROR", 3);
    public static final VoiceChatModeChangeReason USER_EXIT_INTENT = new VoiceChatModeChangeReason("USER_EXIT_INTENT", 4);
    public static final VoiceChatModeChangeReason USER_CLOSED = new VoiceChatModeChangeReason("USER_CLOSED", 5);
    public static final VoiceChatModeChangeReason AUTO_CLOSE_TIMER = new VoiceChatModeChangeReason("AUTO_CLOSE_TIMER", 6);
    public static final VoiceChatModeChangeReason DEEPLINK_NAVIGATION = new VoiceChatModeChangeReason("DEEPLINK_NAVIGATION", 7);
    public static final VoiceChatModeChangeReason BACKGROUND = new VoiceChatModeChangeReason("BACKGROUND", 8);

    private static final /* synthetic */ VoiceChatModeChangeReason[] $values() {
        return new VoiceChatModeChangeReason[]{NONE, NETWORK_LOST, AUDIO_FOCUS_LOST, ERROR, USER_EXIT_INTENT, USER_CLOSED, AUTO_CLOSE_TIMER, DEEPLINK_NAVIGATION, BACKGROUND};
    }

    static {
        VoiceChatModeChangeReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceChatModeChangeReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceChatModeChangeReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceChatModeChangeReason valueOf(String str) {
        return (VoiceChatModeChangeReason) Enum.valueOf(VoiceChatModeChangeReason.class, str);
    }

    public static VoiceChatModeChangeReason[] values() {
        return (VoiceChatModeChangeReason[]) $VALUES.clone();
    }
}
