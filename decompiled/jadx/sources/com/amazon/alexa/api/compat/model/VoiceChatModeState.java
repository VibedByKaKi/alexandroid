package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.presence.service.PresenceBleService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/VoiceChatModeState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", PresenceBleService.ServiceState.STARTING, "ACTIVE", "MUTED", PresenceBleService.ServiceState.STOPPING, "ERROR", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoiceChatModeState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceChatModeState[] $VALUES;
    public static final VoiceChatModeState INACTIVE = new VoiceChatModeState("INACTIVE", 0);
    public static final VoiceChatModeState STARTING = new VoiceChatModeState(PresenceBleService.ServiceState.STARTING, 1);
    public static final VoiceChatModeState ACTIVE = new VoiceChatModeState("ACTIVE", 2);
    public static final VoiceChatModeState MUTED = new VoiceChatModeState("MUTED", 3);
    public static final VoiceChatModeState STOPPING = new VoiceChatModeState(PresenceBleService.ServiceState.STOPPING, 4);
    public static final VoiceChatModeState ERROR = new VoiceChatModeState("ERROR", 5);

    private static final /* synthetic */ VoiceChatModeState[] $values() {
        return new VoiceChatModeState[]{INACTIVE, STARTING, ACTIVE, MUTED, STOPPING, ERROR};
    }

    static {
        VoiceChatModeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceChatModeState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceChatModeState> getEntries() {
        return $ENTRIES;
    }

    public static VoiceChatModeState valueOf(String str) {
        return (VoiceChatModeState) Enum.valueOf(VoiceChatModeState.class, str);
    }

    public static VoiceChatModeState[] values() {
        return (VoiceChatModeState[]) $VALUES.clone();
    }
}
