package com.amazon.alexa.api.compat;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "PREPARING_TO_LISTEN", "LISTENING", "FINISHING_LISTENING", "THINKING", "SPEAKING", "ERROR", "UNKNOWN", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AlexaState IDLE = new AlexaState(WifiConnectionState.IDLE, 0);
    public static final AlexaState PREPARING_TO_LISTEN = new AlexaState("PREPARING_TO_LISTEN", 1);
    public static final AlexaState LISTENING = new AlexaState("LISTENING", 2);
    public static final AlexaState FINISHING_LISTENING = new AlexaState("FINISHING_LISTENING", 3);
    public static final AlexaState THINKING = new AlexaState("THINKING", 4);
    public static final AlexaState SPEAKING = new AlexaState("SPEAKING", 5);
    public static final AlexaState ERROR = new AlexaState("ERROR", 6);
    public static final AlexaState UNKNOWN = new AlexaState("UNKNOWN", 7);

    private static final /* synthetic */ AlexaState[] $values() {
        return new AlexaState[]{IDLE, PREPARING_TO_LISTEN, LISTENING, FINISHING_LISTENING, THINKING, SPEAKING, ERROR, UNKNOWN};
    }

    static {
        AlexaState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AlexaState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaState> getEntries() {
        return $ENTRIES;
    }

    public static AlexaState valueOf(String str) {
        return (AlexaState) Enum.valueOf(AlexaState.class, str);
    }

    public static AlexaState[] values() {
        return (AlexaState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaState$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/AlexaState;", "noncompatState", "Lcom/amazon/alexa/api/AlexaState;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AlexaState convertToCompat(@Nullable com.amazon.alexa.api.AlexaState noncompatState) {
            if (noncompatState != null) {
                return AlexaState.valueOf(noncompatState.name());
            }
            return null;
        }

        private Companion() {
        }
    }
}
