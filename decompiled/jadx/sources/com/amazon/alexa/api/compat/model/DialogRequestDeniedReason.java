package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason;", "", "reason", "Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason$Reason;", "message", "", "exceptionMessage", "<init>", "(Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason$Reason;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason$Reason;", "getMessage", "()Ljava/lang/String;", "getExceptionMessage", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Reason", "BundleKey", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogRequestDeniedReason {
    public static final int $stable = 0;

    @Nullable
    private final String exceptionMessage;

    @Nullable
    private final String message;

    @NotNull
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason$BundleKey;", "", "<init>", "(Ljava/lang/String;I)V", "REQUEST_DENIED_REASON", "REQUEST_DENIED_MESSAGE", "REQUEST_DENIED_EXCEPTION", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleKey {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BundleKey[] $VALUES;
        public static final BundleKey REQUEST_DENIED_REASON = new BundleKey("REQUEST_DENIED_REASON", 0);
        public static final BundleKey REQUEST_DENIED_MESSAGE = new BundleKey("REQUEST_DENIED_MESSAGE", 1);
        public static final BundleKey REQUEST_DENIED_EXCEPTION = new BundleKey("REQUEST_DENIED_EXCEPTION", 2);

        private static final /* synthetic */ BundleKey[] $values() {
            return new BundleKey[]{REQUEST_DENIED_REASON, REQUEST_DENIED_MESSAGE, REQUEST_DENIED_EXCEPTION};
        }

        static {
            BundleKey[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BundleKey(String str, int i) {
        }

        @NotNull
        public static EnumEntries<BundleKey> getEntries() {
            return $ENTRIES;
        }

        public static BundleKey valueOf(String str) {
            return (BundleKey) Enum.valueOf(BundleKey.class, str);
        }

        public static BundleKey[] values() {
            return (BundleKey[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INVALID_AUDIO_METADATA", "INVALID_WAKE_WORD", "SCREEN_LOCKED", "SOURCE_ARBITRATION", "SPEECH_PROVIDER_NOT_REGISTERED", "OUT_OF_TURN_CANNOT_REQUEST_DIALOG", "OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN", "OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN", "OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN", "OUT_OF_TURN_DIALOG_NOT_STARTED", "OUT_OF_TURN_DIALOG_NOT_CURRENT", "OUT_OF_TURN_UNEXPECTED_TURN", "OUT_OF_TURN_UNEXPECTED_NEXT_TURN", "OUT_OF_TURN_START_DIALOG_NOT_ALLOWED", "OUT_OF_TURN_CONTINUE_INVALID_DIALOG", "WAKE_WORD_ENGINE_NOT_READY", "WAKE_WORD_AUDIO_INCOMPLETE", "BINDING_ERROR", "LOCAL_SERVICE_DISCONNECTED", "LEADER_SELECTION_ERROR", "LEADER_DISABLED_ERROR", "INTERNAL_CLIENT_ERROR_MESSAGING", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
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
    }

    public /* synthetic */ DialogRequestDeniedReason(Reason reason, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ DialogRequestDeniedReason copy$default(DialogRequestDeniedReason dialogRequestDeniedReason, Reason reason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = dialogRequestDeniedReason.reason;
        }
        if ((i & 2) != 0) {
            str = dialogRequestDeniedReason.message;
        }
        if ((i & 4) != 0) {
            str2 = dialogRequestDeniedReason.exceptionMessage;
        }
        return dialogRequestDeniedReason.copy(reason, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    @NotNull
    public final DialogRequestDeniedReason copy(@NotNull Reason reason, @Nullable String message, @Nullable String exceptionMessage) {
        reason.getClass();
        return new DialogRequestDeniedReason(reason, message, exceptionMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogRequestDeniedReason)) {
            return false;
        }
        DialogRequestDeniedReason dialogRequestDeniedReason = (DialogRequestDeniedReason) other;
        return this.reason == dialogRequestDeniedReason.reason && Intrinsics.areEqual(this.message, dialogRequestDeniedReason.message) && Intrinsics.areEqual(this.exceptionMessage, dialogRequestDeniedReason.exceptionMessage);
    }

    @Nullable
    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode = this.reason.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.exceptionMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Reason reason = this.reason;
        String str = this.message;
        String str2 = this.exceptionMessage;
        StringBuilder sb = new StringBuilder("DialogRequestDeniedReason(reason=");
        sb.append(reason);
        sb.append(", message=");
        sb.append(str);
        sb.append(", exceptionMessage=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public DialogRequestDeniedReason(@NotNull Reason reason, @Nullable String str, @Nullable String str2) {
        reason.getClass();
        this.reason = reason;
        this.message = str;
        this.exceptionMessage = str2;
    }
}
