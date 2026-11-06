package com.amazon.alexa.ra.core.ui.backgroundmode;

import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import com.dee.app.data.reactnative.observers.WritableMapEncodingDataServiceObserver;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayStateManagerInterface;", "", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayStateManagerInterface$OverlayState;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", WritableMapEncodingDataServiceObserver.ElementsResponseKey.STATUS_TEXT, "", "getStatusText", "isWakeWordMuted", "", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_STATE, "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "getAlexaState", "setWakeWordMuted", "", "muted", "updateAlexaState", "OverlayState", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface OverlayStateManagerInterface {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayStateManagerInterface$OverlayState;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "LISTENING", "SPEAKING", "THINKING", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OverlayState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OverlayState[] $VALUES;
        public static final OverlayState NORMAL = new OverlayState("NORMAL", 0);
        public static final OverlayState LISTENING = new OverlayState("LISTENING", 1);
        public static final OverlayState SPEAKING = new OverlayState("SPEAKING", 2);
        public static final OverlayState THINKING = new OverlayState("THINKING", 3);

        private static final /* synthetic */ OverlayState[] $values() {
            return new OverlayState[]{NORMAL, LISTENING, SPEAKING, THINKING};
        }

        static {
            OverlayState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private OverlayState(String str, int i) {
        }

        @NotNull
        public static EnumEntries<OverlayState> getEntries() {
            return $ENTRIES;
        }

        public static OverlayState valueOf(String str) {
            return (OverlayState) Enum.valueOf(OverlayState.class, str);
        }

        public static OverlayState[] values() {
            return (OverlayState[]) $VALUES.clone();
        }
    }

    @NotNull
    StateFlow<AlexaUiState> getAlexaState();

    @NotNull
    StateFlow<OverlayState> getCurrentState();

    @NotNull
    StateFlow<String> getStatusText();

    @NotNull
    StateFlow<Boolean> isWakeWordMuted();

    void setWakeWordMuted(boolean muted);

    void updateAlexaState(@NotNull AlexaUiState alexaState);
}
