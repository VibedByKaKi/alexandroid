package com.amazon.alexa.assistant;

import com.amazon.alexa.assistant.audio.ExternalAudioTaskScheduler;
import com.amazon.alexa.assistant.conversation.ConversationSession;
import com.amazon.alexa.assistant.visual.ExternalVisualFocusTracker;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/Assistant;", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/AssistantState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "start", "", "stop", "signOut", "onProfileChanged", "externalAudioTaskScheduler", "Lcom/amazon/alexa/assistant/audio/ExternalAudioTaskScheduler;", "getExternalAudioTaskScheduler", "()Lcom/amazon/alexa/assistant/audio/ExternalAudioTaskScheduler;", "externalVisualFocusTracker", "Lcom/amazon/alexa/assistant/visual/ExternalVisualFocusTracker;", "getExternalVisualFocusTracker", "()Lcom/amazon/alexa/assistant/visual/ExternalVisualFocusTracker;", "conversationSession", "Lcom/amazon/alexa/assistant/conversation/ConversationSession;", "getConversationSession", "()Lcom/amazon/alexa/assistant/conversation/ConversationSession;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Assistant {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static ConversationSession getConversationSession(@NotNull Assistant assistant) {
            return null;
        }

        @Nullable
        public static ExternalAudioTaskScheduler getExternalAudioTaskScheduler(@NotNull Assistant assistant) {
            return null;
        }

        @Nullable
        public static ExternalVisualFocusTracker getExternalVisualFocusTracker(@NotNull Assistant assistant) {
            return null;
        }

        @NotNull
        public static StateFlow<AssistantState> getState(@NotNull Assistant assistant) {
            StateFlow<AssistantState> stateFlow;
            stateFlow = AssistantKt.DEFAULT_ASSISTANT_STATE;
            return stateFlow;
        }
    }

    @Nullable
    ConversationSession getConversationSession();

    @Nullable
    ExternalAudioTaskScheduler getExternalAudioTaskScheduler();

    @Nullable
    ExternalVisualFocusTracker getExternalVisualFocusTracker();

    @NotNull
    StateFlow<AssistantState> getState();

    @Deprecated(level = DeprecationLevel.WARNING, message = "The SDK now observes ProfileMetadataProvider.currentProfileFlow reactively. Update your flow — the SDK re-evaluates automatically.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    void onProfileChanged();

    void signOut();

    void start();

    void stop();
}
