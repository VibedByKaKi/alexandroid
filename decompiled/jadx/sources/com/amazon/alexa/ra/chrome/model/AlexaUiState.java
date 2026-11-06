package com.amazon.alexa.ra.chrome.model;

import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "", "<init>", "(Ljava/lang/String;I)V", "LISTENING", VisualShareErrorType.PROCESSING, "SCREEN_ANALYSIS", "SPEAKING", WifiConnectionState.IDLE, "ERROR", "Companion", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AlexaUiState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaUiState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AlexaUiState LISTENING = new AlexaUiState("LISTENING", 0);
    public static final AlexaUiState PROCESSING = new AlexaUiState(VisualShareErrorType.PROCESSING, 1);
    public static final AlexaUiState SCREEN_ANALYSIS = new AlexaUiState("SCREEN_ANALYSIS", 2);
    public static final AlexaUiState SPEAKING = new AlexaUiState("SPEAKING", 3);
    public static final AlexaUiState IDLE = new AlexaUiState(WifiConnectionState.IDLE, 4);
    public static final AlexaUiState ERROR = new AlexaUiState("ERROR", 5);

    private static final /* synthetic */ AlexaUiState[] $values() {
        return new AlexaUiState[]{LISTENING, PROCESSING, SCREEN_ANALYSIS, SPEAKING, IDLE, ERROR};
    }

    static {
        AlexaUiState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AlexaUiState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaUiState> getEntries() {
        return $ENTRIES;
    }

    public static AlexaUiState valueOf(String str) {
        return (AlexaUiState) Enum.valueOf(AlexaUiState.class, str);
    }

    public static AlexaUiState[] values() {
        return (AlexaUiState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/AlexaUiState$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "listening", "", "speaking", "processing", "error", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AlexaUiState from$default(Companion companion, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            if ((i & 8) != 0) {
                z4 = false;
            }
            return companion.from(z, z2, z3, z4);
        }

        @NotNull
        public final AlexaUiState from(boolean listening, boolean speaking, boolean processing, boolean error) {
            return listening ? AlexaUiState.LISTENING : speaking ? AlexaUiState.SPEAKING : processing ? AlexaUiState.PROCESSING : error ? AlexaUiState.ERROR : AlexaUiState.IDLE;
        }

        private Companion() {
        }
    }
}
