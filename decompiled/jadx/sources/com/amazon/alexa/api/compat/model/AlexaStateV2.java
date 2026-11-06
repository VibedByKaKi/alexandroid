package com.amazon.alexa.api.compat.model;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaStateV2;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "PREPARING_TO_LISTEN", "LISTENING", "FINISHING_LISTENING", "THINKING", "SPEAKING", "ERROR", "UNKNOWN", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaStateV2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaStateV2[] $VALUES;
    public static final AlexaStateV2 IDLE = new AlexaStateV2(WifiConnectionState.IDLE, 0);
    public static final AlexaStateV2 PREPARING_TO_LISTEN = new AlexaStateV2("PREPARING_TO_LISTEN", 1);
    public static final AlexaStateV2 LISTENING = new AlexaStateV2("LISTENING", 2);
    public static final AlexaStateV2 FINISHING_LISTENING = new AlexaStateV2("FINISHING_LISTENING", 3);
    public static final AlexaStateV2 THINKING = new AlexaStateV2("THINKING", 4);
    public static final AlexaStateV2 SPEAKING = new AlexaStateV2("SPEAKING", 5);
    public static final AlexaStateV2 ERROR = new AlexaStateV2("ERROR", 6);
    public static final AlexaStateV2 UNKNOWN = new AlexaStateV2("UNKNOWN", 7);

    private static final /* synthetic */ AlexaStateV2[] $values() {
        return new AlexaStateV2[]{IDLE, PREPARING_TO_LISTEN, LISTENING, FINISHING_LISTENING, THINKING, SPEAKING, ERROR, UNKNOWN};
    }

    static {
        AlexaStateV2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaStateV2(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaStateV2> getEntries() {
        return $ENTRIES;
    }

    public static AlexaStateV2 valueOf(String str) {
        return (AlexaStateV2) Enum.valueOf(AlexaStateV2.class, str);
    }

    public static AlexaStateV2[] values() {
        return (AlexaStateV2[]) $VALUES.clone();
    }
}
