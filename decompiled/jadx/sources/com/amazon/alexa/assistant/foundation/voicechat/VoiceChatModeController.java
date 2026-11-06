package com.amazon.alexa.assistant.foundation.voicechat;

import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeEvent;
import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeState;
import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeStopReason;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/VoiceChatModeController;", "", "voiceChatModeState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeState;", "getVoiceChatModeState", "()Lkotlinx/coroutines/flow/StateFlow;", "voiceChatModeEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "getVoiceChatModeEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "startVoiceChatMode", "", "stopVoiceChatMode", "reason", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "muteVoiceChatMode", "unmuteVoiceChatMode", "isVoiceChatModeRunning", "", "isMuted", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceChatModeController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void stopVoiceChatMode$default(VoiceChatModeController voiceChatModeController, VoiceChatModeStopReason voiceChatModeStopReason, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: stopVoiceChatMode");
                return;
            }
            if ((i & 1) != 0) {
                voiceChatModeStopReason = VoiceChatModeStopReason.None;
            }
            voiceChatModeController.stopVoiceChatMode(voiceChatModeStopReason);
        }
    }

    @NotNull
    SharedFlow<VoiceChatModeEvent> getVoiceChatModeEvents();

    @NotNull
    StateFlow<VoiceChatModeState> getVoiceChatModeState();

    boolean isMuted();

    boolean isVoiceChatModeRunning();

    void muteVoiceChatMode();

    void startVoiceChatMode();

    void stopVoiceChatMode(@NotNull VoiceChatModeStopReason reason);

    void unmuteVoiceChatMode();
}
