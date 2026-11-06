package com.amazon.alexa.mobile.assistant.client.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.voicechat.VoiceChatModeController;
import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeState;
import com.amazon.alexa.mobile.assistant.client.apis.VoiceActivityDetectionApiImpl;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/MetricsSubComponentNameProvider;", "", "voiceActivityDetectionApi", "Lcom/amazon/alexa/mobile/assistant/client/apis/VoiceActivityDetectionApiImpl;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/apis/VoiceActivityDetectionApiImpl;)V", "getSubComponentName", "", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetricsSubComponentNameProvider {

    @NotNull
    public static final String VOICE_CHAT_MODE = "voice_chat_mode";

    @NotNull
    private final VoiceActivityDetectionApiImpl voiceActivityDetectionApi;
    public static final int $stable = 8;

    public MetricsSubComponentNameProvider(@NotNull VoiceActivityDetectionApiImpl voiceActivityDetectionApiImpl) {
        voiceActivityDetectionApiImpl.getClass();
        this.voiceActivityDetectionApi = voiceActivityDetectionApiImpl;
    }

    @Nullable
    public final String getSubComponentName() {
        StateFlow<VoiceChatModeState> voiceChatModeState;
        VoiceChatModeState value;
        VoiceChatModeController voiceChatModeController = this.voiceActivityDetectionApi.getVoiceChatModeController();
        if (voiceChatModeController == null || (voiceChatModeState = voiceChatModeController.getVoiceChatModeState()) == null || (value = voiceChatModeState.getValue()) == null || !value.isRunning()) {
            return null;
        }
        return "voice_chat_mode";
    }
}
