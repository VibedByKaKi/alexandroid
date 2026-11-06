package com.amazon.alexa.assistant.foundation.voicechat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "", "<init>", "(Ljava/lang/String;I)V", "None", "NetworkLost", "AudioFocusLost", "Error", "UserExitIntent", "UserClosed", "AutoCloseTimer", "DeeplinkNavigation", "Background", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceChatModeStopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceChatModeStopReason[] $VALUES;
    public static final VoiceChatModeStopReason None = new VoiceChatModeStopReason("None", 0);
    public static final VoiceChatModeStopReason NetworkLost = new VoiceChatModeStopReason("NetworkLost", 1);
    public static final VoiceChatModeStopReason AudioFocusLost = new VoiceChatModeStopReason("AudioFocusLost", 2);
    public static final VoiceChatModeStopReason Error = new VoiceChatModeStopReason("Error", 3);
    public static final VoiceChatModeStopReason UserExitIntent = new VoiceChatModeStopReason("UserExitIntent", 4);
    public static final VoiceChatModeStopReason UserClosed = new VoiceChatModeStopReason("UserClosed", 5);
    public static final VoiceChatModeStopReason AutoCloseTimer = new VoiceChatModeStopReason("AutoCloseTimer", 6);
    public static final VoiceChatModeStopReason DeeplinkNavigation = new VoiceChatModeStopReason("DeeplinkNavigation", 7);
    public static final VoiceChatModeStopReason Background = new VoiceChatModeStopReason("Background", 8);

    private static final /* synthetic */ VoiceChatModeStopReason[] $values() {
        return new VoiceChatModeStopReason[]{None, NetworkLost, AudioFocusLost, Error, UserExitIntent, UserClosed, AutoCloseTimer, DeeplinkNavigation, Background};
    }

    static {
        VoiceChatModeStopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceChatModeStopReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceChatModeStopReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceChatModeStopReason valueOf(String str) {
        return (VoiceChatModeStopReason) Enum.valueOf(VoiceChatModeStopReason.class, str);
    }

    public static VoiceChatModeStopReason[] values() {
        return (VoiceChatModeStopReason[]) $VALUES.clone();
    }
}
