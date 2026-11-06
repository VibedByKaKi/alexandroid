package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.DialogRequestDeniedReason;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/api/compat/Reason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INVALID_AUDIO_METADATA", "INVALID_WAKE_WORD", "SCREEN_LOCKED", "SOURCE_ARBITRATION", "SPEECH_PROVIDER_NOT_REGISTERED", "OUT_OF_TURN_CANNOT_REQUEST_DIALOG", "OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN", "OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN", "OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN", "OUT_OF_TURN_DIALOG_NOT_STARTED", "OUT_OF_TURN_DIALOG_NOT_CURRENT", "OUT_OF_TURN_UNEXPECTED_TURN", "OUT_OF_TURN_UNEXPECTED_NEXT_TURN", "OUT_OF_TURN_START_DIALOG_NOT_ALLOWED", "OUT_OF_TURN_CONTINUE_INVALID_DIALOG", "WAKE_WORD_ENGINE_NOT_READY", "WAKE_WORD_AUDIO_INCOMPLETE", "BINDING_ERROR", "LOCAL_SERVICE_DISCONNECTED", "LEADER_SELECTION_ERROR", "LEADER_DISABLED_ERROR", "INTERNAL_CLIENT_ERROR_MESSAGING", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Reason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Reason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Reason UNKNOWN = new Reason("UNKNOWN", 0);
    public static final Reason INVALID_AUDIO_METADATA = new Reason("INVALID_AUDIO_METADATA", 1);
    public static final Reason INVALID_WAKE_WORD = new Reason("INVALID_WAKE_WORD", 2);
    public static final Reason SCREEN_LOCKED = new Reason("SCREEN_LOCKED", 3);
    public static final Reason SOURCE_ARBITRATION = new Reason("SOURCE_ARBITRATION", 4);
    public static final Reason SPEECH_PROVIDER_NOT_REGISTERED = new Reason("SPEECH_PROVIDER_NOT_REGISTERED", 5);
    public static final Reason OUT_OF_TURN_CANNOT_REQUEST_DIALOG = new Reason("OUT_OF_TURN_CANNOT_REQUEST_DIALOG", 6);
    public static final Reason OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN = new Reason("OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN", 7);
    public static final Reason OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN = new Reason("OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN", 8);
    public static final Reason OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN = new Reason("OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN", 9);
    public static final Reason OUT_OF_TURN_DIALOG_NOT_STARTED = new Reason("OUT_OF_TURN_DIALOG_NOT_STARTED", 10);
    public static final Reason OUT_OF_TURN_DIALOG_NOT_CURRENT = new Reason("OUT_OF_TURN_DIALOG_NOT_CURRENT", 11);
    public static final Reason OUT_OF_TURN_UNEXPECTED_TURN = new Reason("OUT_OF_TURN_UNEXPECTED_TURN", 12);
    public static final Reason OUT_OF_TURN_UNEXPECTED_NEXT_TURN = new Reason("OUT_OF_TURN_UNEXPECTED_NEXT_TURN", 13);
    public static final Reason OUT_OF_TURN_START_DIALOG_NOT_ALLOWED = new Reason("OUT_OF_TURN_START_DIALOG_NOT_ALLOWED", 14);
    public static final Reason OUT_OF_TURN_CONTINUE_INVALID_DIALOG = new Reason("OUT_OF_TURN_CONTINUE_INVALID_DIALOG", 15);
    public static final Reason WAKE_WORD_ENGINE_NOT_READY = new Reason("WAKE_WORD_ENGINE_NOT_READY", 16);
    public static final Reason WAKE_WORD_AUDIO_INCOMPLETE = new Reason("WAKE_WORD_AUDIO_INCOMPLETE", 17);
    public static final Reason BINDING_ERROR = new Reason("BINDING_ERROR", 18);
    public static final Reason LOCAL_SERVICE_DISCONNECTED = new Reason("LOCAL_SERVICE_DISCONNECTED", 19);
    public static final Reason LEADER_SELECTION_ERROR = new Reason("LEADER_SELECTION_ERROR", 20);
    public static final Reason LEADER_DISABLED_ERROR = new Reason("LEADER_DISABLED_ERROR", 21);
    public static final Reason INTERNAL_CLIENT_ERROR_MESSAGING = new Reason("INTERNAL_CLIENT_ERROR_MESSAGING", 22);

    private static final /* synthetic */ Reason[] $values() {
        return new Reason[]{UNKNOWN, INVALID_AUDIO_METADATA, INVALID_WAKE_WORD, SCREEN_LOCKED, SOURCE_ARBITRATION, SPEECH_PROVIDER_NOT_REGISTERED, OUT_OF_TURN_CANNOT_REQUEST_DIALOG, OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN, OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN, OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN, OUT_OF_TURN_DIALOG_NOT_STARTED, OUT_OF_TURN_DIALOG_NOT_CURRENT, OUT_OF_TURN_UNEXPECTED_TURN, OUT_OF_TURN_UNEXPECTED_NEXT_TURN, OUT_OF_TURN_START_DIALOG_NOT_ALLOWED, OUT_OF_TURN_CONTINUE_INVALID_DIALOG, WAKE_WORD_ENGINE_NOT_READY, WAKE_WORD_AUDIO_INCOMPLETE, BINDING_ERROR, LOCAL_SERVICE_DISCONNECTED, LEADER_SELECTION_ERROR, LEADER_DISABLED_ERROR, INTERNAL_CLIENT_ERROR_MESSAGING};
    }

    static {
        Reason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Reason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Reason> getEntries() {
        return $ENTRIES;
    }

    public static Reason valueOf(String str) {
        return (Reason) Enum.valueOf(Reason.class, str);
    }

    public static Reason[] values() {
        return (Reason[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/Reason$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/Reason;", "noncompatReason", "Lcom/amazon/alexa/api/DialogRequestDeniedReason$Reason;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Reason convertToCompat(@NotNull DialogRequestDeniedReason.Reason noncompatReason) {
            noncompatReason.getClass();
            return Reason.valueOf(noncompatReason.name());
        }

        private Companion() {
        }
    }
}
