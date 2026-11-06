package com.amazon.alexa.assistant.foundation.voicechat.model;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeAction;", "", "<init>", "(Ljava/lang/String;I)V", LiveTranslationCapabilityConstants.DIRECTIVE_START, "Stop", "Mute", "Unmute", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceChatModeAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceChatModeAction[] $VALUES;
    public static final VoiceChatModeAction Start = new VoiceChatModeAction(LiveTranslationCapabilityConstants.DIRECTIVE_START, 0);
    public static final VoiceChatModeAction Stop = new VoiceChatModeAction("Stop", 1);
    public static final VoiceChatModeAction Mute = new VoiceChatModeAction("Mute", 2);
    public static final VoiceChatModeAction Unmute = new VoiceChatModeAction("Unmute", 3);

    private static final /* synthetic */ VoiceChatModeAction[] $values() {
        return new VoiceChatModeAction[]{Start, Stop, Mute, Unmute};
    }

    static {
        VoiceChatModeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceChatModeAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceChatModeAction> getEntries() {
        return $ENTRIES;
    }

    public static VoiceChatModeAction valueOf(String str) {
        return (VoiceChatModeAction) Enum.valueOf(VoiceChatModeAction.class, str);
    }

    public static VoiceChatModeAction[] values() {
        return (VoiceChatModeAction[]) $VALUES.clone();
    }
}
